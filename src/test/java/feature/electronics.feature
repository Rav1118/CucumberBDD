#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Adding product to cart on demoblaze website
Background: Log in on website
  Given User must be on the homepage by clicking on Url "https://www.demoblaze.com/"
  @smoketest
  Scenario: Validate if the user is able to signup

    When User clicks on signup
    And Enter Username and Password 
    And Click on signup
    Then Click ok on signup is successful alert
    
    Scenario: Validate if user can log in and add product to cart
    When Click on Log in
    And Enter a valid Username and Password
    Then Log in the website
    And Click on laptops option
    And Click on any laptop name
    Then Click on Add to cart
    And Click ok on Product Added Alert
    Then Go to cart option to check if product is added or not

