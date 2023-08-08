import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        int num,saquare;
        System.out.println("Enter a num");
        Scanner sc= new Scanner(System.in);
        num=sc.nextInt();
        saquare=num*num;
        System.out.println("Square of number "+num+" is "+saquare);
    }
}
