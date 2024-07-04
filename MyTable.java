import javax.swing.*;
public class MyTable{
JFrame f;
 MyTable(){
 f=new JFrame();
 String data[][]={{"101","Amit","67000"},
                  {"102","Jai","750000"},
                  {"103","Sachin","70000"}},
Stringcolumn[]={"ID","NAME","SALARY"};
JTable jt=new JTable(data,column);
jt.setBounds(30,40,200,300);
Jscrollpane sp=new Jscrollpane(jt);
f.add(sp);
f.setSize(300,400);
//f.setLayout(null);
f.setVisible(true);
public static void main(String args[])
{
  new MyTable();
 }
}