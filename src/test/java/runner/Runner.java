package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import pageObjectsManager.FileReaderManager;

import com.cucumber.listener.Reporter;

import java.io.*;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = ".//Resources",
		glue = "stepDefinitions",
		plugin = {"html:target/cucumber-reports", "junit:target/cucumber-reports/JUnit_Cucumber.xml",
				"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
		dryRun = false,
		monochrome = true,
		strict = true
		)

public class Runner {

	@AfterClass
	public static void writeExtentReport() {
		String extentFile = System.getProperty("user.dir")+FileReaderManager.getInstance().getConfigReader().getReportConfigPath();
		Reporter.loadXMLConfig(new File(extentFile));
		Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
		Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10 - 32 Bit");
		Reporter.setSystemInfo("Selenium", "3.14.0");
		Reporter.setSystemInfo("Maven", "3.5.2");
		Reporter.setSystemInfo("Java Version", "1.8.0_151");
	}
}