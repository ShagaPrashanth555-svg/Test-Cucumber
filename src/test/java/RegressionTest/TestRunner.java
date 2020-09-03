package RegressionTest;

import java.io.IOException;

import javax.naming.ConfigurationException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import SupportLibraries.InvokeBrowser;
import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="Feature",glue ={"stepdefinitions"} ,format = {"pretty", "html:target/cucumber"},dryRun= false )

public class TestRunner {
	@Before
	public static void  setup() throws IOException ,InterruptedException ,ConfigurationException {
		// TODO Auto-generated method stubs
	}
	@After
	public static void teardown() throws IOException ,InterruptedException ,ConfigurationException{
		//InvokeBrowser.getDriver().quit();
	}
}
