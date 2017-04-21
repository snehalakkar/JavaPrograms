import java.util.Scanner;
import java.util.Arrays;
public class Anagram
{
public static void main(String[] args)
{
Scanner scan =new Scanner(System.in);
System.out.println("Enter first String:");
String first=scan.next();

System.out.println("Enter second String:");
String second=scan.next();

isAnagram(first,second);
}



static void isAnagram(String first,String second)
{ 

 boolean result=true;

String s1=first.replaceAll(" ","");
String s2=second.replaceAll(" ","");

if(s1.length()!= s2.length())
{
result=false;
}

else
{
char[] news1= s1.toLowerCase().toCharArray();
char[] news2= s2.toLowerCase().toCharArray();

Arrays.sort(news1);
Arrays.sort(news2);

result=Arrays.equals(news1,news2);
}

if(result)
{
System.out.println(s1+" and "+s2+ " are anagrams");
}
else
{
System.out.println(s1+" and "+s2+ "are not anagrams");
}
}
}

