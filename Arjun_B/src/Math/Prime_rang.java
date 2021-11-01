package Math;

import java.util.Arrays;

//import com.sun.tools.javac.code.Attribute.Array;

public class Prime_rang {
	
	public static boolean[] Prime(int n)
	{
		boolean[] isPrime=new boolean[n+1];
		Arrays.fill(isPrime, true);
		isPrime[0]=true;
		isPrime[1]=true;
		
		for(int i=2;i*i<=n;i++)
		{
			for(int j=i*2;j<=n;j+=i)
			{
				isPrime[j]=false;
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean[] isPrime=Prime(20);
		
		for(int i=0;i<=20;i++)
		{
			System.out.println(i+ " " + isPrime[i]);
		}

	}

}
