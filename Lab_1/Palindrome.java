//To check if a number is a palindrome or not
class Palindrome
{
	public static void main(String arg[])
	{
		int x=Integer.parseInt(arg[0]);
		int c_x=x, rem=0, rev=0;
		//reversing the number
		while(x!=0)
		{
			rem=x%10;
			rev=rev*10+rem;
			x/=10;
		}
		//checking if it is a palindrome
		if(rev==c_x)
			System.out.println(c_x+" is a palindrome.");
		else
			System.out.println(c_x +" is not a palindrome.");
	}
}