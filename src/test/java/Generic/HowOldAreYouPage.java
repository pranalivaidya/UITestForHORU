package Generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HowOldAreYouPage extends BaseClassImp{
	
	// Elements for HowOldAreYouPage
		@FindBy(xpath = "//h1[@class='logo cursive']")
		public WebElement headerText;

		@FindBy(xpath = "//input[@name='name']")
		public WebElement yourName;

		@FindBy(xpath = "//input[@name='birthday']")
		public WebElement yourBirthday;

		@FindBy(xpath = "//button[@id='submitButton']")
		public WebElement submitButton;

		@FindBy(xpath = "//span[@id='help_name']")
		public WebElement errorForName;

		@FindBy(xpath = "//span[@id='help_birthday']")
		public WebElement errorForBirthday;

		@FindBy(xpath = "//div[@id='resultDiv']//h1[2]")
		public WebElement CalculatedAge;

		@FindBy(xpath = "//div[@id='resultDiv']//h1[1]")
		public WebElement helloText;

		public HowOldAreYouPage() {
			PageFactory.initElements(driver, this);
		}
		
		public void enterTextName(String name) {
			BaseClassImp.waitFor(2);
			yourName.sendKeys(name);
			BaseClassImp.waitFor(2);
		}
		
		public void clickElement() {
			BaseClassImp.waitFor(2);
			submitButton.click();
		}
		
		public void enterTextYourBirthday(String birthday) {
			BaseClassImp.waitFor(2);
			yourBirthday.sendKeys(birthday);
			BaseClassImp.waitFor(2);
		}
		

}
