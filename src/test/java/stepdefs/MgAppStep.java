package stepdefs;

import cucumber.api.java8.En;
import pageObjects.MgApp;
import util.TestContext;

public class MgAppStep implements En {
	
	
	TestContext testContext;
	private MgApp mgapp;

	
	public MgAppStep(TestContext testContext) {
		this.testContext=testContext;
		//this.mgapp=testContext.getPageObjectManager().getMgApp();
		
		
		
	//	 When("^user opens the browser$", () -> {
		//	 mgapp.goToHomePage();
	    
		 
		//});
	/*	 Then("^Home page should be displayed$", () -> {
			 mgapp.verifyHomePageIsDisplayed();
	    
		 
		});
		 When("^user  enters location box$", () -> {
			    mgapp.clickOnLocationBox();
			    
			});

			Then("^entered location page should be displayed$", () -> {
			    mgapp.verifyEnteredLocationPage();
			   
			});

			When("^user search for medicine in the serach box$", () -> {
			   mgapp.clickOnSearchbox();
			   
			});

			Then("^searched medicine page should be displayed$", () -> {
			    mgapp.verifySearchedPage();
			});

			Then("^check the delivery date is today$", () -> {
			    mgapp.checkDeliveryPage();
			});

			When("^user  click  on add item to the cart$", () -> {
				 mgapp.clickOnAddToCartBtn();
			});

			Then("^cart page should be displayed$", () -> {
				 mgapp.verifyCartPage();
			});
			And("^user should delete  item from the cart$", () -> {
				 mgapp.deleteItemFromCart();
			});

			Then("^deleted cart page should be displayed$", () -> {
				mgapp.verifyDeletedCartPage();
			});
			Then("^user should match product details with excel sheet$", () -> {
				try {
					mgapp.verifyProductDetailsWithExcelSheet();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			});

	 
	*/
}
}