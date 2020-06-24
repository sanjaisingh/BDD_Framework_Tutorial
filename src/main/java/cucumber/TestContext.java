package cucumber;

import pageObjectsManager.PageObjectManager;
import pageObjectsManager.WebDriverManager;

public class TestContext {
	
	private PageObjectManager pageObjectManager;
	private WebDriverManager webDriverManager;
	
	public TestContext() {
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	}
	
	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}

}
