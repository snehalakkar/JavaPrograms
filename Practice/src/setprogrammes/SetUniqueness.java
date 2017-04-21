package setprogrammes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetUniqueness {
public static void main(String[] args) {
	Set set=new HashSet<>();
	set.add("java");
	set.add("android");
	set.add("angular");
	set.add("ios");
	System.out.println(set);//output is random
	
	Set set1=new LinkedHashSet<>();
	set1.add("java");
	set1.add("android");
	set1.add("angular");
	set1.add("ios");
	System.out.println(set1);//insertion order is maintained
	
	Set set2=new TreeSet<>();
	set2.add("java");
	set2.add("android");
	set2.add("angular");
	set2.add("ios");
	System.out.println(set2);//sorting by natural order
}

}
