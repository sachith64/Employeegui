/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeegui;

//import static emp_ex.Menu1.msg;
//import static emp_ex.Menu2.cnt;
import static employeegui.Menu4.msg;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author sachith
 */
public class Menu3 extends Frame implements ActionListener,TextListener {
    
    Button bm = new Button("Total Number of Employess");
    Button mbm = new Button("Menu");
    TextArea ta = new TextArea(2,20);
    static int cnt=0;
    Menu3(){
        Frame f = new Frame();
    f.setBounds(10,10,600,400);
    Font ft = new Font("Time New Roman", Font.BOLD,24);
     f.setFont(ft);
     GridLayout gl = new GridLayout(3,3);
      f.setLayout(gl);
     Label l = new Label("Number of Employees Registered Form",Label.CENTER);
     l.setForeground(Color.GREEN);
     f.add(l);
     bm.addActionListener(this);
    mbm.addActionListener(this);
     f.addWindowListener(new WindowAdapter() {
    
    public void windowClosing(WindowEvent ae) {
        f.dispose();
    }
        });
    Panel pm =new Panel();
     
// f.setLayout(new FlowLayout(FlowLayout.CENTER,140,130)); 
  
  pm.add(bm);
  pm.add(mbm);
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
  f.add(pm);
  f.setVisible(true);
    
}

    @Override
    public void actionPerformed(ActionEvent ae) {
         String str = ae.getActionCommand();
      
      if(str.equals("Total Number of Employess")){
          
          
          Services s = new Services();
         msg=Integer.toString(s.totalEmployees());
         cnt=1;
         this.dispose();
         new Menu3();
      }
      else if(str.equals("Menu"))
      {
          cnt=0;
          this.dispose();
          new Menu();
      }
    }

    @Override
    public void textValueChanged(TextEvent e) {
       
    }
}

