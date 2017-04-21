package collectionPractice;

public class Employee implements Comparable {
	String name;
	int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Employee [name=" + name + ", age=" + age + "]";
	}

	
	 public int compareTo(Object o) { Employee e=(Employee)o; return
	 name.compareTo(e.name); }
	 

	/*public int compareTo(Object o) {
		Employee e = (Employee) o;
		if (age > e.age)
			return 1;
		if (age < e.age)
			return -1;
		if (age == e.age)
			return 0;
		return age;
	}*/
}
