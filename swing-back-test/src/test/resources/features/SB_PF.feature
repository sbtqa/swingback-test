#language:en
Feature: testswingback

  @SB_PF
  Scenario: Test

    * user is on the page "Main page"

    #  custom starting application
    * user open the application cust

    #  switching current form in context to form with title "Main form"
    * opening form "Main form"

    # executing action with title "push button"
    * user (push button) "Panes"

    #  switching current form in context to form with title "Tabbed pane form"
    * opening form "Tabbed pane form"

    # select specified pane
    * user select the tab "Table" on the tabbed pane "Panes2"

    # executing action with title "check table is empty"
    * user (check table is empty) "Table1"

    * user (push button) "Accept"

    * opening form "Main form"
    * user (push button) "input data"
    * opening form "input data"

    * user (check component editable) "Name" "true"
    * user (check component editable) "Last name" "true"
    * user (check component editable) "Patronymic" "false"
    * user (check component editable) "Patronymic cb" "true"

    * user (fill field) "Name" "Иван"
    * user (fill field) "Last name" "Иванов"

    * user (set checkbox) "Patronymic cb" "true"
    * user (fill field) "Patronymic" "Иванович"

    * user (check component editable) "Patronymic" "true"
    * user (push button) "Accept"

    * opening form "Main form"
    * user (push button) "Panes"
    * opening form "Tabbed pane form"
    * user (select first rows)
    * user select the tab "Table" on the tabbed pane "Panes2"
    * user (select first table row) "Table"
    * user (push button) "Accept"