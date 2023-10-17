package Github;

public class SumOfArray {

	public static void main(String[] args) {

		
		int [] a = { 11, 23, 443, 543, 45};
		
		int sum = 0;
		
		for(int i= 0; i<a.length; i++)
		{
			sum = sum + a[i];
		}
		
		System.out.println("Sum = " + sum);
		
		
	}

}
