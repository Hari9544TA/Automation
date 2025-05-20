import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.lang.runtime.SwitchBootstraps;
import java.util.List;

public class Dropdown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.leafground.com/link.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
        //Click Element in menu
        WebElement Element = driver.findElement(By.id("menuform:j_idt38"));
        Element.click();
        //Click Dropdown in element
        WebElement dropdown = driver.findElement(By.xpath("//*[@id=\'menuform:m_dropdown\']/a"));
        dropdown.click();
        //choose fav Automation Tool
        WebElement Dropbox1 = driver.findElement(By.className("ui-selectonemenu"));
        Select Getvalue = new Select(Dropbox1);
        Getvalue.selectByIndex(4);
        //Thread.sleep(3000);
        //Getvalue.selectByValue("4");
        //Thread.sleep(3000);
        Getvalue.selectByVisibleText("Playwright");
       List<WebElement> listofoptions = Getvalue.getOptions();
       int Size=listofoptions.size();
        System.out.println("list od options :"+Size);

        //Dropbox2 preffered county
        WebElement Dropbox2 = driver.findElement(By.xpath("//*[@id=\'j_idt87:country_label\']"));
        Dropbox2.click();
        WebElement OptionIndia=driver.findElement(By.id("j_idt87:country_3"));
        OptionIndia.click();
        //Belongs to country
         WebElement Dropbox3 = driver.findElement(By.xpath("//*[@id=\'j_idt87:city\']/div[3]"));
        Dropbox3.click();
        //Select Getvalue2= new Select(Dropbox3);
         //Getvalue2.selectByIndex(3);
        //chosse fav language course by send keys
        WebElement Dropdown4 = driver.findElement(By.xpath("//*[@id=\'j_idt87:auto-complete\']/button"));
        Dropdown4.click();
        WebElement Options= driver.findElement(By.id("j_idt87:auto-complete_input"));
        Options.sendKeys("AWS");

    }
}
