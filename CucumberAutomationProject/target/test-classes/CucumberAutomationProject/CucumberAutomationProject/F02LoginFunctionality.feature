Feature: Login functionality on OHRM

  Background:
  Given Open Orange HRM in Browser 
  
  Scenario: To validate login with valid data
    Then Enter valid username "Admin" and valid password "admin123"
    And Click on login button
    Then Dashboard page should display

  Scenario: To validate login with invalid data
    Then Enter invalid username "Adminn" and enter invalid password "aadmin123"
    And I click on login button
    Then Error message should display
