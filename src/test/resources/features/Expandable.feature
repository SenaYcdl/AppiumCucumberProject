Feature: API Demos expandable list
  Scenario: Expandable list test
    Given App yuklensin
    And kullanici ana ekranda
    And kullanici "API Demos" butununa tikladi
    Then kullanici "API Demos" ekraninda
    And kullanici "Views" butununa tikladi
    Then kullanici "Views" ekraninda
    And kullanici "Expandable Lists" butununa tikladi
    Then kullanici "Views/Expandable Lists" ekraninda
    And kullanici "1. Custom Adapter" butununa tikladi
    And kullanici "People Names" butununa tikladi
    And 3 saniye bekle
    And kullanici "Chuck" butununa uzun basti
    And 5 saniye bekle
    Then kullanici "Sample menu" ekraninda
