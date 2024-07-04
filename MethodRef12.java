public class MethodRef12{
  public void msg(){
   System.out.println("instance method");
   }
    public static void main(String args[]){
    Thread t2=new Thread(new MethodRef12()::msg);
    t2.start();
    }
   }