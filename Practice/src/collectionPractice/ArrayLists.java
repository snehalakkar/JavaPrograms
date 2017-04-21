package collectionPractice;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {
public static void main(String[] args) {
	List list=new ArrayList();
	
	list.add(21);
	list.add(25);
	System.out.println(list);
	
	System.out.println("iterating using for each loop ");
	for(Object o:list){
		System.out.println(o);
	}
	
	list.add(1, 51);
	list.add(2, 44);
	System.out.println(list);
	
	list.remove(2);//for remove we give index as an argument
	list.remove(new Integer(25));
	System.out.println(list);
}
}
