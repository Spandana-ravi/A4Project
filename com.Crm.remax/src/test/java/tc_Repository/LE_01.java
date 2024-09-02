package tc_Repository;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtilityOrLib.BaseClass;
import genericUtilityOrLib.ExcelUtility;
import genericUtilityOrLib.JavaUtility;
import genericUtilityOrLib.ListenersImplementationClass;
import objectRepository.CreateNewLeadsPage;
import objectRepository.HomePage;
import objectRepository.LeadsHomePage;

//@Listeners(ListenersImplementationClass.class)
public class LE_01 extends BaseClass
{
	@Test(retryAnalyzer = genericUtilityOrLib.RetryAnalyzerImplementation.class)
	public void le_01Case() throws Exception
	{
		JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL=new ExcelUtility();
		String FIRSTNAME=EUTIL.readDataFromExcel("Leads", 2, 1);
		String LASTNAME=EUTIL.readDataFromExcel("Leads", 2, 2);
		String COMPANY=EUTIL.readDataFromExcel("Leads", 2, 3);
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp=new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadsPage cn=new CreateNewLeadsPage(driver);
		cn.createLeads(FIRSTNAME +num, LASTNAME, COMPANY);
		System.out.println("TC 01 executed successfully!! ");
		Thread.sleep(4000);
	}

}
