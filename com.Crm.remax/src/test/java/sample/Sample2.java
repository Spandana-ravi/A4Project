package sample;

import org.testng.annotations.Test;

public class Sample2 
{
	@Test(priority=1,invocationCount=5)
	public void createUser()
	{
		System.out.println("user cretaed!!");
	}
	@Test(priority=2,dependsOnMethods = {"createUser"})
	public void modifyUser()
	{
		System.out.println("user modified!!");
	}
	@Test(priority=3)
	public void deletUser()
	{
		System.out.println("user deleted!!");
	}

}
