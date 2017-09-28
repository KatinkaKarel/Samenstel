package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NavigerenObjecten {
	
	private static WebElement element = null;	
	
	
	public static WebElement NavigerenSamenstellen(WebDriver driver){ 		
		element = driver.findElement(By.linkText("Samenstellen"));		
		return element;
	}
	
			

	public static WebElement ClickCloud(WebDriver driver){
	    element = driver.findElement(By.className(("GJJ2145DCFD")));
		return element;
	}
	
	public static WebElement Zoekveld(WebDriver driver){	    
		WebElement parent = driver.findElement(By.id("main"));
	    element = parent.findElement(By.cssSelector("[placeholder='Zoeken...']"));
		return element;
	}
	


}



