package collectionPractice;  

import java.util.HashSet;
import java.util.Set;

public class Hashcode1 {
public static void main(String[] args) {
	Set set=new HashSet();
set.add(new Student(1, "a", 23));
set.add(new Student(2, "b", 21));
set.add(new Student(1, "h", 23));
set.add("qspiders");
}
}
