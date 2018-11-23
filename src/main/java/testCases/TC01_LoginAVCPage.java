package testCases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import advisorCentralPages.LoginAVC;
import genericMethods.ProjectMethods;

public class TC01_LoginAVCPage extends ProjectMethods {
	
	@BeforeTest
	public void setData()
	{
			testCaseName="TC01_LoginAVCPage";
			testDescription="Login into AVC Application";
			testNodes="AVC";
			category="Smoke";
			authors="Vino";
			browserName="chrome";
			dataSheetName="TC001";
		}
		@Test(dataProvider="fetchData")
		public void login(String uName,String pass,String orgCode) {
			
			new LoginAVC()
			.enterUserId(uName)
			.enterPassword(pass)
			.enterOrgCode(orgCode)
			.clickSubmit();
			
		}
}


