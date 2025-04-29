import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textboxes {
    public static void main( String[] args){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/link.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
        driver.findElement(By.partialLinkText("Dashboard")).click();
        //driver.findElement(By.className("pi pi-server layout-menuitem-icon")).click();
        driver.findElement(By.xpath("//*[@id='menuform:j_idt40']/a")).click();
        driver.findElement(By.xpath("//*[@id='menuform:m_input']/a/i")).click();
        driver.findElement(By.name("j_idt88:name")).sendKeys("Hariharan R");
        driver.findElement(By.name("j_idt88:j_idt91")).sendKeys("  Yes");
        WebElement disablebox =driver.findElement(By.name("j_idt88:j_idt91"));
        String value=disablebox.getAttribute("aria-disabled");
        System.out.println(value);
        WebElement text= driver.findElement(By.name("j_idt88:j_idt95"));
      text.clear();
      text.sendKeys("The value is cleared");








    }
}
