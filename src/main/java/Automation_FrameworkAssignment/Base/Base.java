package Automation_FrameworkAssignment.Base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

      public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://www.giva.co/");
            driver.findElement(By.xpath("//a[@class='header__icon header__icon--account link focus-inset small-hide']")).click();
      }



}
