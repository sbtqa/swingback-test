package varivoda;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import ru.sbtqa.tag.cucumber.TagCucumber;

@RunWith(TagCucumber.class)
@CucumberOptions(
        glue = {"ru.sbtqa.tag.swingback.stepdefs", "varivoda.stepdefs", "ru.sbtqa.tag.pagefactory.stepdefs"},
        features = {"src/test/resources/features"},
        tags = {"@SB_PF"})
public class CucumberTest {
}
