@register
Feature: Register page

  @register-success
  Scenario: CT01 - Register success
    Given the user is on the registration screen
    When to fill in the fields nome, email e senha
    And click on the register button
    Then the user is redirected to the login page

  @register-pressEnter
  Scenario: CT02 - Register success with enter
    Given the user is on the registration screen
    When to fill in the fields nome, email e senha
    And press enter
    Then the user is redirected to the login page

  @register-nameEmpty
  Scenario: CT03 - Register with empty name
    Given the user is on the registration screen
    When fill in name ""
    And fill in email "test@gmail.com"
    And fill in password "passwordTeste1"
    And fill in confirm password "passwordTeste1"
    And click on the register button
    Then it should display the message "É necessário informar seu nome"

  @register-emailInvalid
  Scenario: CT04 - Register with invalid email
    Given the user is on the registration screen
    When fill in name "Joseph"
    And fill in email "test@.com"
    And fill in password "passwordTeste1"
    And fill in confirm password "passwordTeste1"
    And click on the register button
    Then it should display the message "Por favor, verifique o email digitado"

  @register-emailEmpty
  Scenario: CT05 - Register with empty email
    Given the user is on the registration screen
    When fill in name "Joseph"
    And fill in email ""
    And fill in password "passwordTeste1"
    And fill in confirm password "passwordTeste1"
    And click on the register button
    Then it should display the message "É necessário informar um endereço de email"

  @register-pwd5character
  Scenario: CT06 - Register with 5 character password
    Given the user is on the registration screen
    When fill in name "Joseph"
    And fill in email "teste@teste.com"
    And fill in password "paS@1"
    And fill in confirm password "paS@1"
    And click on the register button
    Then it should display the message "A senha deve conter pelo menos uma letra maiúscula, um número e ter entre 6 e 15 caracteres"

  @register-pwd16character
  Scenario: CT07 - Register with 16 character password
    Given the user is on the registration screen
    When fill in name "Joseph"
    And fill in email "teste@teste.com"
    And fill in password "passwordTest1234"
    And fill in confirm password "passwordTest1234"
    And click on the register button
    Then it should display the message "A senha deve conter pelo menos uma letra maiúscula, um número e ter entre 6 e 15 caracteres"

  @register-pwdNoNumber
  Scenario: CT08 - Register with password missing number
    Given the user is on the registration screen
    When fill in name "Joseph"
    And fill in email "teste@teste.com"
    And fill in password "passwordTest"
    And fill in confirm password "passwordTest"
    And click on the register button
    Then it should display the message "A senha deve conter pelo menos uma letra maiúscula, um número e ter entre 6 e 15 caracteres"

  @register-pwdNoUpper
  Scenario: CT09 - Register with password missing capital letter
    Given the user is on the registration screen
    When fill in name "Joseph"
    And fill in email "teste@teste.com"
    And fill in password "passwordtest123"
    And fill in confirm password "passwordtest123"
    And click on the register button
    Then it should display the message "A senha deve conter pelo menos uma letra maiúscula, um número e ter entre 6 e 15 caracteres"

  @register-pwdMismatch
  Scenario: CT10 - Register with mismatched passwords
    Given the user is on the registration screen
    When fill in name "Joseph"
    And fill in email "teste@teste.com"
    And fill in password "passwordTest1"
    And fill in confirm password "passwordtest1"
    And click on the register button
    Then it should display the message "As senhas não batem"