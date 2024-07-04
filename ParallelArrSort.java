import java.util.Arrays;
 public class ParallelArrSort{
  public static void main(String agrs[]){
 //creating an array
  int[] arr={10,3,78,1,56,23,12};
  //iterating an array elements
   for(int i:arr){
     System.out.println(i+"");
     }
 //sorting array elements parllel and passing start,end index
     Arrays.parallelSort(arr,1,5);
     System.out.println("\n sorting elements");
     //iterating array elements
      for(int i:arr){
      System.out.println(i+"");
    }
   }
  }
 
  