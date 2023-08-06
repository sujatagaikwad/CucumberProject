Feature: Saleforce login

Scenario Outline: Saleforce main page login

Given intialize chromedriver
When user navigates to "https://login.salesforce.com/"
And user enter <username> and <password> and clicks on login button
Then user should be able to login

Examples:
|username|password|
|test123|secure123|
|test23|secure567|
