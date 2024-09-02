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
public class LE_02 extends BaseClass
{
	@Test(groups={"sanity"})
	public void le_02Case() throws Exception
	{
		JavaUtility JUTIL=new JavaUtility();
		int num=JUTIL.getRandomNumber(1000);
		ExcelUtility EUTIL=new ExcelUtility();
		String FIRSTNAME=EUTIL.readDataFromExcel("LEADS", 5, 1);
		String LASTNAME=EUTIL.readDataFromExcel("LEADS", 5, 2);
		String COMPANY=EUTIL.readDataFromExcel("LEADS", 5, 3);
		String TITLE=EUTIL.readDataFromExcel("LEADS", 5, 4);
		String PHONE=EUTIL.readDataFromExcel("LEADS", 5, 5);
		String MOBILE=EUTIL.readDataFromExcel("LEADS", 5, 6);
		String EMAIL=EUTIL.readDataFromExcel("LEADS", 5, 7);
		String NOOFEMPLOYEES=EUTIL.readDataFromExcel("LEADS", 5, 8);
		String STREET=EUTIL.readDataFromExcel("LEADS", 5, 9);
		String POBOX=EUTIL.readDataFromExcel("LEADS", 5, 10);
		String POSTALCODE=EUTIL.readDataFromExcel("LEADS", 5, 11);
		String CITY=EUTIL.readDataFromExcel("LEADS", 5, 12);
		String COUNTRY=EUTIL.readDataFromExcel("LEADS", 5, 13);
		String STATE=EUTIL.readDataFromExcel("LEADS", 5, 14);
		HomePage hp=new HomePage(driver);
		hp.clickOnLeads();
		LeadsHomePage lp=new LeadsHomePage(driver);
		lp.clickOnNewLeadBtn();
		CreateNewLeadsPage cn=new CreateNewLeadsPage(driver);
		cn.createLeads(FIRSTNAME +num, LASTNAME, COMPANY,TITLE,PHONE,MOBILE,EMAIL,NOOFEMPLOYEES,
				STREET,POBOX,POSTALCODE,CITY,COUNTRY,STATE);
		System.out.println("TC 02 executed successfully!! ");
		Thread.sleep(4000);
	}

}
