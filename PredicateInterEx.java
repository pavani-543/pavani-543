import java.util.function.Predicate;
public class PredicateInterEx{
      static Boolean Age(int age1)
    {
     if(age1>20)
        return true;
     else     
        return false;
   }
    public static void main(String args[])
     {
      //using predicate interface
       Predicate<Integer> predi=PredicateInterEx::Age;
        //calling predicate method
        boolean res=predi.test(10);
        System.out.println(res);
   }
  }