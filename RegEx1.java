import java.util.regex.*;
class RegEx1
{
 public static void main(String args[])
 {
  boolean r1=Pattern.matches(".s","as");
  boolean r2=Pattern.matches(".a","anusha");
  boolean r3=Pattern.matches("..a","anupama");
  boolean r4=Pattern.matches("..m","iam");
  boolean r5=Pattern.matches("...e","true");
  System.out.println(r1);//true
  System.out.println(r2);//false
  System.out.println(r3);//false
  System.out.println(r4);//true
  System.out.println(r5);//true
  }
 }