package com.testng.concepts;

import org.testng.annotations.Test;

public class Priority_Concept {

	@Test(priority = -11)
	private void laptopSearch() {

		System.out.println("laptop search");
	}

	@Test(priority = 0)
	private void mobileSearch() {

		System.out.println("Mobile Search");
	}

	@Test
	private void bookSearch() {

		System.out.println("Book Search");
	}

	@Test(priority = +1)
	private void accessoriesSearch() {

		System.out.println("Accessories Search");
	}

}
