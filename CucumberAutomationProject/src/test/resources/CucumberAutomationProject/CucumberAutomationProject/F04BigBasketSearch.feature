Feature: Big Basket Search

Background:
Given Given Open "https://www.bigbasket.com/"
 
  Scenario: Test search functionality on BigBasket
    When I search for "Mango"
    And I hit enter
    Then Search for Mango should display

    Scenario: Test search functionality on BigBasket
    When search for "Mashroom"
    And  hit enter
    Then Search for mashroom should display
    