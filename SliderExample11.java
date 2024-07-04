import javax.Swing.*;
public class SliderExample11 extends JFrame{
 public ssliderExamle11(){
 Jslider slider=new Jslider(Jslider.HORIZONTAL,0,50,25);
 JPanel panel=new JPanel();
 panel.add(slider);
 add(panel);
 }
 public static void main(String s[]){
 SliderExample11 frame=new SliderExample11();
 frame.pack();
 frame.setVisible(true);
  }
 }