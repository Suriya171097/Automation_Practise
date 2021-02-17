package com.testng.concepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Invocation_Count {

	@BeforeMethod
	private void browserLaunch() {

		System.out.println("Browser Launch");
	}

	@Test(invocationCount = 2)
	private void refresh() {

		System.out.println("refresh");
	}

	@AfterMethod
	private void url() {

		System.out.println("url");
	}

}
