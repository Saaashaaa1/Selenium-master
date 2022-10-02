@MainPageFeature
Feature: MainPageTest

  Scenario: Test text description
    When I open the site "https://dnipro.ithillel.ua/"
    Then The text description button should be equal "Вдосконалюйся!"