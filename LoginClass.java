package tests;

import org.openqa.selenium.By;

public class LoginClass extends EazDineMainClass{
	
	
	public static void LoginAppTest(String id, String pass) {	
		
		System.out.println("\n******Inside LoginAppTest*********");
				
		try{
			//Test Case No. 1 - Successful login of Manager
			Thread.sleep(3000);
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//hierarchy//android.widget.FrameLayout//android.widget.LinearLayout//android.widget.FrameLayout//android.widget.FrameLayout//android.widget.FrameLayout//android.webkit.WebView//android.webkit.WebView//android.view.View//android.view.View//android.view.View//android.view.View//android.view.View//android.view.View//android.view.View//android.view.View//android.view.View[3]//android.widget.EditText")).sendKeys(id);
			Thread.sleep(3000);			
			System.out.println("\nEntered Username");
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//hierarchy//android.widget.FrameLayout//android.widget.LinearLayout//android.widget.FrameLayout//android.widget.FrameLayout//android.widget.FrameLayout//android.webkit.WebView//android.webkit.WebView//android.view.View//android.view.View//android.view.View//android.view.View//android.view.View//android.view.View//android.view.View//android.view.View//android.view.View[4]//android.widget.EditText")).sendKeys(pass);
			System.out.println("\nEntered Password");
			
			Thread.sleep(3000);
			driver.findElement(By.xpath("//hierarchy//android.widget.FrameLayout//android.widget.LinearLayout//android.widget.FrameLayout//android.widget.FrameLayout//android.widget.FrameLayout//android.webkit.WebView//android.webkit.WebView//android.view.View//android.view.View//android.view.View//android.view.View//android.view.View//android.view.View//android.view.View//android.view.View//android.view.View[5]//android.view.View//android.widget.Button")).click();
	
			System.out.println("\nClicked Login");
			Thread.sleep(3000);
									
			}catch (Exception ex){
			
			System.out.println("\nLogin Test : The cause is :"+ex.getCause());
			System.out.println("\nLogin Test : The message is :"+ex.getMessage());
			ex.printStackTrace();
		}
			
	}//End of LoginAppTest()
	
	
}
