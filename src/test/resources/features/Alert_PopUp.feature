@PopupMenu
Feature: API demos

  Scenario: Popup Menu
    Given App yuklensin
    When kullanici ana ekranda
    And kullanici "API Demos" butununa tikladi
    Then kullanici "API Demos" ekraninda
    And kullanici "Views" butununa tikladi
    And kullanici "Popup Menu" butununa tikladi
    And kullici make popup butonuna tikladi
    And kullanici Search butununa tikladi
    Then popup mesaji onayla
    Then screenshot al