import java.awt.event.*;
import javax.Swing.*;
public class TArea{
JTextArea area;
JFrame f;
TArea(){
f=new JFrame();
area=new JTextArea(300,300);
area.setBounds(10,30,300,300);

area.setBackground(color.black);
area.setForeground(color.white);
f.add(area);
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
 public static void main(String args[]){
 new TArea();
 }
}