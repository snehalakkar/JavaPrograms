package collectionPractice;

import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.add("snehal");
		queue.offer("akkar");
		queue.offer("soni");
		queue.add("hi");
//		queue.peek();
		System.out.println(queue);
		queue.poll();
		System.out.println("poll"+queue);
		System.out.println(queue.peek());
		while (true) {
			String name = queue.poll();
			if (name != null) {
				break;
			}
			System.out.println(name);
		}

	}
}