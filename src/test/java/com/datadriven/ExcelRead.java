package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseclass.Baseclass;

public class ExcelRead extends Baseclass {

	public void method1() throws IOException {
		System.out.println(readDataFromExcelsheet("Sheet1", 1, 0));
		System.out.println(readDataFromExcelsheet("Sheet1", 1, 2));
	}

	public static void main(String[] args) throws IOException {
		// 1. Mention the path of the excel sheet
		File file = new File("C:\\Greens\\Eclipse-greens\\Framewrok_09Am\\Excelsheet\\Nishanth.xlsx");
		// 2. Create a object for File input stream class
		FileInputStream fileInputStream = new FileInputStream(file);
		// 3. Create a object for workbook interface(Casting)
		Workbook book = new XSSFWorkbook(fileInputStream);
		// 4.Get the sheet
		Sheet sheet = book.getSheet("Sheet1");
		// 5.Get the row
		Row row = sheet.getRow(1);
		// 6.Get the cell
		Cell cell = row.getCell(0);
		CellType cellType = cell.getCellType();
		System.out.println(cellType);
		System.out.println(cell);
		// 7.1 Conter this into number
		double numericCellValue = cell.getNumericCellValue();
		System.out.println(numericCellValue);
		// 8. Convert this number into string
		DecimalFormat decimalFormat = new DecimalFormat("#");
		String format = decimalFormat.format(numericCellValue);
		System.out.println(format);
		// 7. Convert this into String
//		String stringCellValue = cell.getStringCellValue();
//		System.out.println(stringCellValue);

		ExcelRead excelRead = new ExcelRead();
		excelRead.method1();
	}

}
