package steps;

import com.nh_HotelResorts.Base;
import com.nh_HotelResorts.pages.signup_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login_steps extends Base {
    @Given("user open the browser")
    public void user_open_the_browser() {
        launchBrowser();

    }
    @When("user fill the email and password and click on login button")
    public void user_fill_the_email_and_password_and_click_on_login_button() throws InterruptedException {
        signup_page.getInstance().performSignup();


    }
    @Then("user should navigate at the homepage")
    public void user_should_navigate_at_the_homepage() {

    }
}

