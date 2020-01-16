package tests;

import java.time.Duration;

import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class ScrollingClass extends EazDineMainClass{

	@SuppressWarnings("rawtypes")
	public static void scrolling(int startx, int endx, int starty, int endy){
		
		try{
	
		System.out.println("\nscrolling function started");
		System.out.println("startx = " + startx + " ,endx = " + endx + " , starty = " + starty+"  ,endy = "+endy);
		
		Thread.sleep(3000);
		
		new TouchAction((driver))
		.press(PointOption.point(startx,starty))
		.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
		.moveTo(PointOption.point(endx,endy))
		.release().perform();	
		
		Thread.sleep(3000);
		
		}catch(Exception Ex){
			System.out.println("\n scrolling : The cause is :"+Ex.getCause());
			System.out.println("\n scrolling : The message is :"+Ex.getMessage());
			Ex.printStackTrace();
			
		}
	}//End of scrolling()
	
	
	
	
	
}
