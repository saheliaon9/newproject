package com.test.minivet;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.*;

@CucumberOptions(features = "@target/rerun.txt",
        plugin = {"pretty", "rerun:target/rerun.txt"}, monochrome = true, strict = true)
public class ReRunCucumberTest extends AbstractTestNGCucumberTests {

}
