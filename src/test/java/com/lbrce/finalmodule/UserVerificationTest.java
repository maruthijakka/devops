package com.lbrce.finalmodule;
import org.testng.Assert;
import org.testng.annotations.Test;
public class UserVerificationTest {
	UserVerification uv=new UserVerification();
	@Test
	public void testcase1()
	{
		Assert.assertEquals(true,uv.check("maruthi", "#Maruthi767"));
	}
	@Test
	public void testcase2()
	{
		Assert.assertEquals(false,uv.check("maruthi767", "maruthi"));
	}
	@Test
	public void testcase3()
	{
		Assert.assertEquals(false,uv.check("manu", "man"));
	}
}
