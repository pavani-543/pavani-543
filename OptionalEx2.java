// if value present
 import java.util.Optional;
  class OptionalEx2{
   public static void main(String args[])
   {
    String str[]= new String[30];
    //setting value for 10th index
     str[10]="THIS IS A JAVA PROGRAM";
     Optional<String> checkNull = Optional.ofNullable(str[10]);
     //pring value by using method reference
      checkNull.ifPresent(System.out::println);
      //printing value by using get method
       System.out.println(checkNull.get());
     }
    }