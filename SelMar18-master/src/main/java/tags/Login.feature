@Smoke
Feature: Login into Leaftaps Application

Scenario Outline: Login with system Admin (+ve)
Given Enter the UserName as <uName>
And Enter the Password as <pwd>
When Click on Login button
Then Login should be successful
Examples: 
|uName|pwd|
|DemoSalesManager|crmsfa|
|DemoCSR|crmsfa|


Scenario Outline: Login with system Admin (-ve)
Given Enter the UserName as <uName>
And Enter the Password as <pwd>
When Click Login button for Failure
But Verify Login failed
Examples: 
|uName|pwd|
|DemoSalesManager1|crmsfa1|