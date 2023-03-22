package NullpointerException;

//without try and catch block

public class A 
{
	public static void main(String args[])
	{
		System.out.println("Main Start");
		String name=null;
		System.out.println(name.length());
		System.out.println("Main End");
	}

}
