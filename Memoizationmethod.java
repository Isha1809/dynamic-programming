import java.util.*;
public class Memoizationmethod {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        int x=helper(n,dp);
        System.out.println(x);

    }
    public static int helper(int n,int dp[])
    {
        if(n<=1)
        return 1;
        if(dp[n]!=-1)
        {
            return dp[n];
        }
        dp[n]=helper(n-1,dp)+helper(n-2,dp);
        return dp[n];
    }
}
