package excelreader;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SimpleExcelReader {

	public static void main(String[] args) throws IOException {

		// XSSFWorkbook workbook = null;
		HSSFWorkbook workbook = null;
		FileInputStream inputStream = null;

		String excelFilePath = "C:\\myexcel.xls";
		inputStream = new FileInputStream(new File(excelFilePath));
		workbook = new HSSFWorkbook(inputStream);

		HSSFSheet firstSheet = workbook.getSheetAt(0);
		Iterator<Row> iterator = firstSheet.iterator();

		while (iterator.hasNext()) {
			Row nextRow = iterator.next();
			Iterator<Cell> cellIterator = nextRow.cellIterator();

			while (cellIterator.hasNext()) {

				Cell cell = cellIterator.next();
				switch (cell.getCellType()) {

				case Cell.CELL_TYPE_STRING:

					System.out.println(cell.getStringCellValue());
					break;

				case Cell.CELL_TYPE_BOOLEAN:

					System.out.println(cell.getBooleanCellValue());
					break;

				case Cell.CELL_TYPE_NUMERIC:

					System.out.println(cell.getNumericCellValue());
					break;

				}
				System.out.print(" - ");
			}
			System.out.println();
			workbook.write(null);
			inputStream.close();
		}
	}
}
