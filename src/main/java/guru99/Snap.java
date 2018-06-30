package guru99;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snap {

	public void takeSnap() throws IOException
	{
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	
	File src=driver.getScreenshotAs(OutputType.FILE);
	File des=new File("./GuruImage/img2.png");
	FileUtils.copyFile(src, des);
}
}