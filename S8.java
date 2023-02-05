 import java.util.*;
class S8  {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt(); 
       int p=1;
        for(int i=1;i<x;i++)
        {
            System.out.print(p+" ");
         p=p+i;
        }
    }
    
}
