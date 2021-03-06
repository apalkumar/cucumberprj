import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class FileUploadRobotClass {
 
 
    static WebDriver driver = null;
    public static void main(String[] args) throws InterruptedException, AWTException {
         
         
        System.setProperty("webdriver.chrome.driver", "E:\\BrowserexecutablePath\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         
         // Specify the file location
         StringSelection sel = new StringSelection("E:\\Resume.docx");
          
         // Copy to clipboard
         Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
         System.out.println("selection" +sel);
          
        // Open naukri.com
        driver.get("https://www.naukri.com/account/register/basicdetails");
         
        //Click on upload resume button
        driver.findElement(By.name("userType")).click();
        Thread.sleep(3000);
        //Click on upload resume button
//        driver.findElement(By.name("uploadCV")).click();
//        driver.findElement(By.xpath("//input[@type='file']")).click();
        
        WebElement elem = driver.findElement(By.xpath("//span[@class='uploadCV']"));
        elem.click();

         Thread.sleep(1000);
         
        // Create object of Robot class

         Robot robot = new Robot();
         Thread.sleep(1000);
               
          // Press Enter
         robot.keyPress(KeyEvent.VK_ENTER);
          
        // Release Enter
         robot.keyRelease(KeyEvent.VK_ENTER);
          
          // Press CTRL+V
         robot.keyPress(KeyEvent.VK_CONTROL);
         robot.keyPress(KeyEvent.VK_V);
          
        // Release CTRL+V
         robot.keyRelease(KeyEvent.VK_CONTROL);
         robot.keyRelease(KeyEvent.VK_V);
         Thread.sleep(1000);
                 
         //Press Enter 
         robot.keyPress(KeyEvent.VK_ENTER);
         robot.keyRelease(KeyEvent.VK_ENTER);
          
         driver.close();
    }
}