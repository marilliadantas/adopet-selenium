@initial
Feature: Initial page

  Scenario: CT01 - Validate website home page
    Given the user accesses the home page of the site
    Then the page should contain the text "Boas-vindas!"
    And the text "Adotar pode mudar uma vida. Que tal buscar seu novo melhor amigo hoje? Vem com a gente!"