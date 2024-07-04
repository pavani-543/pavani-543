import java.util.regex.*;
class RegEx2
{
 public static void main(String args[])
 {
  System.out.println(Pattern.matches("[job]?","o"));//true
  System.out.println(Pattern.matches("[job]?","oo"));//false
  System.out.println(Pattern.matches("[job]?","ob"));//false
 System.out.println("+quantifiers....");
 System.out.println(Pattern.matches("[job]+","o"));//true
 System.out.println(Pattern.matches("[job]+","bb"));//true
 System.out.println(Pattern.matches("[job]+","jobmela"));//false
 System.out.println("*quantifiers");
 System.out.println(Pattern.matches("[job]*","jjbboo"));//true
 System.out.println(Pattern.matches("[job]*","mela"));//false
 System.out.println(Pattern.matches("[job]*","o"));//true
 }
 }