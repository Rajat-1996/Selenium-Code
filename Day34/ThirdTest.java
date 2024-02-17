package Day34;

import org.testng.annotations.Test;

public class ThirdTest 
{
  
	@Test(priority=0)
	void Test1()
	{
		System.out.println("Incridable");
	}
	
	@Test(priority=2)
	void Test2()
	{
		System.out.println("India");
		
	}
	
	@Test(priority=3)
	void Test3()
	{
		System.out.println("Bharat");
	}
	
}
