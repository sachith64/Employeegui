/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeegui;

//import static emp_ex.Menu1.cnt;
//import static emp_ex.Menu1.msg;
import static employeegui.Menu4.msg;
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
 * @author sachith
 */
public class Menu2 extends Frame implements ActionListener,TextListener {
    TextField tf1 = new TextField(10);
    Button bm = new Button("Search");
    Button mbm = new Button("Menu");
    TextArea ta = new TextArea(2,20);
    static int cnt=0;
    Menu2(){
        Frame f = new Frame();
    f.setBounds(10,10,600,400);
    Font ft = new Font("Time New Roman", Font.BOLD,24);
     f.setFont(ft);
     GridLayout gl = new GridLayout(3,3);
      f.setLayout(gl);
     Label l = new Label("Search Form",Label.CENTER);
     l.setForeground(Color.GREEN);
     f.add(l);
     Label lm1 = new Label("Id: ");
        
        tf1.addTextListener(this);
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
      
      if(str.equals("Search")){
          
          String id=tf1.getText();
          Services s = new Services();
         msg=s.search(id);
         cnt=1;
         this.dispose();
         new Menu2();
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
