package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.projects.Categori;

public class categoriesStep {
    @Steps
    Categori categori;
    @Given("I set valid Url")
    public void iSetValidUrl() {
        categori.getUrl();
    }

    @When("I request get categories")
    public void iRequestGetCategories() {
        categori.reqGetcategories();
    }

    @Then("I will get message 200")
    public void iWillGetMessage200() {
        categori.message200();
    }
}
