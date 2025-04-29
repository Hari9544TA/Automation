import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdgebrowser {
    public static void main (String[] args){
        System.setProperty("webdriver.edge,driver","C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs");
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.youtube.com/watch?v=TmTL7LS33t8&list=PLLS0D9-W-1dln8tK3dmOsaOzuApPQ0OaL");
        driver.quit();
            }
}
