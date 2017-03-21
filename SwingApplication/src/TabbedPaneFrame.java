import javax.swing.*;
import javax.swing.table.TableColumn;
import java.awt.*;

/**
 * @author Olga Germanova
 */
public class TabbedPaneFrame extends JFrame {
    public TabbedPaneFrame() {
        super("Tabbed pane form");
        final JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setSize(new Dimension(200, 300));
        tabbedPane.setName("tp1");
        tabbedPane.setFont(new Font("Verdana", Font.PLAIN, 10));
        tabbedPane.addTab("Tree", new TreePanel());
        tabbedPane.addTab("Table", new TableWithCheckBoxPanel(1));
        tabbedPane.addTab("TextField", new JPanel() {
            {
                JTextField jTextField = new JTextField("text1");
                jTextField.setToolTipText("text1");
                jTextField.setPreferredSize(new Dimension(200, 50));
                add(jTextField);
            }
        });

        final JTabbedPane tabbedPane2 = new JTabbedPane();
        tabbedPane2.setSize(new Dimension(200, 300));
        tabbedPane2.setName("tp2");
        tabbedPane2.setFont(new Font("Verdana", Font.PLAIN, 10));

        tabbedPane2.addTab("Tree", new TreePanel());

        JPanel tableP = new JPanel();
        Object[] hearers = new Object[]{"Name", "Last name", "Patronymic"};
        Object[][] data;
        if (Data.isFull) {
            data = new Object[][]{{Data.name, Data.lastName, Data.patr}};
        } else {
            data = new Object[][]{};
        }
        JTable table = new JTable(data, hearers);
        tableP.add(new JScrollPane(table));
        table.setPreferredScrollableViewportSize(new Dimension(250, 100));

        tabbedPane2.addTab("Table", tableP);
        tabbedPane2.addTab("TextField", new JPanel() {
            {
                JTextField jTextField = new JTextField("text2");
                jTextField.setToolTipText("text2");
                jTextField.setPreferredSize(new Dimension(200, 50));
                add(jTextField);
            }
        });


        JPanel panel1 = new JPanel();
        JLabel fileLabel2 = new JLabel("Name: ");
        final JTextField fileField2 = new JTextField();
        fileField2.setPreferredSize(new Dimension(150, 20));
        fileField2.setName("field2");
        panel1.add(fileLabel2);
        panel1.add(fileField2);


        JButton accept = new JButton();
        accept.setPreferredSize(new Dimension(200, 50));
        accept.setName("accept");
        accept.setText("accept");
        accept.addActionListener(e -> {
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            this.dispose();
        });

        JPanel panel2 = new JPanel();
        panel2.setSize(new Dimension(100, 200));

        JPanel content = new JPanel();
        content.setLayout(new GridLayout(0, 1));
        JTextField jTextField = new JTextField("text2");
        jTextField.setToolTipText("text2");
        jTextField.setPreferredSize(new Dimension(200, 50));
        panel2.add(accept);
        panel2.add(jTextField);
        content.add(tabbedPane);
        content.add(tabbedPane2);
        content.add(panel2);


        getContentPane().add(content);
        setPreferredSize(new Dimension(1000, 700));
        pack();
        setLocationRelativeTo(null);
    }
}
