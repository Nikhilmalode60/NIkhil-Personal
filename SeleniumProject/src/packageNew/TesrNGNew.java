package packageNew;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TesrNGNew {

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("hii");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("hii");
	}
	
	@Test
	public void test()
	{
		System.out.println("hii");
	}
	
	
}
