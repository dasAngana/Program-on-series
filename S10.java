import java.util.*;
class S10  {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt(); 
        
        for(int i=9;i<=x;i=i+2)
        { int p=21;
           System.out.printf(" %d %d",p,i);
        }
    }
}