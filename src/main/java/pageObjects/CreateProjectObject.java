package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateProjectObject {
	
	private static WebElement element = null;
	
	public static WebElement SelectNew(WebDriver driver){	    
		WebElement parent = driver.findElement(By.cssSelector("*[class$='cw-ButtonBar']"));
		element = parent.findElement(By.cssSelector("[title='Nieuw']"));
		return element;
		}
	/*
	public static WebElement SelectSaldibalans(WebDriver driver){
	    element = driver.findElement(By.partialLinkText("Saldibalans"));
	    return element;	
		}*/

	public static WebElement SelectImport(WebDriver driver){	
		element = driver.findElement(By.cssSelector("*[class^='btn-group']"));			
				//By.cssSelector("*[class^='tech']");
				//By.cssSelector("*[class$='text_left']");
		return element;
		}

	public static WebElement SelectImportKlik(WebDriver driver){	
			element = driver.findElement(By.className(("caret")));	
		return element;
		}

	public static WebElement SelectImportCSV(WebDriver driver){
		element = driver.findElement(By.partialLinkText("Excel of CSV import"));
		return element;
		}

	/*
	public static WebElement SelectFile(WebDriver driver){
		WebElement parent = driver.findElement(By.cssSelector("*[class='modal-dialog']"));
		element = parent.findElement(By.cssSelector("[upload-browse='!uploadEnabled']"));
		return element;
		} Vragen aan Michel
	*/ 

	public static WebElement SelectEntity(WebDriver driver){	
			element = driver.findElement(By.cssSelector("[placeholder='Begin met typen om resultaten te zien.']"));
		return element;
	}

}
