import java.Swing.*;
import java.Radio{
JFrame f;
Radio(){
f=new Frame();
JRadioButton r1=new JRadioButton("A)male");
JRadioButton r2=new JRadioButton("B)Female");
 r1.setBounds(50,100,70,30);
 r2.setBounds(50,100,70,30);

ButtonGroup bg=new ButtonGroup();
bg.add(r1);bg.add(r2);
f.add(r1); f.add(r2);
 f.setSize(300,300);
 f.setLayout(null);
 f.setVisible(true);
 }
 public static void main(String args[])
 {
  new Radio();
  }
 