package ArithmaticException;       //when output is infinite,then we get arithmatic 
                                     //exception
public class A 
{
	public static void main(String args[])
	{
		System.out.println("Main Start");
		int a=10/0;          //here output will get infinite
		System.out.println("Main End");
	}

}//without try and catch block
