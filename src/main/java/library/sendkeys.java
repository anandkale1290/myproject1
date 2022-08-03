package library;

import org.openqa.selenium.WebElement;

public class sendkeys {

	public static void Custom_SendKeys(WebElement element,String Value) {
    try {
		element.sendKeys(Value);
    }catch(Exception e) {
    System.out.println(e.getMessage());
    }
    }
}
