Feature: As a User
  I want to move mouse on Houses And Flats and in applied menu to see categories with
  prices, cities and car brands
  So that I can


  Scenario Outline: Houses And Flats title should show dropdown menu
    Given the user opens Onliner website
    When the user move mouse to "Дома и квартиры"
    Then dropdown list with title "Дома и квартиры" is displayed
    And dropdown list with title "Дома и квартиры" hase size 28
    And dropdown list with title "Дома и квартиры" contains "<value>"


    Examples:
    |value|
    |    Минск    |
    |    Брест    |
    |    Гродно   |
    |  2-комнатные|
    |  3-комнатные|
    |      $      |

