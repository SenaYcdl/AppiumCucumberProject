Feature: API Demos Scrolling

  Background:  scroll
    Given App yuklensin
    When kullanici ana ekranda
    And kullanici "API Demos" butununa tikladi
    Then kullanici "API Demos" ekraninda
    And kullanici "Views" butununa tikladi
    Then kullanici "Views" ekraninda

  Scenario: Scrolling test
    And kullanici Switches butonun tiklasin

  Scenario: Scrolling test uiscrollable
    And kullanici "Switches" button tiklasin

  Scenario: scroll with reusable method
    And kullanici "Switches" butununa tikladi

