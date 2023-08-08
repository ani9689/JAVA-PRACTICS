import java.util.*;

class queueexample
{
	public static void main(String args[])
	{
		Queue<String> eq = new LinkedList<>();
		eq.add("element 1");
		eq.add("element 2");
		eq.add("element 3");
		eq.add("element 4");
		eq.offer("element 5");
		
		System.out.println("Waiting Queue : "+eq);
		
		System.out.println("is Waiting Queue empty?: "
		+eq.isEmpty());
		
		System.out.println("Waiting Queue contains the element"+eq.contains("hello"));
		
		
		System.out.println("First element: "+eq.element());
		System.out.println("First element: "+eq.peek());
	
		System.out.println("Removing element: "+eq.poll());
	
		System.out.println("Removing element: "+eq.size());	
	}
}