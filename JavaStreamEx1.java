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
  public int getId(){
           return id;
    }
     public String getName(){
     return name;
    }
   public int getruns(){
    return runs;
   }
  }
  public class JavaStreamEx1{
    public static void main(String args[])
     {
      List<Player>pl=new ArrayList<Player>();
    //Adding player data
    pl.add(new Player(1,"sachin",99));
    pl.add(new Player(2,"kholi",100));
    pl.add(new Player(3,"dhoni",89));
    pl.add(new Player(4,"raina",79));
    pl.add(new Player(5,"dravin",86));
    List<Integer>PlayerRuns=pl.stream()
    .filter(p->p.runs>90)//filtering data
    //fectching runs by referring getRuns method
    .map(player::getRuns)
    //collecting a list
    .collect(Collectors.toList());
    System.out.print(PlayerRuns);
   }
  }