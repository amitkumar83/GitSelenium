package seleniumTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Employee {

	public ArrayList<String> getData(String testCaseName) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\amitm\\Documents\\MY RESUME & COURSES\\SELENIUMNEWPROJ\\employee.xlsx");
		//XSSFWorkbook: Is a class representation of XLSX file.
		ArrayList<String> arlist=new ArrayList<String>();
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		
		int sheetcount=workbook.getNumberOfSheets();
		
		for(int i=0;i<sheetcount;i++) {
			
			if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
				XSSFSheet sheet=workbook.getSheetAt(i);
				
			//Identify EMPNO column by scanning the entire 1st row
				Iterator<Row> rows=sheet.iterator();	//rows has access to all the rows in the sheet
				Row firstrow=rows.next();	//firstrow has access to first row in the sheet
				
				Iterator<Cell> ce=firstrow.cellIterator();
				
				int k=0;
				int column=0;
				
				while(ce.hasNext()) {
					Cell cvalue=ce.next();
					
					if(cvalue.getStringCellValue().equalsIgnoreCase("EMPNO")) {
						column=k;
					}
					k++;
				}
				
			//	System.out.println(column);
				
				
				
				//Once column is identified then scan the entire column and to identify EMPNO 1004
				
				while(rows.hasNext()) {
					Row r=rows.next();
					if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testCaseName)) {
						Iterator<Cell> cv=r.cellIterator();
						
						while(cv.hasNext()) {
							Cell chk=cv.next();
							if(chk.getCellType()==CellType.STRING) {
								arlist.add(chk.getStringCellValue());
							}
							else {
								arlist.add(NumberToTextConverter.toText(chk.getNumericCellValue()));
							}
						//System.out.println(cv.next().getStringCellValue());
							//arlist.add(cv.next().getStringCellValue());
						}
					}
				}
			}
		}
		return arlist;
	}
	


public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub

	}
}