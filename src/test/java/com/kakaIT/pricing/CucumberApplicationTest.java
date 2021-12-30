package com.kakaIT.pricing;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.spring.CucumberContextConfiguration;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        plugin = {"pretty"},
        monochrome=true,
        tags="@test"
)

@SpringBootTest(classes = SpringCucumberApplication.class)
@CucumberContextConfiguration
public class CucumberApplicationTest {

    @BeforeClass
    public static void cleanTable(){
        System.out.println("before class - runner");
    }

    @AfterClass
    public static void teardown()
    {
        System.out.println("after class - runner");
    }


}
