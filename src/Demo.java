import java.util.Scanner;
/*Write a program to print the area of a rectangle by creating a class named 'Area'
        having two methods. First method named as 'setDim' takes length and breadth of
        rectangle as parameters and the second method named as 'getArea' returns the area of
        the rectangle. Length and breadth of rectangle are entered through keyboard */
class Area{
    void getDim(int l,int b){
        int parameter =l*b;
        System.out.println("paramter ="+parameter);

    }
    void getArea(int l,int b){
        double area=l*b;
        System.out.println("area ="+area);
    }
}
public class Demo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int l= sc.nextInt();
        int b=sc.nextInt();
        Area a= new Area();
        a.getArea(l,b);
        a.getDim(l,b);

    }
}
