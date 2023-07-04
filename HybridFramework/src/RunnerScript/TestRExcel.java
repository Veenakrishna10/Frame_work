package RunnerScript;

import org.testng.annotations.Test;

import GenericScript.Base_Test;
import GenericScript.DDT;
import PomScript.FbLgnPg;

public class TestRExcel extends Base_Test{
	@Test
	public void test() throws InterruptedException
	{
		String un=DDT.getdata("shee1",0,0);
		String pwd=DDT.getdata("shee1",0,1);
		FbLgnPg f1=new FbLgnPg(driver);
		f1.passUN(un);
		f1.passPwd(pwd);
		Thread.sleep(2000);
		f1.btn();
	}
	
}
		
