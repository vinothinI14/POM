package week4;

import java.io.IOException;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Reports {
	@Test
	public void learnReport() throws IOException
	{
		//BeforeSuite
		ExtentHtmlReporter html=new ExtentHtmlReporter("./reports/result.html");
		html.setAppendExisting(true);
		//beforeTest
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(html);
		//BeforeMethod
		ExtentTest test = extent.createTest("Create lead", "Create a lead");
		test.assignAuthor("vino");
		test.assignCategory("test leaf");
		test.pass("Data added successfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img1.png").build());
		test.pass("Enter password successfully",MediaEntityBuilder.createScreenCaptureFromPath("./../snaps/img2.png").build());
		test.fail("unable to login");
		
		//AfterSuite
		extent.flush();
	}
}
