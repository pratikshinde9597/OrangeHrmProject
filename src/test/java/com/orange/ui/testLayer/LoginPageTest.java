package com.orange.ui.testLayer;

import com.orange.ui.pageLayer.AddPersonalDetailsPage;
import com.orange.ui.pageLayer.AddUser;
import com.orange.ui.pageLayer.ContactPage;
import com.orange.ui.pageLayer.HomePage;
import com.orange.ui.pageLayer.LoginPage;
import com.orange.ui.pageLayer.SearchEmployeePage;
import com.orange.ui.pageLayer.SignUpPage;

public class LoginPageTest {
	
	public static void main(String[] args) {
		LoginPage login = new LoginPage();
		
		login.valiadateLoginFuncationality("Pratik@gamil.com", "Pratik@123");
		
		
		
		SignUpPage sign =new SignUpPage();
		
		sign.validateSignUPFunctionality("Hemant", "Kamble", "Male");
		
		
		
		HomePage homePage=new HomePage();
		homePage.validateHomePageFunctionality("OranageHrm");
		
		
		
		ContactPage page = new ContactPage();
		
		page.validateContactPageFunctionality("Prajakta", "Jamdar");
		
		
		
		AddPersonalDetailsPage personalDetails = new AddPersonalDetailsPage();
		
		personalDetails.validateAddPersonalDetailsPage("Komal", "Dhole", "Female");
		
		
		
		AddUser obj = new AddUser();
		
		obj.addUserFunctionality("Aditya", "Pawar");
		
		
		
		SearchEmployeePage searchEmp = new SearchEmployeePage();
		
		searchEmp.validateSearchEmployeePage("Neha", 29);
		
	}

}
