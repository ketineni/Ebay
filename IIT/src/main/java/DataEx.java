import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataEx {

	public static void main(String[] args) throws Exception {
	 FileInputStream fin = new FileInputStream("D:\\softwaretools.xlsx");
	 XSSFWorkbook wb = new XSSFWorkbook(fin);
	 XSSFSheet ws =wb.getSheet("sheet1");
	 Row row;
	 
	 WebDriverManager.chromedriver().setup();
	 ChromeDriver driver = new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	 
	 driver.get("https://www.google.com/ ");
	 driver.findElement(By.xpath("//div[text()='I agree']")).click();
	 
	 for(int r =1; r<= ws.getLastRowNum();r++) {
		 row = ws.getRow(r);
		 driver.findElement(By.name("q")).sendKeys(row.getCell(0).getStringCellValue());
		 driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		 String str = driver.findElement(By.id("result-stats")).getText();
		 
		 row.createCell(1).setCellValue(str);
		 driver.navigate().back();
		 
	 }
	 
	 FileOutputStream fout = new FileOutputStream("D:\\softwaretools.xlsx");
	 wb.write(fout);
	 
	 

	}

}
