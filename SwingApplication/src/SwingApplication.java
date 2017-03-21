import javax.swing.*;
import java.awt.*;

/**
 * @author Olga Germanova
 */
public class SwingApplication
{
  public static void main(String[] args)
  {
    final JFrame frame = new JFrame("Example app");
    frame.setSize(500, 200);
    frame.setLayout(new BorderLayout());

    JPanel jPanel = new JPanel(new FlowLayout());

    JButton inputFrameButton = new JButton("input data");
    inputFrameButton.setToolTipText("Ввести данные");
    inputFrameButton.setMaximumSize(new Dimension(15, 15));

    inputFrameButton.addActionListener(e -> {
      InputDataFrame iF = new InputDataFrame();
      iF.setVisible(true);
    });

    JButton tabButton = new JButton("Panes");
    tabButton.setPreferredSize(new Dimension(100, 20));

    tabButton.addActionListener(e1 -> {
      TabbedPaneFrame tabbedPaneFrame = new TabbedPaneFrame();
      tabbedPaneFrame.setVisible(true);
    });

    jPanel.add(inputFrameButton);
    jPanel.add(tabButton);
    frame.add(jPanel, BorderLayout.CENTER);

    JPanel panel = new JPanel(new FlowLayout());
    JButton exitButton = new JButton("Выход");
    exitButton.setToolTipText("Tool type");
    exitButton.setSize(new Dimension(50, 50));
    exitButton.addActionListener(e -> {
      frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
      frame.dispose();
      System.exit(0);
    });

    panel.add(exitButton);
    frame.add(panel, BorderLayout.SOUTH);

    frame.setVisible(true);
  }
}