import java.io.*;
import java.net.*;
class client
{
 public static void main(String args[])throws Exception
 {
  Socket s=new Socket("localhost",8888);
//creat connection with the server
DataOutputStream dos=new DataOutputStream(s.getOutputStream());
//gathers data from user and sends it into the networking
BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
//Reads data from the network
BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
String str1,str;
while(!((str=kb.readLine()).equals("exist")))
{
 dos.writeBytes(str+"\n");
 str1=br.readLine();
 System.out.println(str1);
 }
 s.close();
 br.close();
 dos.close();
 kb.close();
 }
}