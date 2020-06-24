package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath = System.getProperty("user.dir")+"/Configurations/Configs.properties";
	
	public ConfigFileReader() {

		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			
			try {
				properties.load(reader);
				reader.close();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configs.properties not found at: " + propertyFilePath);
		}		
	}	
	
	public String getDriverPath() {
		String driverPath = properties.getProperty("driverPath");
		
		if(driverPath != null)
			return driverPath;
		else
			throw new RuntimeException("driverPath not specified in the Configuration.properties file.");
	}
		 
	public long getImplicitlyWait() {
		String implicitlyWait = properties.getProperty("implicitlyWait");
		
		if(implicitlyWait != null) {
			try {
				return Long.parseLong(implicitlyWait);
			}
			catch (NumberFormatException e) {
				e.printStackTrace();
				throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
			}
		}
		return 30;
	}
		 
	public String getApplicationUrl() {
		String appURL = properties.getProperty("appURL");
		
		if(appURL != null)
			return appURL;
		else
			throw new RuntimeException("application URL not specified in the Configuration.properties file.");
	}
	
	public String getAppUsername() {
		String appUsername = properties.getProperty("appUsername");
		
		if(appUsername != null)
			return appUsername;
		else
			throw new RuntimeException("application username not specified in the Configuration.properties file.");
	}
	
	public String getAppPassword() {
		String appPassword = properties.getProperty("appPassword");
		
		if(appPassword != null)
			return appPassword;
		else
			throw new RuntimeException("application password not specified in the Configuration.properties file.");
	}
	
	// Select browser type to execute scripts on particular browser....
	
	public DriverType getBrowserType() {
		String browserName = properties.getProperty("browserName");
		
		if(browserName == null || browserName.equals("chrome"))
			return DriverType.CHROME;
		else if(browserName.equalsIgnoreCase("firefox"))
			return DriverType.FIREFOX;
		else if(browserName.equals("iexplorer"))
			return DriverType.INTERNETEXPLORER;
		else
			throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName);
	}
	
	public Boolean getBrowserWindowSize() {
		String windowSize = properties.getProperty("windowMaximize");
		if(windowSize != null) 
			return Boolean.valueOf(windowSize);
		return true;
	}
	
	
	
	
	
	
	
	public String getTestDataResourcesPath() {
		String testDataResourcesPath = properties.getProperty("dataResourcesPath");
		if(testDataResourcesPath != null)
			return testDataResourcesPath;
		else
			throw new RuntimeException("Test Data Resource Path not specified in the Configuration.properties file for the Key:testDataResourcePath");
	}
	
	

	public String getReportConfigPath() {
		String reportConfigPath = properties.getProperty("reportConfigPath");
		if(reportConfigPath != null)
			return reportConfigPath;
		else
			throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
	}
}
