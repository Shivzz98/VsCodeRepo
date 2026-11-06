
public class ifElseCondition4 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int[] arr2 = { 1, 2, 3, 4, 5, 8, 100, 120, 123 };

		for (int p : arr2) 
		{
			
//check if arrays has multiple of 2
			
			if (p % 2 == 0)
				
			{
				System.out.println(p + " is a multiple of 2");
			} 
			
			else 
				
			{
				System.out.println(p + " is not a multiple of 2");
			}
		}
	}
}