import java.io.FileInputStream;

import java.io.FileOutputStream;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenDemo {

	public static void main(String[] args) throws Exception {
		FileInputStream fin = new FileInputStream("d:\\Book3.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		
		XSSFSheet ws = wb.getSheet("sheet1");
		Row r = ws.createRow(0);
		r.createCell(0).setCellValue("Bill");
		r.createCell(1).setCellValue(200);
		 r = ws.createRow(1);
		 r.createCell(0).setCellValue("David");
		 r.createCell(1).setCellValue(300);
		 FileOutputStream fout = new FileOutputStream("d:\\Book3.xlsx");
		 wb.write(fout);
		

	}

}
