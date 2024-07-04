import java.awt.*;
import java.awt.evenet.*;

 class NewFrame extends Frame{
 NewFrame(){
  Label l=new Label("new window");
  add(l);
  setSize(300,300);
  setVisible(true);
  }
 }
 class AwtLogin implements ActionLisener
 {
  TextField t1,t2,t3,t3;
  
  AwtLogin(){
  Frame f=new Frame("Login page");
  Panel p=new Panel();
  CheckboxGroup cbg =new
 CheckboxGroup();
 FlowLayout f1=new FlowLayout();
 p.setLayout(f1);
 f.setSize(300,300);
 f.setVisible(true);
 f.addWindowListener(new WindowAdapter(){
      public void
   WinowCloseing(WindowEvent we){
        System.exit(0);
     }
     });
    t1=new TextField(20);
    t2=new TextField(20);
    t3=new TextField(20);
    t4=new TextField(20);
    Label l1=new Label("Name");
    Label l2=new Label("Email");
    Label l3=new Label("phone");
    Label l4=new Label("Address");
    Label l5=new Label("Gender");
    Checkbox c1=new Checkbox("Male",cbg,false);
    Checkbox c2=new Checkbox("Female",cbg,false);
    Checkbox c3=new Checkbox("others",cbg,false);
    Checkbox c4=new Checkbox("skip",cbg,false);
    Button b=new Button("Submit");
    p.add(l1);
    p.add(t1);
    p.add(l2);
    p.add(t2);
    p.add(l3);
    p.add(t3);
    p.add(l4);
    p.add(t4);
    p.add(l5);
    p.add(c2);
    p.add(c2);
    p.add(c3);
    p.add(c4);
    p.add(b);
    f.add(p);
    b.addActionListener(this);
    }
    public static void main(String args[]){
    AwtLogin e=new AwtLogin();
    }
   }
     