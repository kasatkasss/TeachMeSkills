package com.sharelane.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SignInTest {
    private String successfulRegMessage;
    public void setSuccessfulRegMessage(String successfulRegMessage){
        this.successfulRegMessage = successfulRegMessage;
    }
    public String getSuccessfulRegMessage(){
        return successfulRegMessage;
    }
    private String successfulLogOutMessage;
    public void setSuccessfulLogOutMessage(String successfulLogOutMessage){
        this.successfulLogOutMessage = successfulLogOutMessage;
    }
    public String getSuccessfulLogOutMessage(){
        return successfulLogOutMessage;
    }

    @Test
    public void signInPositive(){
        System.setProperty("webdriver.chrome.driver", "D:\\QA12_Workspace\\webdriver\\" +
                "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");

        WebElement zipField = driver.findElement(By.name("zip_code"));
        zipField.sendKeys("12345");

        WebElement continueButton = driver.findElement(By.cssSelector("[type='submit'][value='Continue']"));
        continueButton.click();

        WebElement firstNameField = driver.findElement(By.name("first_name"));
        firstNameField.sendKeys("vlad");

        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("asd@mail.com");

        WebElement passwordField = driver.findElement(By.name("password1"));
        passwordField.sendKeys("12345");

        WebElement confirmPasswordField = driver.findElement(By.name("password2"));
        confirmPasswordField.sendKeys("12345");

        WebElement register = driver.findElement(By.cssSelector("[type='submit'][value='Register']"));
        register.click();

        WebElement confirmationMessageElement = driver.findElement(By.className("confirmation_message"));
        setSuccessfulRegMessage(confirmationMessageElement.getText());
        Assert.assertEquals(getSuccessfulRegMessage(), "Account is created!");

        WebElement loginElement = driver.findElement(By.xpath("/html/body/center/table/tbody/tr" +
                "[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b"));
        String login = loginElement.getText();

        WebElement goToMainPage = driver.findElement(By.xpath("/html/body/center/table" +
                "/tbody/tr[6]/td/table/tbody/tr[2]/td/p/a"));
        goToMainPage.click();

        WebElement emailField1 = driver.findElement(By.name("email"));
        emailField1.sendKeys(login);

        WebElement passwordField1 = driver.findElement(By.name("password"));
        passwordField1.sendKeys("1111");

        WebElement loginOnSite = driver.findElement(By.cssSelector("[type='submit'][value='Login']"));
        loginOnSite.click();
    }

    @Test
    public void logOutTest(){
        System.setProperty("webdriver.chrome.driver", "D:\\QA12_Workspace\\webdriver\\" +
                "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");

        WebElement zipField = driver.findElement(By.name("zip_code"));
        zipField.sendKeys("12345");

        WebElement continueButton = driver.findElement(By.cssSelector("[type='submit'][value='Continue']"));
        continueButton.click();

        WebElement firstNameField = driver.findElement(By.name("first_name"));
        firstNameField.sendKeys("vlad");

        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("asd@mail.com");

        WebElement passwordField = driver.findElement(By.name("password1"));
        passwordField.sendKeys("12345");

        WebElement confirmPasswordField = driver.findElement(By.name("password2"));
        confirmPasswordField.sendKeys("12345");

        WebElement register = driver.findElement(By.cssSelector("[type='submit'][value='Register']"));
        register.click();

        WebElement confirmationMessageElement = driver.findElement(By.className("confirmation_message"));
        setSuccessfulRegMessage(confirmationMessageElement.getText());
        Assert.assertEquals(getSuccessfulRegMessage(), "Account is created!");

        WebElement loginElement = driver.findElement(By.xpath("/html/body/center/table/tbody/tr" +
                "[6]/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/b"));
        String login = loginElement.getText();

        WebElement goToMainPage = driver.findElement(By.xpath("/html/body/center/table" +
                "/tbody/tr[6]/td/table/tbody/tr[2]/td/p/a"));
        goToMainPage.click();

        WebElement emailField1 = driver.findElement(By.name("email"));
        emailField1.sendKeys(login);

        WebElement passwordField1 = driver.findElement(By.name("password"));
        passwordField1.sendKeys("1111");

        WebElement loginOnSite = driver.findElement(By.cssSelector("[type='submit'][value='Login']"));
        loginOnSite.click();

        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement logout = driver.findElement(By.xpath("/html/body/center/table/tbody/tr[3]" +
                "/td/a"));
        logout.click();

        WebElement logOutConfirmationMessageElement = driver.findElement(By.className("confirmation_message"));
        setSuccessfulLogOutMessage(logOutConfirmationMessageElement.getText());

        Assert.assertEquals(getSuccessfulLogOutMessage(), "You've been logged out");
    }

    @Test
    public void zipCodeField(){
        Assert.assertEquals(test("1234"), true);
        Assert.assertEquals(test("12345"), false);
        Assert.assertEquals(test("123564"), true);
    }
    public boolean test(String zipCodeInput){
        System.setProperty("webdriver.chrome.driver", "D:\\QA12_Workspace\\webdriver\\" +
                "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        WebElement zipField = driver.findElement(By.name("zip_code"));
        zipField.sendKeys(zipCodeInput);

        WebElement continueButton = driver.findElement(By.cssSelector("[type='submit'][value='Continue']"));
        continueButton.click();

        List<WebElement> registerButton = driver.findElements(By.xpath(".//input[@value='Register']"));
        List<WebElement> errorMessageElement = driver.findElements(By.className("error_message"));

        if (registerButton.isEmpty()&&!errorMessageElement.isEmpty()){
            return true;
        }
        else{
            return false;
        }
    }
}
