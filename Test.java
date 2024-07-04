 public class Test
 {
  public static void main(String args[])
 {
  System.out.println(validate("ABCDEF abcdef 123450"));//true
  System.out.println(validate("GUAVA"));//true
  System.out.println(validate("vamsi"));//true
  System.out.println(validate("@#[]%"));//true
  System.out.println(validate("pavani.17596@gmail.com"));//false
  }
  public static boolean validate(String text)
  {
   return text.matches("^[\\w]+$");
   }
  }