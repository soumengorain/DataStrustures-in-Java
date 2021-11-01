package com.Stock_Buy_N_Sell;

import java.util.Scanner;

public class Stock {
	
	public static void constant_space(int arr[],int n)
	{
		int min=arr[0];
		int max_diff=0;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]<min)
				min=arr[i];
			if(arr[i]-min> max_diff)
				max_diff=arr[i]-min;
			//System.out.println(max_diff);
		}
		System.out.println(max_diff);
	}
	
	public static void bruteforce(int arr[],int n)
	{
		int max_sum=0;
		int max_so_far=arr[0];
		
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				max_so_far=arr[j]- arr[i];
				
				if(max_so_far>max_sum)
					max_sum=max_so_far;
			}
		}
		System.out.println(max_sum);
	}
	
	public static void auxillary(int arr[],int n)
	{
		int aux[]=new int[n];
		aux[n-1]=arr[n-1];
		
		for(int i=n-2;i>=0;i--)
		{
			if(aux[i+1]>arr[i])
				aux[i]=aux[i+1];
			else
				aux[i]=arr[i];
		}
		
		int max=0;
		
		for(int i=0;i<n;i++)
		{
			if(aux[i]-arr[i]>max)
				max=aux[i]-arr[i];
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter no. of elements in an Array");
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		int arr[]=new int[num];
		
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		//bruteforce(arr,num);
		//auxillary(arr,num);
		constant_space(arr,num);

	}

}
