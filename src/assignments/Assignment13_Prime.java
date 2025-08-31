package assignments;

public class Assignment13_Prime {

	public boolean prime(int n)
	{
		//number less than or equal to 1 is not prime
		if (n<= 1)
		{
			return false;
		}
		
		else if (n>= 2)
		{
			//Check if number is divisible from 2 up to the square root of number
			for(int i = 2; i *i <=n;i++)
			{
				// If number is divisible by i, it's not prime
				if(n%i==0)
				{
					return false;
				}
				
			}
		}
		//if number is not divisible 
		return true;
		
	}
	public static void main(String[] args) {
	//input number to validate prime or not
	int n = 991;
	Assignment13_Prime obj = new Assignment13_Prime();

	System.out.println("The Number " +n +" is a Prime number: "+ obj.prime(n));

	}

}
