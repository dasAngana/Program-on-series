import java.util.*;
public class S4 {
    public static void main(String args[]) {
           Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();    

        int a=1,b=2;
        System.out.print(a+","+b);
        for(int i=0;i<x-2;i++)
        {
            System.out.print(","+a*b);
            int c=b;
            b=a*b;
            a=c;
        }
    }
}
