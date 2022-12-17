package com.google.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.google.common.Testbase;
import com.google.pages.bestSellerProductPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class bestSellersProduct extends Testbase{
	

	
	@Given("I am on the amazon homepage")
	public void i_am_on_the_amazon_homepage() {
		
		launchBrowser();
	    
	}

	@When("I click on the all button")
	public void i_click_on_the_all_button() {
		
		WebElement allbutton = driver.findElement(By.id("nav-hamburger-menu"));
		allbutton.click();
	   
	}

	@When("I click on the best seller button")
	public void i_click_on_the_best_seller_button() {
		
		bestSellerProductPage bp = new bestSellerProductPage(driver);
		bp.clickBestSeller();
		
	    
	}

	@Then("I can see the list of best selleing products successfully")
	public void i_can_see_the_list_of_best_selleing_products_successfully() {
		
		bestSellerProductPage bp = new bestSellerProductPage(driver);
		bp.gettingBestsellerText();
		
		closeAll();
	   
	}


}
