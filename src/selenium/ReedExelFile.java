package selenium;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReedExelFile {

	public String ReedFile(int r, int c) throws IOException {

		File fc = new File(System.getProperty("user.dir") + "\\password.xlsx");
		//File fc = new File("J:\\VilocityJava\\password.xlsx");
		FileInputStream fs = new FileInputStream(fc);
		XSSFWorkbook xw = new XSSFWorkbook(fs);

		XSSFSheet zs = xw.getSheet("Sheet2");
		
		String rc = zs.getRow(r).getCell(c).getStringCellValue();
		xw.close();
		return rc;
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://opensource-demo.orangehrmlive.com/");
		ref.manage().window().maximize();
		
		ReedExelFile ss=new ReedExelFile();
		
		ref.findElement(By.id("txtUsername")).sendKeys(ss.ReedFile(0, 0));
		ref.findElement(By.id("txtPassword")).sendKeys(ss.ReedFile(0, 1));
		
	}

}
