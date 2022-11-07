package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankAndCash {
	
	WebDriver driver;
	
	TestBase t = new TestBase();
	
	public BankAndCash() {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement UserName;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement Password;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SignInButton;
	@FindBy(how = How.XPATH, using = "//i[@class = 'fa fa-university']")
	WebElement BankAndCashMouseHover;
	@FindBy(how = How.XPATH, using = "//a[text() = 'New Account']")
	WebElement NewAccount;
	@FindBy(how= How.XPATH,using ="//input[@id = 'account']")
	WebElement accountTitle;
	@FindBy(how= How.XPATH,using ="//input[@id = 'description']")
	WebElement description;
	@FindBy(how= How.XPATH,using ="//input[@id = 'balance']")
	WebElement Balance;
	@FindBy(how= How.XPATH,using ="//input[@id = 'account_number']")
	WebElement AccountNumber;
	@FindBy(how= How.XPATH,using ="//input[@id = 'contact_person']")
	WebElement ContactPerson;
	@FindBy(how= How.XPATH,using ="//input[@id = 'contact_phone']")
	WebElement ContactPhone;
	@FindBy(how= How.XPATH,using ="//input[@id = 'ib_url']")
	WebElement BankingUrl;
	@FindBy(how= How.XPATH,using ="//button[@class = 'btn btn-primary']")
	WebElement submitButton;
	@FindBy(how= How.XPATH,using ="//*[@id=\"page-wrapper\"]/div[3]/div[1]")
	WebElement accountValidation;
	
	

	public void insertUserName(String username) {
		UserName.sendKeys(username);
		 try {
		 Thread.sleep(3000);
		 } catch (InterruptedException e) {
		 e.printStackTrace();
		 }
	}

	public void insertPassword(String password) {
		Password.sendKeys(password);
		 try {
		 Thread.sleep(3000);
		 } catch (InterruptedException e) {
		 e.printStackTrace();
		 }
	}

	public void clickSignIn() {
		SignInButton.click();
		 try {
		 Thread.sleep(3000);
		 } catch (InterruptedException e) {
		 e.printStackTrace();
		 }
	}

	public String getPageTitle(WebDriver driver) 
	{
		 return driver.getTitle();
		
	}
	
	

	public void clickNewAccount() {
		t.mouseHover(BankAndCashMouseHover , NewAccount);

//		 try {
//		 Thread.sleep(3000);
//		 } catch (InterruptedException e) {
//		 e.printStackTrace();
//		 }
	}
	
	
	public void insertAccountTitle(String accTitle)
	{
		accountTitle.sendKeys(accTitle);
		try {
			 Thread.sleep(3000);
			 } catch (InterruptedException e) {
			 e.printStackTrace();
			 }
	}
	
	public void insertdescreption(String desc)
	{
		description.sendKeys(desc);
//		try {
//			 Thread.sleep(3000);
//			 } catch (InterruptedException e) {
//			 e.printStackTrace();
//			 }
	}
	
	public void insertIntialBalance(String bal)
	{
		Balance.sendKeys(bal);
//		try {
//			 Thread.sleep(3000);
//			 } catch (InterruptedException e) {
//			 e.printStackTrace();
//			 }
	}
	
	public void insertAccountNumber(String accNum)
	{
		AccountNumber.sendKeys(accNum);
//		try {
//			 Thread.sleep(3000);
//			 } catch (InterruptedException e) {
//			 e.printStackTrace();
//			 }
	}
	
	public void insertContactPerson(String conPer)
	{
		ContactPerson.sendKeys(conPer);
//		try {
//			 Thread.sleep(3000);
//			 } catch (InterruptedException e) {
//			 e.printStackTrace();
//			 }
	}
	
	public void insertContactPhone(String conPh)
	{
		ContactPhone.sendKeys(conPh);
//		try {
//			 Thread.sleep(3000);
//			 } catch (InterruptedException e) {
//			 e.printStackTrace();
//			 }
	}
	
	public void insertBankingUrl(String bankUrl)
	{
		BankingUrl.sendKeys(bankUrl);
//		try {
//			 Thread.sleep(3000);
//			 } catch (InterruptedException e) {
//			 e.printStackTrace();
//			 }
	}
	
	
	public void clickSubmitButton()
	{
		submitButton.click();
		 try {
		 Thread.sleep(3000);
		 } catch (InterruptedException e) {
		 e.printStackTrace();
		 }
	}
	
	public String accountValidation(WebDriver driver)
	{
		
		return accountValidation.getText();
		
	
	}

	

}