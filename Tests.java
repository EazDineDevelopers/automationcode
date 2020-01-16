package tests;

import org.testng.annotations.Test;

public class Tests extends EazDineMainClass{
		
	@Test
	public static void main() {
		
		/*******Login*************/ 
		String username = null;
		String password = null;
		username = "mbriks@eazdine.com";
		password = "11020640"; 	
		
		
		
		
		/********Delete Menu *********/
//		String dinnerPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[4]/android.widget.Button";
//		String dessertPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.Button";
		
		/********Login*********/
		LoginClass.LoginAppTest( username,  password);
		
		/********Delete Menu *********/
//		DeleteMenuItemsClass.DeleteMenuItems(dessertPath,2);
		
		/******** Start Table & Host *******/
//		//guest no , table no, table location
//		StartTableClass.StartTable("4", "67","24");	

//		int menuCount = 3;
//		String payTypeCOD = "COD";
//		String payTypeCC = "CC";
//		String[] takeOrderArr = {"Egg","Coconut Waters","Two Sliders"};		
//		TakeOutClass.TakeOut(menuCount,takeOrderArr,"Roshit","9823430989",payTypeCOD);
		
		
		/**** TakeOut ********/
		int orderCount = 2;
		String[] hostNo = {"8939","9845"}; 
		TakeOrderClass.TakeOrder(orderCount, hostNo);
		
		
	}//End of main function
	
				
}//End of Tests
			
			
	