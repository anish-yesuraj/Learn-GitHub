package test

private class ClassOne
{
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int subract(int a, int b)
	{
		return a-b;
	}
	
	public int divide (int a, int b)
	{
		return a / b;
	}
	
	public int multiply(int a, int b)
	{
		return a*b;
	}

	public int factorial (int a)
	{
		if (a<2)
		{
			return 1;
		}
		
		return a * factorial(a - 1);
	}


	

}
