package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.BaseDriver;

public class hooks {
    @Before
    public void before()
    {
        System.out.println("The Scenario is started");
    }

    @After
    public void  after()
    {
        System.out.println("The Scenario is finished");
        BaseDriver.quitDriver();
    }
}
