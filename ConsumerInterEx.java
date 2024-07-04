import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
public class ConsumerInterEx{
     static void addList(List<Integer> list){
  //retruns the sum of list values
  int result=list.stream().mapToInt(Integer::intValue).sum();
  System.out.println("sum of list values:"+result);
  }
  public static void main(String args[]){
   List <Integer>list=new ArrayList<Integer>();
     list.add(10);
     list.add(20);
     list.add(50);
     list.add(90);
    //refering method to string type consumer interface
    Consumer<List<Integer>> consumer=ConsumerInterEx::addList;
     consumer.accept(list);//calling consumer method
  }
 }