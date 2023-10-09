package com.test.minivet;

import io.cucumber.testng.*;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/resources/com/test/minivet/feature",
        glue={"com.test.minivet.stepdefinition"},
        plugin = { "pretty", "rerun:target/rerun.txt", "timeline:target/timeline"}, monochrome = true)

public class RunCucumberTest extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}

