import java.util.*; 
import java.util.Queue; 


public class dequeue
{
	public static void main(String[] args)
	{
		Deque<String> dq= new ArrayDeque<String>();

		dq.add("element1");
		dq.addFirst("element2"); 
		dq.addLast("element3"); 
		dq.push("element4");
		dq.offer("element5");
		dq.offerFirst("element6");

		System.out.println("WaitingQueue : " + dq);
		
		System.out.println("Removed from WaitingQueue : "
		+ dq.remove());
	
		System.out.println("Removed from WaitingQueue : "
		+ dq.poll());

		System.out.println("dequeue after adding is : "+dq);
		
		dq.removeFirst();
         dq.removeLast();
         System.out.println("Deque after removing : "+ dq);
	}
}

		
	
