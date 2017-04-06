import java.util.Scanner;

public class Anagram1
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
String news1= s1.toLowerCase();
String news2= s2.toLowerCase();

for(int i=0;i<s1.length();i++)
{
if(news2.indexOf(news1.charAt(i))==-1)
{
result=false;
}
}
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


