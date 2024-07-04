import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
 
//Declaring repeatable annotation type
 @Repeatable(Courses.class)
 @interface Course{
  String name();
  String day();
 }
 
 //Declaring container for repeatable annotation type
   @Retention(RetentionPolicy.RUNTIME)
   @interface Courses{
   Course[] value();
   }
   
  //repeating annotation
   @Course(name="clanguage",day="monday")
   @Course(name="c++",day="wednesday")
   @Course(name="JAVA",day="friday")
 
   public class RepeatingAnnotatEx{
     public static void main(String args[]){
      Course[] cour=RepeatingAnnotatEx.class.getAnnotationsByType
       (Course.class);
       for(Course cour1:cour)
       {
        System.out.println(cour1.name()+"on"+cour1.day());
      }
     }
    }