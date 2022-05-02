Feature: YouTube search

  Background:
    Given the home page is opened
      #And hovered over the cookie popup
      #And scrolled to the bottom of the cookie popup
      #And the ELFOGADOM button is clicked

  Scenario: Search
    Given the search field is clicked
    When search field is filled with 'alma'
      And magnifying glass is clicked
    Then the title of the page should be 'alma - YouTube'