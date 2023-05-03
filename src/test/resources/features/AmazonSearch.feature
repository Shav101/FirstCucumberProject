@amazonSearch
Feature: Amazon Search Functionality

  @amazonTestData
  Scenario Outline: Search for coffee mugs on Amazon
    Given I am on Amazon homepage
    Then I verify that I am on the Amazon homepage
    When i search for "<testdata>" and click search
    Then verify that I am on the search result page
    When I get text of the search criteria text element
    Then I verify that the search criteria text matches the search input

Examples:
|testdata					| 
|coffee mug				|
|pretty coffee mug|                   
|cool coffee mug	|
|cute coffee mug 	|
