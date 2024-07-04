import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class JavaStreamEx2{
   public static void main(String args[]){
 //List1
 List<String> names=Arrays.asList("sushma","jhon","anil");
 //List2
 List<String> marks=Arrays.asList("90","98","99");
 //creating two streams from the two lists and concating them into one
 Stream<String> opstream=Stream.concat(names.stream(),marks.stream());
 //display the elements of the Concatenated stream
 opstream.forEach(str->System.out.print(str+" "));
  }
 }