/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        int t,n,k;
        Scanner sc=new Scanner(System.in);
        t=sc.nextInt();
        while(t>0)
        {
            System.out.println("JJJJ");
            n=sc.nextInt();
            k=sc.nextInt();
            for(int i=0;i<n;n++)
            {
                int p=sc.nextInt();
                if(k>p){
                    k=k-p;
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
        }

    }
}
