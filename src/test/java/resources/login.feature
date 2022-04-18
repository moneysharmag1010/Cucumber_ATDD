Feature: Web login


  #Background is for 1 feature file ; will be common for all scenarios
  #if in a single file we need different pre req for scenarios, use hooks.
  #Background:
   # Given user is at login page
   # Then user refreshes the page
  @Regression
  Scenario Outline: Validate UI elements on Home Page Scenario Outline


    Then the user should be logged in successfully
    Then user should be able to see logo icon
    And user is able to see "<OneText>" and "<SecondText>" button
    And user is able to see sign out button

    Examples:
    | OneText | SecondText |
    | Hey |     Money |
    | Hard Work | has no substitute |



@Smoke
    Scenario: Validate UI elements on Home Page

      When the user enters valid credentials
      And hits submit button
      Then the user should be logged in successfully
      Then user should be able to see logo icon
      And user is able to see "this is new text" button
      And user is able to see sign out button


