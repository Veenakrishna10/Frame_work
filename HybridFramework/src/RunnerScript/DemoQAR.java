package RunnerScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PomScript.DemoQA;

public class DemoQAR {
	@Test
	public void Demo() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(2000);
		DemoQA d=new DemoQA(driver);
		d.fname("veena");
		d.lname("priya");
		d.mail("veenapb55@gmail.com");
		d.rbutton();
		d.mob();
		d.birth("15/04/1989");
		//d.subject("maths");
		d.hoby("music");
		d.browse("image");
		d.address("bangalore");
	}

}
