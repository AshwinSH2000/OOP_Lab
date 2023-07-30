//To display the multiplication table of a number
class MultTable
{
	public static void main(String arg[])
	{
		//inputting using the command line
		int x=Integer.parseInt(arg[0]);
		//displaying the result using a loop
		for(int i=1 ; i<=20 ; i++)
			System.out.println(x + " * "+ i + " = " + x*i );
	}
}
