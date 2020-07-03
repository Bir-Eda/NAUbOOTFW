Feature: Amazon Login Functionality

  Scenario: Verify user logins with valid identity
    Given User opens Amazon website
    When User navigates to Login page
    And User writes the valid username as "gurcuesra@gmail.com"
    And User navigates to password page with clicking the button
    Then Password pages is displayed