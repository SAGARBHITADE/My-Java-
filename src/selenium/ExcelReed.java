package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFName;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReed {

	public String reedfile(int r, int c) throws IOException {

		// step 1 set file path

		//String path = System.getProperty("user.dir") + "\\password.xlsx";
		// step 2 use the file path
		File file = new File("J:\\VilocityJava\\password.xlsx");
		// step 3 for reed file
		FileInputStream fileread = new FileInputStream(file);
		// step 4 handling the excel work book
		XSSFWorkbook wb = new XSSFWorkbook(fileread);
		// step 5 locat sheet inside workbook
		XSSFSheet sheet = wb.getSheet("Sheet1");
		// Step 6
		XSSFRow row = sheet.getRow(r);
		
		XSSFCell col = row.getCell(c);
		// Step 7 is Sow and Col Value is a string store the value varabal
		String value = col.getStringCellValue();
		wb.close();
		return value;

	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		ExcelReed ex = new ExcelReed();
		// ex.reedfile(0, 0);

		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://opensource-demo.orangehrmlive.com/");
		ref.manage().window().maximize();

		ref.findElement(By.xpath("//*[@name=\"txtUsername\"]")).sendKeys(ex.reedfile(0, 0));
		ref.findElement(By.xpath("//*[@name=\"txtPassword\"]")).sendKeys(ex.reedfile(0, 1));
		Thread.sleep(5000);
		ref.close();

	}

}
