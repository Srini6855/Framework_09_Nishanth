package org.sample;

import java.io.IOException;

import org.baseclass.Baseclass;

import com.pages.LoginPage;

public class Day3 extends Baseclass {
	public void login() throws IOException {
		browserLaunch("googleChrome");
		maximizewindow();
		launchtheappln(readDataFromExcelsheet("Sheet1", 1, 3));
		implicitWait();
		LoginPage loginPage = new LoginPage();
		loginPage.enterCredentials(readDataFromExcelsheet("Sheet1", 1, 0), readDataFromExcelsheet("Sheet1", 1, 1));
	}

	public static void main(String[] args) throws IOException {
		Day3 day2 = new Day3();
		day2.login();
	}

}
