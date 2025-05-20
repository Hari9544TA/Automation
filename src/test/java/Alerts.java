import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/link.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
        //Click Browser
        WebElement Browser = driver.findElement(By.xpath("//*[@id=\'menuform:j_idt37\']/a"));
        Browser.click();
        //Click Alert
        WebElement Alert= driver.findElement(By.xpath("//*[@id=\'menuform:m_overlay\']/a"));
        Alert.click();
        //Frst alert 1
        WebElement Alert1 = driver.findElement(By.id("j_idt88:j_idt91"));
        Alert1.click();
        org.openqa.selenium.Alert Alertpage = driver.switchTo().alert();
        //Thread.sleep(3000);
        Alertpage.accept();
        //2nd Alert
        WebElement Alert2 = driver.findElement(By.id("j_idt88:j_idt93"));
        Alert2.click();
        org.openqa.selenium.Alert Alertpage2 =driver.switchTo().alert();
        Alertpage2.dismiss();
        //3rd alert
        WebElement Alert3 =driver.findElement(By.id("j_idt88:j_idt95"));
        Alert3.click();
        WebElement Alertpage3 = driver.findElement(By.xpath("//*[@id=\'j_idt88:j_idt98\']/span[2]"));
       //Thread.sleep(3000);
        Alertpage3.click();
       // org.openqa.selenium.Alert Alertpage3 = driver.switchTo().alert();
       // Alertpage3.
        WebElement Alert4= driver.findElement(By.id("j_idt88:j_idt100"));
        Alert4.click();
        WebElement Alertpage4 = driver.findElement(By.className("ui-icon ui-icon-closethick"));
        Alertpage4.click();
    }
}
