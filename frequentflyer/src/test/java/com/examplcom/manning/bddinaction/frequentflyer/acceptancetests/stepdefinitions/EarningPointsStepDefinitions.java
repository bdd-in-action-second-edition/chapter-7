package com.examplcom.manning.bddinaction.frequentflyer.acceptancetests.stepdefinitions;

import com.examplcom.manning.bddinaction.frequentflyer.domain.CabinClass;
import com.examplcom.manning.bddinaction.frequentflyer.domain.FrequentFlyerMember;
import com.examplcom.manning.bddinaction.frequentflyer.domain.PointsMultiplier;
import com.examplcom.manning.bddinaction.frequentflyer.domain.PointsSchedule;
import com.examplcom.manning.bddinaction.frequentflyer.repositories.FrequentFlyerMemberRepository;
import com.examplcom.manning.bddinaction.frequentflyer.repositories.PointsMultiplierRepository;
import com.examplcom.manning.bddinaction.frequentflyer.repositories.PointsScheduleRepository;
import com.examplcom.manning.bddinaction.frequentflyer.services.FrequentFlyerPointsService;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@ContextConfiguration
public class EarningPointsStepDefinitions {

    @Autowired
    PointsScheduleRepository pointsScheduleRepository;

    @Autowired
    PointsMultiplierRepository pointsMultiplierRepository;

    @Autowired
    FrequentFlyerMemberRepository frequentFlyerMemberRepository;

    @Autowired
    FrequentFlyerPointsService frequentFlyerPointsService;

    /**
     * Preparing test data using auto-wired Spring components
     */
    @Given("the following flight points schedule:")
    public void theFollowingFlightPointsSchedule(List<PointsSchedule> pointsSchedules) {
        pointsScheduleRepository.deleteAll();
        pointsSchedules.forEach(
                schedule -> pointsScheduleRepository.save(schedule)
        );
    }

    @And("the following flyer types multipliers:")
    public void theFollowingFlyerTypesMultipliers(List<PointsMultiplier> multipliers) {
        pointsMultiplierRepository.deleteAll();
        multipliers.forEach(
                multiplier -> pointsMultiplierRepository.save(multiplier)
        );
    }

    private FrequentFlyerMember member;

    @Given("{} is a {frequentFlyer}")
    public void aFrequentFlyerMember(String name, FrequentFlyerMember member) {
        this.member = frequentFlyerMemberRepository.save(member.named(name));
    }

    @Given("the distance from {} to {} is {int} km")
    public void recordFlightDistance(String departure, String destination, int distanceInKm) {
        // Record trip distance
    }

    @When("he/she flies from {} to {} in {cabinClass} class")
    public void sheFliesFromLondonToNewYorkInBusinessClass(String departure,
                                                           String destination,
                                                           CabinClass cabinClass) {
        frequentFlyerPointsService.recordFlight(member, departure, destination, cabinClass);
    }

    @Then("he/she should earn {int} points")
    public void shouldEarnPoints(int expectedPoints) {
        assertThat(frequentFlyerPointsService.pointsEarnedBy(member)).isEqualTo(expectedPoints);
    }

    @Given("{} joined the Frequent Flyer programme on {ISO-date}")
    public void justJoined(String name, LocalDate joinDate) {
        this.member = FrequentFlyerMember.newMember().named(name);
        this.member.setJoinDate(joinDate);
        this.member = frequentFlyerMemberRepository.save(member);
    }

    @Given("^s?he has been a member for (\\d+) years")
    public void memberFor(int years) {
        this.member.setJoinDate(LocalDate.now().minusYears(years));
    }

    @When("she views her award trips")
    public void ssheViewsHerAwardTrips() {
    }

    @Then("the available destinations should be {string-values}")
    public void availableDestinations(List<String> destinations) {
    }

    @Given("{} is a {frequentFlyer} with {int} points")
    public void aFrequentFlyerMemberWithPoints(String name,
                                               FrequentFlyerMember member,
                                               int points) {
        this.member = FrequentFlyerMember.newMember().named(name);
        this.member.setInitialPoints(points);
        frequentFlyerMemberRepository.save(this.member);
    }

    @When("he/she completes a flight from {} to {}")
    public void travellerCompletesAFlight(String departure, String destination) {
        // TODO: Record the flight details
    }

}
