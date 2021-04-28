@signup
Feature: Sign Up
  I want to use this for Signup

  @signupuser
  Scenario Outline: Test the Sign Up Page
    Given load the home page
    When Go to singup page
    And Provide first name "<first_name>"
    And Provide last name  "<last_name>"
    And Provide email "<email>"
    And Provide userid "<user_id>"
    And Provide password "<pass>"
    And Provide confirm password "<conf_pass>"
    And Enter the resister button
    Then Verify the welcom message "<value1>" & "<first_name>" &"<last_name>" &"<value2>"

    Examples: 
      | first_name | last_name | email       | user_id | pass         | conf_pass    | value1 | value2                                       |
      | So0970     | y779      | k@9mmcr.com | somuone2   | No09a0ter123 | No09a0ter123 | Dear   | Your personal settings have been registered. |

