Feature: API Demos Switches

  Background: Switches screen Test
    Given upload to app
    Then user goes to page
    And user click to API demos
    And user on the API demos screen
    And user click to Preference button
    Then user on the Preference page
    And kullanici "Switches" butununa tikladi

  Scenario: Switch test
    And kullanici check box tikladi
    And kulanici switch butonuna tikladi
    Then screenshot al

  Scenario: Switch button checks
    And check box secili olmali
    And ilk switch butonu kapali
    And ikici switch butonu acik
    Then screenshot al