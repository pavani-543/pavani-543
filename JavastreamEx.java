import java.util.*;
import java.util.stream.Collectors;
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
class JavastreamEx{
   public static void main(String args[]){
   List<Player> pl=new ArrayList<Player>();
   // Addng player data
    pl.add(new Player(1,"sachin",99));
    pl.add(new Player(2,"kohili",88));
    pl.add(new Player(3,"dhoni",89));
    pl.add(new Player(4,"raina",89));
    pl.add(new Player(5,"dravid",100));
    //compact approch for filtering data
     pl.stream()
       .filter(player->player.runs==89)
       .forEach(player->System.out.println(player.name));
/*accounting runs,by referring methgod of Integer class by appling reduce() method*/
 int runTotal1=pl.stream()
      .map(player->player.runs)
      .reduce(0,Integer::sum);
      System.out.println("total runs:"+runTotal1);
   //max() method to get maximum runs
   Player runs1=pl.stream()
   .max((player1,player2)->player1.runs>player2.runs?1:-1).get();
    System.out.println("max runs in the list:"+runs1.runs);
    //min() method to get minimum runs
     Player runs2=pl.stream()
     .max((player1,player2)->player1.runs<player2.runs?1:-1).get();
     System.out.println("min runs in the list:"+runs2.runs);
     //count no.of player based on the filter
      long count=pl.stream()
      .filter(player->player.runs<90)
      .count();
      System.out.println("players count value:"+count);
      //converting player lists into sets
       Set<Integer> runslist=pl.stream()
     //filter player on the base of runs
     .filter(player->player.runs<99)
     .map(player->player.runs)
     //collect it as set(remove duplicate elements)
      .collect(Collectors.toSet());
      System.out.println("selected runs lists:"+runslist);
      
      //converting player list into map
      Map<Integer,String> playerMap=pl.stream()
      .collect(Collectors.toMap(p->p.id,p->p.name));
       System.out.println("lists into maps:"+playerMap);
       //use collectors method to sum of the runs
        int runTotal=pl.stream()
        .collect(Collectors.summingInt(player->player.runs));
         System.out.println("player runs total:"+runTotal);
    }
   }