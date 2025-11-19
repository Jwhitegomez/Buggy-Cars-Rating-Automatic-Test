# Author: Levi
# Language: en

Feature: Register on the AutomationExercises website
  As a user, I want to create a new account to access the services of the website.

  Scenario: Successfully register a new user on AutomationExercises
    Given I am on the AutomationExercises homepage
    When I click on the "Signup / Login" button
    And I enter a valid name and email in the Signup section
    And I toggle the "Signup" button
    And I fill in all required fields in the registration form
    And I click the "Create Account" button
    Then I should see the message "ACCOUNT CREATED!"
    And I click the "Continue" button
