package sine;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiple_Of_Three {

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
			
		   
			
			for(int i=0;i<size-1;i++)
			{
				if(i%3==0)
					
				System.out.println(alloptions.get(i).getText());
				
				
				
			}
		
		driver.quit();
	}

}
