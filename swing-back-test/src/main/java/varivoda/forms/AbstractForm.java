package varivoda.forms;

import ru.sbtqa.tag.swingback.Form;
import ru.sbtqa.tag.swingback.annotations.ActionTitle;
import ru.sbtqa.tag.swingback.jemmy.components.Button;

/**
 * Abstact form with basic functions
 */
public class AbstractForm extends Form {

    /*
    If user is on form (in TestContext) which doesn't contain itself methods with title "push button" this method will be executed.
    If this class doesn't contain a method with necessary title it method will be searched in super class (Form).
    If the super class doesn't contains this method a NoSuchMethodException will be thrown.
     */
//    @ActionTitle("нажимает на кнопку")
    @ActionTitle("push button")
    public void pushButton(String title) {
        System.out.println("push button from AbstractForm!");
        ((Button) getComponentOperator(title)).push();
    }

}
