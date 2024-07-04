import java.util.function.BiFunction;
 class Mathematical
 {
  public static int add(int a,int b)
  {
   return a+b;
   }
   public static float add(int a,float b)
   {
    return a+b;
    }
   public static float add(float a,float b)
     {
      return a+b;
      }
     }
     public class MethodRef3
     {
     public static void main(String args[])
      {
       BiFunction<Integer,Integer,Integer> add1=Mathematical::add;
       BiFunction<Integer,Float,Float> add2=Mathematical::add;
       BiFunction<Float,Float,Float> add3=Mathematical::add;
       int res1=add1.apply(50,60);
       float res2=add2.apply(96,23.45f);
       float res3=add3.apply(43.67f,56.23f);
       System.out.println(res1);
       System.out.println(res2);
       System.out.println(res3);
       }
     }