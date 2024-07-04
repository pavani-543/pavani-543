import java.util.function.BiFunction;
class Mathematical{
  public int add(int a,int b)
  {
   return(a+b);
   }
  }
  public class MethodRef13{
   public static void main(String args[])
    {
 BiFunction<Integer,Integer,Integer> add=new Mathematical()::add;
     int result=add.apply(40,60);
     System.out.println(result);
    }
   }