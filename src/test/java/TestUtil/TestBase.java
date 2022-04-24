package TestUtil;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class TestBase {


        public By searchbox = By.xpath(".//input[@title='Search']");




    public static WebDriver driver;
    public static Properties prop;
    public FileInputStream propfile;
    static int counter = 0;



    public void setup() {

        prop = new Properties();
        try {
            propfile = new FileInputStream(new File("src/test/java/TestUtil/properties.properties"));
            prop.load(propfile);
            propfile.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Zuba" + ++counter);
        String browser = prop.getProperty("browser");
        if (browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/Drivers/chromedriver");
            driver = new ChromeDriver();
            PageFactory.initElements(driver,this);

        }
    }
}

