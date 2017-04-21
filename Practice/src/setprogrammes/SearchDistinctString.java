package setprogrammes;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SearchDistinctString {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the string to find distinct character from it");
	String string=scanner.next();
	searchDistint(string);
}

private static void searchDistint(String string) {
Set set=new LinkedHashSet<>();
for(int i=0;i<string.length();i++){
	set.add(string.charAt(i));
}
System.out.println(set);

String s1="";
for(Object o:set)
{
	s1+=o;
}
System.out.println("unique char are: "+s1);
}
}
