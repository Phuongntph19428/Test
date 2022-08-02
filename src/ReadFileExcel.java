
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author ppolo
 */
public class ReadFileExcel {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String pathFile = "D:\\FPTPolytechnic\\SOF203\\LuyenTap1\\TestExcel.xlsx";
        FileInputStream fis = new FileInputStream(new File(pathFile));

        XSSFWorkbook wb = new XSSFWorkbook(fis);

        XSSFSheet sheet = wb.getSheetAt(0);
        Iterator<Row> itr = sheet.iterator();
        itr.next();
        while (itr.hasNext()) {
            Row row = itr.next();            
            Iterator<Cell> cellIterator = row.cellIterator();

            while (cellIterator.hasNext()) {
                Cell cell = cellIterator.next();

                switch (cell.getCellType()) {
                    case Cell.CELL_TYPE_STRING:    //field that represents string cell type  
                        System.out.print(cell.getStringCellValue() + "\t\t\t");
                        break;
                    case Cell.CELL_TYPE_NUMERIC:    //field that represents number cell type  
                        System.out.print(cell.getNumericCellValue() + "\t\t\t");
                        break;
                    default:
                }
                
            }
            System.out.println("");
        }  //object of the class  
//reading the value of 2nd row and 2nd column  
        String vOutput = ReadCellData(0, 1);
        System.out.println(vOutput);
    }

    public static String ReadCellData(int vRow, int vColumn) {
        String value = null;          //variable for storing the cell value  
        Workbook wb = null;           //initialize Workbook null  
        try {
//reading data from a file in the form of bytes  
            FileInputStream fis = new FileInputStream("D:\\FPTPolytechnic\\SOF203\\LuyenTap1\\TestExcel.xlsx");
//constructs an XSSFWorkbook object, by buffering the whole stream into the memory  
            wb = new XSSFWorkbook(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        Sheet sheet = wb.getSheetAt(0);   //getting the XSSFSheet object at given index  
        Row row = sheet.getRow(vRow); //returns the logical row  
        Cell cell = row.getCell(vColumn); //getting the cell representing the given column  
        value = cell.getStringCellValue();    //getting cell value  
        return value;               //returns the cell value  
    }
}
