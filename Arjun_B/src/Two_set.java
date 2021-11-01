
public class Two_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{ 2, 3, 7, 9, 11, 2, 3, 11 };
		int temp=0;
		for(int i=0;i<8;i++)
		{
			temp=temp^arr[i];
		}
		
		int right_most=temp&(-temp);
		
		int sum1=0;
		int sum2=0;
		
		for(int i=0;i<8;i++)
		{
			if ((right_most&arr[i])==0)
				sum1=sum1^arr[i];
			else
			{
				sum2=sum2^arr[i];
			}
		}
		
		System.out.println(sum1);
		System.out.println(sum2);

	}

}
