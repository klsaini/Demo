package utils.common;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import utils.config.Config;
import utils.logger.ILogger;


public abstract class BaseTest implements ILogger {
	private static boolean isInit = false;



	static {
		synchronized (BaseTest.class) {
			if (!isInit) {
				isInit = true;
			}
		}
	}

	@BeforeSuite(alwaysRun = true)
	public void initBeforeSuite(ITestContext context) {
	}

	@AfterSuite(alwaysRun = true)
	public void cleanUpAfterSuite() {
	}

	@BeforeClass(alwaysRun = true)
	public void init(ITestContext suite) throws ConfigurationException {
		Config.getInstance();
	}


	@AfterClass(alwaysRun = true)
	public void cleanUp(ITestContext suite) {

	}

}
