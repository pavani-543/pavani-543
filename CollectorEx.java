import java.util.Stream.Collectors;
import java.util.ArrayList;
import java.util.Set;
 class Player
 {
   int id;
   String name;
   int runs;
 public Player(int id,String name,int runs)
 {
  this.id=id;
  this.name=name;
  this.runs=runs;
  }
 }
 public class CollectorsEx{
  public static void main(String args[])
  {
   List<Player> pl=new ArrayList<Player>();
   //Adding player data
   pl.add(new Player(1,"sachin",99));
   pl.add(new Player(2,"kholi",100));
   pl.add(new Player(3,"dhoni",89));
   pl.add(new Player(4,"raina",79));
   pl.add(new Player(5,"dravin",86));
    //fetching data as list
     List<Integer> runlist=pl.Stream()
     .map(x->x.runs)
     .collect(Collectors.toList());
     System.out.println(runlist);
   //converting data as set
    Set<Integer> runlist=pl.stream()
    .map(x->x.runs)
    .collect(Collectors.toSet());
    System.out.println(runlist);
   //using sum() method
   Integer sumruns=pl.Stream()
   .collect(Collector.summmingInt(x->x.runs));
   System.out.println("sum of runs:"+sumruns);
   Integer sumid=pl.Stream()
   .collect(Collectors.summingInt(x->x.id));
   System.out.println("sum of ids is:"+sumid);
   //getting average runs
   Double avg=pl.Stream()
    . collect(Collectors.averagingDouble(p->p.runs));
    System.out.println("average rins:"+avg);
    }
   }