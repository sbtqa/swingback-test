import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import java.awt.BorderLayout;
import java.util.Date;
import java.util.Vector;

/** @author Olga Germanova */
public class TableWithCheckBoxPanel extends JPanel
{
  int index;

  public TableWithCheckBoxPanel(int index)
  {
    super();
    this.index = index;
    JInit();
  }

  private void JInit()
  {
    Vector vector = new Vector();
    // создаем вектор, хранящий сведения (колонки) для каждой из строк-записей
    vector.add("Иван");
    vector.add(20);
    vector.add(new Date(System.currentTimeMillis()));
    vector.add(true);// тип данных Boolean

    Vector vector2 = new Vector();
    vector2.add("Сергей");
    vector2.add(24);
    vector2.add(new Date(System.currentTimeMillis()));
    vector2.add(false);

    // помещаем две созданные записи - вектора внутрь третьего - списка всех записей
    final Vector vec_data = new Vector();
    vec_data.add(vector);
    vec_data.add(vector2);

    // создаем таблицу на основании собственной модели данных
    JTable table = new JTable
            (
                    new AbstractTableModel()
                    {
                      public int getRowCount()
                      {
                        return vec_data.size();
                      }
                      public int getColumnCount()
                      {
                        return 4;
                      }
                      public Object getValueAt(int rowIndex, int columnIndex)
                      {
                        return ((Vector) vec_data.get(rowIndex)).get(columnIndex);
                      }
                      public String getColumnName(int column)
                      {
                        return new String[] {"Name", "Возраст", "Дата рождения", "Галка"}[column];
                      }
                      public Class<?> getColumnClass(int columnIndex)
                      {
                        return new Class[] {String.class, Integer.class, Date.class, Boolean.class}[columnIndex];
                      }
                      public boolean isCellEditable(int rowIndex, int columnIndex)
                      {
                        return true;
                      }

                      public void setValueAt(Object aValue, int rowIndex, int columnIndex)
                      {
                        ((Vector) vec_data.get(rowIndex)).set(columnIndex, aValue);
                      }
                    }
            );

    table.setRowHeight(50);
    table.setName("Table " + index);
    add(new JScrollPane(table), BorderLayout.CENTER);
    setSize(640, 480);
  }
}
