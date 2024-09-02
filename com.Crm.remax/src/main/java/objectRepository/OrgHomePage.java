package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*
 * this is a pom class for organization home page
 */
public class OrgHomePage 
{
	@FindBy(xpath="//img[@alt='Create Organization...']")
	private WebElement newOrgBtn;
	
	public OrgHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getNewOrgBtn()
	{
		return newOrgBtn;
	}
	
	/*
	 * this is business library to click on org btn
	 */
	public void clickOnNewOrgBtn()
	{
		newOrgBtn.click();
	}

}
