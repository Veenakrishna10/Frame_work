package PomScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito {

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--incognito");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
		// TODO Auto-generated method stub

	}

}
