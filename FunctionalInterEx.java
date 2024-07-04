/* a functional interface is extending to a non-functional interface*/
 interface mesg{
      default void mssg(){
    System.out.println("L technologies");
   }
  }
  @FunctionalInterface
  interface message extends mesg{
    void prtmsg(String str);
    }
    public class FunctionalInterEx implements message{
 
     public void prtmsg(String str){
       System.out.println(str);
      }
     public static void main(String args[]){
      FunctionalInterEx fie=new FunctionalInterEx();
       fie.prtmsg("its a java program");
       fie.mssg();
    }
   }
     
            