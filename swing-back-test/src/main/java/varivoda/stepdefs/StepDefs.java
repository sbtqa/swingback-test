package varivoda.stepdefs;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import org.netbeans.jemmy.JemmyProperties;
import org.netbeans.jemmy.TestOut;
import ru.sbtqa.tag.swingback.AppManager;

import java.io.PrintStream;
import java.util.concurrent.Callable;


public class StepDefs {
    
    
    @Before
    public void beforeTest() {
        
    }
    
    /**
     * Custom starting the application. With switching off logging with jemmy
     */
    @And("^user open the application cust$")
    public void startApp() throws NoSuchMethodException {
        AppManager.getInstance().startApplication();
        AppManager.getInstance().execute(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                JemmyProperties.setCurrentOutput(new TestOut(System.in, null, (PrintStream) null, null));
                return null;
            }
        });
    }
}
