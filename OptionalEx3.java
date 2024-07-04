import java.util.Optional;
public class OptionalEx3{
   public static void main(String args[]){
    String str[]=new String [30];
    str[10]="learing java8 features";
    // it returns an empty=Optional.empty();
     Optional <String> empty=Optional.empty();
     System.out.println(empty);
     //it retruns a non-empty optional
      Optional <String> value=Optional.of(str[10]);
      /* if value is present,it returns an optional otherwise returns an empty optional*/
      System.out.println("filtered value:"+value.filter((s)->s.equals("lmn")));
      System.out.println("filtered value:"+value.filter((s)->s.equals("learing javas features")));
     /* it returns value of an optional,if value is not present, it throws an NoSuchElementException*/
     System.out.println("getting value:"+value.get());
     // it returns hashcode of the value 
     System.out.println(("getting hashcode:"+value.hashCode()));
     /*it returns true, if value is present,otherwise return false*/
    System.out.println("is value present:"+value.isPresent());
    /*it returns non-empty optional,if value is present otherwise returns an empty optional*/
    System.out.println("Nullable optional:"+Optional.ofNullable(str[10]));
    /* it returns value if available, otherwise returns specified value*/
    System.out.println("orelse:"+value.orElse("value is not present"));
    System.out.println("orelse:"+empty.orElse("value is not present"));
    value.ifPresent(System.out::println);
    }
   }