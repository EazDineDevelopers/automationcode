package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ExcelDataProviderStaff;
import utils.ExcelUtils;

public class AddStaffItems extends EazDineMainClass{

	static Dimension size;
	static int startx;
	static int endx;
	static int starty;
	static int endy;
	
	static String addStaffPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[8]/android.view.View";
	static String addStaffPlus = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View";
	static String firstNamePath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText";
	static String lastNamePath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText";
	static String mobilePath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText";
	static String emailPath =  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText";
	static String rolePath =  "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]";
	static String roleManagerPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.widget.RadioButton[1]";
	static String roleWaiterPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View[2]/android.widget.RadioButton[2]";
	static String okPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.widget.Button[2]";
	static String cancelPath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.widget.Button[1]";
	static String savePath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[7]/android.view.View/android.widget.Button";
	static int rowFlag = 0;
	
	
	static WebDriverWait wait = new WebDriverWait(driver, 50);
	
	
	public static void addStaff(){
		System.out.println("\n***********Inside AddStaff*************");
		String projectpath1 = System.getProperty("user.dir")+"/excel/EazDine_Staff.xlsx"; 	
		String sheet1 = "Staff";
		
		try{		
		size  = driver.manage().window().getSize();	
		startx = (int) (size.width * 0.90);
		endx = (int)(size.width * 0.30);
		starty = (int) (size.height/2);
		endy= (int) (size.height/2);
		
		ScrollingClass.scrolling(startx,endx,starty,endy);
		Thread.sleep(3000);
					
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(addStaffPath))).click();
		System.out.println("\nClicked on AddStaff");		
	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(addStaffPlus))).click();
		System.out.println("\nClicked on AddStaff Plus");
		
		//Calling of Function to Fetch the Excel Data
		Thread.sleep(3000);
		addStaffExcelItem(projectpath1,sheet1);
		
		}catch(Exception Ex){
			System.out.println("\nAddStaff: "+Ex.getMessage());
			System.out.println("\nAddStaff: "+Ex.getCause());
			
		}			
		
	}//End of AddStaff
	
	
	public static void addStaffExcelItem(String projectPath1, String sheet1){
		
		String firstName = null;
		String lastName = null;
		String mobile = null;
		String email =  null;
		String role =  null;
		
		try{
			System.out.println("\n**************Inside AddStaffExcelItem***********");
			Thread.sleep(3000);
			int rowCount = 0;
			int colCount=0;
			
			ExcelDataProviderStaff excelProvider = new ExcelDataProviderStaff(projectPath1,sheet1);
			Object data[][] = excelProvider.getExcelData();
			ExcelUtils excel = new ExcelUtils(projectPath1, sheet1);
			rowCount = excel.getRowCount();
			colCount = excel.getColCount();
			
			for(int i=0;i<rowCount;i++){
				
				for(int j=0;j<colCount;j++){
					
					firstName = (String) data[i][0];
					lastName = (String) data[i][1];
					mobile = (String) data[i][2];
					email =  (String) data[i][3];
					role =  (String) data[i][4];				
					
				} //end of j (columns)				
				//Calling of Function to Feed Excel Data in the Staff Page
				
				addStaffItemUpload(firstName, lastName, mobile, email, role);	
				if(rowFlag==(rowCount-1)){
					System.out.println("\nTotal Records : "+(rowCount-1)+"Records Inserted Successfully are: "+rowFlag);
				}
				
				
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(addStaffPlus))).click();
				System.out.println("\nClicked on AddStaff Plus");
				
			}//end of i	(rows)
			
			if(rowFlag==rowCount){
				System.out.println("\nTotal Records : "+(rowCount-1)+"Records. Inserted Successfully are: "+rowFlag);
			}else{
				System.out.println("\nTotal Records : "+(rowCount-1)+"Records. Inserted Successfully are: "+rowFlag);				
			}	
			
			
		}catch(Exception Ex){
			System.out.println("\nAddStaffExcelItem: getMessage  "+Ex.getMessage());
			System.out.println("\nAddStaffExcelItem: getCause"+Ex.getCause());
			
		}
	
	}//AddStaffExcelItem	
	
	
	public static void addStaffItemUpload(String firstName, String lastName, String mobile, String email, String role)
	{
		
		System.out.println("\n******Inside AddStaffItemUpload******");
		
		try{
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(firstNamePath))).sendKeys(firstName);
		System.out.println("\nEntered Name");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(lastNamePath))).sendKeys(lastName);
		System.out.println("\nEntered LastName");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(mobilePath))).sendKeys(mobile);
		System.out.println("\nEntered Mobile");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(emailPath))).sendKeys(email);
		System.out.println("\nEntered Email");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(rolePath))).click();
		System.out.println("\nClicked Role");
		
		if(role.equals("Manager"))
		{
			System.out.println("\nRole is Manager");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(roleManagerPath))).click();
			System.out.println("\nClicked Role Manager");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(okPath))).click();	
			System.out.println("\nClicked Ok");
			
		}else{
			System.out.println("\nRole is Waiter");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(roleWaiterPath))).click();
			System.out.println("\nClicked Role Waiter");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(okPath))).click();	
			System.out.println("\nClicked Ok");
		
		}
		
//		Thread.sleep(3000);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(savePath))).click();
		System.out.println("\nSaved!");
		Thread.sleep(10000);
		rowFlag = rowFlag +1;	
		System.out.println("\nOne Record Inserted Successfully");	
				
		}catch(Exception Ex){
			System.out.println("\nAddStaffItemUpload: getMessage "+Ex.getMessage());
			System.out.println("\nAddStaffItemUpload: getCause"+Ex.getCause());
			
		}
			
	}//End of AddStaffItemUpload

}//AddStaffItems Class
