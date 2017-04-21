package collectionPractice;

import java.util.Comparator;

public class SortByAgeComparator implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		Employee e=(Employee)arg0;
		Employee e1=(Employee)arg1;
		return e.age-e1.age;
	}

	
}
