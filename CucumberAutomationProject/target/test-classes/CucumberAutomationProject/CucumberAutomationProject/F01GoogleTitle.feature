Feature: Check Google title

  Scenario: Validate Google title
    Given Open google
    When Read title
    Then Title should be Google

  Scenario: Validate search functionality of Google
    Given I open Google
    When Enter valid keyword in search box
    And Hit enter
    Then Valid search should display
