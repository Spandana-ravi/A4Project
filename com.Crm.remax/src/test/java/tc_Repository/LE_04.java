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
public class LE_04 extends BaseClass
{
	@Test(groups={"smoke"})
	public void le_04Case() throws Exception
	{
		JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL=new ExcelUtility();
		String FIRSTNAME=EUTIL.readDataFromExcel("LEADS", 11, 1);
		String LASTNAME=EUTIL.readDataFromExcel("LEADS", 11, 2);
		String COMPANY=EUTIL.readDataFromExcel("LEADS", 11, 3);
		String STREET=EUTIL.readDataFromExcel("LEADS", 11, 4);
		String POBOX=EUTIL.readDataFromExcel("LEADS", 11, 5);
		String POSTALCODE=EUTIL.readDataFromExcel("LEADS", 11, 6);
		String CITY=EUTIL.readDataFromExcel("LEADS", 11, 7);
		String COUNTRY=EUTIL.readDataFromExcel("LEADS", 11, 8);
		String STATE=EUTIL.readDataFromExcel("LEADS",11, 9);
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp=new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadsPage cn=new CreateNewLeadsPage(driver);
		cn.createLeads(FIRSTNAME +num, LASTNAME, COMPANY,
				STREET,POBOX,POSTALCODE,CITY,COUNTRY,STATE);
		System.out.println("TC 01 executed successfully!! ");
		Thread.sleep(4000);

	}

}
