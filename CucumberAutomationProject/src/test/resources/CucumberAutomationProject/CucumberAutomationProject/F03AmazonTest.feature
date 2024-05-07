@AmazonLinks
Feature: Amazon Links test

  Background: 
    Given Open Amazon

	@SellLink
  Scenario: To Test Sell Link
    When Click on Sell link
    Then Sell page should openn
	
	@BestSellerLink
  Scenario: To test Best Seller link
    When I click on Best Seller link
    Then Best Sellers page should open
	
	@MobileLink
  Scenario: To test Mobile link
    When I click on Mobile link
    Then Mobile page should open
	
	@ElectronicsLink
  Scenario: To test Electronics link
    When I click on Electronics link
    Then Electronics page should open
