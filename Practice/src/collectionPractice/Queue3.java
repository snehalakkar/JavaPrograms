package collectionPractice;

import java.util.PriorityQueue;

public class Queue3 {
public static void main(String[] args) {
	PriorityQueue<Employee> priorityQueue=new PriorityQueue<>();
	System.out.println("sort by name ");
	priorityQueue.add(new Employee("snehal", 21));
	priorityQueue.add(new Employee("pooja", 22));
	System.out.println(priorityQueue);

	while (priorityQueue.peek()!=null)
	{
		System.out.println(priorityQueue.poll());
	}

	System.out.println("sort by age ");
	PriorityQueue<Employee> priorityQueue1=new PriorityQueue<>(new SortByAgeComparator());
	priorityQueue.add(new Employee("snehalakkar", 21));
	priorityQueue.add(new Employee("rajwar", 22));
	System.out.println(priorityQueue);
} 
}
