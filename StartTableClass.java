package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StartTableClass extends EazDineMainClass {

	
	static WebDriverWait wait = new WebDriverWait(driver, 20);
	
	
	static String startTablePath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[3]/android.view.View";
	static String createHostPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View/android.widget.Button";
	static String guestCountPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.view.View/android.widget.EditText";
	static String guestCountId = "alert-input-3-0";
	static String okPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.widget.Button[2]";
	static String tablenumberPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[3]/android.view.View/android.widget.EditText";
	static String tableNoConfirm = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.widget.Button[2]";
	static String assignWaiterPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.widget.Button[1]";
	static String waiterallocatePath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View[3]/android.view.View";
	static String gotoStartPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Image";
	static String backArrowPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]";
	static String searchHostPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText";
	
	//Take Order Paths
	static String takeOrderPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]";
	static String indOrderPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]";
	static String tableOrderPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[8]";
	static String guestOrderPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Image[1]";
	static String addOrderPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[3]";
	
	//Select Menu 
	static String menuOder1Path = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[6]/android.view.View/android.view.View[4]/android.view.View/android.widget.Button";
	static String menuOder2Path = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[9]/android.view.View/android.view.View[4]/android.view.View/android.widget.Button";
	static String placeOrderPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[2]";
	static String markDel1Path = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.view.View[1]";
	//static String markDel2Path = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[3]/android.view.View[3]/android.view.View[1]";
	static String invoicePath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]";
	
	//Select Status
	static String tableStatusDrpDwnPath ="//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View[1]";
	static String tableStatus1Path = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View/android.widget.RadioButton[1]";
	static String tableStatus2Path = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View/android.widget.RadioButton[2]";
	
	//Select Check
	static String checkPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]";
	
	
	public static void StartTable(String guestNo, String tableNo, String tableLoc){
		
		System.out.println("\n******Inside StartTable*********");
		String tablepath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View["+tableLoc+"]/android.view.View";
		String hostnovalue = null;
		String hostno = null;
		try{
		
		Thread.sleep(5000);
		
		/*** Click on Menu ***/
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(startTablePath))).click();
		System.out.println("\nClicked on Start Table Menu Icon");
		
		
		Thread.sleep(3000);
		
		/***Click on Create a Host Link***/
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(createHostPath))).click();
		System.out.println("\nClicked on Create a Host Link");
		
		
		/***Enter Count of Guest***/
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(guestCountPath))).sendKeys(guestNo);
		System.out.println("\nEntered Guest Count "+guestNo);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(okPath))).click();		
		System.out.println("\nClicked ok");
		
		Thread.sleep(10000);
		
		/*******Select the White Table*********/
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(tablepath))).click();
		System.out.println("\nSelected Table");
		

		
		/*******Enter Table Number and Confirm*********/
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(tablenumberPath))).sendKeys(tableNo);
		System.out.println("\nEntered Table Number");		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(tableNoConfirm))).click();
		System.out.println("\nClicked on TableNo Confirm");
		
		Thread.sleep(10000);
		
				
		/****Assign Waiter ****/
		
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(assignWaiterPath))).click();
		System.out.println("\nClicked on Assign Waiter");
		
		/*****Allocate Waiter ***/
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(waiterallocatePath))).click();
		System.out.println("\nClicked on Allocate Waiter");
		
		Thread.sleep(10000);
		
	
		/****Fetching Host No. ****/
		hostnovalue = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.view.View[1]"))).getText();
		System.out.println("\nThe HostNumber is : "+hostnovalue);
		String[] arrSplit = hostnovalue.split("\\s");
		hostno = arrSplit[2];
		System.out.println("The Host no in number is :"+hostno);
		
				
		/*****Goto Start Table ***/
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(gotoStartPath))).click();
		System.out.println("\nClicked on Goto Start Table");
			
		
		/*** Search for Host no ***/
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(searchHostPath))).sendKeys(hostno);
		System.out.println("\nEntered Host No. for Search");
		
		Thread.sleep(5000);
		
		/**** Take Order ****/
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(takeOrderPath))).click();
		System.out.println("\nClicked on Take Order");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(indOrderPath))).click();
		System.out.println("\nSelected Individual Order");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(guestOrderPath))).click();
		System.out.println("\nSelected Guest");
		
		
		//**** Select Menu ****/
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(addOrderPath))).click();
		System.out.println("\nClicked on Add Order");
					
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(menuOder1Path))).click();
		System.out.println("\nSelected Menu Item 1");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(menuOder2Path))).click();
		System.out.println("\nSelected Menu Item 2");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(placeOrderPath))).click();
		System.out.println("\nClicked on Place Order");
		
		/***** Check Orders ***/ 
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(markDel1Path))).click();
		System.out.println("\nClicked on Delivered 1");		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(markDel1Path))).click();
		System.out.println("\nClicked on Delivered 2");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(invoicePath))).click();
		System.out.println("\nClicked on Invoice");
		
				
		
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(tableStatusDrpDwnPath))).click();
//		System.out.println("\nClicked on Table Status Drop Down");
//		
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(tableStatus1Path))).click();
//		System.out.println("\nClicked on Table Status Appetizer");
//		
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(okPath))).click();		
//		System.out.println("\nClicked ok");
//		
//		/*** Check ****/
//		
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(checkPath))).click();		
//		System.out.println("\nClicked Check");
		
		
		
		}catch(Exception Ex){
			System.out.println("\nStartTable : The cause is :"+Ex.getCause());
			System.out.println("\nStartTable : The message is :"+Ex.getMessage());
			Ex.printStackTrace();
		}
		
		
		
	}
	
	
	
	
	
}//End of StartTableClass
