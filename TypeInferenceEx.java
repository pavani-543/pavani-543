import java.util.ArrayList;
import java.util.List;
 public class TypeInferenceEx{
   public static void showList(List<Integer>list){
     if(!list.isEmpty()){
     list.forEach(System.out::println);
     }
     else
     System.out.println("it is empty");
    }
   public static void main(String args[]){
    List<Integer> list1=new ArrayList<Integer>();
     list1.add(11);
     showList(list1);
    
   //java7version
   List<Integer>list2=new ArrayList<>();
   list2.add(14);
      showList(list2);

   //java8 version
   showList(new ArrayList<>());
  }
 }