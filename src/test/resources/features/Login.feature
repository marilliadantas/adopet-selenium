@login
Feature: Login page

  @login-emailEmpty
  Scenario: CT01 - Login with empty email
    Given the user is on the login page
    When fill in email ""
    And fill in password with "1234Teste"
    And clicks on the login button
    Then it should display the message error "É necessário informar um endereço de email"