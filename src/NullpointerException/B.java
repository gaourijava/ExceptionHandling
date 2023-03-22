package NullpointerException;

//with try and catch block

public class B 
{
	public static void main(String args[])
	{
		System.out.println("Main Start");
		String name=null;
		try
		{
			System.out.println("Try Start");
			System.out.println(name.length());
			System.out.println("Try End");
		}
		catch(Exception e)
		{
			System.out.println("Catch Block");
		}
		System.out.println("Main End");
	}

}
