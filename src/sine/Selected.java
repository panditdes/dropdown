package sine;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected {

	public static void main(String[] args) {
		
		//Alternative method for select class
	
		
        System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();   
		
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		System.out.println("The Title Is"+driver.getTitle());
		
		driver.manage().window().maximize();
		
		WebElement country=driver.findElement(By.xpath("//select[contains(@name,'vfb-13[country]')]"));
		
		country.click();
		
		
		List<WebElement> list=driver.findElements(By.xpath("(//span[@class='vfb-right'])[2]"));

		
		System.out.println("The Total Number Of Country Is:"+list.size());
		
		for(WebElement e:list)
		{
			System.out.println(e.getText());
		}
		
		
		
	}

}
