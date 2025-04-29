import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {
    public static void main( String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/link.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
        driver.findElement(By.partialLinkText("Dashboard")).click();
    }
}
