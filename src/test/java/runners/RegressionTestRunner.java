package runners;


import com.aventstack.extentreports.service.ExtentService;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;

@CucumberOptions
        (
                tags = "@RegressionTest",
                features = "src/test/java/featureFiles",
                glue = "stepDefinitions",
                plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
                dryRun = false
        )

public class RegressionTestRunner extends AbstractTestNGCucumberTests {
    @AfterClass
    public static void writeExtentReport(){
        ExtentService.getInstance().setSystemInfo("Windows Username",  System.getProperty("user.name"));
        ExtentService.getInstance().setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        ExtentService.getInstance().setSystemInfo("Username", "Senol");
        ExtentService.getInstance().setSystemInfo("Application Name", "Campus");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name"));
        ExtentService.getInstance().setSystemInfo("Department", "QA-Tester");
    }
}
