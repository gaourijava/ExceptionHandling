package CustomExceptionBySir;

public class Test 
{
	public void m1(int age)throws Age_Invalid
	{
		System.out.println("m1     Start");
		if(age<18)
		{
			throw new Age_Invalid("Age is Less");
		}
	}
	public static void main(String args[])
	{
		Test t=new Test();
		System.out.println("Main Start");
		try
		{
			System.out.println("Try Start");
			t.m1(10);
			System.out.println("Try End");
		}
		catch(Age_Invalid e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("Main End");
	}
		
		
			
		
	

}
