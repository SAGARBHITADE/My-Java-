package selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2 {
	
	public static XSSFSheet sheet;
	
	public void writeData(int r,int c, String val) throws IOException {
	
		//step-1 
		String path=System.getProperty("user.dir")+"\\password.xlsx";
		
		//step-2
		File file =new File(path);
		
		//step-3
		FileInputStream fis=new FileInputStream(file);
		
		//step-4
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		//step-5
		if (r==0) {
		 sheet=wb.createSheet("Sheet2");
		} else {
			sheet=wb.getSheet("Sheet2");
		}
		
		//step-6
		XSSFRow row=sheet.createRow(r);
		
		//step-7
		XSSFCell cell=row.createCell(c);
		
		cell.setCellValue(val);
		
		//step-8
		FileOutputStream fos=new FileOutputStream(file);
		
		wb.write(fos);
		
		//step-9 close book
		wb.close();
		
		System.out.println("Written successfully");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
	
		Ex2 ref=new Ex2();
		
		//ref.writeData(2, 0, "ABCDEF235");
		
		System.setProperty("webdriver.chrome.driver", "J:\\VELOCITY CLASS\\SELENIUM AUTO\\Chrome\\chromedriver_win32\\chromedriver.exe");
		
		//Step -1 Launch browser 
		WebDriver driver =new ChromeDriver();
		
		//step-2 max window
		driver.manage().window().maximize();
		
		//step-3 open web application
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(2000);
		
		//step-4 get title
		List<WebElement>list=driver.findElements(By.xpath("//*[@id='product']//tbody//tr//td[3]"));
		
		//step-5 iterate
		int col=0, row=0;
		
		for (WebElement ele:list) {
			
			String val=ele.getText();
			ref.writeData(row, col, val);
			row++;
			Thread.sleep(1000);
		}
	    //step-5 write data in excel 
		

	}

}

