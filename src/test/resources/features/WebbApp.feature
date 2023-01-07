@WebApp
Feature: API demos
  Scenario: Web app test
    Given App yuklensin
    When kullanici ana ekranda
    And kullanici "API Demos" butununa tikladi
    Then kullanici "API Demos" ekraninda
    And kullanici "Views" butununa tikladi
    Then kullanici "Views" ekraninda
    And kullanici Webview butununa tikladi