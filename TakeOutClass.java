package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TakeOutClass extends EazDineMainClass{
	
	
	static WebDriverWait wait = new WebDriverWait(driver, 20);
	static String takeOutPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[4]/android.view.View";
	
	//Header Paths Create TakeOut , Back Button
	static String createTakeOutPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View/android.widget.Button";	
	static String backButtonPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.view.View/android.widget.Button"; 
	
	//Search Menu's
	static String searchMenuPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[1]/android.view.View/android.widget.EditText";
	static String addMenuPath= "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]/android.view.View";
	static String placeOrderPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]";
	
	//TakeOut Guest Path
	static String guestNamePath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText";
	static String mobilePath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText";
	static String expectedPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button";
	static String confirmPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View/android.widget.Button";
	static String donePath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[3]/android.app.Dialog/android.view.View[1]/android.view.View[2]";

	//TakeOut Payment Path
	static String proceedPayPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[2]/android.view.View[1]";
	static String ccPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.view.View[1]/android.view.View";
	static String codPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.view.View[2]/android.view.View/android.widget.RadioButton/android.widget.Button";
	
	static String cardnoPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText";
	static String expMonthPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText";
	static String expYearPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText";
	static String cvvPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText";
	static String confirmPayPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]";
	
	
	public static void TakeOut (int menuCount, String[] takeOrderArr, String guestName, String guestMobile, String paymentType){
		
		System.out.println("\n******Inside TakeOrder*********");
		
		try{
			
			Thread.sleep(5000);
			
			/*** Click on Take Out Menu ***/
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(takeOutPath))).click();
			System.out.println("\nClicked on on Take Out Menu Icon");
			
			
			/*** Click on Create TakeOut ***/
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(createTakeOutPath))).click();
			System.out.println("\nClicked on on Create TakeOut Button");
			
			
			System.out.println("\nBelow is the Menu for Take Out");
			
			for(int i=0;i<menuCount; i++){
				System.out.println("\n"+i+". "+takeOrderArr[i]);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(searchMenuPath))).sendKeys(takeOrderArr[i]);
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(addMenuPath))).click();	
						
			}
			
			System.out.println("\nMenu Items added to Cart");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(placeOrderPath))).click();	
			
			Thread.sleep(5000);
			
			//Entering Guest Details
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(guestNamePath))).sendKeys(guestName);
			System.out.println("\nEntered Guest Name");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(mobilePath))).sendKeys(guestMobile);
			System.out.println("\nEntered Guest Mobile no.");
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(expectedPath))).click();
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(donePath))).click();
			System.out.println("\nSelected Expected Time");
			Thread.sleep(5000);
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(confirmPath))).click();
			System.out.println("\nClicked on Confirm");
			
			Thread.sleep(5000);
			
			/****Take Out Payment ****/
			
			if(paymentType.equals("COD")){
			
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(codPath))).click();
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(proceedPayPath))).click();
				System.out.println("\nClicked on Proceed Payment : COD");				
							
			}else{
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ccPath))).click();
				Thread.sleep(5000);
				
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(cardnoPath))).sendKeys("4242424242424242");
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(expMonthPath))).sendKeys("06");
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(expYearPath))).sendKeys("2023");
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(cvvPath))).sendKeys("09");
				
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(confirmPayPath))).click();
				System.out.println("\nClicked on Confirm Pay");
			}
			
			
		}catch(Exception Ex){
			System.out.println("\nTakeOut : The cause is :"+Ex.getCause());
			System.out.println("\nTakeOut : The message is :"+Ex.getMessage());
			Ex.printStackTrace();
		}		
		
	}//End of TakeOrder
	
}//End of TakeOutClass
