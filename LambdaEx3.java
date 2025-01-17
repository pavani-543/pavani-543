//Lambda expression with threads
 class LambdaEx3{
  public static void main(String args[])
  {
   //thread example without Lambda
    Runnable r1=new Runnable(){
    public void run(){
     System.out.println("thread 1 is running...");
     }
    };
    Thread t1=new Thread(r1);
    t1.start();
    //thread example with Lambda
      Runnable r2=()->{
       System.out.println("Thread 2 is running...");
     };
     Thread t2=new Thread(r2);
     t2.start();
    }
   }