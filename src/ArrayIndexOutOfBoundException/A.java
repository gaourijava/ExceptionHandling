package ArrayIndexOutOfBoundException;

//without try and catch block

public class A 
{
	public static void main(String args[])
	{
		System.out.println("Main Start");
		int a[]=new int[2];
		a[0]=10;
		a[1]=20;
		System.out.println(a[2]);
		System.out.println("Main End");
	}

}
