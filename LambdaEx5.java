//Lambda expression with filtering data
 import java.util.ArrayList;
 import java.util.stream.Stream;
 import java.util.List;
 class player{
  int id;
  String name;
  int runs;
  public player(int id, String name, int runs)
  {
   super();
   this.id=id;
   this.name=name;
   this.runs=runs;
   }
  }
  public class LambdaEx5
  {
   public static void main(String args[])
   {
   List<player>list=new ArrayList<player>();
   list.add(new player(3,"sachin",90));
   list.add(new player(2,"dhoni",79));
   list.add(new player(1,"kohli",99));
   list.add(new player(8,"raina",55));
   list.add(new player(9,"dhawan",88));
   list.add(new player(1,"lakshmi",99));
   Stream<player> filter_data=list.stream().filter(p->p.runs>85);
  filter_data.forEach(pla->System.out.println(pla.name+":"+pla.runs));
  }
 }