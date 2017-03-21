package varivoda.forms;

import org.netbeans.jemmy.operators.JFrameOperator;
import org.netbeans.jemmy.operators.JTabbedPaneOperator;
import ru.sbtqa.tag.swingback.annotations.ActionTitle;
import ru.sbtqa.tag.swingback.annotations.Component;
import ru.sbtqa.tag.swingback.annotations.FormEntry;
import ru.sbtqa.tag.swingback.jemmy.choosers.ComponentChooserByIndex;
import ru.sbtqa.tag.swingback.jemmy.choosers.ComponentChooserByName;
import ru.sbtqa.tag.swingback.jemmy.components.Button;
import ru.sbtqa.tag.swingback.jemmy.components.Table;
import ru.sbtqa.tag.swingback.jemmy.components.TextField;


@FormEntry(title = "Tabbed pane form")
public class TabbedPaneForm extends AbstractForm {

    public static final String TITLE = "Tabbed pane form";

    private JFrameOperator currentCont = new JFrameOperator(TITLE);

    @Component(title = "Panes1")
    private JTabbedPaneOperator tabbedPaneOperator = new JTabbedPaneOperator(currentCont, new ComponentChooserByIndex(0));

    @Component(title = "Panes2")
    private JTabbedPaneOperator tabbedPaneOperator1 = new JTabbedPaneOperator(currentCont, new ComponentChooserByIndex(1));

    @Component(title = "Accept")
    private Button butt = new Button(currentCont, new ComponentChooserByName("accept"));

    @Component(title = "Table")
    private Table tab = new Table(currentCont, new ComponentChooserByIndex(0));

    @Component(title = "Table1")
    private Table tab2 = new Table(currentCont, new ComponentChooserByIndex(1));

    @Component(title = "text1")
    private TextField tf1 = new TextField(currentCont, new ComponentChooserByIndex(0));

    @Component(title = "text2")
    private TextField tf2 = new TextField(currentCont, new ComponentChooserByIndex(1));

    @Component(title = "text3")
    private TextField tf3 = new TextField(currentCont, new ComponentChooserByIndex(3));


    @ActionTitle("select first rows")
    public void selectAllTabs() {
        tab.selectFistTableElem();
        tab2.selectFistTableElem();
    }
}
