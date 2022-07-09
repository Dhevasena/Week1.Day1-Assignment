package week1.day1;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=20,prime=0;
		for (int i=2; i<n; i++)
		{
		   prime=n%i;
			if (prime==0)
			{
				System.out.println(i+"Its not a prime number");
			}
			else
			{
				System.out.println(i+"Its a prime number");
			}
			
	
			
		}
		
	}

}
