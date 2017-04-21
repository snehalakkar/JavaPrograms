package concepts;

public class Aggregation {
	public static void main(String[] args) {
	Address address=new Address("maharashtra", "India", "ozar");
	Student student=new Student(1, "snehal", "ece", address);
	student.display();
}
}