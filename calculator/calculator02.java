package calculator;

import javax.swing.*;
public class cal_frame {
   public static void main(String[] args)
 {

	    JFrame f=new JFrame(); //默认情况窗口不显示,窗口有自己的格局
	    f.setBounds(500, 200, 350, 400);
	    f.setLayout(null);//取消窗口布局

JButton b1=new JButton("1");
	    b1.setBounds(15, 40, 65, 65);
	    f.add(b1);
JButton b2=new JButton("2");
	    b2.setBounds(95, 40, 65, 65);
	    f.add(b2);
JButton b3=new JButton("3");
	    b3.setBounds(175, 40, 65, 65);
	    f.add(b3);
JButton b4=new JButton("4");
	    b4.setBounds(15, 115, 65, 65);
	    f.add(b4);
JButton b5=new JButton("5");
	    b5.setBounds(95, 115, 65, 65);
	    f.add(b5);
JButton b6=new JButton("6");
	    b6.setBounds(175, 115, 65, 65);
	    f.add(b6);
JButton b7=new JButton("7");
	    b7.setBounds(15, 195, 65, 65);
	    f.add(b7);
JButton b8=new JButton("8");
	    b8.setBounds(95, 195, 65, 65);
	    f.add(b8);
JButton b9=new JButton("9");
	    b9.setBounds(175, 195, 65, 65);
	    f.add(b9);
JButton b0=new JButton("0");
	    b0.setBounds(95, 275, 65, 65);
	    f.add(b0);
JButton badd=new JButton("+");
	    badd.setBounds(255, 40, 65,65);
	    f.add(badd);
JButton bsuc=new JButton("-");
	    bsuc.setBounds(255, 115, 65,65);
	    f.add(bsuc);
JButton bmul=new JButton("*");
	    bmul.setBounds(255, 195, 65, 65);
	    f.add(bmul);
JButton bdiv=new JButton("/");
	    bdiv.setBounds(255, 275,65, 65);
	    f.add(bdiv);
JButton bequ=new JButton("=");
	    bequ.setBounds(175, 275,65, 65);
	    f.add(bequ);
JButton bdot=new JButton(".");
	    bdot.setBounds(15, 275,65, 65);
	    f.add(bdot);
JTextField t=new JTextField();
            t.setBounds(15,5,305,30);
            f.add(t);
	    f.setVisible(true);//窗口显示一般房在所有内容都完成之后，再定义
	   }
}
