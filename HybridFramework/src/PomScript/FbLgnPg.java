package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericScript.BasePage;
import net.bytebuddy.implementation.bind.annotation.Super;

public class FbLgnPg extends BasePage{
		@FindBy(id="email")
		private WebElement unField;
		@FindBy(id="pass")
		private WebElement pwdField;
		@FindBy(name="login")
		private WebElement loginBtn;
		public FbLgnPg(WebDriver driver)
		{
			super(driver);
		}
		public void passUN(String un)
		{
			unField.sendKeys(un);
		}
		public void passPwd(String pwd)
		{
			pwdField.sendKeys(pwd);
		}
		public void btn()
		{
			loginBtn.click();
		}
		}
