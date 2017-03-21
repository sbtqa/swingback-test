import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

public class TreePanel extends JPanel
{
  public TreePanel()
  {
    super();
    setPreferredSize(new Dimension(300, 300));
    setLayout(new FlowLayout());
    jInit();
  }

  private void jInit()
  {
    JTree tree = new JTree();
    tree.setFont(new Font("Tahoma", Font.PLAIN, 11));
    tree.setModel(new DefaultTreeModel(new DefaultMutableTreeNode("Персонал")
    {
      {
        DefaultMutableTreeNode node_1;
        node_1 = new DefaultMutableTreeNode("Руководство");
        node_1.add(new DefaultMutableTreeNode("Директор"));
        node_1.add(new DefaultMutableTreeNode("Заместитель"));
        node_1.add(new DefaultMutableTreeNode("Нач.отделов"));
        add(node_1);
        DefaultMutableTreeNode node_2;
        DefaultMutableTreeNode node_3;
        node_2 = new DefaultMutableTreeNode("Бухгалтерия");
        node_3 = new DefaultMutableTreeNode("Бухгалтер");
        node_2.add(node_3);
        node_2.add(new DefaultMutableTreeNode("Секретарь"));
        add(node_2);
        node_3.add(new DefaultMutableTreeNode("Старший"));
        DefaultMutableTreeNode node_4;
        node_4 = new DefaultMutableTreeNode("Младший");
        node_3.add(node_4);
        node_4.add(new DefaultMutableTreeNode("Стажер"));
        node_4.add(new DefaultMutableTreeNode("Постоянный сотрудник"));

        add(new DefaultMutableTreeNode("Диспетчерская"));
        add(new DefaultMutableTreeNode("Планово-аналитический"));
        add(new DefaultMutableTreeNode("Отдел кадров"));
      }
    }));

    tree.setToolTipText("");
    tree.setVisibleRowCount(40);
    add(tree);
  }
}
