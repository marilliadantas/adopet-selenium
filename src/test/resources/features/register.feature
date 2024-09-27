
@register
Feature: Register page

  Scenario: Register success
    Given the user is on the registration screen
    When to fill in the fields
    And click on the register button
    Then it should display the message