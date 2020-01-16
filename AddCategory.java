package tests;

import java.time.Duration;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class AddCategory extends EazDineMainClass{

	@SuppressWarnings("rawtypes")
	public void AddEditMenu_Category() {
		
		try{
		
		 Thread.sleep(3000);
		 System.out.println("\n Inside AddEditMenu_Category");
		 MobileElement addeditmenuitem_cat = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button"));
		 addeditmenuitem_cat.click();
		 System.out.println("\n Clicked on AddEditMenu_Category");
		 
		 Thread.sleep(3000);
		 
		 MobileElement add_cat = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View/android.widget.Button"));
		 add_cat.click();
		 System.out.println("\n Clicked on Add_Category");

		 Thread.sleep(3000);
		 
		 MobileElement cat_name = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText")); 
		 cat_name.sendKeys("Breezers");
		 System.out.println("\n Entered Name of Category");
		 Thread.sleep(3000);
		 
		 MobileElement cat_startDate = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button")); 
		 cat_startDate.click();
		 System.out.println("\n Clicked on Start Date Btn");
		 Thread.sleep(3000);
		 
		 MobileElement cat_startime = driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View[4]/android.widget.CheckBox/android.widget.Button")); 
		 cat_startime.click();
		 System.out.println("\n Clicked on Start Time Done Btn");
		 Thread.sleep(3000);
		 
		 
		 MobileElement cat_EndDate = driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button"));
		 cat_EndDate.click();
		 System.out.println("\n Clicked on End Date Btn");
		 Thread.sleep(3000);
		 
		 	 
//		 size = driver.manage().window().getSize();
//		 int startx = (int) (size.width * 0.90);
//		 int endx = (int)(size.width * 0.30);
//		 int starty = (int) (size.height/2);
//		 System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty);

		 Thread.sleep(3000);		
		 new TouchAction((driver))
		 .press(PointOption.point(380,1550))
		 .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		 .moveTo(PointOption.point(372,1750)).release().perform();	
		 Thread.sleep(3000);
		 
		System.out.println("\nScrolled");
		MobileElement cat_endtime = driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View[4]/android.widget.CheckBox/android.widget.Button")); 
		cat_endtime.click();
		System.out.println("\n Clicked on End Time Done Btn");
		Thread.sleep(3000);
		 
		
		MobileElement cat_Add = driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[4]"));
		cat_Add.click();
		System.out.println("\n Clicked on Add Btn");
		Thread.sleep(3000);
		
		
		 
		}catch(Exception Ex){
			System.out.println("\nAdd/Edit Menu_Category Test : The cause is :"+Ex.getCause());
			System.out.println("\nAdd/Edit Menu_Category Test : The message is :"+Ex.getMessage());
			Ex.printStackTrace();
		}
	}//AddEditMenu_Category
	
	
}
