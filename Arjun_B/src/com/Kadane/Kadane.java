package com.Kadane;

import java.util.Scanner;

public class Kadane {
	
	public static void kadane(int arr[],int n)
	{
		int max_sum=0;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=arr[i];
			
			if(sum>max_sum)
				max_sum=sum;
			if(sum<0)
				sum=0;
		}
		System.out.println(max_sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter No of Elements in an array");
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		kadane(arr,n);

	}

}
