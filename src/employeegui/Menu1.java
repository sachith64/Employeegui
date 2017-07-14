/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeegui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author 
 */
public class Menu1 extends Frame implements ActionListener,TextListener {
    TextField tf1 = new TextField(10);
    TextField tf2 = new TextField(10);
    TextField tf3 = new TextField(10);
    Button bm = new Button("Register");
    Button mbm = new Button("Menu");
    TextArea ta = new TextArea(2,20);
    static int cnt = 0;
    static String msg;
    Menu1()
    {
//         new EmpEx();
       Frame f = new Frame();
    f.setBounds(10,10,600,400);
    Font ft = new Font("Time New Roman", Font.BOLD,24);
     f.setFont(ft);
     GridLayout gl = new GridLayout(3,3);
      f.setLayout(gl);
     Label l = new Label("Registeration Form",Label.CENTER);
     l.setForeground(Color.GREEN);
     f.add(l);
    
        
       Label lm1 = new Label("Id: ");
        
        tf1.addTextListener(this);
        Label lm2 = new Label("Name: ");
        
        tf2.addTextListener(this);
        
        Label lm3 = new Label("DOB: ");
        
        tf3.addTextListener(this);
        
        bm.addActionListener(this);
        mbm.addActionListener(this);
        Panel pm =new Panel();
         f.addWindowListener(new WindowAdapter() {
    
    public void windowClosing(WindowEvent ae) {
        f.dispose();
    }
        });
     
// f.setLayout(new FlowLayout(FlowLayout.CENTER,140,130)); 
  
  pm.add(lm1);
  pm.add(tf1);
  pm.add(lm2);
  pm.add(tf2);
  pm.add(lm3);
  pm.add(tf3);
  pm.add(bm);
  pm.add(mbm);
  f.add(pm);
  
  Panel pm1= new Panel();
    
  pm1.add(ta);
      if(cnt==0){
           ta.setVisible(false);
       }
       else{
            f.add(pm1);
            ta.append(msg);
           ta.setVisible(true);
       }
  
  
  
  f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        String str = ae.getActionCommand();
      
      if(str.equals("Register")){
          
          String id=tf1.getText();
          String name=tf2.getText();
          String dob=tf3.getText();
         
          Employee e1 = new Employee(id,name,dob);
          
          Services s = new Services();
         msg=s.registration(e1);
          //String msg = id;
         cnt++;
         this.dispose();
         new Menu1();
         
        }
      else if(str.equals("Menu"))
      {
          this.dispose();
          new Menu();
      }
      
    }

    @Override
    public void textValueChanged(TextEvent e) {
            }
}
