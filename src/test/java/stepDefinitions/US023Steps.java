package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Body;

public class US023Steps {
    Body el = new Body();

    @And("the user should see the course statuses : Published \\(P), Started \\(S), Ended \\(E), Cancelled \\(C)")
    public void theUserShouldSeeTheCourseStatusesPublishedPStartedSEndedECancelledC() {

        el.verifyContainsText(el.publishedText,"Published");
        el.verifyContainsText(el.startedText,"Started");
        el.verifyContainsText(el.endedText,"Ended");
        el.verifyContainsText(el.cacelledText,"Cancelled");
    }



    @Then("the user should see the options: Week, Month, Day, List")
    public void theUserShouldSeeTheOptionsWeekMonthDayList() {
        el.verifyContainsText(el.weekText,"Week");
        el.verifyContainsText(el.monthText,"Month");
        el.verifyContainsText(el.dayText,"Day");
        el.verifyContainsText(el.listText,"List");
    }

    @When("the user clicks on the Calendar tab")
    public void theUserClicksOnTheCalendarTab() {
        el.myClick(el.calendarButton);

    }

    @Then("the Weekly Course Plan tab should be displayd")
    public void theWeeklyCoursePlanTabShouldBeDisplayd() {
        el.verifyContainsText(el.weeklycoursePlanText,"Weekly Course Plan");
    }

    @And("the user clicks on the Calendar button next to the Weekly Course Plan")
    public void theUserClicksOnTheCalendarButtonNextToTheWeeklyCoursePlan() {
        el.myClick(el.calendarPlanButton);
    }
}
