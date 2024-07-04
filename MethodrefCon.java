interface printMsg
{
 Message getMessage(String msg);
 }
 class Message{
    public Message(String msg){
     System.out.println(msg);
    }
   }
  public class MethodRefCon{
    public static void main(String args[])
    {
     printMsg mss=Message::new;
      mss.getMessage("method reference using constructor");
   }
 }