@compose
Feature: Validate the user

  @composeemail
  Scenario Outline: Compose Email
    Given load the home page
    When After login "<login>" & "<Pass>"
    And click on compose
    And Provide recipient name "<resp_name>"
    And Provide subject "<subject>"
    And Provide details "<details>"
    And Enter the send key
    Then Verify the welcom message "<value1>" & "<resp_name>"

    Examples: 
      | login    | Pass         | resp_name             | subject       | details                    | value1                        |
      | someone1 | No09a0ter123 | naveen naveen(naveen) | Hi,Test email | Hello ,This is for testing | This Message has been send to |
