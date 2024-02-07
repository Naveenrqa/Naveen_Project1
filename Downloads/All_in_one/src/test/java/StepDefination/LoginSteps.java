package StepDefination;

import io.cucumber.java.en.*;

public class LoginSteps {

	@Given(": user is on the login page")
	public void user_is_on_the_login_page() {
	    System.out.println("hello");
	}

	@When(": user enter the username and pwd")
	public void user_enter_the_username_and_pwd() {
		 System.out.println("hello");
	}

	@And(": click on the enter")
	public void click_on_the_enter() {
		 System.out.println("hello");
	}

	@Then(": user able to navigete to login page")
	public void user_able_to_navigete_to_login_page() {
		 System.out.println("hello");
	    
	}
}
