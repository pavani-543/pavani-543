import java.util.Base64;
public class BasicEncryEx3{
   public static void main(String args[])
   {
    //getting mime encoder
    Base64.Encoder encoder=Base64.getMimeEncoder();
    String mesg="Working as software trainee in new thouhts pvt limited";
    String str=encoder.encodeToString(mesg.getBytes());
    System.out.println("encoded mime message:"+str);
    //getting mime decoder
    Base64.Decoder decoder=Base64.getMimeDecoder();
    //decoding mime encoded messages
    String str1=new String(decoder.decode(str));
    System.out.println("decoded mesg:"+str1);
   }
  }