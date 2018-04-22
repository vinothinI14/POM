package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeMethods implements WdMethods{

	public RemoteWebDriver driver = null;
	public RemoteWebDriver startAppWithReturn(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();

		}else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("internetExplorer")) {
			System.setProperty("webdriver.ie.driver", "./drivers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		//Maximize the browser
		driver.manage().window().maximize();
		//Load the URL
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("The "+browser+" browser launched successfully");
		takeSnap();
		return driver;
	}
	public void startApp(String browser, String url) {
		try {
			if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();

			}else if (browser.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			//Maximize the browser
			driver.manage().window().maximize();
			//Load the URL
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println("The "+browser+" browser launched successfully");

		} catch (NullPointerException e) {
			System.err.println("The "+browser+" browser not launched");
			e.printStackTrace();

		}catch (WebDriverException e) {
			System.err.println("webDriver Exception");
			e.printStackTrace();

		}catch (Exception e) {
			System.err.println("The "+browser+" browser not launched");
			e.printStackTrace();

		}finally {
			takeSnap();
		}

	}

	public WebElement locateElement(String locator, String locValue) {
		WebElement ele = null;
		try {
			switch (locator) {
			case "id":
				ele = driver.findElementById(locValue);
				break;
			case "class":
				ele = driver.findElementByClassName(locValue);
				break;
			case "link text":
				ele = driver.findElementByLinkText(locValue);
				break;
			case "xpath":
				ele=driver.findElementByXPath(locValue);
				break;
			case "name":
				ele=driver.findElementByName(locValue);
				break;
			}
		} catch (NoSuchElementException e) {
			System.err.println("The element not found");
			e.printStackTrace();
			//throw new RuntimeException();
		}
		catch (Exception e) {
			System.err.println("The element not found");
			e.printStackTrace();
		}
		finally {
			takeSnap();
		}
		return ele;

	}

	public WebElement locateElement(String locValue) {
		try {
			WebElement id = driver.findElementById(locValue);

		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Element not found");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("WebDriver Exception");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Element not found");
		}
		finally
		{
			takeSnap();
		}
		WebElement id = null;
		return id;
	}


	public void type(WebElement ele, String data) {
		try {
			ele.sendKeys(data);
			System.out.println("The given value is entered "+data);

		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.err.println("WebDriver Exception");
			e.printStackTrace();
		}finally {
			takeSnap();
		}
	}

	public void click(WebElement ele) {
		try {
			ele.click();
			System.out.println("The element is clicked successfully");

		}catch (NoSuchElementException e) {
			System.err.println("The elemenet not found");
			e.printStackTrace();
			throw new RuntimeException();
		}
		catch (WebDriverException e) {
			System.err.println("webDriver Exception");
			e.printStackTrace();
		}
		finally {
			takeSnap();
		}
	}

	public void clear(WebElement ele) {
		try {
			ele.clear();
			System.out.println("The text is removed successfully");
		} catch (WebDriverException e) {
			// TODO Auto-generated catch block
			System.out.println("WebDriver Exception");
			e.printStackTrace();

		}finally {
			takeSnap();
		}
	}

	public void clickWithNoSnap(WebElement ele) {
		try {
			ele.click();
			System.out.println("The element is clicked successfully");
		}catch (NoSuchElementException e) {
			System.err.println("The elemenet not found");
			e.printStackTrace();
			throw new RuntimeException();
		}
		catch (WebDriverException e) {
			System.err.println("webDriver Exception");
			e.printStackTrace();
		}
		

	}

	public String getText(WebElement ele) {
		String txt = ele.getText();
		System.out.println(txt);
		takeSnap();
		return txt;
	}

	public String getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		takeSnap();
		return title;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		new Select(ele).selectByVisibleText(value);
		System.out.println("The element was selected"+value);
		takeSnap();

	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		new Select(ele).selectByIndex(index);
		System.out.println("The element was selected"+index);
		takeSnap();

	}

	public boolean verifyTitle(String expectedTitle) {
		String title = driver.getTitle();
		if(title.equals(expectedTitle))
		{
			System.out.println("The tile of the page"+title);
		}
		takeSnap();
		return false;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		if(ele.getText().equals(expectedText))
		{
			System.out.println("The text"+ele.getText()+"matched with"+expectedText);
		}
		else
			System.out.println("The text was not match");
		takeSnap();
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		if(ele.getText().contains(expectedText))
		{
			System.out.println("The text"+ele.getText()+"contains the"+expectedText);
		}
		else
		{
			System.out.println("The text was not match");
		}
		takeSnap();
	}

	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		if(ele.getAttribute(attribute).equals(value))
		{
			System.out.println("The given attribute"+ele.getAttribute(attribute)+"matched with"+value);
		}
		else
		{
			System.out.println("The attribute was not match");
		}
		takeSnap();

	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		if(ele.getAttribute(attribute).contains(value))
		{
			System.out.println("The given attribute"+ele.getAttribute(attribute)+"matched with"+value);
		}
		else
		{
			System.out.println("The attribute was not match");
		}
		takeSnap();

	}

	public void verifySelected(WebElement ele) {
		if(ele.isSelected())
		{
			System.out.println("The element was selected");
		}
		else
			System.out.println("the element not selected");
		takeSnap();
	}

	public void verifyDisplayed(WebElement ele) {
		if(ele.isDisplayed())
		{
			System.out.println("The element was displayed");
		}
		else
			System.out.println("The element was not displayed");
		takeSnap();
	}

	public void switchToWindow(int index) {
		try {
			Set<String> win = driver.getWindowHandles();
			List<String> winList = new ArrayList<String>();
			winList.addAll(win);
			driver.switchTo().window(winList.get(index));
			System.out.println("Moved to next window successfully"+index);

		} catch (NoSuchWindowException e) {
			System.err.println("Window not found");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Invalid Index ");
			e.printStackTrace();
		}finally {
			takeSnap();


		}

	}

	public void switchToFrame(WebElement ele) {
		try {
			driver.switchTo().frame(ele);
			System.out.println("Moved to next frame successfully"+ele);

		} catch (NoSuchFrameException e) {
			System.err.println("Frame not found");
			e.printStackTrace();
		}finally {
			takeSnap();
		}

	}

	public void switchToFrame(int index) {
		try {
			driver.switchTo().frame(index);
			System.out.println("Moved to next frame successfully"+index);
		} catch (NoSuchFrameException e) {
			System.out.println("Frame not found");
			e.printStackTrace();
		} catch (WebDriverException e) {
			System.out.println("WebDriver Exception");
			e.printStackTrace();
		}finally
		{
		takeSnap();
		}
	}

	public void acceptAlert() {
		try {
			driver.switchTo().alert().accept();
			System.out.println("The alert was accepted successfully");
		}  catch (NoAlertPresentException e) {
			System.out.println("No alert found but it was handled");
			e.printStackTrace();
		}catch (WebDriverException e) {
			System.out.println("WebDriver Exception");
			e.printStackTrace();
		}

	}

	public void dismissAlert() {
		try {
			driver.switchTo().alert().dismiss();
			System.out.println("The alert was dismissed successfully");
		}catch (NoAlertPresentException e) {
			System.out.println("No Alert found ");
			e.printStackTrace();
		} 
		catch (WebDriverException e) {
			System.out.println("WebDriver exception");
			e.printStackTrace();
		}

	}

	public String getAlertText() {
		String text = null;
		try {
			text = driver.switchTo().alert().getText();
			System.out.println("The alert text is"+text);
		}catch (NoAlertPresentException e) {
			System.out.println("No Alert found ");
			e.printStackTrace();
		} 
		catch (WebDriverException e) {
			System.out.println("WebDriver Exception");
			e.printStackTrace();
		}
		return text;
	}

	int i =1;
	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File des = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		i++;
	}
	public void webDriverWait(String locator) {
		try {
			WebDriverWait wait=new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
		} catch (TimeoutException e) {
			// TODO Auto-generated catch block
			System.out.println("Timed out");
			e.printStackTrace();
		}
	}
	
	
	public static void firstResLeadId(String leadId)
	{
		
	}

	public void closeBrowser() {
		driver.close();

	}

	public void closeAllBrowsers() {
		driver.quit();

	}

}
