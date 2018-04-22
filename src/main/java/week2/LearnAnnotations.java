package week2;

import org.testng.annotations.*;

import wdMethods.SeMethods;

public class LearnAnnotations extends SeMethods {
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("brfore suite");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println(" before test");
	}
	@BeforeClass
	public void beforeclass() {
		System.out.println(" before class");
	}
	@AfterSuite
	public void aftersuite() {
		System.out.println("After suite");
	}
	@AfterTest
	public void afterTest() {
		System.out.println(" After test");
	}
	@AfterClass
	public void afterclass() {
		System.out.println(" After class");
	}

}
