import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\BrowserexecutablePath\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//		driver.get("https://demoqa.com");
		driver.get("http://spreadsheetpage.com/index.php/file/C35/P10/"); // sample url	
        driver.findElement(By.xpath(".//a[@href=contains(text(),'yearly-calendar.xls')]")).click();	

//		Below Piece of code is not able to take the complete page screen shot also not able to take 
//		screen shot of particular webelement
        
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile, new File("E:\\ScreenShotCapture\\homePageScreenshot.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
