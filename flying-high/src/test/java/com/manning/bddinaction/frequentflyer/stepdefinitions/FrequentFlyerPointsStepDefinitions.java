package com.manning.bddinaction.frequentflyer.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FrequentFlyerPointsStepDefinitions {
    @Given("the flying distance between Sydney and Melbourne is {int} km")
    public void theFlyingDistanceBetweenSydneyAndMelbourneIsKm(int arg0) {
    }

    @And("(?:.*) is a standard Frequent Flyer member")
    public void iAmAStandardFrequentFlyerMember() {
    }

    @When("(?:.*) flies from Sydney to Melbourne")
    public void iFlyFromSydneyToMelbourne() {
    }

    @Then("s?he should earn (.*) points")
    public void iShouldEarnPoints(int arg0) {
    }

    @When("(?:.*) flies from Sydney to Melbourne in Business class")
    public void iFlyFromSydneyToMelbourneInBusinessClass() {
    }

    @When("(?:.*) flies from Sydney to Melbourne on a Partner Airlines flight")
    public void iFlyFromSydneyToMelbourneOnAPartnerAirlinesFlight() {
    }

    @Given("Fred is a (.*) Frequent Flyer member")
    public void fredIsAStatusFrequentFlyerMember(String status) {
    }

    @When("Fred flies on a flight that is worth (.*) base points")
    public void fredFliesOnAFlightThatIsWorthBaseBasePoints(int points) {
    }

    @Then("^s?he should earn a status bonus of (.*)")
    public void heShouldEarnAStatusBonusOfBonus(int bonus) {
    }

    @And("^s?he should have guaranteed minimum earned points per trip of (.*)")
    public void heShouldHaveGuaranteedMinimumEarnedPointsPerTripOfMinimum(int minimum) {
    }

    @Given("^(.*) and (.*) are family members")
    public void familyMembers(String giver, String receiver) {

    }

    @And("they have the following accounts:")
    public void theyHaveTheFollowingAccounts(DataTable accountDetails) {
    }

    @When("{word} transfers {int} points to {word}")
    public void martinTransfersPointsToDanielle(String giver, int amount, String receiver) {
    }

    @Then("the accounts should be as follows:")
    public void theAccountsShouldBeAsFollows(DataTable accountDetails) {
    }

    @Given("Todd has just joined the Frequent Flyer programme")
    public void toddHasJustJoinedTheFrequentFlyerProgramme() {
    }

    @And("Todd asks for the following flight to be credited to his account:")
    public void toddAsksForTheFollowingFlightToBeCreditedToHisAccount(DataTable fights) {
    }

    @Then("the flight should be considered (.*)")
    public void theFlightShouldBeConsideredEligibility(String eligibility) {
    }
}
