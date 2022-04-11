package baseclass;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver = null;
	
	//sendkeys
	public static void userInput(WebElement element ,String value) {
		element.sendKeys(value);	
	}
	//click
	public static void clickOnElement(WebElement element) {
		element.click();
	
	}
	//gettext
	public static void printText(WebElement element) {
		
		String t = element.getText();
	    System.out.println(t);
	    
	}
	//clear
	public static void clearOnElement(WebElement element) {
		element.clear();
	
	}//selectbyvalue
	public static void selectbyvalue(WebElement element, String value) {
	new Select(element).selectByValue(value);
	}
	//selectbyindex
	public static void selectindex(WebElement ele, int string) {
	new Select(ele).selectByIndex(string);
		}	
	//Actions
	public static void action( WebElement element) {
	Actions acc = new Actions(driver);
    acc.moveToElement(element).build().perform();
	acc.click().perform();
				}
	//screenshot
	public static void screenshot() throws IOException {
					
	TakesScreenshot anew =(TakesScreenshot) driver;
					
	File element1 = anew.getScreenshotAs(OutputType.FILE);
	File elemen1 = new File("C:\\Users\\dines\\eclipse-workspace\\AdacitinHotel\\target\\Screenshots\\Adactin.png");
	FileUtils.copyFile(element1, elemen1);		
						
	}				
	// get Current url
		public static void getCurrentUrl(String gt) {
			String gt2 = driver.getCurrentUrl();
			System.out.println("Current Url" + gt2);
		}

		// close
		public static void close() {
			driver.close();
		}

		// quit
		public static void quit() {
			driver.quit();
		}

		// navigation methods
		// to
		public static void navigate(String name, String page) {
			if (name.equalsIgnoreCase("to")) {
				driver.navigate().to(page);
			} else if (name.equalsIgnoreCase("back")) {
				driver.navigate().back();
			} else if (name.equalsIgnoreCase("forward")) {
				driver.navigate().back();
			} else if (name.equalsIgnoreCase("refresh")) {
				driver.navigate().refresh();
			}
		}			
		// window handling
		public static void windowHandling(String name) {
			if (name.equalsIgnoreCase("getWndowHandle")) {
				String current_ID = driver.getWindowHandle();
				System.out.println("Window Handle" + current_ID);
			} else if (name.equalsIgnoreCase("getWindowHandles")) {
				Set<String> All_ID = driver.getWindowHandles();
				System.out.println("Window Handles" + All_ID);

			}
		}

		// frames
		public static void frames(String type, WebElement element, WebElement First_Frame, WebElement Second_Frame) {
			if (type.equalsIgnoreCase("toFrame")) {
				driver.switchTo().frame(element);
			} else if (type.equalsIgnoreCase("backfromframe")) {
				driver.switchTo().defaultContent();
			} else if (type.equalsIgnoreCase("toFirst")) {
				driver.switchTo().frame(First_Frame);
			} else if (type.equalsIgnoreCase("toSecond")) {
				driver.switchTo().frame(Second_Frame);
			}

		}
		
		// getText
		public static void getText(WebElement element) {
			String t = element.getText();
			System.out.println(t);
		}

		// get attribute value
		public static void aValue(WebElement element) {
			String a = element.getAttribute("Value");
			System.out.println(a);
		}

		// get attribute placeholder
		public static void aPlaceholder(WebElement element) {
			String a = element.getAttribute("Placeholder");
			System.out.println(a);
		}

		// isDisplayed
		public static void Displayed(WebElement element) {
			boolean d = element.isDisplayed();
			System.out.println("Displayed" + d);
		}

		// isEnabled
		public static void Enabled(WebElement element) {
			boolean e = element.isEnabled();
			System.out.println("Enabled" + e);
		}

		// isSelected
		public static void Selected(WebElement element) {
			boolean s = element.isSelected();
			System.out.println("Selected" + s);
			
		}
		
		// dropdown
		public static void dropdown(String type, WebElement element, String value) {
			Select s = new Select(element);
			// is Multiple
			if (type.equalsIgnoreCase("isMultiple")) {
				boolean m = s.isMultiple();
				System.out.println("Multiple dropdown: " + m);
			}
			// get first selected option
			if (type.equalsIgnoreCase("FirstSelectedOption")) {
				WebElement f = s.getFirstSelectedOption();
				System.out.println("First selected option: " + f.getText());
			}
			// get all selected option
			if (type.equalsIgnoreCase("AllSelectedOption")) {
				List<WebElement> a = s.getAllSelectedOptions();
				for (int i = 0; i < a.size(); i++) {
					System.out.println("All selected Options: " + a.get(i).getText());
				}
			}
			// to select all the options at one shot
			if (type.equalsIgnoreCase("SelectAll")) {
				List<WebElement> o = s.getOptions();
				for (int i = 0; i <= o.size(); i++) {
					s.selectByIndex(i);
				}
			}
			// getoptions
			if (type.equalsIgnoreCase("getOptions")) {
				List<WebElement> g = s.getOptions();
				for (WebElement w : g) {
					System.out.println("Options in dropdown: " + w.getText());
				}
			}
			// select
			if (type.equalsIgnoreCase("index")) {
				int index = Integer.parseInt(value);
				s.selectByIndex(index);
			} else if (type.equalsIgnoreCase("value")) {
				s.selectByValue(value);
			} else if (type.equalsIgnoreCase("text")) {
				s.selectByVisibleText(value);

			}
		}	
		// up
		public static void scroll_up() {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,-200)");
		}

		// down
		public static void scroll_down() {
			JavascriptExecutor js1 = (JavascriptExecutor) driver;
			js1.executeScript("window.scrollBy(0,-200)");
		}

		// scroll into particular element
		public static void scroll(WebElement element) {
			JavascriptExecutor js2 = (JavascriptExecutor) driver;
			js2.executeScript("arguments[0].scrollIntoView();", element);
		}
		

		// robot
		public static void robot(String action) throws Throwable {
			Robot r = new Robot();
			if (action.equalsIgnoreCase("pressDown")) {
				r.keyPress(KeyEvent.VK_DOWN);
			} else if (action.equalsIgnoreCase("releaseDown")) {
				r.keyRelease(KeyEvent.VK_DOWN);
			} else if (action.equalsIgnoreCase("pressEnter")) {
				r.keyPress(KeyEvent.VK_ENTER);
			} else if (action.equalsIgnoreCase("releaseEnter")) {
				r.keyRelease(KeyEvent.VK_ENTER);
			} else if (action.equalsIgnoreCase("pressDown")) {
				r.keyPress(KeyEvent.VK_UP);
			} else if (action.equalsIgnoreCase("releaseDown")) {
				r.keyRelease(KeyEvent.VK_UP);
			}		
		
		}	
		
		
		
public static WebDriver browserLaunch(String browser) {
if (browser.equalsIgnoreCase("chrome")) {
	System.setProperty("webdriver.chrome.driver",
			System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	
}else if (browser.equalsIgnoreCase("edge")){
	System.setProperty("webdriver.edge.driver",
			System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();	
}	
else {	
	System.out.println("Invalid browser");
}

driver.manage().window().maximize();
return driver;
}
public static void getUrl(String url) {
	driver.get(url);
	
}	

public static void implicityWait() {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
}
public static void sleep() throws InterruptedException {
	Thread.sleep(3000);
	
}

}
