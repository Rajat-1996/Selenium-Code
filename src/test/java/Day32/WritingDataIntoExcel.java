package Day32;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Excel File-->Workbook-->Sheets---->Rows--->Cells

public class WritingDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
		
		FileOutputStream file=new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\myfile.xlsx"); 

		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet();
		
		//Creating rows, cells and update data without loop
		/*XSSFRow row1=sheet.createRow(0);
				
		row1.createCell(0).setCellValue("Welcome To Apache");
		row1.createCell(1).setCellValue("270124");
		row1.createCell(2).setCellValue("Coding");
				
		XSSFRow row2=sheet.createRow(1);
		
		row2.createCell(0).setCellValue("Hello");
		row2.createCell(1).setCellValue("270124");
		row2.createCell(2).setCellValue("Happy to Code");
		*/
		
		
		//creating rows, cells and update data using loop
		
		Scanner sc=new Scanner(System.in);
		
		for(int r=0;r<=3;r++)
		{
			XSSFRow currentrow=sheet.createRow(r);
						
			for(int c=0;c<1;c++)
			{
				//currentrow.createCell(c).setCellValue("Welcome to Apache");
				
				System.out.println("Enter a value:");
				String value=sc.next();
				currentrow.createCell(c).setCellValue(value);
				
			}
		}
		
		workbook.write(file);
		workbook.close();
		file.close();
		
		System.out.println("Writing is done!!!!");
		
	}

}
