package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TakeOrderClass extends EazDineMainClass{
	
	static WebDriverWait wait = new WebDriverWait(driver, 20);
	static String takeOrderPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[5]";
	
	//Search Bar
	static String searchPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText";
	static String takeOrderBtnPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]";
	
	public static void TakeOrder(int orderCount, String[] hostNo){	
		System.out.println("\n******Inside TakeOrder*******");
		
		try{
			
			Thread.sleep(5000);
			/*** Click on Take Order Menu ***/
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(takeOrderPath))).click();
			System.out.println("\nClicked on on Take Order Menu Icon");
			
			
			//Search for Host No
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(searchPath))).sendKeys(hostNo[0]);
			System.out.println("\nHost No Entered");
			
			//Click on Take Order Button
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(takeOrderBtnPath))).click();
			
			
			//for(int i =0;i < orderCount; i++){				
				
			//}
			
			
			
		}catch(Exception Ex){
			System.out.println("\nTakeOut : The cause is :"+Ex.getCause());
			System.out.println("\nTakeOut : The message is :"+Ex.getMessage());
			Ex.printStackTrace();
		}
		
		
		
	}
	

}
