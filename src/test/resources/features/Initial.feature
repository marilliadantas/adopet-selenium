@inicial
Feature: Initial page

  @validateMsgWelcome
  Scenario: Validation of the welcome message
    Given the user accesses the home page of the site
    Then the page should contain the text "Boas-vindas!"
    And the text "Adotar pode mudar uma vida. Que tal buscar seu novo melhor amigo hoje? Vem com a gente!"

  @validateLoginLink
  Scenario: Validation of the Login link
    Given the user accesses the home page of the site
    Then the page should contain a link with text "Fazer login"

  @validateSignUpLink
  Scenario: Validation of the Sign Up link
    Given the user accesses the home page of the site
    Then the page should contain a link "Cadastrar"