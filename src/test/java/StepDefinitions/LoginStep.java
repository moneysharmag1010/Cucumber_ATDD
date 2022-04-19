package StepDefinitions;

import TestUtil.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LoginStep extends TestBase {


    JavascriptExecutor js;
    SoftAssert sf = new SoftAssert();

    @Then("user refreshes the page")
    public void user_refreshes_the_page() {
        // Write code here that turns the phrase above into concrete actions
        driver.navigate().refresh();
    }


    @Given("user is at login page")
    public void user_is_at_login_page() {
        // Write code here that turns the phrase above into concrete actions

        //     driver.get("https://www.google.com");

    }


    //Moving head to somewhere else and making a commit to see what happensgit

    @When("the user enters valid credentials")
    public void the_user_enters_valid_credentials() {
        // Write code here that turns the phrase above into concrete actions
//        driver.get(prop.getProperty("url"));/**/
        driver.get("https://www.google.com/");
        //New comment for commit


      //  driver.findElement(By.xpath(".//input[@title='Search']")).sendKeys("Things we do for love");
        driver.findElement(searchbox).sendKeys("Things we do for love");
        js = (JavascriptExecutor) driver;
        WebElement searchbtn = driver.findElement(By.xpath(".//input[@value='Google Search']"));
        js.executeScript("arguments[0].click();", searchbtn);
        //sf.assertEquals(actualtitle,expectedTitle);

    }

    @When("hits submit button")
    public void hits_submit_button() {
        // Write code here that turns the phrase above into concrete actions'

        sf.assertTrue(driver.getTitle().contains("love"));
        sf.assertAll();

    }

    @Then("the user should be logged in successfully")
    public void the_user_should_be_logged_in_successfully() {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("Finished!");

    }


    @Then("user should be able to see logo icon")
    public void user_should_be_able_to_see_logo_icon() {
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("user is able to see {string} button")
    public void user_is_able_to_see_menu_button(String s) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(s);
        driver.close();

    }

    @Then("user is able to see sign out button")
    public void user_is_able_to_see_sign_out_button() {
        // Write code here that turns the phrase above into concrete actions

    }

    //scenario Outline
    @Then("user is able to see {string} and {string} button")
    public void user_is_able_to_see_enter_text_twice(String u, String p) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println(u + p);
        driver.findElement(By.xpath(".//input[@title='Search']")).sendKeys(u + " " + p);
        js = (JavascriptExecutor) driver;
        WebElement searchbtn = driver.findElement(By.xpath(".//input[@value='Google Search']"));
        js.executeScript("arguments[0].click();", searchbtn);
        //sf.assertEquals(actualtitle,expectedTitle);
        driver.close();

    }


}
