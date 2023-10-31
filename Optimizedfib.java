import java.util.*;
public class Optimizedfib {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value for the n:");
        int n=sc.nextInt();
        int x=findfib(n);
        System.out.println(x);
    }
    public static int findfib(int n)
    {
        int prev2=0;
        int prev=1;
        int curi=0;
        for(int i=2;i<=n;i++)
        {
curi=prev+prev2;
prev2=prev;
prev=curi;
        }
        return prev;
    }

}
