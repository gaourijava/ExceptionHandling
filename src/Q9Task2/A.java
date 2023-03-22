package Q9Task2;

public class A 
{
	public static void main(String args[])
	{
		A a=null;
		System.out.println("Main Start");
		try
		{
			System.out.println("Try Start");
			System.out.println(a.toString());
			System.out.println("Try End");
		}
		catch(Exception e)
		{
			System.out.println("Catch Block");
		}
		System.out.println("Main End");
	}

}
