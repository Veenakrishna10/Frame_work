package RunnerScript;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;

import freemarker.log.Logger;

public class Log4j_Report {
	@Test
	public void test2()
	{
		BasicConfigurator.configure();
		Logger log=Logger.getLogger(this.getClass().getName());
		log.error("error");
		log.info("info");
	}

}
