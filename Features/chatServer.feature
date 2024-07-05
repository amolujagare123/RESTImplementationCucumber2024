
Feature: chat server API


@createUserChat @singleRequest
Scenario: Verify chat server user is created successfully
Given create user payload is created for Chat server
#When user calls createUser request with POST http call for Chat server
  When user calls "createUser" request with "PUT" http call for Chat server
Then for Chat server API call got success with status code 200
Then Chat server "error" should be "false"


  @UpdateUserChat @singleRequest
  Scenario: Verify chat server user is created successfully
    Given Update user payload is created for Chat server
#    When user calls createUser request with POST http call for Chat server
    When user calls "updateUser" request with "PUT" http call for Chat server
    Then for Chat server API call got success with status code 200
    Then Chat server "error" should be "false"



  @createMultipleUserChat @multipleRequest
  Scenario Outline: Verify chat server user is created successfully
    Given create user payload is created with <username> ,<password> , <email> , <firstName> ,<lastName> ,<nickName>
    When user calls createUser request with POST http call for Chat server
    Then for Chat server API call got success with status code 200
    Then Chat server "error" should be "false"
    Examples:
      | username    | password   | email                          | firstName | lastName | nickName          |
      | ywhitney    | V_*6uRmzOE | hgoodman@alvarez-smith.org     | Steven    | Simpson  | hancockchristopher|
      | smithsarah  | @d2^Xrj(Ap | jstevens@petersen-bennett.net  | Nicholas  | Hughes   | melissa69         |
      | jsilva      | oE4%ItUc^( | randyshaffer@abbott-burke.net  | Joseph    | Garcia   | gregorywright     |
      | jensendonald| @(qlDblTf2 | matthewmendoza@jones.com       | Todd      | King     | mandy30           |