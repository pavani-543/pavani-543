//Lambda expression with comparator
  import java.util.ArrayList;
  import java.util.Collections;
  import java.util.List;
   class player{
    int id;
    String name;
    int runs;
    public player(int id, String name,int runs)
   {
    super();
    this.id=id;
    this.name=name;
    this.runs=runs;
    }
   }
   public class LambdaEx4
   {
    public static void main(String args[])
    {
     List<player>list=new ArrayList<player>();
    list.add(new player(3,"dhoni",90));
    list.add(new player(2,"sachin",79));
    list.add(new player(1,"kohil",99));
    System.out.println("sorting on the basis of name...");
    Collections.sort(list,(p1,p2)->{
     return p1.name.compareTo(p2.name);
     });
     for(player p:list){
     System.out.println(p.id+" "+p.name+" "+p.runs);
     }
    }
   }