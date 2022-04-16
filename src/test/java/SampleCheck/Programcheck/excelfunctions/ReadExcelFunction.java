package SampleCheck.Programcheck.excelfunctions;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;

public class ReadExcelFunction {

    public void readExcelFile() throws Exception {
        File file = new File("./target/ExcelSheet/Sheet1.xlsx");
        FileInputStream stream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(stream);
        XSSFSheet sheet = workbook.getSheet("ExcelTesting");
        int row = sheet.getPhysicalNumberOfRows();
        for (int i = 0; i < row; i = i + 1) {
            XSSFRow allRow = sheet.getRow(i);
            int cells = allRow.getPhysicalNumberOfCells();
            System.out.println(cells);
        }

    }

    public static void main(String[] args) throws Exception {
        ReadExcelFunction obj = new ReadExcelFunction();
        obj.readExcelFile();
    }
}
