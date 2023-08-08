import java.util.Scanner;

class Dog {
    // Instance Variables
    String name;
    String breed;
    int age;
    String color;

    public void getDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = sc.nextLine();
        System.out.println("Enter breed: ");
        breed = sc.nextLine();

        System.out.println("Enter age: ");
        age = sc.nextInt();
        System.out.println("Enter color: ");
        color = sc.nextLine();
    }

    public void showDetails() {
        System.out.println("Name is: " + name);
        System.out.println("Breed is: " + breed);
        System.out.println("Age is: " + age);
        System.out.println("colour is: " + color);

    }
}

public class classesandobj {
    public static void main(String[] args)
    {
        Dog d1=new Dog();
        d1.getDetails();
        d1.showDetails();
    }
}

