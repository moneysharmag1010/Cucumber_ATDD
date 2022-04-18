package StepDefinitions;

import TestUtil.TestBase;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Hooks  {

    public TestBase contextbase = new TestBase();

    @Before
    public void InitiateBrowser()
    {
        contextbase.setup();


    }

    @Before("@Regression")
    public void InitiateBrowserReg()
    {


    }


}
