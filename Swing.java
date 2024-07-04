import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class JcolorCooserExample extends JFrame implementsActionListener{
 JButton b;
 Cotainer c;
 JColorChooserExample(){
  c=getContentpane();
  c.getLayout(new FloewLayout());
  b=new JButton("color");
  b.addActionListener(this);
  c.add(b);
  }
 public void actionperformed(ActionEvent){
 Color initalcolor=Color.RED;
 Color color=JColorChooser.showDailog(this,"Select acolor",intial color);
 }
 public Static void main(String args[]){
 JColor ChooserExample ch=new JcolorChooserExample();
 ch.setSize(400,400);
 ch.setVisible(true);
 ch.setDefaultCloseOperation(EXIT_ON_CLOSE);
  }
 }