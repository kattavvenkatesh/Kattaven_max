package all_test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import pages.Profile_Page;

import root_base.Base_Root;


public class All_TestCases extends Base_Root {

	public All_TestCases() {
		super();
		
	}
	
@BeforeClass // Initializing the driver and launching the application
	
	public void setup() throws InterruptedException {
		initialization();
	}

@Test (priority=1) 

public void HomePageTest() throws InterruptedException {
	System.out.println("Print");
	Profile_Page.getPages()
	.ClickonProfileicon()
	.ClickonAlltheDropdowns();
}


//@AfterClass // Closing the app

public void unInstallAll() {
	driver.closeApp();


}



}