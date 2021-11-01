package com.Majority_element;

import java.util.Scanner;

//import com.sun.tools.jdeprscan.scan.Scan;

public class Major {
	
	public static void findMajority(int arr[],int n)
	{
		int ans_count=1;
		int index=0;
		for(int i=1;i<n;i++)
		{
			if(arr[index]==arr[i])
				ans_count++;
			else {
				ans_count--;
				
			}
			if(ans_count==0)
				index=i;
				ans_count=1;
		}
		
		if(isMajority(arr,index)==true)
			System.out.println(arr[index] + " is major");
		else
			System.out.println("No major element");
	}

	public static boolean isMajority(int arr[],int index)
	{
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]==arr[index])
				count++;
			
		}
		
		if(count>(arr.length)/2)
			return true;
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no. of elements");
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		findMajority(arr,n);

	}

}
