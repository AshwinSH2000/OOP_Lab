//To find the number of positive, negative and zeros number
class PosNegZer {

	public static void main( String a[] )	{
		int x, i;
		int pos=0, neg=0, zer=0;
		for(i=0 ; i<10 ; i++)
		{
			//inputting using command line
			x = Integer.parseInt( a[i] );
			if(x>0)
				pos++;
			else if(x<0)
				neg++;
			else
				zer++;
		}
		System.out.println("Positive numbers = "+pos);
		System.out.println("Negative numbers = "+neg);
		System.out.println("Zero = "+ zer);
	}
}