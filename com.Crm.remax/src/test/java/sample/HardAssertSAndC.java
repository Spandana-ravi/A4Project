package sample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertSAndC 
{
	@Test
	public void hardAssertStrictComaprison()
	{
		String expectedData="raja";
		String actualData="Raja";
		Assert.assertEquals(actualData, expectedData);
		System.out.println("strict comparison passed");
	}
	
	@Test
	public void containsLevelComparison()
	{
		String expectedData="raja";
		String actualData="maharaja";
		Assert.assertTrue(actualData.contains(expectedData));
		System.out.println("contains comparison passed");
	}

}
