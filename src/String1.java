public class String1 {
    public static void main(String[] args) {
        String s1="PW";
        String s2=s1.concat("Skills");
        String s3=new String("PW");
        s3=s3.concat("Skills");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s2==s3);
    }
}
