import java.util.*;

class arraylist
{
	public static void main(String args[])
	{
		ArrayList<Integer>list = new ArrayList<>();
		
		list.add(45);
	     list.add(46);
		list.add(99);
		list.add(48);
		System.out.println("After Adding List is : "+list);

		System.out.println("1 st element is : "+list.get(1));
		
		list.add(2,6);
		System.out.println("After add List is : "+list);

		list.set(0,5);
		System.out.println("After set list is : "+list);

		System.out.println("Size of array list is :"+list.size());

		list.remove(2);
		System.out.println("after remove list is : "+list);

		Collections.sort(list);
		System.out.println("after sorting list is : "+list);

		System.out.println("list using loop :");
		for(int i=1;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
}