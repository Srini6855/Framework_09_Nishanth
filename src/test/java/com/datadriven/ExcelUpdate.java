package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.baseclass.Baseclass;

public class ExcelUpdate extends Baseclass {

	public void method1() throws IOException {
	}

	public static void main(String[] args) throws IOException {
		// 1. Mention the path of the excel sheet
		File file = new File("C:\\Greens\\Eclipse-greens\\Framewrok_09Am\\Excelsheet\\Nishanth.xlsx");
		// 2. Create a object for File input stream class
		FileInputStream fileInputStream = new FileInputStream(file);
		// 3. Create a object for workbook interface(Casting)
		Workbook book = new XSSFWorkbook(fileInputStream);
		// 4.Get the sheet
		Sheet sheet = book.getSheet("Login");
		// 5. Get the row
		Row row = sheet.getRow(0);
		// 6. Get the cell
		Cell cell = row.getCell(0);
		// 7. Set the value
		cell.setCellValue("Welcome Selenium");
		FileOutputStream fileOutputStream = new FileOutputStream(file);
		book.write(fileOutputStream);
		System.out.println("Done");

	}

}
