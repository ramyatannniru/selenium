package annoataion.dependecy.asser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

	@Test
	void test()
	{
		//int x=10;
		//int y=15;
		
		/*if(x==y)
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}*/
		
		//Assert.assertEquals(x,y);
		
		//Assert.assertTrue(true);  //pass
		//Assert.assertTrue(false);  //pass
		
		int a=10;
		int b=20;
		
		// Assert.assertEquals(actual, expected, description)
		//Assert.assertEquals(a>b,true,"a is not greater than b");  //false
		
		
		String s1="abc";
		String s2="abc1";
		
		//Assert.assertEquals(s1,s2,"string are not equal"); // pass
		
		//Assert.assertNotEquals(s1, s2);  // fail
		
		if(false)
		{
			Assert.assertTrue(true);
		}
		else
		{
			//Assert.assertTrue(false);
			Assert.fail();
			
		}
		
			
		
	}
	
}

