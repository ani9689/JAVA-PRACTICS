import java.util.Stack;

public class StackjavaAdv{
    public static void main(String[] args) {
     Stack stack =new Stack();
     stack.push("Aniket Swami");
     stack.push("Pratik");
     stack.push("swami");
     stack.pop();
     System.out.println("Stack is "+stack);
     boolean result= stack.empty();
     System.out.println("Is the stack empty? " + result);

    }
}
