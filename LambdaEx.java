interface Message{
public void msg();
 }
 public class LambdaEx
 {
  public static void  main(String args[])
 {
  String s1="hello";
  //with Lambda
  Message m=()->{
  System.out.println(s1);
  };
  m.msg();
  }
 }