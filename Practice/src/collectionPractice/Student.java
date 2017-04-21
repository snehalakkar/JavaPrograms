package collectionPractice;

public class Student {
	int rollno;
	String name;
	int age;
	int hashCode = 0;

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", age=" + age + "]";
	}
/*
	public int hashCode() {
		return this.rollno;
	}*/

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + hashCode;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + rollno;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (hashCode != other.hashCode)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (rollno != other.rollno)
			return false;
		return true;
	}
	
	/*public int hashCode() {
		
		System.out.println(hashCode);   
		return hashCode++;		//if you want to add duplicate value also then override the hashCode()
	}*/

	/*public boolean equals(Object arg) {
		if(!(arg instanceof Student)) 
			return false;
		this.hashCode = arg.hashCode();
		return true;
	}
	*/
	
	
}
