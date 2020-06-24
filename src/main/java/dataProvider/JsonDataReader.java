package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import pageObjectsManager.FileReaderManager;
import testDataTypes.CustomerData;

public class JsonDataReader {
	
	private final String customerFilePath = System.getProperty("user.dir")+FileReaderManager.getInstance().getConfigReader().getTestDataResourcesPath()+"CustomerData.json";
	private List<CustomerData> customerList;
	
	public JsonDataReader() {
		
		customerList = getCustomerData();
	}
	
	private List<CustomerData> getCustomerData() {
		Gson gson = new Gson();
		BufferedReader bufferedReader = null;
		
		try {
			bufferedReader = new BufferedReader(new FileReader(customerFilePath));
			CustomerData[] customers = gson.fromJson(bufferedReader, CustomerData[].class);
			return Arrays.asList(customers);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("JSON file not found at specified location : " + customerFilePath);
		}
		finally {
			try {
				if(bufferedReader != null)
					bufferedReader.close();
			}
			catch (IOException e) {
				
			}
		}
	}
	
	public final CustomerData getCustomerByName(String customerName) {
		return customerList.stream().filter(x -> x.firstName.equalsIgnoreCase(customerName)).findAny().get();
	}
}
