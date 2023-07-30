// To calculate the area and circumference of a rectangle
class RectArea
{
	public static void main(String arg[])
	{
		int len, bre, area, circum;
		//using command line to take input
		len=Integer.parseInt(arg[0]);
		bre=Integer.parseInt(arg[1]);
		//calculating and displaying the result
		area=len*bre;
		circum=2*(len+bre);
		System.out.println("The area of rectangle is "+area);
		System.out.println("The circumference of the rectangle is "+circum);
	}
}
		
		