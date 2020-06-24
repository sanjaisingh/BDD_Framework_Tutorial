package pageObjectsManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

import enums.DriverType;

public class WebDriverManager {
	
	private WebDriver driver;
	private static DriverType driverType;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	
	public WebDriverManager() {
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowserType();
	}
	
	public WebDriver getDriver() {
		if(driver == null) {
			driver = createDriverInstance();
		}
		return driver;
	}
	
	private WebDriver createDriverInstance() {

		String driverPath = System.getProperty("user.dir")+FileReaderManager.getInstance().getConfigReader().getDriverPath();
		
		switch(driverType) {
		case CHROME:
			System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
			System.setProperty(CHROME_DRIVER_PROPERTY, driverPath+"chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver", driverPath+"geckodriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		default:
			throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + driverType);
		}
		
		if(FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize())
			driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(FileReaderManager.getInstance().getConfigReader().getImplicitlyWait(), TimeUnit.SECONDS);
		return driver;
	}
	
	public void quitDriver() {
		driver.close();
		driver.quit();
	}
}
