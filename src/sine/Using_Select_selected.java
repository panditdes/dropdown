package sine;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Using_Select_selected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.setProperty("webdriver.chrome.driver", "F:\\Pandit\\Required Document\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();   
		
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		driver.manage().window().maximize();
		
		WebElement country=driver.findElement(By.id("vfb-13-country"));
		
		Select sel =new Select(country);
		
	   String FirstselectedOption=  sel.getFirstSelectedOption().getText();  
	   
	   System.out.println("default selected option is :"+FirstselectedOption);
		
	}

}
