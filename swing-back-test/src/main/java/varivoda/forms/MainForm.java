package varivoda.forms;

import org.netbeans.jemmy.operators.JFrameOperator;
import ru.sbtqa.tag.swingback.annotations.ActionTitle;
import ru.sbtqa.tag.swingback.annotations.Component;
import ru.sbtqa.tag.swingback.annotations.FormEntry;
import ru.sbtqa.tag.swingback.jemmy.choosers.ComponentChooserByIndex;
import ru.sbtqa.tag.swingback.jemmy.choosers.ComponentChooserByText;
import ru.sbtqa.tag.swingback.jemmy.choosers.ComponentChooserByToolTip;
import ru.sbtqa.tag.swingback.jemmy.components.Button;

@FormEntry(title = "Main form")
public class MainForm extends AbstractForm {

    public static final String TITLE = "Example app";

    JFrameOperator currentCont = new JFrameOperator();

    @Component(title = "input data")
    private Button but1 = new Button(currentCont, new ComponentChooserByIndex(0));

    @Component(title = "Panes")
    private Button but2 = new Button(currentCont, new ComponentChooserByText("Panes"));

    @Component(title = "Panes")
    private Button but3 = new Button(currentCont, new ComponentChooserByToolTip("Tool type"));

    @ActionTitle("push button")
    public void pushButton(String title) {
        System.out.println("push button from Main form!");
        ((Button) getComponentOperator(title)).push();
    }

}
