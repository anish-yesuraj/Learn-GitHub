package test

public class ClassOne
{
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int multiply(int a, int b)
	{
		System.out.println("Test Merge in Multiply method");
		return a*b;
	}

	public int subract(int a, int b)
	{
		return a-b;
	}
	
	public int divide (int a, int b)
	{
		System.out.println("Test Merge in Divide method");
		return a / b;
	}
	
	public double computeCircleArea(double radius)
	{
		System.out.println("Test Merge in computeCircleArea");
		return Math.PI*radius*radius;
	}

}
