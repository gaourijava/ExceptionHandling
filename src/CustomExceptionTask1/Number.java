package CustomExceptionTask1;

public class Number 
{
	public void getNumber(int i) throws ZeroInputException
	{
		if(i==0)
		{
			ZeroInputException e=new ZeroInputException("Zero Input Number");
			throw e;
		}
	}

}
