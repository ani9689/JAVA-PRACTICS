import java.util.Scanner;
class Student {
    String name;
    int roll_no;
    void outdata(){
        System.out.println("Name ="+name);
        System.out.println("roll no="+roll_no);
    }
}
public class demo2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Student s1=new Student();
        s1.name="Aniket";
        s1.roll_no=12;
        s1.outdata();
        Student s2=new Student();
        s2.name="Aniket";
        s2.roll_no=12;
        s2.outdata();
        //System.out.println("Name="+s1.name+" roll no="+s1.roll_no);

    }
}
