package CustomExceptionTask1;

public class TestN 
{
	public static void main(String args[])
		{
			System.out.println("main start");
			Number n=new Number();
			try
			{
				System.out.println("Try Start");
				n.getNumber(0);
				System.out.println("Try End");
			}
			catch(ZeroInputException e)
			{
				System.out.println("Catch="+e.getMessage());
			}
			System.out.println("Main End");
		}
	

}

