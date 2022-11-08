Feature: Get All Categories
  As a user
  I want to get all categories
  So i can manage my categories

  Scenario: Get all categories with valid url
    Given I set valid Url
    When I request get categories
    Then I will get message 200