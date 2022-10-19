/**
 * 
 */
package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass.BaseClass;
import Pages.SearchResultPage;

/**
 * @author QurratulAeinMohammad
 *
 */
public class SearchResultTestPage extends BaseClass 
{
	SearchResultPage searchresultpage;
	@BeforeMethod
	public void setup()
	{
		launchApp();
	}
	@Test
	public void Verify_SearchBox() throws Throwable
	{
		searchresultpage= new SearchResultPage();
		searchresultpage.searchAll("Tops");
		//Thread.sleep(2000);
		searchresultpage.add();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
