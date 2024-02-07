package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.*;
// we need junit and j
@RunWith(Cucumber.class)
@CucumberOptions(features = "D:\\All_in_one\\src\\test\\resources\\Features",glue = ("StepDefination"),monochrome = true)
public class RunnerClass {

}
