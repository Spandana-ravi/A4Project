package tc_Repository;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import genericUtilityOrLib.ListenersImplementationClass;
import objectRepository.CreateNewOrgPage;
import objectRepository.HomePage;
import objectRepository.OrgHomePage;
@Listeners(ListenersImplementationClass.class)
public class Org_01 extends BaseClass
{
	@Test
	public void org_01Case() throws Exception
	{
		JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL=new ExcelUtility();
		String ORGNAME=EUTIL.readDataFromExcel("Organization", 1, 1);
		String WEBSITE =EUTIL.readDataFromExcel("Organization", 1, 2);
		String EMPLOYEES=EUTIL.readDataFromExcel("Organization", 1, 3);
		
		HomePage hp=new HomePage(driver);
		hp.clickOnOrg();
		OrgHomePage op=new OrgHomePage(driver);
		op.clickOnNewOrgBtn();
		CreateNewOrgPage cn=new CreateNewOrgPage(driver);
		cn.createOrganisation(ORGNAME + num, WEBSITE, EMPLOYEES);
		Thread.sleep(3000);
	}

}
