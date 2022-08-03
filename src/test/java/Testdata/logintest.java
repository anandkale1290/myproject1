package Testdata;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import library.Baseclass;
import library.ExcelDataProvider;
import library.sendkeys;
import pageobject.LoginPom;

public class logintest extends Baseclass{

	@Test
	public void Test_001() throws Exception {
LoginPom login=PageFactory.initElements(driver, LoginPom.class);
sendkeys.Custom_SendKeys(login.getTxt_email(), ExcelDataProvider.getStringData("Sheet1", 0, 0));
Thread.sleep(2000);
sendkeys.Custom_SendKeys(login.getTxt_pass(),ExcelDataProvider.getStringData("Sheet1", 0, 1));
Thread.sleep(2000);
login.getBtn_login().click();
Thread.sleep(15000);

	}
	
}
