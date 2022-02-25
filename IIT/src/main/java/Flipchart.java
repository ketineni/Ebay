import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipchart {

	public static void main(String[] args) throws InterruptedException, Exception {
		
		  FileInputStream fin = new FileInputStream("D:\\softwaretools.xlsx");
		  XSSFWorkbook wb = new XSSFWorkbook(fin);
		  XSSFSheet ws = wb.getSheet("sheet2");
		  
		  Row row;
		  
				  
	   
	
				  
				  
		  
	      WebDriverManager.chromedriver().setup();
	      ChromeDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	      driver.get("https://www.flipkart.com/");

	      
	      
	      
	      driver.manage().window().maximize();
	      
	      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	      
	      driver.findElement(By.name("q")).sendKeys("Mobiles");
	      driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	      
	     
	     
	      
	      String str = driver.getTitle();
	      
	      
	      System.out.println(str);
	      
	      
	      if(str.contains("Mobile")) {
	    	  
	    	  System.out.println("Correct output");
	    	  
	      }
	      
	      
	      else {
	    	  
	    	  System.out.println("Wrong Title");
	      }
	      
	      WebElement drop = driver.findElement(By.xpath("//div[@class='_3uDYxP']//child::select"));
	      
          Select sel = new Select(drop);
          sel.selectByValue("30000");
          Thread.sleep(3000);
          WebElement el = driver.findElement(By.xpath("//div[text()='Newest First']"));
          Thread.sleep(3000);
          Actions a1 = new Actions(driver); 
          a1.moveToElement(el).click().perform();
          
          Thread.sleep(3000);
         List<WebElement> lt =  driver.findElements(By.xpath("//div[@class='_4rR01T']" ));
         String st ;
         
    
         
            	   for(int r = 0;r<=5;r++)
                   {
                  	 row = ws.createRow(r);
                  	  for(int i = 0 ; i <5 ; i++ ) {
        	 st = lt.get(i).getText();
        	 System.out.println(st);
        	 row.createCell(0).setCellValue(st);
         }
         }
        FileOutputStream fout = new FileOutputStream("D:\\softwaretools.xlsx");
         wb.write(fout);
	
         
        	 
         }

	}


