import java.util.LinkedList;
import java.util.Scanner;

public class Duplicate {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int array[]=new int[7];
		
		for(int i=0;i<7;i++)
		{
			array[i]=sc.nextInt();
		}
		int  temp=0;
		for(int i=0;i<7;i++)
		{
			temp=temp^array[i];
		}
		
		System.out.println(temp);
		
		sc.close();

	}

}
