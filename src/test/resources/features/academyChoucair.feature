# Autor: SaraBermudez

@stories
Feature: Register UTest
  As a user, I want to register on the UTest platform
  @scenario1
  Scenario Outline: Successful registration
    Given that Rose want register on UTest
    When she complete form step one
      | strUserName   | strUserLastname   | strUserEmail   |
      | <strUserName> | <strUserLastname> | <strUserEmail> |
    When she complete form step two
      | strUserCity   | strUserZip   |
      | <strUserCity> | <strUserZip> |
    When she complete form step three
    Then she finsh register
      | strUserPassword   | strUserConfirmPassword   |
      | <strUserPassword> | <strUserConfirmPassword> |
    Examples:
      | strUserName | strUserLastname | strUserEmail                      | strUserCity | strUserZip | strUserPassword | strUserConfirmPassword |
      | Rose        | Perez           | rosapereztestchoucair@yopmail.com | Medellin    | 050023     | AbCdEfGh12345#  | AbCdEfGh12345#         |