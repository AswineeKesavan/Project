package tests;

import Pages.HomePage;
import Pages.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignUpPageTest extends baseTest {



    @Test
    public void validatePositiveSignUp() throws InterruptedException {

       //Clicking Account button
        homePage.setAccount();

        Thread.sleep(2000);
        homePage.setCreateAccount();
        //Sending keys to create new account
        signUpPage.setFirstName("Aswinee");
        signUpPage.setLastName("Kesavan");
        signUpPage.setEmail("aswineek7@gmail.com");
        signUpPage.setPassword("Aswinee@0412");
        signUpPage.setReEnterPassword("Aswinee@0412");
        signUpPage.setPhoneNumber("9940584857");
        signUpPage.setRecoverPhoneNum();
        signUpPage.setSubmit();
        signUpPage.setSkipNow();

        //Assertions to validate successful sign-up
        WebElement str = driver.findElement(By.xpath("//div[@class='welcome-wrapper--not-emphasized']"));
        str.getText();
        Assert.assertEquals(str, "Hi, Lokki. Welcome back.");
    }


    }






