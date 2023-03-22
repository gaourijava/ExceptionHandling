package ArrayIndexOutOfBoundException;

//with try and catch block

public class B 
{
	public static void main(String args[])
	{
		System.out.println("Main Start");
		try
		{
			System.out.println("Try Start");
			int a[]=new int[2];
			a[0]=10;
			a[1]=20;
			System.out.println(a[2]);
			System.out.println("Try End");
		}
		catch(Exception e)
		{
			System.out.println("Catch Block");
		}
		System.out.println("Main End");
	}

}
