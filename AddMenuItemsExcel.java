package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.ExcelDataProvider;
import utils.ExcelUtils;

public class AddMenuItemsExcel extends EazDineMainClass {
	static Dimension size;
	static int startx;
	static int endx;
	static int starty;
	static int endy;
	
	static WebDriverWait wait = new WebDriverWait(driver, 20);
	static String addPlus = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button";
	//Add Menu 
	static String namePath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText";
	static String vegPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.RadioButton/android.widget.Button";
	static String nonvegPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View[3]/android.view.View/android.view.View/android.view.View/android.view.View";
	static String catMenuPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[4]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button";
	static String ok = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.widget.Button[2]";
	static String serMenuPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[5]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View";
	static String descPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[6]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText";
	static String ingrPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[7]/android.view.View[2]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.EditText";
	static String pricePath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[2]/android.view.View/android.view.View[8]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText";
	static String savePath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View";
	static String crossPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.Button";
	static String menuItemPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]/android.widget.Button";
	
	
	public static void AddEditMenu(String projectpath,String sheet){
		try{
			
			
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
			driver.findElement(By.xpath(addPlus)).click();
			System.out.println("\nClicked on +");
			
				
			Thread.sleep(4000);	
			driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[1]")).click();
			System.out.println("\n Clicked Add Menu - AddEditMenu");
			
			Thread.sleep(4000);
			AddMenuItemsExcelFetch(projectpath,sheet );	
			
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]")).click();
//			
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[1]")).click();
			System.out.println("Menu Items Added Successfully");
						
		}catch(Exception Ex){
			System.out.println("\nAdd/Edit Menu Test : The cause is :"+Ex.getCause());
			System.out.println("\nAdd/Edit Menu Test : The message is :"+Ex.getMessage());
			Ex.printStackTrace();
			
		}
		
		
	}//End of AddEditMenu()
	
	
	public static void AddMenuItemsExcelFetch(String projectpath, String sheet  ) {
				
		String name = null;
		String type = null;
		String category = null;
		String servicetype = null;
		String desc = null;
		String ingredients = null;
		double price = 0;
		int count = 0;
		
		try{
			System.out.println("\n Inside AddMenuItemsExcelFetch ");		
			
			ExcelDataProvider excelProvider = new ExcelDataProvider(projectpath, sheet);
			Object data[][] = excelProvider.getExcelData();		
			ExcelUtils excel = new ExcelUtils(projectpath, sheet);
			int rowCount = excel.getRowCount(); 
			int colCount = excel.getColCount(); 
				
			for(int i = 0 ; i < rowCount ; i++) {
				Thread.sleep(3000);
				count = i;
				System.out.println("\nThe RC now : "+i);			
				for(int j = 0 ; j < colCount; j++){
					
					if(j==0){ 	name = (String) data[i][j];}
					if(j==1){   type = (String) data[i][j];}
					if(j==2){	category = (String) data[i][j]; }
					if(j==3){	servicetype = (String) data[i][j];}
					if(j==4){	desc = (String) data[i][j];}
					if(j==5){	ingredients = (String) data[i][j];}
					if(j==6){	price = (double) data[i][j] ;}
				}
				
				System.out.println("\n Data Fetched");			
				Thread.sleep(3000);
				AddEditMenu_MenuUpload(name, type, category, servicetype, desc, ingredients, price);
				}	
			
				System.out.println("\n Menus Added Sucessfully "+"Row Count : "+ count);
			
			}catch(Exception Ex){
					System.out.println("\n AddMenuItemsExcelFetch : "+Ex.getCause());
					System.out.println("\n AddMenuItemsExcelFetch : "+Ex.getMessage());
					Ex.getStackTrace();
			}
				
	}//End of AddMenuItemsExcelFetch
		
		
	public static void AddEditMenu_MenuUpload(String name, String type, String category, String servicetype, String desc, String ingredients, double price) throws InterruptedException{
		
		String catOptionsPath = null;
		String serviceTypePath = null;
		
		try{
			Thread.sleep(3000);				
			System.out.println("\nInside AddEditMenu_MenuUpload");		
					
			//Started Adding Menu Items
			//Name
			Thread.sleep(3000);
					
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(namePath))).sendKeys(name);			
			
			System.out.println("\nEntered Menu Name");
			
			//Type - Veg
			if(type.equals("Veg")){								
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(vegPath))).click();	
				System.out.println("\nSelected Type Veg");
			} else {			
					
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(nonvegPath))).click();	
				System.out.println("\nSelected Type Non-Veg");
			}
			
			//Category
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(catMenuPath))).click();
			System.out.println("\nClicked Category Menu");
			
			//Scrolling for Category value
			size  = driver.manage().window().getSize();	
			startx = (int) (size.width * 0.70);
			endx = (int)(size.width * 0.70);
			starty = (int) (size.height * 0.65);
			endy= (int) (size.height * 0.40);
						
			//Category Options
			if(category.equals("Lunch")){ ScrollingClass.scrolling(startx, endx, starty, endy); ScrollingClass.scrolling(startx, endx, starty, endy);catOptionsPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View/android.widget.RadioButton[10]"; }
			if(category.equals("Dinner")){ catOptionsPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View/android.widget.RadioButton[5]"	; }
			if(category.equals("BIRK'S DESSERT")){ catOptionsPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View/android.widget.RadioButton[1]"	; }
			if(category.equals("Classic Americana Menu")) { ScrollingClass.scrolling(startx, endx, starty, endy); catOptionsPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View/android.widget.RadioButton[6]"	; }	
			if(category.equals("Birk's Junior Executive")) { catOptionsPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View/android.widget.RadioButton[2]"	; }	
			if(category.equals("Bar Menu")) { ScrollingClass.scrolling(startx, endx, starty, endy); ScrollingClass.scrolling(startx, endx, starty, endy); catOptionsPath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View/android.widget.RadioButton[11]"	; }	
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(catOptionsPath))).click();
			System.out.println("\nSelected Category");
			
			//Category Options - Ok 
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ok))).click();
			System.out.println("\nClicked ok ");
			
			//Service Type
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(serMenuPath))).click();
			System.out.println("\nClicked Service Type Menu");			
			
			//Service Options
			
			if(servicetype.equals("Appetizer")){ serviceTypePath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View/android.widget.RadioButton[4]";}
			if(servicetype.equals("Drinks")) {  serviceTypePath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View/android.widget.RadioButton[2]";}
			if(servicetype.equals("Dinner")) {   serviceTypePath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View/android.widget.RadioButton[1]";}
			if(servicetype.equals("Breakfast")) {   serviceTypePath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View/android.widget.RadioButton[3]";}
			if(servicetype.equals("Dessert")) {   serviceTypePath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View/android.widget.RadioButton[5]";}
			if(servicetype.equals("Lunch")) {   ScrollingClass.scrolling(startx, endx, starty, endy); serviceTypePath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.app.Dialog/android.view.View[2]/android.view.View/android.widget.RadioButton[6]"; }
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(serviceTypePath))).click();
			System.out.println("\nSelected Service Type"); 
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ok))).click();
			System.out.println("\nClicked ok ");
			
			//Description
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(descPath))).sendKeys(desc);
			System.out.println("\nEntered Description ");
			
			//Ingredients
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(ingrPath))).sendKeys(ingredients);
			System.out.println("\nEntered Ingredients ");
			
			//Price
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(pricePath))).sendKeys(String.valueOf(price));
			System.out.println("\nEntered Price ");
			
			//Save
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[2]/android.view.View[2]/android.view.View")).click();
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(savePath))).click();
			System.out.println("\n Clicked on Save");
			Thread.sleep(15000);		
					
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(crossPath))).click();
			System.out.println("\nClicked + ");		
			Thread.sleep(10000);		
			
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(menuItemPath))).click();	
			System.out.println("\nClicked on Add MenuItem");
			Thread.sleep(5000);	
						
		}catch(Exception Ex){
			System.out.println("\n AddEditMenu_MenuUpload : The Message is : "+Ex.getCause());
			System.out.println("\n AddEditMenu_MenuUpload : The message is :"+Ex.getMessage());
			Ex.printStackTrace();		
		}
	} //End of AddEditMenu_MenuUpload	

}//End of Class

