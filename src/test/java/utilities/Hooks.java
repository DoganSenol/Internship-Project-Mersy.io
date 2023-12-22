package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
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
