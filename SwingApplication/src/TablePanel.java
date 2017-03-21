import javax.swing.*;
import java.awt.Dimension;
import java.awt.FlowLayout;

/** @author Olga Germanova */
public class TablePanel extends JPanel
{
  //Массив содержащий заголоки таблицы
  Object[] headers = { "Name", "Last name", "Телефон" };

  //Массив содержащий информацию для таблицы
  Object[][] data = {
          { "John", "Smith", "1112221" },
          { "Ivan", "Black", "2221111" },
          { "George", "White", "3334444" },
          { "Anna", "Black", "2235111" },
          { "Serg", "Black", "1234"},
          { "Adam", "Black", "2221111" },
          { "Tonya", "Red", "2121101" },
          { "Elise", "Green", "2321111" },
          };

  public TablePanel()
  {
    super();
    setSize(300, 170);
    setLayout(new FlowLayout());
    jInit();
  }

  private void jInit()
  {
    JTable table = new JTable(data, headers);
    JScrollPane scrollPane = new JScrollPane(table);
    table.setPreferredScrollableViewportSize(new Dimension(250, 100));
    add(scrollPane);
  }
}
