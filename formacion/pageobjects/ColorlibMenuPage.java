package com.choucair.formacion.pageobjects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

public class ColorlibMenuPage extends PageObject{
	
	//Menu Forms
		@FindBy(xpath="//*[@id='menu']/li[6]/a")
		public WebElement menuForms;
		
		//Submenu Form General
		@FindBy(xpath="//*[@id='menu']/li[6]/ul/li[1]/a")
		public WebElement menuFormsGenerals;
		
		//Submenu Form Validation
		@FindBy(xpath="//*[@id='menu']/li[6]/ul/li[2]/a")
		public WebElement menuFormsValidation;
				
		//Label
		@FindBy(xpath="//*[@id='content']/div/div/div[1]/div/div/header/h5")
		public WebElement lblFormValidation;
		
		public void menuFormValidation() {
			menuForms.click();
			menuFormsValidation.click();
			String strMensaje=lblFormValidation.getText();
			assertThat(strMensaje, containsString("Popup Validation"));
	
			
		}	

}
