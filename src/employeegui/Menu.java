/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeegui;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.BoxLayout;


/**
 *
 * @author sachith
 */
public class Menu extends Frame implements ActionListener {
    
    Button bm = new Button("Next");
    CheckboxGroup cbGroup = new CheckboxGroup();
    Menu(){
    Frame f = new Frame();
    f.setBounds(10,10,600,400);
   // BorderLayout bl = new BorderLayout();
    
    GridLayout gl = new GridLayout(3,1);
        f.setLayout(gl);
        
    Label l = new Label("Its Your menu",Label.CENTER);
    f.add(l);
    
    
    Checkbox cb1 = new Checkbox("Register");
    cb1.addItemListener(null);
    cb1.setCheckboxGroup(cbGroup);
    
    Checkbox cb2 = new Checkbox("Search");
    cb2.addItemListener(null);
    cb2.setCheckboxGroup(cbGroup);
    
    Checkbox cb3 = new Checkbox("Total Number of Employee");
    cb3.addItemListener(null);
    cb3.setCheckboxGroup(cbGroup);
    
    Checkbox cb4 = new Checkbox("Employee List");
    cb4.addItemListener(null);
    cb4.setCheckboxGroup(cbGroup);
    
    Checkbox cb5 = new Checkbox("Exit");
    cb5.addItemListener(null);
    cb5.setCheckboxGroup(cbGroup);
    
    bm.addActionListener(this);
    f.addWindowListener(new WindowAdapter() {
    
    public void windowClosing(WindowEvent ae) {
        f.dispose();
    }
        });
     Panel pm =new Panel();   
     
     pm.setBounds(61, 11, 81, 140);
     //pm.setBounds(10,10,10,10);
    pm.setLayout(new BoxLayout(pm, BoxLayout.Y_AXIS));
        
    // f.setLayout(new FlowLayout(FlowLayout.CENTER,40,30)); 
     
     pm.add(cb1);
     pm.add(cb2);
     pm.add(cb3);
     pm.add(cb4);
     pm.add(cb5);
     
     
     f.add(pm);
     
     Panel pm1= new Panel();
     
     pm1.add(bm);
     f.add(pm1);
      
    
    f.setVisible(true);
            
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       Checkbox c = cbGroup.getSelectedCheckbox();
       
            
      String str = ae.getActionCommand();
      
      if(str.equals("Next")){
        
          switch(c.getLabel())
          {
            case "Register":
                this.dispose();
                  new Menu1(); 
                
                  break;
            case "Search":
                this.dispose();
                  new Menu2();
                  break;
            case "Total Number of Employee":
                this.dispose();
                  new Menu3(); 
                  break;
            case "Employee List":
                this.dispose();
                  new Menu4(); 
                  
                  break;
            case "Exit":
                  System.exit(1);
                 
                  }
          
      }
        
    }
}
