import java.util.Stack;

class stack_example
{

	public static void main(String ar[])
	{
		Stack<Integer> stk = new Stack<>();

		boolean result= stk.empty();
		System.out.println("is Stack Empty ?"+result);

		stk.push(45);
		stk.push(25);
		stk.push(48);
		stk.push(49);
		stk.push(50);
		
		System.out.println("Elements of stack are : "+stk);
		result= stk.empty();
		System.out.println("is Stack Empty ? "+result);

		int ele = stk.peek();
		System.out.println("Topmost element is : "+ele); 
		
		System.out.println("Element poped from stack is : "+stk.pop());

		int location = stk.search(45);
		System.out.println("The Location of element is : "+location);

		int siz = stk.size();
		System.out.println("Size of Stack is "+siz);
		
		
	}

}