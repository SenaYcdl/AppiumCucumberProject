Feature: API Demos touch action
  Scenario: Drag and Drop
    Given upload to app
    Then user goes to page
    And user click to API demos
    And user on the API demos screen
    And kullanici Views butonuna tikladi
    Then kullanici Views ekraninda
    And kullanici Drag and Drop butonuna tikladi
    When kullanici birinci topu ikici topun ustune brakti
    Then kullanici dorduncu top gorecek
    Then screenshot al