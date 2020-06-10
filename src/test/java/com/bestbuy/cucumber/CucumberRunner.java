package com.bestbuy.cucumber;

import com.bestbuy.testbase.TestBase;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created By Chaitanya
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/com/bestbuy/resources/feature/")

public class CucumberRunner extends TestBase {
    
}
