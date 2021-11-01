package com.dp;

import java.util.Arrays;

public class MinCoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=18;
		int a[]= {5,7,2};
		int dp[]=new int[n+1];
		Arrays.fill(dp, -1);
		dp[0]=0;
		int ans=minCoins(n, a,dp);
		System.out.println(ans);
		for(int x:dp)
		{
			System.out.print(x + " ");
		}

	}
	
	static int minCoins(int n, int a[],int dp[])
	{
		if(n==0)
		{
			return 0;
		}
		int ans=Integer.MAX_VALUE;
		
		for(int i=0;i<a.length;i++)
		{
			if(n-a[i]>=0)
			{
				int subans=0;
				if(dp[n-a[i]] !=-1)
					subans=dp[n-a[i]];
				else
				{
					subans=minCoins(n-a[i], a,dp);
				}
				 
				
				if(subans!= Integer.MAX_VALUE && subans+1<ans)
					ans=subans+1;
			}
		}
		dp[n]=ans;
		return dp[n];
	}

}
