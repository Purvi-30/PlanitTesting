#Author: purvikala3003@gmail.com
#Summary - Planit Technical Assessment
Feature: Feature to test Contact page functionality

  Background: User is on Planit testing demo website
    Given browser is open
    When user enters Planit Demo website URL
    Then user is redirected to Home Page

  @TestCase1 @ContactPage
  Scenario: Check mandatory field errors are gone after entering values
    And user clicks on contact menu
    When user clicks on submit button
    Then mandatory field errors are shown on the page
    And user populates correct data in all mandatory fields
    Then all errors are gone.

  @TestCase2 @ContactPage
  Scenario: Check Successful submission on contact page
    And user clicks on contact menu
    When user populates correct data in all mandatory fields
    And user clicks on submit button
    Then successful submission message is received

  @TestCase3 @ContactPage
  Scenario: Check Mandatory field errors
    And user clicks on contact menu
    When user enters incorrect data in all mandatory fields
    Then mandatory field errors are shown on the page

  @TestCase4 @ShopPage
  Scenario: Check the added items in the cart from shop page
    And user clicks on shop menu
    When user adds Funny Cow item twice times
    And user adds Fluffy Bunny item once
    And user clicks the cart menu
    Then all the added items are displayed in the cart
