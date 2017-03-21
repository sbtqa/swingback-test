package varivoda;

import cucumber.api.CucumberOptions;
import cucumber.api.java.Before;
import gherkin.I18n;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.cglib.core.Local;
import ru.sbtqa.tag.cucumber.TagCucumber;
import ru.sbtqa.tag.qautils.i18n.I18N;

import java.util.Locale;

@RunWith(TagCucumber.class)
@CucumberOptions(
        glue = {"ru.sbtqa.tag.swingback.stepdefs", "varivoda.stepdefs", "ru.sbtqa.tag.pagefactory.stepdefs"},
        features = {"src/test/resources/features"},
        tags = {"@SB_PF"})
public class CucumberTest {
}
