import java.util.*;
class S11  {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt(); 
        for(int i=14;i<x;i=2*i-8)
        {
            System.out.print(i+" "+2*i+" ");
        }
         
    }
}