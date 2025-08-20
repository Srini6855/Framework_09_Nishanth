package org.sample;

import java.io.IOException;

import org.baseclass.Baseclass;

public class Day2 extends Baseclass {
	public void login() throws IOException {
		browserLaunch("googleChrome");
		maximizewindow();
		launchtheappln(readDataFromExcelsheet("Sheet1", 1, 3));
		implicitWait();
		elementSendKeys(locatorbyid("username"), readDataFromExcelsheet("Sheet1", 1, 0));
		elementSendKeys(locatorbyid("password"), readDataFromExcelsheet("Sheet1", 1, 1));
		elementClick(locatorbyid("login"));
	}

	public static void main(String[] args) throws IOException {
		Day2 day2 = new Day2();
		day2.login();
	}

}
