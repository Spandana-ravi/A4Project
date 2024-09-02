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
public class ORG_02 extends BaseClass
{
	@Test
	public void org_02Case() throws Exception
	{
	JavaUtility JUTIL=new JavaUtility();
	int num=JUTIL.getRandomNumber(1000);
	ExcelUtility EUTIL=new ExcelUtility();
	String ORGNAME=EUTIL.readDataFromExcel("Organization", 4, 1);
	String WEBSITE =EUTIL.readDataFromExcel("Organization", 4, 2);
	String EMPLOYEES=EUTIL.readDataFromExcel("Organization", 4, 3);
	String PHN=EUTIL.readDataFromExcel("Organization", 4, 4);
	String OTHERPHN=EUTIL.readDataFromExcel("Organization", 4, 5);
	String EMAIL=EUTIL.readDataFromExcel("Organization", 4, 6);
	
	HomePage hp=new HomePage(driver);
	hp.clickOnOrg();
	OrgHomePage op=new OrgHomePage(driver);
	op.clickOnNewOrgBtn();
	CreateNewOrgPage cn=new CreateNewOrgPage(driver);
	cn.createOrganisation(ORGNAME +num, WEBSITE,EMPLOYEES, PHN, OTHERPHN, EMAIL);
	Thread.sleep(3000);
	}

}
