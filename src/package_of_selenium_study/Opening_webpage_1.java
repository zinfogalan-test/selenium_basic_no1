package package_of_selenium_study;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Opening_webpage_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.flipkart.com/?affid=tilc2c&affExtParam1=NBT_Listicle8&affExtParam2=875_4&gad_source=1&gad_campaignid=23067189828&gbraid=0AAAABBOGRT8MaOmgKCBx2X1_9s8NS0weB&gclid=Cj0KCQjwovPGBhDxARIsAFhgkwSc5W6_X_STWjAk638G4Npdp6fkwXAT6SVLWHID9HBzhyQdEX5PF8EaAm1mEALw_wcB");
        
		WebElement searchbox= driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div/div/div/div/div/div[1]/div/div/header/div[1]/div[2]/form/div/div/input"));
		searchbox.sendKeys("car toy under 4000",Keys.ENTER);
		
		
		

		
	}

}
//C:\Users\User\eclipse-workspace
