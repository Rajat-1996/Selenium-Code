package Day37;

import org.testng.annotations.Test;

public class InvocationCount {

	@Test(invocationCount=10)
	void test()

	{
	System.out.println("Printing The Values Multiple Times");
	}
}
	
	
