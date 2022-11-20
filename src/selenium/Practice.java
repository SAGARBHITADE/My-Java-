package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Practice {
	
	
	public String ReedFile(int r,int w) throws IOException  {
		
		File file=new File(System.getProperty("user.dir")+"\\PracticeEx.xlsx");
		FileInputStream fi=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		
		XSSFSheet sh= wb.getSheet("Sheet1");
		XSSFRow roc=sh.getRow(r);
		XSSFCell cel=roc.getCell(w);
		String ss=cel.getStringCellValue();
		wb.close();
		
		return ss;
		
		
		
	}

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver.exe");
		WebDriver ref = new ChromeDriver();
		ref.get("https://www.facebook.com/login/");
		ref.manage().window().maximize();
		Practice pr=new Practice();
		ref.findElement(By.xpath("//*[@class=\"inputtext _55r1 inputtext _1kbt inputtext _1kbt\"]")).sendKeys(pr.ReedFile(0, 0));
		ref.findElement(By.xpath("//*[@class=\"inputtext _55r1 inputtext _9npi inputtext _9npi\"]")).sendKeys(pr.ReedFile(0, 1));
		ref.findElement(By.xpath("//*[@id=\"loginbutton\"]")).click();
	}
}
