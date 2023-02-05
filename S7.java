import java.util.*;
class S7  {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();

        for(int i=7;i<x;i++)
        {
            int p=i+3;
            System.out.print(i+","+p+" ");
        }
    }
}    