public class MethodRef1{
   public static void threadMsg(){
        System.out.println("Thread running");
         }
         public static void main(String args[])
        {
         Thread t1=new Thread(MethodRef1::threadMsg);
         t1.start();
       }
      }