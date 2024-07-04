//Lambda expression with foreach loop
 import java.util.*;
 public class LambdaEx2
  {
   public static void main(String args[])
  {
   List<String> list=new ArrayList<String>();
   list.add("sachin");
   list.add("kohli");
   list.add("dhoni");
   list.add("ifranpatan");
   list.forEach(
        (n)->System.out.println(n)
        );
       }
      }