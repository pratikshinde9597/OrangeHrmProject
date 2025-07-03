package com.orange.ui.testLayer;

import com.orange.ui.pageLayer.LoginPage;
import com.orange.ui.pageLayer.SignUpPage;

public class LoginPageTest {
	
	public static void main(String[] args) {
		LoginPage login = new LoginPage();
		
		login.valiadateLoginFuncationality("Pratik@gamil.com", "Pratik@123");
		
		
		SignUpPage sign =new SignUpPage();
		
		sign.validateSignUPFunctionality("Hemant", "Kamble", "Male");
	}

}
