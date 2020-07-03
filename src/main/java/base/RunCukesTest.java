package base;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)  // instructs junit to run this class as a cucumber test runner
@CucumberOptions(
        dryRun  = false,  // executes the features and validates whether features exist without failing, step definitionlar tanimlanmis mi onu kontrol ediyo
        features="classpath:features",  // location of the features file folder
        glue = {"./src/test/java/stepdefinitions"}, // location of the step definition classes
        //  tags ="",
        // tags ="@practice",
        // tags ="@multiparams or @doublequoteparams or doublequoteparam1 or @wordparam" ,
        // tags="@checkboxradiotest",
        tags="@hotelstars",
        // tags="@checkboxradiotest or  @radiosselection",
        // tags="@controlgroupheader",
        //tags="@datatable2",
        // tags="@dateselection",
        //tags="@datatable",
        // tags="@mapparams",
        //  tags ="@multiparams or  @doublequoteparams or  @doublequoteparam1 or  @wordparam or  @intparam or @doubleparam",   //calling with tag
        plugin= {"pretty", "html:target/cucumber.html", "json:target/cucumber.json"} //
)
public class RunCukesTest { // runner file
}