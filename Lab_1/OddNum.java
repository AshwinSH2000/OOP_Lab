// to generate odd numbers from 1 to 100
class OddNum
{
	public static void main(String arg[])
	{
		int i=0;
		System.out.println("Odd numbers from 1 to 100 are :");
		//using a loop to calculate and display the numbers
		for(i=1 ; i<100 ; i+=2)
			System.out.print(i + ", ");
	}
}