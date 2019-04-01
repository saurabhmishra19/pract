package tests.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by saurabh on 19/6/18.
 */
public class welcomePageTester {



    public static void main(String [] args){
        System.setProperty("webdriver.chrome.driver","/home/saurabh/Desktop/tools/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("http://localhost:4200");


    }
}
