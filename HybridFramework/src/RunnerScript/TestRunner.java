package RunnerScript;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericScript.Base_Test;
import PomScript.FbLgnPg;

public class TestRunner extends Base_Test{
@Test(dataProvider="testData")
public void test1(String d1,String d2) throws InterruptedException 
{
	FbLgnPg f1=new FbLgnPg(driver);
	f1.passUN(d1);
	f1.passPwd(d2);
	Thread.sleep(2000);
	f1.btn();
	//Assert.fail();
}
@DataProvider(name = "testData")
public Object[][] createData1() {
 return new Object[][] {
   { "Cedric", "veena" },
   { "Anne", "priya"},
 };
}
}
