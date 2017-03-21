#language:ru
Функционал: testswingback

@rusTest
Сценарий: Тест

  * пользователь открывает приложение
  * открывается форма "Main form"
  * пользователь (нажимает на кнопку) "Panes"
  * открывается форма "Tabbed pane form"
  * пользователь переходит на вкладку "Table" в окне с вкалдками "Panes2"
#  * пользователь (проверяет, что таблица пуста) "Table"
  * пользователь (нажимает на кнопку) "Accept"

  * открывается форма "Main form"
  * пользователь (нажимает на кнопку) "input data"
  * открывается форма "input data"

  * пользователь (проверяет редактируемость элемента) "Name" "true"
  * пользователь (проверяет редактируемость элемента) "Last name" "true"
  * пользователь (проверяет редактируемость элемента) "Patronymic" "false"

  * пользователь (заполняет поле) "Name" "Иван"
  * пользователь (заполняет поле) "Last name" "Иванов"

  * пользователь (устанавливает чекбокс) "Patronymic cb" "true"
  * пользователь (заполняет поле) "Patronymic" "Иванович"

  * пользователь (проверяет редактируемость элемента) "Patronymic" "true"
  * пользователь (нажимает на кнопку) "Accept"

  * открывается форма "Main form"
  * пользователь (нажимает на кнопку) "Panes"
  * открывается форма "Tabbed pane form"
  * пользователь переходит на вкладку "Table" в окне с вкалдками "Panes2"
  * пользователь (выделяет первую запись таблицы) "Table"
#  * пользователь (проверяет, что Table пуста) "Table"
  * пользователь (нажимает на кнопку) "Accept"