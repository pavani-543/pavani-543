interface Message
{
 void msg();
 }
  public class MethodRef{
    public static void printMsg(){
      System.out.println("static method");
    }
    public static void main(String args[])
    {
     //referring static method
      Message ms=MethodRef::printMsg;
     //calling interface method
      ms.msg();
      }
     }