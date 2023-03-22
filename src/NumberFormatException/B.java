package NumberFormatException;

//with try and catch block

public class B 
{
	public static void main(String args[])
	{
		System.out.println("Main Start");
		try
		{
			System.out.println("Try Start");
			int a=Integer.parseInt("ABC");
			System.out.println(a);
			System.out.println("Try End");
		}
		catch(Exception e)
		{
			System.out.println("Catch Block");
		}
		System.out.println("Main End");
	}

}
