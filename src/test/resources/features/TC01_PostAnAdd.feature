@regression
Feature: 4Sale Task
  Scenario: As a User I want to post a new ad
    Given Open forsale application
    When user tap on post an ad
    And user enter login credentials
    Then user should directed to posting an ad
    When user pick a category
    And tap on next button
    Then error message should appear
    When user select address
    And user enter title for the ad
    And tap on next button
    Then user should be directed to Add media screen



