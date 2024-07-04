import javax.Swing.*;
public class Myprogress extends JFrame{
    JprogressBar jb;
   int i=0;num=0;
   Myprogress(){
   jb=new JprogressBar(0,2000);
   jb=SetBounds(40,40,200,30);
   jb.setValue(0);
   jb.setStringpainted(true);
   add(jb);
   setSize(400,400);
   setLayout(null);
   }
    public void iterate(){
    while(i<=2000){
    jb.SetValue(i);
    i=i+20;
    try{Thread.sleep(150);} catch(Exception e){}
   }
  }
   public static void main(String args[]){
   Myprogress m=new Myprogress();
   m.setVisible(true);
   m.iterate();
   }
  }
   