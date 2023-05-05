package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        WebDriver driver = new ChromeDriver();
       driver.get("http://google.com");
        System.out.println(driver.getTitle());
        if ("Hi Google".equals(driver.getTitle())){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
        driver.navigate().to("http://amazon.com");

        System.out.println(driver.getTitle());
        if ("Hi Amazon".equals(driver.getTitle())){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }

        driver.navigate().back();
        driver.navigate().refresh();
        driver.close();




    }
}
