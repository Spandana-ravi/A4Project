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
@Listeners(ListenersImplementationClass.class)
public class LE_03 extends BaseClass
{
	@Test(groups={"regression","sanity"})
	public void le_03Case() throws Exception
	{
		JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL=new ExcelUtility();
		String FIRSTNAME=EUTIL.readDataFromExcel("LEADS", 8, 1);
		String LASTNAME=EUTIL.readDataFromExcel("LEADS", 8, 2);
		String COMPANY=EUTIL.readDataFromExcel("LEADS", 8, 3);
		String TITLE=EUTIL.readDataFromExcel("LEADS", 8, 4);
		String PHONE=EUTIL.readDataFromExcel("LEADS", 8, 5);
		String MOBILE=EUTIL.readDataFromExcel("LEADS", 8, 6);
		String EMAIL=EUTIL.readDataFromExcel("LEADS", 8, 7);
		String NOOFEMPLOYEES=EUTIL.readDataFromExcel("LEADS", 8, 8);
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp=new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadsPage cn=new CreateNewLeadsPage(driver);
		cn.createLeads(FIRSTNAME +num, LASTNAME, COMPANY,TITLE,PHONE,MOBILE,EMAIL,NOOFEMPLOYEES);
		System.out.println("TC 03 executed successfully!! ");
		Thread.sleep(4000);
	}

}
