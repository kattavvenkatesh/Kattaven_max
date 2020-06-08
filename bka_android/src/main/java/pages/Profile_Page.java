package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


import root_base.Base_Root;

public class Profile_Page extends Base_Root<Profile_Page> {
		private static Profile_Page  A= new Profile_Page();
		private Profile_Page() {
			
		}
			
		public  static Profile_Page getPages() {
			if(A==null) {
				A = new Profile_Page();
			}
			return A;
		} 
		
		private static WebElement profile;
		private static WebElement dropdown1;
		private static WebElement dropdown2;
		private static WebElement dropdown3;
		private static WebElement dropdown4;
		private static WebElement dropdown5;
		
		
		private static final String Profile_icon = "android.widget.FrameLayout/Profile";
		private static final String drop_down1 = "//*[@resource-id=\"de.arbeitsagentur.bka:id/sdOvSectionHeaderPersonal\"]/android.widget.ImageView[2]";
		private static final String drop_down2 = "//*[@resource-id=\"de.arbeitsagentur.bka:id/sdOvSectionHeaderAdresse\"]/android.widget.ImageView[2]";
		private static final String drop_down3 = "//*[@resource-id=\"de.arbeitsagentur.bka:id/sdOvSectionHeaderKontakt\"]/android.widget.ImageView[2]";
		private static final String drop_down4 = "//*[@resource-id=\"de.arbeitsagentur.bka:id/sdOvSectionHeaderZahlung\"]/android.widget.ImageView[2]";
		private static final String drop_down5 = "//*[@resource-id=\"de.arbeitsagentur.bka:id/sdOvSectionHeaderAccount\"]/android.widget.ImageView[2]";



		
		
		
		public Profile_Page ClickonProfileicon() throws InterruptedException { 
			Thread.sleep(10000);
			profile = driver.findElement(By.xpath(Profile_icon));
			clickonView(profile);
			return this;
		}

		public Profile_Page ClickonAlltheDropdowns(){ 
			dropdown1 = driver.findElement(By.xpath(drop_down1));
			clickonView(dropdown1);
			
			dropdown2 = driver.findElement(By.xpath(drop_down2));
			clickonView(dropdown2);
			
			dropdown3 = driver.findElement(By.xpath(drop_down3));
			clickonView(dropdown3);
			
			dropdown4 = driver.findElement(By.xpath(drop_down4));
			clickonView(dropdown4);
			
			dropdown5 = driver.findElement(By.xpath(drop_down5));
			clickonView(dropdown5);
			
			
			
			return this;
		}
}
