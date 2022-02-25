import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataOutDemo {

	public static void main(String[] args) throws Exception {
	FileInputStream f= new FileInputStream("d:\\Book1.xlsx");
	XSSFWorkbook wb =  new XSSFWorkbook(f);
	XSSFSheet ws = wb.getSheet("sheet1");
	Row row;
	for(int r = 0;r <= ws.getLastRowNum();r++)
	{
		row = ws.getRow(r);
		
		for(int c = 0 ; c <row.getLastCellNum();c++) {
			System.out.print(row.getCell(c).getStringCellValue());
		}
		System.out.println("  ");
	}
	}
	

}
