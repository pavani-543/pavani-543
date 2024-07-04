//if value present
import java.util.Optional;
public class OptionalEx{
     public static void  main(String args[]){
      String str[]=new String[30];
   //setting value foe 10th index
    str[10]="This is a Javaprogram";
    Optional<String> checkNull=Optional.ofNullable(str[10]);
    if(checkNull.isPresent())//it checks value is present or not
  {
   String str1=str[10].toLowerCase();
   System.out.print(str1);
  }
  else
  {
   System.out.println("String value is not present");
   }
  }
 }