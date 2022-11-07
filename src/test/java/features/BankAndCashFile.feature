Feature: Techfios bank and cash New Account Functionality 

Scenario Outline: User should be able to login with valid credentials 
	and open a new account	
	Given User is on the techfios login page 
	When User enters the "<username>" as "username" field
	When User enters the "<password>" as "password" field
	And User clicks on "login"
	Then User should land on Dashboard page 
	And User clicks on "newAccount"
	And User enters "<accountTitle>" in accounts page as "accountTitle" field
	And User enters "<description>" in accounts page as "description" field
	And User enters "<initialBalance>" in accounts page as "initialBalance" field
	And User enters "<accountNumber>" in accounts page as "accountNumber" field
	And User enters "<contactPerson>" in accounts page as "contactPerson" field
	And User enters "<Phone>" in accounts page as "Phone" field
	And User enters "<internetBankingURL>" in accounts page as "internetBankingURL" field
	And User clicks on "Submit"
	Then User should be able to validate account created successfully
	
Examples:
|username          |password |accountTitle |description |initialBalance |accountNumber |contactPerson |Phone       |internetBankingURL              |
|demo@techfios.com |abc123   |demoAcc      |	SavingAcc | 10000         | 1234         | Sahiba       | 1234567890 | https://www.bankofamerica.com/ |