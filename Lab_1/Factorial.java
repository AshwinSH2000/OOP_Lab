//To find the factorial of a number using iterative method
class Factorial
{
	public static void main(String arg[])
	{
		int x=Integer.parseInt(arg[0]);
		int fact=1;
		if(x==0 || x==1)
			System.out.println(x+"'s factorial is 1");
		else
		{
			//calculating the factorial
			for(int i=2 ; i<=x ; i++)
				fact*=i;
		
		System.out.println(x+"'s factorial is "+fact);
		}
			
	}
	
}