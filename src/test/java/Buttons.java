import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class Buttons {
    public static void main(String[] args){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.leafground.com/link.xhtml;jsessionid=node010nx464jtc8vzxsmrg4fp0yu9138.node0");
        WebElement Element =driver.findElement(By.xpath("//*[@id=\'menuform:j_idt38\']/a/i[1]"));
        Element.click();
        WebElement button =driver.findElement(By.xpath("//*[@id=\'menuform:m_button\']/a/i"));
        button.click();
        //WebElement Clickandconfirm = driver.findElement(By);
     //Find the position of the button
        WebElement Findposition = driver.findElement(By.id("j_idt88:j_idt94"));
        Point XYvalue=Findposition.getLocation();
       int Xvalue= XYvalue.getX();
       int Yvalue=XYvalue.getY();
        System.out.println("X value is :"+ Xvalue);
        System.out.println("Y value is :"+ Yvalue);

        //Find the backround colour
        WebElement disable= driver.findElement(By.id("j_idt88:j_idt92"));
       String Value=disable.getAttribute("aria-disabled");
        System.out.println(Value);
     //Find the color
        WebElement Colorbutton = driver.findElement(By.id("j_idt88:j_idt96"));
       String color= Colorbutton.getCssValue("background-color");
        System.out.println(color);
        //Find the size
        WebElement Buttonsize= driver.findElement(By.id("j_idt88:j_idt94"));
        int height=Buttonsize.getSize().getHeight();
        int width=Buttonsize.getSize().getWidth();
        System.out.println("heiht of the button:"+ height);
        System.out.println("width of the button:"+ width);
        //Click and confirm the button
         WebElement Clickandconfirm =driver.findElement(By.id("j_idt88:j_idt90"));
        Clickandconfirm.click();

    }
}
