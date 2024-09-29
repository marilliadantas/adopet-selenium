@register
Feature: Register page

  @register-success
  Scenario: Register success
    Given the user is on the registration screen
    When to fill in the fields
    And click on the register button
    Then the user is redirected to the login page

  @register-emptyName
  Scenario: Register with empty name
    Given the user is on the registration screen
    When not to fill in the name field
    And click on the register button
    Then it should display the message "É necessário informar seu nome"