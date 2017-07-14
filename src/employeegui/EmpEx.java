/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employeegui;

import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author sachith
 */
public class EmpEx extends Frame implements ActionListener, TextListener {

    //field

    TextField tfm1 = new TextField(10);
    TextField tfm2 = new TextField(10);
    Button bm = new Button("Enter");
    Button ex = new Button("Exit");

    Label error = new Label("Enter Valid input ... Try Again");
    static int cnt = 0;

    static int cnt1 = 0;
    //method

    //constructor
    EmpEx() {
//        this.disable();
//        this.setVisible(false);

        Frame f = new Frame();
        f.setTitle("Emp Excercise");
        f.setBounds(10, 10, 600, 400);

        GridLayout gl = new GridLayout(3, 1);
        f.setLayout(gl);

        Font ft = new Font("Time New Roman", Font.BOLD, 24);

        f.setFont(ft);

        Label lt = new Label("Employee Managment System", Label.CENTER);

        lt.setForeground(Color.BLUE);

        f.add(lt);

        Label lm1 = new Label("Id: ");

        tfm1.addTextListener(this);
        Label lm2 = new Label("Psw: ");

        tfm2.addTextListener(this);
        tfm2.setEchoChar('*');

        bm.addActionListener(this);
        ex.addActionListener(this);
        f.addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent ae) {
//        f.dispose();
                f.dispose();
            }
        });

        Panel pm = new Panel();
        pm.add(lm1);
        pm.add(tfm1);
        pm.add(lm2);
        pm.add(tfm2);
        pm.add(bm);
        pm.add(ex);
        f.add(pm);

        Label lb = new Label("OOP", Label.CENTER);
        lb.setForeground(Color.red);
        Panel pb = new Panel();
        if (cnt == 0) {
            error.setVisible(false);
        } else {
            pb.add(error);
            error.setVisible(true);
        }
        if (cnt1 == 1) {
            pb.add(error);
            error.setVisible(true);
            f.setVisible(false);

        } else {
            f.setVisible(false);
        }

        pb.add(lb);
        f.add(pb);

        f.setVisible(true);

    }//constructor EmpEx

    public void actionPerformed(ActionEvent ae) {
        String str = ae.getActionCommand();

        if (str.equals("Enter")) {
            if ((tfm1.getText().equals("sachit")) && (tfm2.getText().equals("sachit"))) {
//                        this.setVisible(false);
//                        this.dispose();
//                        this.disable();
                cnt1 = cnt1 + 1;
//                this.addWindowListener(new WindowAdapter() {
//
//                    public void windowClosing(WindowEvent ae) {
////        f.dispose();
//        this.dispose();
//                        System.exit(0);
//                    }
//                });
               this.setVisible(false);
                new Menu();

            } else {
                cnt++;
                new EmpEx();
            }
        }
        if (str.equals("Exit")) {
            System.exit(0);
        }
    }

    public void textValueChanged(TextEvent te) {

    }

}//EmpEx

