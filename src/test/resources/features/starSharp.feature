# Carlos Martinez

Feature: Login to starsharp to create business unit and schedule meetings
  Background:
    Given that the user needs to log into the system with his username and password
  @scenario
  Scenario: Login to starsharp
    When he enters his details and logs in
        |strUser    |strPass    |
        |admin      |serenity   |
    Then the system will display a home page

  @scenario
  Scenario: Creating a business unit
    When the user has entered his credentials
      |strUser    |strPass    |
      |admin      |serenity   |
    Then he can create the business unit
      |unit002|


  @scenario
  Scenario:Create a meeting
    When the user has entered his credentials
      | strUser | strPass  |
      | admin   | serenity |
    Then User will then be able to create a meeting
      |meetingName|meetingNumber|meetingType|startDate |startTime|endDate   |endTime|location |unit    |organized|reporter     |attendee|
        |RetoMeet   |123456789    |Reto82   |02/10/2022|10:30    |03/10/2022|11:00  |La loma|unitname|Testers  |Rumania|Roco Rex|

