package sample;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertSAndC 
{
	@Test
	public void softAssertStrictComparison()
	{
		String expectedData="raja";
		String actualData="Raja";
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(actualData, expectedData);//doesn't terminate and prints the sopln statement
		System.out.println("strict comparison passed");
		sa.assertAll();//mandatory
	}
	@Test
	public void containsLevelComparison()
	{
		String expectedData="raja";
		String actualData="maharaja";
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(actualData.contains(expectedData));
		System.out.println("contains comparison passed");
		sa.assertAll();
	}

}
