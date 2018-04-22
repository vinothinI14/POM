package week4;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class LearnRetry implements IRetryAnalyzer{
int counter=0;
int retryList=4;
	@Override
	public boolean retry(ITestResult result) {

		{
			if(counter<retryList)
			{
				counter++;
				boolean status = false;
				
			}
		}
		return false;
	}

}
