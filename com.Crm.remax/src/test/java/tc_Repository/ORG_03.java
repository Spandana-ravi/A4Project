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
public class ORG_03 extends BaseClass
{

	@Test
	public void org_03Case() throws Exception
	{
		JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL=new ExcelUtility();
		String ORGNAME=EUTIL.readDataFromExcel("Organization", 7, 1);
		String WEBSITE =EUTIL.readDataFromExcel("Organization", 7, 2);
		String BILLINGADDRESS=EUTIL.readDataFromExcel("Organization", 7, 3);
		String BILLINGCITY=EUTIL.readDataFromExcel("Organization", 7, 4);
		String BILLINGSTATE=EUTIL.readDataFromExcel("Organization", 7, 5);
		
		HomePage hp=new HomePage(driver);
		hp.clickOnOrg();
		OrgHomePage op=new OrgHomePage(driver);
		op.clickOnNewOrgBtn();
		CreateNewOrgPage cn=new CreateNewOrgPage(driver);
		cn.createOrganisation(ORGNAME +num, WEBSITE, BILLINGADDRESS, BILLINGCITY, BILLINGSTATE);
		Thread.sleep(3000);
	}
}
