package SampleCheck.Programcheck.excelfunctions;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;

public class WriteExcelFileFunction {

    public void wrtiteExcelMethod() throws Exception {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet  = workbook.createSheet("ExcelTesting");
        sheet.createRow(0);
        sheet.getRow(0).createCell(0).setCellValue("Bala");
        sheet.getRow(0).createCell(1).setCellValue("Vignesh");

        sheet.createRow(1);
        sheet.getRow(1).createCell(0).setCellValue("Vignesh");
        sheet.getRow(1).createCell(1).setCellValue("Subramanian");

        File file  = new File("./target/ExcelSheet/Sheet1.xlsx");
        FileOutputStream stream = new FileOutputStream(file);
        workbook.write(stream);
        stream.close();
        workbook.close();
    }

    public static void main(String[] args) throws Exception {
        WriteExcelFileFunction obj = new WriteExcelFileFunction();
        obj.wrtiteExcelMethod();
    }
}
