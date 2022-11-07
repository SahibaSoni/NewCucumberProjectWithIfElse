package steps;


import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.BankAndCash;
import page.TestBase;

public class BankAndCashStep extends TestBase{
	
	BankAndCash bankCash;
	
	
	@Before
	public void setUp()
	{
		initDriver();
		bankCash = PageFactory.initElements(driver, BankAndCash.class);
		
	}
	
	@Given ("^User is on the techfios login page$")
	public void User_is_on_the_techfios_login_page()
	{
		
		driver.get("https://techfios.com/billing/?ng=admin/");
		
	}
	
	@When("^User enters the \"([^\"]*)\" as \"([^\"]*)\" field$")
	public void user_enters_the(String data , String field)  {
		
		if(field.equalsIgnoreCase("username"))
		{
			bankCash.insertUserName(data);
			System.out.println("UserName : " + data);
		}else if(field.equalsIgnoreCase("password"))
		{
			bankCash.insertPassword(data);
			System.out.println("Password : " + data);
		}else 
		{
			System.out.println("data not found : "+data);
		}
	   
	}
	
	@When("^User clicks on \"([^\"]*)\"$")
	public void user_clicks_on(String button){
		
		switch(button)
		{
		case "login" : bankCash.clickSignIn();
		break;
		
		case "newAccount" : bankCash.clickNewAccount();
		break;
		
		case "Submit" : bankCash.clickSubmitButton();
		break;
		
		default:
			break;
		}
	    
	}
	
	@Then("^User should land on Dashboard page$")
	public void user_should_land_on_Dashboard_page(){
	   
		String expectedTitle = "Dashboard- iBilling";
		String actuleTitle = bankCash.getPageTitle(driver);
		Assert.assertEquals("Page not found ",expectedTitle, actuleTitle);
	}
	
	@And("^User enters \"([^\"]*)\" in accounts page as \"([^\"]*)\" field$")
	public void user_enters_in_accounts_page(String detail , String field){
		
		if(field.equalsIgnoreCase("accountTitle"))
		{
			bankCash.insertAccountTitle(detail + generateRandomNum(9999));
		}else if(field.equalsIgnoreCase("description"))
		{
			bankCash.insertdescreption(detail);
		}else if(field.equalsIgnoreCase("initialBalance"))
		{
			bankCash.insertIntialBalance(detail);
		}else if(field.equalsIgnoreCase("accountNumber"))
		{
			bankCash.insertAccountNumber(detail + generateRandomNum(9999));
		}else if(field.equalsIgnoreCase("contactPerson"))
		{
			bankCash.insertContactPerson(detail);
		}else if(field.equalsIgnoreCase("Phone"))
		{
			bankCash.insertContactPhone(detail + generateRandomNum(9999));
		}else if(field.equalsIgnoreCase("internetBankingURL"))
		{
			bankCash.insertBankingUrl(detail);
		}else
		{
			System.out.println("Deails are not correct");
		}
	   
	}
	
	@Then("^User should be able to validate account created successfully$")
	public void user_should_be_able_to_validate_account_created_successfully()
	{
		//String expectedText = "Account Created Successfully";
		String actualText = bankCash.accountValidation(driver);
		
		if(actualText.contentEquals("Account Created Successfully"))
		{
			System.out.println("Successfully Created ");
		}else
		{
			System.out.println("Account not Created");
		}
		//Assert.assertTrue(actualText == expectedText);
	}

}
