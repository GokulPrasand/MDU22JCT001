package StudentTest;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;



public class AddStudent {



public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
	System.setProperty("webdriver.edge.driver", "..//StdMarksManagementTest//msedgedriver.exe"); // value is path of the exe file
	WebDriver web = new EdgeDriver();
	web.get("http://localhost:9001/myjdbcapp/ab");
Thread.sleep(1000);
web.findElement(By.name("username")).sendKeys("school");
Thread.sleep(3000);
web.findElement(By.name("password")).sendKeys("campus");
Thread.sleep(1000);
WebElement userTypeDropdown = web.findElement(By.id("slec"));
Select typeoption = new Select(userTypeDropdown);
typeoption.selectByVisibleText("Admin");
Thread.sleep(1000);
web.findElement(By.name("submit")).click();

System.out.println("----------- ");

WebElement link = web.findElement(By.linkText("Faculty"));
String url = link.getAttribute("href");
System.out.println("Link Url : " + url);
web.get(url);
Thread.sleep(1000);

web.findElement(By.name("fid")).sendKeys("1018");
Thread.sleep(1000);
web.findElement(By.name("factName")).sendKeys("Ak");
Thread.sleep(1000);
web.findElement(By.name("gender")).sendKeys("Male");
Thread.sleep(1000);
web.findElement(By.name("address")).sendKeys("OMR");
Thread.sleep(1000);
web.findElement(By.name("location")).sendKeys("Chennai");
Thread.sleep(1000);
web.findElement(By.name("phone")).sendKeys("87898236653");
Thread.sleep(1000);
web.findElement(By.name("email")).sendKeys("ak@gmail.com");
Thread.sleep(1000);
web.findElement(By.name("password")).sendKeys("SSlaves");
Thread.sleep(1000);
Thread.sleep(1000);
web.findElement(By.name("submit")).click();





}



}