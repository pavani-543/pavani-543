import java.util.Base64;
public class BasicEncryEx{
  public void main(String args[])
 {
  // getting encoder
  Base64.Encoder encoder=Base64.getEncoder();
  //creating byte array
  Byte Arr={20,22};
  //encoding byte array
  Byte Arr2[]=encoder.encoder(Arr);
  //make sure it has enough size to storecopied bytes
  Byte Arr3[]=new Byte[10];
  //returns no of bytes
   int y=encoder.encode(Arr,Arr3);
   System.out.println("encoded byte array written to another array:"+Arr3);
   System.out.println("no of bytes:"+y);
   //encoding string
    String str=encoder.encodeToString("java8features".getBytes());
       System.out.println("encoded String:"+str);
     //getting decoder
      Base64.Decoder decoder=Base64.getDecoder();
      //decoding String
     String str1=new String(decoder.decode(str));
     System.out.println("decoded String:"+str1);
     }
    }
  