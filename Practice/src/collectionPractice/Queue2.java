package collectionPractice;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue2 {
public static void main(String[] args) {
	Queue queue=new LinkedList<>();
	queue.add(50);
	queue.add(30);
	queue.add(40);
	queue.add(null);
	System.out.println(queue.size());//in linkedlist we can store null elements also
	
	System.out.println(queue);//insertion order is maintained bcoz elements are not sorted
	
	Queue queue2=new PriorityQueue<>();
	queue2.add(65);
	queue2.add(31);
	queue2.add(42);
	
	System.out.println(queue2);//insertion order is not maintained bcoz elements are sorted
	
	while(queue.peek()!=null)
{
	System.out.println(queue.poll());	
}
	
	while(queue2.peek()!=null)
	{
		System.out.println("\n"+queue2.poll());	
	}
}
}
