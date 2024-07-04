//Lambda expression with Multiple parameters
 interface Addition{
 int add(int x,int y);
 }
  public class LambdaEx1{
   public static void main(String args[])
  {
   Addition ad1=(x,y)->(x+y);
   System.out.println(ad1.add(10,20));
   Addition ad2=(x,y)->(x+y);
   System.out.println(ad2.add(100,200));
   }
  }