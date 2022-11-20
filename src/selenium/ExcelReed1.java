package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.eventusermodel.XSSFSheetXMLHandler;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelReed1 {

	public String m1(int r, int c) throws IOException {

		String path = System.getProperty("user.dir") + "\\password.xlsx";
		File file = new File(path);

		FileInputStream fi = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fi);

		XSSFSheet sheet = wb.getSheet("Sheet1");
		XSSFRow row = sheet.getRow(r);
		XSSFCell call = row.getCell(c);
		String value = call.getStringCellValue();
		wb.close();
		return value;

	}

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		ExcelReed1 ref1 = new ExcelReed1();

		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://opensource-demo.orangehrmlive.com/");
		ref.manage().window().maximize();

		ref.findElement(By.xpath("//*[@name=\"txtUsername\"]")).sendKeys(ref1.m1(0, 0));
		ref.findElement(By.xpath("//*[@name=\"txtPassword\"]")).sendKeys(ref1.m1(0, 1));
	
	Thread.sleep(5000);
	ref.close();
	}

}
