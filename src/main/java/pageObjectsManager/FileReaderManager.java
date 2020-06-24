package pageObjectsManager;

import dataProvider.ConfigFileReader;
import dataProvider.JsonDataReader;

public class FileReaderManager {
	
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigFileReader configFileReader;
	private static JsonDataReader jsonDataReader;

	private FileReaderManager() {
		// Using private constructor to achieve singleton class
	}
	
	public static FileReaderManager getInstance() {
		return fileReaderManager;
	}
	
	public ConfigFileReader getConfigReader() {
		return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	}
	
	public JsonDataReader jsonDataReader() {
		return (jsonDataReader == null) ? new JsonDataReader() : jsonDataReader;
	}
}
