import java.util.StringJoiner;
public class StringJoinerEx{
  public static void main(String args[]){
   StringJoiner joinnames=new StringJoiner(",");
    //prints nothing because it is empty
    System.out.println(joinnames);
    
    //we can set default empty value
     joinnames.setEmptyValue("empty");
     System.out.println(joinnames);
     
    //Adding value to Stringjoiner
     joinnames.add("pavani");
     joinnames.add("hayansh");

     //returns length
     int len=joinnames.length();
     System.out.println("length:"+len);
 
    //return StringJoiner as string type
     String str=joinnames.toString();
     System.out.println(str);
     
   //finding character in given index value
     char ch=str.charAt(4);
     System.out.println("character is:"+ch);
     
    //Adding an element
    joinnames.add("sowmya");
    System.out.println(joinnames);
  
   //returns length of new string
     int newlen=joinnames.length();
     System.out.println("new length:"+newlen);
     }
    }