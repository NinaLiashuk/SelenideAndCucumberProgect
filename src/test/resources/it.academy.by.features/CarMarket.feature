Feature: As a User
  I want to move mouse on Car Market and in applied menu to see categories with
  prices, cities and car brands
  So that I can


  Scenario Outline: Car Market title should show dropdown menu
    Given the user opens Onliner website
    When the user move mouse to "Автобарахолка"
    Then dropdown list with title "Автобарахолка" is displayed
    And dropdown list with title "Автобарахолка" hase size 36
    And dropdown list with title "Автобарахолка" contains "<value>"

    Examples:
    |  value      |
    |    Минск    |
    |    Брест    |
    |    Гродно   |
    |    Могилев  |
    |    Брест    |





