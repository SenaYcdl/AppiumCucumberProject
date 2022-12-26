Feature: API Demos swipe
  Scenario: Swipe Test
    Given App yuklensin
    And kullanici ana ekranda
    And kullanici "API Demos" butununa tikladi
    Then kullanici "API Demos" ekraninda
    And kullanici "Views" butununa tikladi
    Then kullanici "Views" ekraninda
    And kullanici "Date Widgets" butununa tikladi
    Then kullanici "Views/Date Widgets" ekraninda
    And kullanici "2. Inline" butununa tikladi
    And kullanici 9 tiklasin
    And kulanici 15 ten 45 e yesil topu kaydirsin