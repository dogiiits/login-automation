Feature: Tests Legacy login on Platform

  Scenario: Verification of Legacy Login
    Given Open the Firefox and launch the platform legacy registration
    When Fill form Inputs and click on login
    Then open available collection
    Then create moodboard
