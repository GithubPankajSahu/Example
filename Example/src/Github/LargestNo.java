package Github;

public class LargestNo {

	public static void main(String[] args) {


		int a [] =  {11, 43, 64, 54};
		
		int max = a[0];
		
		for(int i = 1; i<a.length; i++)
		{
			if(a[0]<a[i])
			{
				max = a[i];
			}
		}
		
		
		System.out.println("max= " + max );
		
		
		
		
		
		
		
	}

}
