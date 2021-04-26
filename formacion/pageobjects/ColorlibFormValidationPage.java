package com.choucair.formacion.pageobjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ColorlibFormValidationPage extends PageObject {

	//Campo Required
		@FindBy(id="req")
		public WebElementFacade txtRequired;
		
	//Campo Seleccion de deporte 1
		@FindBy(id="sport")
		public WebElementFacade cmbSport1;
		
	//Campo Seleccion multiple
		@FindBy(id="sport2")
		public WebElementFacade cmbSport2;
		
	//Campo Url
		@FindBy(id="url1")
		public WebElementFacade txtUrl;
			
	//Campo Email
		@FindBy(id="email1")
		public WebElementFacade txtEmail;
			
	//Campo Password1
		@FindBy(id="pass1")
		public WebElementFacade txtPassword1;
			
	//Campo Password2
		@FindBy(id="pass2")
		public WebElementFacade txtPassword2;
			
	//Campo MinSize
		@FindBy(id="minsize1")
		public WebElementFacade txtMinSize;
			
	//Campo MaxSize
		@FindBy(id="maxsize1")
		public WebElementFacade txtMaxSize;
			
	//Campo Number
		@FindBy(id="number2")
		public WebElementFacade txtNumber;
			
	//Campo IP
		@FindBy(id="ip")
		public WebElementFacade txtIP;
			
	//Campo Date
		@FindBy(id="date3")
		public WebElementFacade txtDate;
			
	//Campo DateEarlier
		@FindBy(id="past")
		public WebElementFacade txtDateEarlier;
		
	//Campo DateEarlier
		@FindBy(xpath="//*[@id='popup-validation']/div[14]/input")
		public WebElementFacade btnValidate;
		
	//Globo informatico
		@FindBy(xpath="(//DIV[@class='formErrorContent'])[1]")
		public WebElementFacade globoInformativo;
				
    
	    public void Select_Sport(String datoPrueba) {
	    	cmbSport1.click();
	    	cmbSport1.selectByVisibleText(datoPrueba);
	    }
	    
	    public void Multiple_Select(String datoPrueba) {
	    	cmbSport2.selectByVisibleText(datoPrueba);
	    }


	    public void Url(String datoPrueba) {
	    	txtUrl.click();
	    	txtUrl.clear();
	    	txtUrl.sendKeys(datoPrueba);
	 
	    }

	    public void Email(String datoPrueba) {
	    	txtEmail.click();
	    	txtEmail.clear();
	    	txtEmail.sendKeys(datoPrueba);
	
	    }

	    public void Password(String datoPrueba) {
	    	txtPassword1.click();
	    	txtPassword1.clear();
	    	txtPassword1.sendKeys(datoPrueba);
	
	    }

	    public void Confirm_Password(String datoPrueba) {
	    	txtPassword2.click();
	    	txtPassword2.clear();
	    	txtPassword2.sendKeys(datoPrueba);
	
	    }

	    public void Minimum_Size(String datoPrueba) {
	    	txtMinSize.click();
	    	txtMinSize.clear();
	    	txtMinSize.sendKeys(datoPrueba);
	
	    }

	    public void Maximum_Size(String datoPrueba) {
	    	txtMaxSize.click();
	    	txtMaxSize.clear();
	    	txtMaxSize.sendKeys(datoPrueba);
	
	    }

	    public void Number(String datoPrueba) {
	    	txtNumber.click();
	    	txtNumber.clear();
	    	txtNumber.sendKeys(datoPrueba);
	
	    }

	    public void Ip(String datoPrueba) {
	    	txtIP.click();
	    	txtIP.clear();
	    	txtIP.sendKeys(datoPrueba);
	
	    }

	    public void Date(String datoPrueba) {
	    	txtDate.click();
	    	txtDate.clear();
	    	txtDate.sendKeys(datoPrueba);
	
	    }
				
	    public void Date_Earlier(String datoPrueba) {
	    	txtDateEarlier.click();
	    	txtDateEarlier.clear();
	    	txtDateEarlier.sendKeys(datoPrueba);    	
	    }
	    
	    public void Validate() {
	    	btnValidate.click();
	    }

		public void Required(String datoPrueba) {
			txtRequired.click();
	    	txtRequired.clear();
	    	txtRequired.sendKeys(datoPrueba);
			
		}

		public void required(String datoPrueba) {
			txtRequired.click();
	    	txtRequired.clear();
	    	txtRequired.sendKeys(datoPrueba);
			
		}
		
		public void form_sin_errores(){
			assertThat(globoInformativo.isCurrentlyVisible(), is(false));
		}

		public void form_con_errores(){
			assertThat(globoInformativo.isCurrentlyVisible(), is(true));
		}
}
