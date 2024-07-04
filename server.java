import java.io.*;
import java.net.*;
class server
{
 public static void main(String args[])throws Exception
{
 ServerSocket ss=new ServerSocket(8888);
Socket s=ss.accept();
PrintStream ps=new PrintStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
BufferedReader kb=new BufferedReader(new InputStreamReader(System.in));
while(true)
{
 String readstr,writestr;
 while((readstr=br.readLine())!=null)
 {
  System.out.println(readstr);
  writestr=kb.readLine();
  ps.println(writestr);
  }
  ss.close();
   s.close();
  ps.close();
  br.close();
  kb.close();
     System.exit(0);
   }
  }
 }