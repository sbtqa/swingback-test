package varivoda.forms;

import org.netbeans.jemmy.operators.JFrameOperator;
import ru.sbtqa.tag.swingback.annotations.Component;
import ru.sbtqa.tag.swingback.annotations.FormEntry;
import ru.sbtqa.tag.swingback.jemmy.choosers.ComponentChooserByIndex;
import ru.sbtqa.tag.swingback.jemmy.choosers.ComponentChooserByText;
import ru.sbtqa.tag.swingback.jemmy.choosers.ComponentChooserByToolTip;
import ru.sbtqa.tag.swingback.jemmy.components.Button;
import ru.sbtqa.tag.swingback.jemmy.components.CheckBox;
import ru.sbtqa.tag.swingback.jemmy.components.TextField;

@FormEntry(title = "input data")
public class InputForm extends AbstractForm {

    public static final String TITLE = "input data";

    JFrameOperator currentCont = new JFrameOperator(TITLE);

    @Component(title = "Name")
    private TextField tex0 = new TextField(currentCont, new ComponentChooserByIndex(0));

    @Component(title = "Last name")
    private TextField tex1 = new TextField(currentCont, new ComponentChooserByToolTip("Enter last name"));

    @Component(title = "Patronymic")
    private TextField tex2 = new TextField(currentCont, new ComponentChooserByIndex(2));

    @Component(title = "Patronymic cb")
    private CheckBox cb1 = new CheckBox(currentCont, new ComponentChooserByIndex(0));

    @Component(title = "Accept")
    private Button but = new Button(currentCont, new ComponentChooserByText("accept"));

}
