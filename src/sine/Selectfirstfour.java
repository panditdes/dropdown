package sine;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectfirstfour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");
			
			
			WebDriver driver = new ChromeDriver();   
			
			driver.get("https://nxtgenaiacademy.com/demo-site/");
			
			driver.manage().window().maximize();
			
			WebElement country=driver.findElement(By.id("vfb-13-country"));
			
			Select sel =new Select(country);
			
			List<WebElement> alloptions =sel.getOptions();
			
			int size =alloptions.size();
			
			System.out.println("The Total Number is :"+size);
			
		   int j=1;
			
			for(int i=0;i<4;i++)
			{
				System.out.println(j+":"+alloptions.get(i).getText());
				
				j++;	
			}
		
		driver.quit();
	}

}
