package day14;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	
	public void readExcel(String path,String sheetName) throws IOException {
//		XSSFWorkbook wb=new XSSFWorkbook("./src/day14/testData.xlsx");
//		XSSFSheet sheet=wb.getSheet("data");
//		
		XSSFWorkbook wb=new XSSFWorkbook(path);
		XSSFSheet sheet=wb.getSheet(sheetName);
		
		int noOfRows=sheet.getPhysicalNumberOfRows();//4
		int noOfCols=sheet.getRow(0).getPhysicalNumberOfCells();//2
		
		
		System.out.println(noOfRows + " "+ noOfCols);
		
		for(int r=0;r<noOfRows;r++) {
			for(int c=0;c<noOfCols;c++) {
				System.out.println(sheet.getRow(r).getCell(c).getStringCellValue());
			}
		}
	}

	public static void main(String[] args) throws IOException {
		
		
		
		// Apache POI
		/*XSSFWorkbook - path workbook
		 * XSSFSheet
		 * XSSFRow
		 * XSSFCell
		 */
		
		
//		System.out.println(sheet.getRow(0).getCell(0).getStringCellValue());
//		System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
//		
//		System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
//		System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
//		
//		
//		System.out.println(sheet.getRow(2).getCell(0).getStringCellValue());
//		System.out.println(sheet.getRow(2).getCell(1).getStringCellValue());
//		
//		System.out.println(sheet.getRow(3).getCell(0).getStringCellValue());
//		System.out.println(sheet.getRow(3).getCell(1).getStringCellValue());

	}

}
