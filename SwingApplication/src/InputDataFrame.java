import javax.swing.*;
import java.awt.*;

/** @author Olga Germanova */
public class InputDataFrame extends JFrame
{
  public InputDataFrame()
  {
    super("input data");

    JPanel content = new JPanel(new GridLayout(2,2));

    JPanel p = new JPanel();
    p.setPreferredSize(new Dimension(200, 50));
    JLabel nameLabel = new JLabel("Name: ");
    final JTextField nameFieldText = new JTextField();
    nameFieldText.setPreferredSize(new Dimension(150, 20));
    p.add(nameLabel);
    p.add(nameFieldText);
    content.add(p);

    JPanel p1 = new JPanel();
    p1.setPreferredSize(new Dimension(200, 50));
    JLabel lastNameLabel = new JLabel("Last name: ");
    final JTextField lastNameFieldText = new JTextField();
    lastNameFieldText.setToolTipText("Enter last name");
    lastNameFieldText.setPreferredSize(new Dimension(150, 20));
    p1.add(lastNameLabel);
    p1.add(lastNameFieldText);
    content.add(p1);

    JPanel p2 = new JPanel();
    p2.setPreferredSize(new Dimension(200, 30));
    final JCheckBox patrCheckBox = new JCheckBox();
    final JLabel patrLabel = new JLabel("Patronymic: ");
    final JTextField patrTextField = new JTextField();
    patrTextField.setEditable(false);
    final JButton accept = new JButton("accept");
    accept.setPreferredSize(new Dimension(150, 20));
    patrTextField.setPreferredSize(new Dimension(100, 20));
    p2.add(patrCheckBox);
    p2.add(patrLabel);
    p2.add(patrTextField);
    p2.add(accept);
    content.add(p2);

    accept.addActionListener(e -> {
      Data.lastName = lastNameFieldText.getText();
      Data.name = nameFieldText.getText();
      if (patrCheckBox.isSelected()) {
        Data.patr = patrTextField.getText();
      }
      Data.isFull = true;
      this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      this.dispose();
    });

    patrCheckBox.addActionListener(e -> {
      patrTextField.setEditable(patrCheckBox.isSelected());
    });

    getContentPane().add(content);
    setPreferredSize(new Dimension(500, 200));
    pack();
    setLocationRelativeTo(null);
  }
}
