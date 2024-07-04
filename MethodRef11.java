interface message
{
   void msg();
 }
 public class MethodRef11
 {
  public void printMsg(){
    System.out.println("non-static method");
    }
    public static void main(String args[]){
     MethodRef11 method=new MethodRef11();
     message mss=new MethodRef11()::printMsg;
     mss.msg();
     message mss2=new MethodRef11()::printMsg;
     mss2.msg();
    }
   }