package advisorCentralPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericMethods.ProjectMethods;


public class LoginAVC extends ProjectMethods{
	

	public LoginAVC()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(how=How.XPATH,using="//*[@id='userid']")
	private WebElement eleUserId;
	
	@FindBy(how=How.XPATH,using="//*[@name='j_password']")
	private WebElement elePassword;
	
	@FindBy(how=How.XPATH,using="//*[@id='orgcode']")
	private WebElement eleOrgCode;
	
	@FindBy(how=How.XPATH,using="//*[@class='btn']")
	private WebElement eleSubmitClick;
	
	public LoginAVC enterUserId(String data)
	{
		type(eleUserId,data);
		return this;
		
	}
	public LoginAVC enterPassword(String data)
	{
		type(elePassword,data);
		return this;
		
	}
	public LoginAVC enterOrgCode(String data)
	{
		type(eleOrgCode,data);
		return this;
		
	}	
	public FundFamilyList clickSubmit()
	{
		click(eleSubmitClick);
		return new FundFamilyList();
		
	}
	
	
}
