
public class Three_Dup {
	
	public static  void findElement(int[] arr) {
		  int ones = 0;
		  int twos = 0;
		  for (int ele:arr) {
		    ones = (ones ^ ele) & ~twos;
		    twos = (twos ^ ele) & ~ones;
		  }
		 System.out.println(ones);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{ 2, 2, 2, 5, 1,1,1,4,4,4 };
		
		
		findElement(arr);
		

	}

	
}
