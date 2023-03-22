package User_DefineException;///Second Method Of Custom Exception



public class TestV 
{
	public void m1(int age)throws Voting
	{
		System.out.println("M1    Start");
		if(age<18)
		{
			Voting a=new Voting("Invalid Age");
			throw a;
		}
	}
	public static void main(String args[]) throws Exception
	{
		System.out.println("Main Start");
		TestV t=new TestV();
		try
		{
			System.out.println("Try Start");
			t.m1(12);
			System.out.println("Try End");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Catch="+e.getMessage());
			
		}
	}

}
