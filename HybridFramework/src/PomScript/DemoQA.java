package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQA {
	@FindBy(id="firstName")
	private WebElement name;
	@FindBy(id="lastName")
	private WebElement lsname;
	@FindBy(id="userEmail")
	private WebElement email;
	@FindBy(xpath="//label[text()='Female']")
	private WebElement radio;
	@FindBy(id="userNumber")
	private WebElement mobile;
	@FindBy(id="dateOfBirthInput")
	private WebElement birth;
	
	//private WebElement subjects;
	@FindBy(xpath="//label[text()='Music']")
	private WebElement hobby;
	@FindBy(id="uploadPicture")
	private WebElement choosefile;
	@FindBy(id="currentAddress")
	private WebElement address;
	
	public DemoQA(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void fname(String fn)
	{
		name.sendKeys(fn);
	}
	public void lname(String ln)
	{
		lsname.sendKeys(ln);
	}
	public void mail(String em)
	{
		email.sendKeys(em);
	}
	public void rbutton()
	{
		radio.click();
	}
	public void mob()
	{
		mobile.sendKeys("9590122254");
	}
	public void birth(String dob)
	{
		birth.sendKeys(dob);
	}
	//public void subject(String sb)
//	{
	//	subjects.sendKeys(sb);
	//}
	public void hoby(String hb)
	{
		hobby.sendKeys(hb);
	}
	public void browse(String up)
	{
		choosefile.sendKeys(up);
	}
	public void address(String ad)
	{
		address.sendKeys(ad);
	}
}
