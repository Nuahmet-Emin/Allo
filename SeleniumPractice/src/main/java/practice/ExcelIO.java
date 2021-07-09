package practice;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ExcelIO {

    @Test
    public void readDataFromExcel() throws IOException {
        String path = "/Users/nurahmetemin/IdeaProjects/Cybertek21-Junit/SampleData.xlsx";
        Workbook workbook = WorkbookFactory.create(new File(path));
        Sheet sheet = workbook.getSheet("Employees");
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0)  ;
        System.out.println(cell);

        int lastRow = sheet.getLastRowNum();
        for (int i = 0; i <= lastRow; i++) {
            int lastColumn = sheet.getRow(i).getLastCellNum()-2;
            System.out.print(sheet.getRow(i).getCell(0));
            System.out.print(" " + sheet.getRow(i).getCell(lastColumn));
            System.out.println();
        }
       // System.out.println(lastRow);


    }
}
