package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteMenuItemsClass extends EazDineMainClass {
	
	//static WebDriverWait wait1 = new WebDriverWait(driver, 20);
	static Dimension size;
	static int startx;
	static int endx;
	static int starty;
	static int endy;
	

// 	Path of category to be deleted
//
//	String apptezierPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[1]/android.widget.Button";
//	String breakfastPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[2]/android.widget.Button";
//	String dessertPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.Button";
//	String dinnerPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[4]/android.widget.Button";
//	 Will need scrolling 
//	String drinksPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[5]/android.widget.ToggleButton";
//	lunchPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[2]/android.view.View[5]/android.widget.Button"; 

		
	static String deletePath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.view.View[3]/android.view.View[2]/android.view.View[2]";
	static String deleteCfrmPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.widget.Button[2]";
	static WebDriverWait wait = new WebDriverWait(driver, 20);
		
	public static void DeleteMenuItems(String categoryPath, int count){
		
		try{
			
			System.out.println("\n**********Inside DeleteMenuItems***********");
						
			size  = driver.manage().window().getSize();	
			startx = (int) (size.width * 0.90);
			endx = (int)(size.width * 0.30);
			starty = (int) (size.height/2);
			endy= (int) (size.height/2);	
			ScrollingClass.scrolling(startx, endx, starty,endy);
		
			Thread.sleep(3000);
			driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[7]/android.view.View")).click();
			System.out.println("\nClicked on AddEditMenu");		
			
			Thread.sleep(3000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(categoryPath))).click();				
			System.out.println("\nClicked on Category");
			
			Thread.sleep(3000);
			
			for(int i=0; i<count;i++){		
				
				//Delete Menu Item
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(deletePath))).click();
				System.out.println("\nClicked on Delete Menu Item");
				
				//Click on Confirm Delete
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(deleteCfrmPath))).click();
				System.out.println("\nClicked on Delete Button");
				Thread.sleep(7000);
			}
			
			Thread.sleep(3000);
			
		}catch(Exception Ex){			
			System.out.println("\nDeleteMenuItemsSingle : The cause is :"+Ex.getCause());
			System.out.println("\nDeleteMenuItemsSingle : The message is :"+Ex.getMessage());
			Ex.printStackTrace();
		}
				
	}//End of DeleteMenuItems
		

}//End of DeleteMenuItemsClass
