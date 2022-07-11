package com.vcentry.lab.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class) //junit main method
@CucumberOptions(
features="src/test/java/com/vcentry/lab/features",
glue="com.vcentry.lab.stepDefinition",
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
monochrome = true, // readable console
dryRun= false, //dry run to check feature file steps
                 //were implemented in TestSteps
tags="@validlogin or @sanity"
			)
public class TestRunner {

}