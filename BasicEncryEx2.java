import java.util.Base64;
public class BasicEncryEx2{
 public static void main(String args[])
 {
  //getting encoder
 Base64.Encoder encoder=Base64.getUrlEncoder();
  
  //encoding URL
   String str=encoder.encodeToString("http://www.newthoughtspvtlimited.com/".getBytes());
   System.out.println("encoded="+Base64.getUrlDecoder());

  //getting decoder
 Base64.Decoder decoder=Base64.getUrlDecoder();
 
  //decoding URL
  String str2=new String(decoder.decode(str));
  System.out.println("Decode URL:"+str2);
  }
 }