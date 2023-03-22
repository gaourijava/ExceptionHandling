package NumberFormatException;

//without try and catch block

public class A 
{
	public static void main(String args[])
	{
		System.out.println("Main Start");
		int a=Integer.parseInt("ABC");  //this method is used to convert String into int.
		System.out.println(a);
		System.out.println("Main End");
	}

}
