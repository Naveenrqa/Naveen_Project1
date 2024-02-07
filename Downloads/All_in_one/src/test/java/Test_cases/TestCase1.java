package Test_cases;

import org.testng.annotations.Test;

public class TestCase1 {

	@Test(priority = 1,invocationCount = 6)
	public void Test_method1() {
		System.out.println("from test methods 1 ");
		
	}
	@Test(priority = -1)
	public void Test_method2() {
		System.out.println("from test methods 2 ");
		
	}
	@Test(priority = 3 ,enabled = false)
	public void Test_method3() {
		System.out.println("from test methods 3 ");
		
	}
	@Test
	public void Test_method4() {
		System.out.println("from test methods 4 ");
		
	}
	@Test
	public void Test_method5() {
		System.out.println("from test methods 5 ");
		
	}
}
