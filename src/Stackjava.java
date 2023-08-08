import java.util.Stack;
class StackJava {
    public static void main(String[] args)
    {
        Stack str =new Stack();
        boolean result= str.empty();
        System.out.println("Is the stack empty? " + result);
        str.push(33);
        str.push(22);
        str.push(221);
        str.push(221);
        str.pop();
        System.out.println("Elements in Stack: " + str);
        result= str.empty();
        System.out.println("Is the stack empty? " + result);
        System.out.println(str.peek());
        System.out.println(str.search(33));
        int x=str.size();
        System.out.println(x);


    }
}
