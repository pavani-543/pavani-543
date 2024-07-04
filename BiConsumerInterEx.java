import java.util.function.BiConsumer;
 public class BiConsumerInterEx{
  static void display(String name,Integer runs)
  {
   System.out.println(name+" "+runs);
   }
   public static void main(String args[]){
   BiConsumer<String,Integer>bicon=BiConsumerInterEx::display;
   bicon.accept("dhoni",99);
   bicon.accept("kholi",100);
 //whit Lambda expression
 BiConsumer<String,Integer>bicon2=(name,runs)->
  System.out.println(name+" "+runs);
  bicon2.accept("sachin",89);
  }
 }