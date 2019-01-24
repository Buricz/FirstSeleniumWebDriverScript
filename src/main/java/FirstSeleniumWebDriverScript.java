import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumWebDriverScript {



    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "/home/jbu/Downloads/geckodriver");



        WebDriver driver = new FirefoxDriver();

        String url = "https://www.google.com/";


        driver.get(url);
        Thread.sleep(2000);
        WebElement wyszukiwarka =driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[1]/div/div[1]/input"));
        wyszukiwarka.sendKeys("Francis Bacon");

        Thread.sleep(2000);
        WebElement szukaj =driver.findElement(By.xpath("/html/body/div/div[3]/form/div[2]/div/div[3]/center/input[1]"));
        szukaj.submit();

        Thread.sleep(2000);
        WebElement tekst =driver.findElement(By.xpath("/html/body/div[6]/div[3]/div[10]/div[1]/div[2]/div/div[2]/div[2]/div/div/div/div/div/div[1]/div/div/div[1]/a/h3"));
        System.out.println(tekst.getText());
    }
}