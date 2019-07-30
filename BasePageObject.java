package org.cts.oneframework.utilities;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileFilter;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.cts.oneframework.configprovider.ConfigProvider;
import org.cts.oneframework.utilities.AssertionLibrary;
import org.cts.oneframework.utilities.Screenshots;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;

import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.apache.commons.net.util.Base64;


public class BasePageObject {

	protected final JavascriptExecutor javascriptExecutor;
	private static final int DEFAULT_IMPLICIT_WAIT = 0;
	private FluentWait<WebDriver> fluentWait;
	public WebDriver driver;
	private Duration pollingInterval = Duration.ofMillis(ConfigProvider.getAsInt("POLLING_INTERVAL"));
	private Duration fluentWaitDuration = Duration.ofSeconds(ConfigProvider.getAsInt("FLUENT_WAIT"));
	//private static final String SET_INPUT = "Set input: ";
	private static final String CLICK_ACTION = "Click Action";
	private static final String SET_INPUT_COMMAND = "arguments[0].value='%s';";
	public static final String CLICK_COMMAND = "arguments[0].click();";
	protected static final String JS_DISPLAY_COMMAND = "arguments[0].style.display='block';";
	private static final String CLICK = "Click: ";
	public String home = System.getProperty("user.home");
	
	private static final String SET_INPUT = "Set input: ";	
	private static final String DROPDOWN = "Selected value from dropdown: ";	
	private static final String UNICODE_FORMAT = "UTF8";
	public static final String DESEDE_ENCRYPTION_SCHEME = "DESede";
	private KeySpec ks;
	private SecretKeyFactory skf;
	private Cipher cipher;
	byte[] arrayBytes;
	private String myEncryptionKey;
	private String myEncryptionScheme;
	SecretKey key;

	public BasePageObject(WebDriver webDriver) {
		this.driver = webDriver;
		fluentWait = new FluentWait<>(driver).withTimeout(fluentWaitDuration).pollingEvery(pollingInterval)
				.ignoring(StaleElementReferenceException.class).ignoring(ElementNotVisibleException.class)
				.ignoring(NoSuchElementException.class);
		javascriptExecutor = (JavascriptExecutor) driver;
		PageFactory.initElements(driver, this);
		new AssertionLibrary(webDriver);
	}

	public void get(String url) {
		driver.get(url);
		Screenshots.addStepWithScreenshotInReport(driver,
				"Application launched: <a href=\"" + url + "\">" + url + "</a>");
	}

	public void navigateTo(String url) {
		driver.navigate().to(url);
		Screenshots.addStepWithScreenshotInReport(driver,
				"Application launched: <a href=\"" + url + "\">" + url + "</a>");
	}

	protected void setImplicitWait(int duration) {
		driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
	}

	/**
	 * returns list of webElements.
	 * 
	 * @param locator
	 * @return List<WebElement>
	 */
	protected List<WebElement> getElements(final String locator) {
		return fluentWait.until(new ExpectedCondition<List<WebElement>>() {
			@Override
			public List<WebElement> apply(WebDriver driver) {
				WebDriverWait wait = new WebDriverWait(driver, 10);
				wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
				List<WebElement> subEle = driver.findElements(By.xpath(locator));
				for(WebElement eleList: subEle )
				{
					String elementList=eleList.getText();
					System.out.println(elementList);
					Screenshots.addStepWithScreenshotInReport(driver, elementList +" successfully displayed on the page");
				}
				
				return driver.findElements(By.xpath(locator));
			}
		});
	}

	/**
	 * returns list of webElements.
	 * 
	 * @param locator
	 * @return List<WebElement>
	 */
	protected List<WebElement> getElements(final By by) {
		return fluentWait.until(new ExpectedCondition<List<WebElement>>() {
			@Override
			public List<WebElement> apply(WebDriver driver) {
				return driver.findElements(by);
			}
		});
	}

	/**
	 * returns the first instance of webElement
	 * 
	 * @param locator
	 * @return WebElement
	 */
	protected WebElement getElement(final String locator) {
		return fluentWait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.xpath(locator));
			}
		});
	}

	/**
	 * returns the first instance of webElement
	 * 
	 * @param locator
	 * @return WebElement
	 */
	protected WebElement getElement(final By by) {
		return fluentWait.until(new ExpectedCondition<WebElement>() {
			@Override
			public WebElement apply(WebDriver driver) {
				return driver.findElement(by);
			}
		});
	}

	/**
	 * this method checks if the element is present on page.
	 * 
	 * @param locator
	 * @return boolean
	 */
	protected boolean isElementOnPage(final String locator) {
		setImplicitWait(DEFAULT_IMPLICIT_WAIT);
		boolean flag = !getElements(locator).isEmpty();
		setImplicitWait(ConfigProvider.getAsInt("IMPILCIT_WAIT"));
		return flag;
	}

	/**
	 * this method checks if the element is present on page.
	 * 
	 * @param locator
	 * @return boolean
	 */
	protected boolean isElementOnPage(final By by) {
		setImplicitWait(DEFAULT_IMPLICIT_WAIT);
		boolean flag = !getElements(by).isEmpty();
		setImplicitWait(ConfigProvider.getAsInt("IMPILCIT_WAIT"));
		return flag;
	}

	/**
	 * returns true, if element is enabled.
	 * 
	 * @param locator
	 * @return boolean
	 */
	protected boolean isEnabled(final String locator) {
		List<WebElement> elementList = getElements(locator);
		if (!elementList.isEmpty()) {
			return elementList.get(0).isEnabled();
		} else {
			return false;
		}
	}

	/**
	 * returns true, if element is enabled.
	 * 
	 * @param locator
	 * @return boolean
	 */
	protected boolean isEnabled(final By by) {
		List<WebElement> elementList = getElements(by);
		if (!elementList.isEmpty()) {
			return elementList.get(0).isEnabled();
		} else {
			return false;
		}
	}

	/**
	 * returns true, if element is displayed.
	 * 
	 * @param locator
	 * @return boolean
	 */
	public boolean isDisplayed(final String locator, String locatorName) {

		List<WebElement> elementList = getElements(locator);
		if (!elementList.isEmpty()) {
			sleep(1000);
			Screenshots.addStepWithScreenshotInReport(driver, locatorName +" successfully displayed on the page");
			return elementList.get(0).isDisplayed();

		} 

		else {

			return false;
		}


	}

	public void verifyElementDisplayed(String locator,String locatorName) {
		
			WebElement element = getElement(locator);
			WebDriverWait wait = new WebDriverWait(driver, 10);
			  wait.until(ExpectedConditions.visibilityOf(element));
			Assert.assertTrue("The Element not displayed"+locatorName, element.isDisplayed());			
				  
				if (driver instanceof JavascriptExecutor) {
			        ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid blue'", element);
			      
					driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
					
					((JavascriptExecutor)driver).executeScript("arguments[0].style.border='0px'", element);
			    }
				Screenshots.addStepWithScreenshotInReport(driver, locatorName +" displayed on the page");
			 				
		
}


	/**
	 * returns true, if element is displayed.
	 * 
	 * @param locator
	 * @return boolean
	 */
	protected boolean isDisplayed(final By by) {
		List<WebElement> elementList = getElements(by);
		if (!elementList.isEmpty()) {
			return elementList.get(0).isDisplayed();
		} else {
			return false;
		}
	}

	/**
	 * returns true, if element is selected.
	 * 
	 * @param locator
	 * @return boolean
	 */
	protected boolean isSelected(final String locator) {
		List<WebElement> elementList = getElements(locator);
		if (!elementList.isEmpty()) {
			return elementList.get(0).isSelected();
		} else {
			return false;
		}
	}

	/**
	 * returns true, if element is selected.
	 * 
	 * @param locator
	 * @return boolean
	 */
	protected boolean isSelected(final By by) {
		List<WebElement> elementList = getElements(by);
		if (!elementList.isEmpty()) {
			return elementList.get(0).isSelected();
		} else {
			return false;
		}
	}

	/**
	 * returns the number of instances of the element.
	 * 
	 * @param locator
	 * @return size
	 */
	protected int getElementsSize(final String locator) {
		if (isElementOnPage(locator)) {
			return getElements(locator).size();
		} else {
			return 0;
		}
	}

	/**
	 * returns the number of instances of the element.
	 * 
	 * @param locator
	 * @return size
	 */
	protected int getElementsSize(final By by) {
		if (isElementOnPage(by)) {
			return getElements(by).size();
		} else {
			return 0;
		}
	}

	/**
	 * This method sets input value using sendkeys function of selenium. Also
	 * provides the feature of clean before setting the value.
	 * 
	 * @param locator
	 * @param clearInput
	 */
	protected void setInputValue(final String locator, final String value, final boolean clearInput) {
		WebElement element = getElement(locator);
		if (clearInput) {
			element.clear();
		}
		element.sendKeys(value);
		Screenshots.addStepWithScreenshotInReport(driver, "Value entered successfully in the field" + value);
	}

	/**
	 * This method sets input value using sendkeys function of selenium. Also
	 * provides the feature of clean before setting the value.
	 * 
	 * @param locator
	 * @param clearInput
	 */
	protected void setInputValue(final By by, final String value, final boolean clearInput) {
		WebElement element = getElement(by);
		if (clearInput) {
			element.clear();
		}
		element.sendKeys(value);
		Screenshots.addStepWithScreenshotInReport(driver, "Value entered successfully in the field" + value);
	}

	/**
	 * This method first clears and then sets input value using sendkeys
	 * function of selenium.
	 * 
	 * @param locator
	 * @param clearInput
	 */
	protected void setInputValue(final String locator, final String value) {
		WebElement element = getElement(locator);
		element.clear();
		WebDriverWait wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(element));
		element.sendKeys(value);
		Screenshots.addStepWithScreenshotInReport(driver, "Value entered successfully in the field :" + value);
	}
	
	protected void setInputValueAndEnter(final String locator, final String value) {
		waitForPageToLoad(driver);
		
		WebElement element = getElement(locator);		
		element.clear();
		element.click();		
		sleep(3000);
		element.sendKeys(value,Keys.TAB);
		Screenshots.addStepWithScreenshotInReport(driver, "Value entered successfully in the field :" + value);
	}
	protected void setInputValueEnter(final String locator, final String value) {
		
		waitForPageToLoad(driver);		
		WebElement element = getElement(locator);
		javascriptExecutor.executeScript(JS_DISPLAY_COMMAND, element);
		//waitForPageToLoad(driver);
		//makeElementVisibleAndClick(locator);
		
		javascriptExecutor.executeScript(CLICK_COMMAND, element);
		element.clear();	
		//sleep(2000);
		element.sendKeys(value,Keys.ENTER);
		Screenshots.addStepWithScreenshotInReport(driver, "Value entered successfully in the field :" + value);
	}

	/**
	 * This method first clears and then sets input value using sendkeys
	 * function of selenium.
	 * 
	 * @param locator
	 * @param clearInput
	 */
	protected void setInputValue(final By by, final String value) {
		WebElement element = getElement(by);
		element.clear();
		element.sendKeys(value);
		Screenshots.addStepWithScreenshotInReport(driver, "Value entered successfully in the field :" + value);
	}

	/**
	 * This method sets input value using javascript Executor. Also provides the
	 * feature of clean before setting the value.
	 * 
	 * @param locator
	 * @param value
	 * @param clearInput
	 */
	protected void setInputValueJS(final String locator, final String value, final boolean clearInput) {
		WebElement element = getElement(locator);
		if (clearInput) {
			element.clear();
		}
		javascriptExecutor.executeScript(String.format(SET_INPUT_COMMAND, value), element);
		Screenshots.addStepWithScreenshotInReport(driver, "Value entered successfully in the field :" + value);
	}

	/**
	 * This method sets input value using javascript Executor. Also provides the
	 * feature of clean before setting the value.
	 * 
	 * @param locator
	 * @param value
	 * @param clearInput
	 */
	protected void setInputValueJS(final By by, final String value, final boolean clearInput) {
		WebElement element = getElement(by);
		if (clearInput) {
			element.clear();
		}
		javascriptExecutor.executeScript(String.format(SET_INPUT_COMMAND, value), element);
		Screenshots.addStepWithScreenshotInReport(driver, "Value entered successfully in the field :" + value);
	}

	/**
	 * This method sets input value using javascript Executor.
	 * 
	 * @param locator
	 * @param value
	 * @param clearInput
	 */
	protected void setInputValueJS(final String locator, final String value) {
		WebElement element = getElement(locator);
		element.clear();
		javascriptExecutor.executeScript(String.format(SET_INPUT_COMMAND, value), element);
		Screenshots.addStepWithScreenshotInReport(driver, "Value entered successfully in the field :" + value);
	}

	/**
	 * This method sets input value using javascript Executor.
	 * 
	 * @param locator
	 * @param value
	 * @param clearInput
	 */
	protected void setInputValueJS(final By by, final String value) {
		WebElement element = getElement(by);
		element.clear();
		javascriptExecutor.executeScript(String.format(SET_INPUT_COMMAND, value), element);
		Screenshots.addStepWithScreenshotInReport(driver, "Value entered successfully in the field :" + value);
	}

	/**
	 * This method clears the input field value.
	 * 
	 * @param locator
	 */
	protected void clearElement(final String locator) {
		getElement(locator).clear();
	}

	/**
	 * This method clears the input field value.
	 * 
	 * @param locator
	 */
	protected void clearElement(final By by) {
		getElement(by).clear();
	}

	/**
	 * This method returns the text.
	 * 
	 * @param locator
	 * @return String
	 */
	protected String getText(final String locator) {
		return getElement(locator).getText();
	}

	/**
	 * This method returns the text.
	 * 
	 * @param locator
	 * @return String
	 */
	protected String getText(final By by) {
		return getElement(by).getText();
	}

	/**
	 * This method returns the value of mentioned attribute.
	 * 
	 * @param locator
	 * @param attribute
	 * @return String
	 */
	protected String getAttribute(final String locator, final String attribute) {
		return getElement(locator).getAttribute(attribute);
	}

	/**
	 * This method returns the value of mentioned attribute.
	 * 
	 * @param locator
	 * @param attribute
	 * @return String
	 */
	protected String getAttribute(final By by, final String attribute) {
		return getElement(by).getAttribute(attribute);
	}

	/**
	 * This method returns the css value of mentioned field.
	 * 
	 * @param locator
	 * @param attribute
	 * @return String
	 */
	protected String getCssValue(final String locator, final String attribute) {
		return getElement(locator).getCssValue(attribute);
	}

	/**
	 * This method returns the css value of mentioned field.
	 * 
	 * @param locator
	 * @param attribute
	 * @return String
	 */
	protected String getCssValue(final By by, final String attribute) {
		return getElement(by).getCssValue(attribute);
	}

	/**
	 * This method clicks using javascript executor.
	 * 
	 * @param locator
	 */
	protected void clickElementJS(final String locator) {
		javascriptExecutor.executeScript(CLICK_COMMAND, getElement(locator));
		Screenshots.addStepWithScreenshotInReport(driver, CLICK_ACTION);
	}

	/**
	 * This method clicks using javascript executor.
	 * 
	 * @param locator
	 */
	protected void clickElementJS(final By by) {
		javascriptExecutor.executeScript(CLICK_COMMAND, getElement(by));
		Screenshots.addStepWithScreenshotInReport(driver, CLICK_ACTION);
	}

	/**
	 * This method clicks using javascript executor. Add description to display
	 * in the report.
	 * 
	 * @param locator
	 */
	protected void clickElementJS(final String locator, final String description) {
		javascriptExecutor.executeScript(CLICK_COMMAND, getElement(locator));
		Screenshots.addStepWithScreenshotInReport(driver, CLICK + description);
	}

	/**
	 * This method clicks using javascript executor. Add description to display
	 * in the report.
	 * 
	 * @param locator
	 */
	protected void clickElementJS(final By by, final String description) {
		javascriptExecutor.executeScript(CLICK_COMMAND, getElement(by));
		Screenshots.addStepWithScreenshotInReport(driver, CLICK + description);
	}

	/**
	 * This method first makes the element visible and then perform click action
	 * using javascript.
	 * 
	 * @param locator
	 */
	protected void makeElementVisibleAndClick(final String locator) {
		WebElement element = getElement(locator);
		javascriptExecutor.executeScript(JS_DISPLAY_COMMAND, element);
		javascriptExecutor.executeScript(CLICK_COMMAND, element);
		Screenshots.addStepWithScreenshotInReport(driver, CLICK_ACTION);
	}

	/**
	 * This method first makes the element visible and then perform click action
	 * using javascript.
	 * 
	 * @param locator
	 */
	protected void makeElementVisibleAndClick(final By by) {
		WebElement element = getElement(by);
		javascriptExecutor.executeScript(JS_DISPLAY_COMMAND, element);
		javascriptExecutor.executeScript(CLICK_COMMAND, element);
		Screenshots.addStepWithScreenshotInReport(driver, CLICK_ACTION);
	}

	/**
	 * This method first makes the element visible and then perform click action
	 * using javascript. Add description to display in the report.
	 * 
	 * @param locator
	 */
	protected void makeElementVisibleAndClick(final String locator, final String description) {
		WebElement element = getElement(locator);
		javascriptExecutor.executeScript(JS_DISPLAY_COMMAND, element);
		javascriptExecutor.executeScript(CLICK_COMMAND, element);
		Screenshots.addStepWithScreenshotInReport(driver, CLICK + description);
	}

	/**
	 * This method first makes the element visible and then perform click action
	 * using javascript. Add description to display in the report.
	 * 
	 * @param locator
	 */
	protected void makeElementVisibleAndClick(final By by, final String description) {
		WebElement element = getElement(by);
		javascriptExecutor.executeScript(JS_DISPLAY_COMMAND, element);
		javascriptExecutor.executeScript(CLICK_COMMAND, element);
		Screenshots.addStepWithScreenshotInReport(driver, CLICK + description);
	}

	/**
	 * This method performs the normal click operation of Selenium.
	 * 
	 * @param locator
	 */
	protected void clickElement(final String locator) {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
		getElement(locator).click();	

		Screenshots.addStepWithScreenshotInReport(driver, "Element Clicked Successfully");

	}

	protected void clickWithNoScreenElement(final String locator,String description) {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
		getElement(locator).click();			
		Screenshots.addStepInReport(description +"clicked successfully");
	}

	/**
	 * This method performs the normal click operation of Selenium.
	 * 
	 * @param locator
	 */
	protected void clickElement(final By by) {
		getElement(by).click();
		Screenshots.addStepWithScreenshotInReport(driver, " Element Clicked Successfully");
	}

	/**
	 * This method performs the normal click operation of Selenium. Add
	 * description to display in the report.
	 * 
	 * @param locator
	 */
	protected void clickElement(final String locator, String description) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
		getElement(locator).click();
		Screenshots.addStepWithScreenshotInReport(driver, description +" Clicked Successfully");
	}

	/**
	 * This method performs the normal click operation of Selenium. Add
	 * description to display in the report.
	 * 
	 * @param locator
	 */
	protected void clickElement(final By by, String description) {
		getElement(by).click();
		Screenshots.addStepWithScreenshotInReport(driver, " Element Clicked Successfully" + description);
	}

	/**
	 * This method shifts the focus away from the current element.
	 * 
	 * @param locator
	 */
	protected void shiftFocusAway(final String locator) {
		getElement(locator).sendKeys(Keys.TAB);
	}

	/**
	 * This method shifts the focus away from the current element.
	 * 
	 * @param locator
	 */
	protected void shiftFocusAway(final By by) {
		getElement(by).sendKeys(Keys.TAB);
	}



	protected String getPageSource() {
		return driver.getPageSource();
	}




	public void switchToFrameById(String id) {
		driver.switchTo().frame(id);
		Screenshots.addStepWithScreenshotInReport(driver, "Successfully switched to "+id+ "Frame");
	}
	
	public void switchToFrameByName(String name) {				
		driver.switchTo().frame(name);
		Screenshots.addStepWithScreenshotInReport(driver, "Successfully switched to "+name+ " Frame");
	}
	public void switchToFrameByWebElement(String locator)
	{
		WebElement element = getElement(locator);
		driver.switchTo().frame(element);
	}
	public void switchToDefaultcontent() {
		driver.switchTo().defaultContent();
		Screenshots.addStepWithScreenshotInReport(driver, "Successfully switched to default Frame");
	}

	//	public void focusElement(final String locator) {
	//		JavascriptExecutor js = (JavascriptExecutor) driver;
	//		js.executeScript("document.getElementById('elementid').focus();");
	//	}

	public void focusWindow() {
		((JavascriptExecutor)driver).executeScript("window.focus();");
	}

/*Mouse hover*/
	public void moveToElement(String locator) {
		
		WebElement target = getElement(locator);
		Actions builder=new Actions(driver);
		builder.moveToElement(target).perform();	
		Screenshots.addStepWithScreenshotInReport(driver, "Successfully moved to element");
	}


	public void moveToElementWithClick(WebElement target) {
		Actions builder=new Actions(driver);
		builder.click(target).build().perform();


	}

	public String lastFileModified(String dir, String fileContent) {
		File fl = new File(dir);

		File[] files = fl.listFiles(new FileFilter() {          
			public boolean accept(File file) {
				if(file.getName().contains(fileContent)){
					return file.isFile();
				}else{
					return false;
				}
			}
		});
		long lastMod = Long.MIN_VALUE;
		File choice = null;
		for (File file : files) {
			if (file.lastModified() > lastMod) {
				choice = file;
				lastMod = file.lastModified();
			}
		}
		return choice.getAbsolutePath();
	} 

	public void scrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
	}

	public void windowPoPaccept()
	{
		((JavascriptExecutor) driver).executeScript("window.confirm = function(msg) { return true; }"); 
	}

	public void acceptBrowserPopup()
	{
		//Desired capabilities=
		//general chrome profile
		DesiredCapabilities ch=DesiredCapabilities.chrome();
		//ch.acceptInsecureCerts();
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

		//Belows to your local browser
		ChromeOptions c= new ChromeOptions();
		c.merge(ch);
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver=new ChromeDriver(c);

	}

	public void closeBrowser()
	{
		driver.close();
	}

	public void verifyPartialText(String locator, String expectedText) {
		WebElement ele=getElement(locator);
		System.out.println(ele.getText());
		Assert.assertTrue("The expected text doesn't contains the actual Text :" +expectedText , ele.getText().contains(expectedText));
		//		if (ele.getText().contains(expectedText)) {
		//			WebDriverWait wait = new WebDriverWait(driver, 30);
		//			wait.until(ExpectedConditions.textToBePresentInElement(ele, expectedText));
		//			Screenshots.addStepWithScreenshotInReport(driver, "The expected text contains the actual Text : "+ expectedText);
		//
		//		}	
		//		else
		//		{
		//			Screenshots.addStepWithScreenshotInReport(driver, "The expected text doesn't contains the actual Text1 :" + expectedText);			
		//		}
		Screenshots.addStepWithScreenshotInReport(driver, "The expected text : "+ ele.getText() + "contains the actual Text : "+ expectedText);
	}

	public void switchToFrame(String locator) {
		WebElement element = getElement(locator);
		driver.switchTo().frame(element);


	}


	public void verifyExactText(String locator, String expectedText) {
		WebElement ele=getElement(locator);
		System.out.println(ele.getText());
		Assert.assertTrue("The expected text doesn't contains the actual Text :" +expectedText, ele.getText().equals(expectedText));
		//		if (ele.getText().equals(expectedText)) {
		//			WebDriverWait wait = new WebDriverWait(driver, 10);
		//			wait.until(ExpectedConditions.textToBePresentInElement(ele, expectedText));
		//			Screenshots.addStepWithScreenshotInReport(driver, "The text: " + ele.getText() + " matches with the value :" + expectedText);
		//		} else {
		//			Screenshots.addStepWithScreenshotInReport(driver, "The text " + ele.getText() + " doesn't matches the actual :" + expectedText);
		//		}

		Screenshots.addStepWithScreenshotInReport(driver, "The text: " + ele.getText() + " matches with the value :" + expectedText);
	}

	public void getElementsFromTrow(final String locator) {	


		WebElement tableList = driver.findElement(By.xpath(locator));

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
		List<WebElement> row = tableList.findElements(By.tagName("tr"));
		System.out.println(row.size());

		for(int i=0;i<row.size();i++)
		{
			List<WebElement> col = row.get(i).findElements(By.tagName("td"));

			for(int j=0;j<col.size();j++)
			{
				System.out.print(col.get(j).getText()+ "\t");
			}
			System.out.println("\n");
			Screenshots.addStepWithScreenshotInReport(driver, "Table detials displayed successfully in the console");
		}
		

	}
	
	public void verifySelectedText(String dropdownLocator,String tableLocator,String attribute)
	{
		WebElement element = getElement(dropdownLocator);
		String selectedValue = element.getAttribute(attribute).substring(0, 3);
		WebElement tableList = driver.findElement(By.xpath(tableLocator));

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(tableLocator)));
		List<WebElement> row = tableList.findElements(By.tagName("tr"));
		
			List<WebElement> col = row.get(2).findElements(By.tagName("td"));
			String columnText = col.get(1).getText().substring(0, 3);
			Assert.assertTrue("The selected value doen't matched", selectedValue.contains(columnText));
	}
	public void switchToWindow(int index) {

		Set<String> winHandle = driver.getWindowHandles();
		for(String window:winHandle)
		{

			System.out.println(window);
			List <String> winHandleList = new ArrayList<String>();
			winHandleList.addAll(winHandle);	
			driver.switchTo().window(winHandleList.get(index));
			System.out.println("Switched window successful");
			Screenshots.addStepWithScreenshotInReport(driver, "Successfully switched to window");
		}


	}

	public void getNewWindowTitle(int index)
	{
		waitForPageToLoad(driver);
		Set<String> winHandle = driver.getWindowHandles();
		for(String window:winHandle)
		{

			System.out.println(window);
			List <String> winHandleList = new ArrayList<String>();
			winHandleList.addAll(winHandle);	
			driver.switchTo().window(winHandleList.get(index));
			String newWinTitle = driver.getTitle();
			System.out.println(newWinTitle);
			Screenshots.addStepWithScreenshotInReport(driver, "New window title :" + newWinTitle+" displaye successfully");
		}
	}

	public void waitTill(final String locator, int timeLimit)
	{
		WebElement ele=getElement(locator);		
		WebDriverWait wait= new WebDriverWait(driver, timeLimit);
		wait.until(ExpectedConditions.visibilityOf(ele));

	}


	public void acceptAlert() throws NoAlertPresentException
	{
		try {
			driver.switchTo().alert().accept();
			System.out.println("Switched to Alert");
		} catch (WebDriverException e) {
			System.err.println("Unexpected error in WebDriver");
			e.printStackTrace();
		}catch (Exception e) {
			System.err.println("Error occured");
			e.printStackTrace();
		}

		Screenshots.addStepInReport("PopUp accepted successfully");
	}


	public void dismissAlert() {
		
		try {
			driver.switchTo().alert().dismiss();
			System.out.println("Alert Dismissed");
		} catch (WebDriverException e) {
			System.err.println("Unexpected error in WebDriver");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Error occured");
			e.printStackTrace();
		}
		Screenshots.addStepInReport("PopUp dismissed successfully");
	}

	public void getAlertText(String expected) {
		String text = null;		
		SoftAssert softAssertion= new SoftAssert();	
		
			text = driver.switchTo().alert().getText();
			System.out.println(text);
		//	Assert.assertEquals("Expected text :"+expected+ " doesn't match with actual: "+text , expected, text);
								
			softAssertion.assertEquals(text, expected,"Expected text :"+expected+ " doesn't match with actual: "+text);
			
		Screenshots.addStepInReport("PopUP Message :"+text+" ");
				
	}
	
	public void getAlertText1(String expected) {
		String text = null;
		boolean warningMsg=true;
		try {

			text = driver.switchTo().alert().getText();
			warningMsg = text.contains(expected);
			//assert.assertEquals(warningMsg, expected);
			
			//Assert.assertEquals(expected, expected);
		} catch (WebDriverException e) {
			System.err.println("Unexpected error in WebDriver");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Error occured");
			e.printStackTrace();
		}
		Screenshots.addStepInReport("PopUP Message :"+text+" ");
		

		

	}

	public void selectDropDownUsingText(String locator, String value) {
		WebElement element=getElement(locator);
		try {

			Select dropdown = new Select(element);			
			dropdown.selectByVisibleText(value);

		} catch (ElementNotSelectableException e) {
			System.err.println("Element is not selectable");
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			System.err.println("Unable to find the value in dropdown");
		} catch (WebDriverException e) {
			System.err.println("Unexpected error in WebDriver");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Error occured");
			e.printStackTrace();
		}
		Screenshots.addStepWithScreenshotInReport(driver, "Dropdown Value :" +value+" selected successfully");
		
	}
	
	public void selectDropDownUsingIndex(String locator, int index)
	{
		WebElement element=getElement(locator);
		try {

			Select dropdown = new Select(element);			
			dropdown.selectByIndex(index);

		} catch (ElementNotSelectableException e) {
			System.err.println("Element is not selectable");
			e.printStackTrace();
		} catch (NoSuchElementException e) {
			System.err.println("Unable to find the value in dropdown");
		} catch (WebDriverException e) {
			System.err.println("Unexpected error in WebDriver");
			e.printStackTrace();
		} catch (Exception e) {
			System.err.println("Error occured");
			e.printStackTrace();
		}
		Screenshots.addStepWithScreenshotInReport(driver, "Dropdown Value :" +index+" selected successfully");
	}

	public static void waitForPageToLoad(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
			}
		});

	}

	public static void waitForSomeTime(long inMillis) {
		try {
			Thread.sleep(inMillis);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	public void secelBootStrapDropDown(String locator,String value)
	{

		//List<WebElement> li=driver.findElements(By.xpath(locator));
		WebElement dropdown = driver.findElement(By.xpath(locator));
		List<WebElement> li=dropdown.findElements(By.tagName("option"));
		for(WebElement element:li)
		{
			// Assert.assertTrue("The expected text doesn't contains the actual text", element.getText().equals(value));
			if(element.getText().equals(value))
			{
				if(element.isSelected())
				{
					break;
				}
				else {
				element.click();
				sleep(1000);
				System.out.println("Element Clicked");
				}
			}			
		}
		Screenshots.addStepWithScreenshotInReport(driver, "The value selected from dropdown:" +value);
	}

	public void ClickcancelPopUP() 
	{
		try {
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);			
			robot.keyPress(KeyEvent.VK_TAB);
			sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);

			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			Screenshots.addStepWithScreenshotInReport(driver, "Cancel button on PopUp clicked successfully");
		} catch (AWTException e) {

			e.printStackTrace();
		}
	}

	public void clickOkPopUP() 
	{
		try {
			Robot robot=new Robot();
			robot.keyPress(KeyEvent.VK_CONTROL);
			sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_CONTROL);		
			Screenshots.addStepWithScreenshotInReport(driver, "Ok button on PopUp clicked successfully");
		} catch (AWTException e) {

			e.printStackTrace();
		}
	}


	public void verifyPartialAttribute(String locator,String attribute,String locatorValue)
	{
		WebElement element = getElement(locator);		
		Assert.assertTrue("The attribute value doesn't matched with actual value"+locatorValue, element.getAttribute(attribute).contains(locatorValue));
		Screenshots.addStepWithScreenshotInReport(driver, "Attribute value matched with expected value: "+locatorValue);
	}
	
	public void verifyExactAttribute(String locator,String attribute,String locatorValue)
	{
		WebElement element = getElement(locator);
		Assert.assertTrue("The attribute value doesn't matched with actual value"+locatorValue, element.getAttribute(attribute).equals(locatorValue));
		Screenshots.addStepWithScreenshotInReport(driver, "Attribute value matched with expected value: "+locatorValue);
	}
	
	public void fileUpload(String filePath)
	{
		StringSelection stringSelection = new StringSelection(filePath);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
 
        Robot robot = null;
        
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
 
        robot.delay(250);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.delay(150);
        robot.keyRelease(KeyEvent.VK_ENTER);
	}
		
		
	public void viewAutoInstructRecord(String locator)
	{
		WebElement tableList = driver.findElement(By.xpath(locator));

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
		List<WebElement> row = tableList.findElements(By.tagName("tr"));
		int rowCount=row.size();
		if(rowCount==0)
		{
			Screenshots.addStepWithScreenshotInReport(driver,"No records found");
		}
		else
		{
			Screenshots.addStepWithScreenshotInReport(driver,"records found");
		}
			
	}
	
	public void clickClose() throws FindFailed 
	{
		sleep(4000);
		  String IMAGE_DIR ="./images/closeView.PNG";  		
		  Screen screen = new Screen();
	      Pattern pattern = new Pattern(IMAGE_DIR);
		  screen.wait(pattern,10);
		  sleep(2000);
		  screen.click(pattern);	 
	}
	
	public void clickClosePopUP() throws FindFailed 
	{
		sleep(4000);
		  String IMAGE_DIR ="./images/close.PNG";  		
		  Screen screen = new Screen();
	      Pattern pattern = new Pattern(IMAGE_DIR);
		  screen.wait(pattern,10);
		  sleep(2000);
		  screen.click(pattern);	 
	}
	
	public void imageExist() throws FindFailed
	{
		  String IMAGE_DIR ="./images/showBtn.PNG";  		
		  Screen screen = new Screen();
	      Pattern pattern = new Pattern(IMAGE_DIR);
		  screen.wait(pattern,10);
		  Assert.assertTrue("Downloaded not successfull",  screen.exists(pattern)!=null);
		  Screenshots.addStepWithScreenshotInReport(driver,"Excel sheet downloaded successfully");
		 
	}
	
	public void doubleClickElement(String locator,String description)
	{
		Actions actions = new Actions(driver);
		WebElement element = getElement(locator);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
		actions.doubleClick(element).perform();		
		Screenshots.addStepWithScreenshotInReport(driver, description +"Clicked Successfully");
	}
	
	public void rightClickElement(String locator, String description)
	{
		Actions actions = new Actions(driver);
		WebElement element = getElement(locator);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
		actions.contextClick(element).perform();		
		Screenshots.addStepWithScreenshotInReport(driver, description +"Clicked Successfully");
	}
	

	protected void setPassword(final By by, final String encryptedString) throws UnsupportedEncodingException,
	InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeySpecException {
		String decryptedText = null;
		try {
			myEncryptionKey = "WelcomeToBYNMNextGenFramework";
			myEncryptionScheme = DESEDE_ENCRYPTION_SCHEME;
			arrayBytes = myEncryptionKey.getBytes(UNICODE_FORMAT);
			ks = new DESedeKeySpec(arrayBytes);
			skf = SecretKeyFactory.getInstance(myEncryptionScheme);
			cipher = Cipher.getInstance(myEncryptionScheme);
			key = skf.generateSecret(ks);
			cipher.init(Cipher.DECRYPT_MODE, key);
			byte[] encryptedText = Base64.decodeBase64(encryptedString);
			byte[] plainText = cipher.doFinal(encryptedText);
			decryptedText = new String(plainText);
		} catch (Exception e) {
			e.printStackTrace();
		}
		WebElement element = getElement(by);
		element.clear();
		element.sendKeys(decryptedText);
		//fullScreenShot();
		Screenshots.addStepWithScreenshotInReport(driver, SET_INPUT + encryptedString);
	}
}	








