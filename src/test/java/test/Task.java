package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("http://cashwise.us");

        String expectedCashwiseTitle = "Cashwise is best!";
        String expectedCashwiseURL = "https://sachwise.us/home";
        driver.manage().window().maximize();

        if (driver.getTitle().equals(expectedCashwiseTitle)){
            System.out.println("Cashwise title is passed");
        }else {
            System.out.println("Cashwise title is failed");

        }
        if (driver.getCurrentUrl().equals(expectedCashwiseURL)){
            System.out.println("Cashwise title is passed");

        }else {
            System.out.println("Cashwise url failed");
        }

        System.out.println(driver.getPageSource());

    }
}
