Feature: All scenarios from reqres.in

  @SampleListUsers
  Scenario: Verify that all users are displayed correctly
    Given List user payload is created
#    When user calls ListUser request with GET http call
    When user calls "ListUser" request with "GET" http call
    Then API call got success with status code 200

  @SampleSingleUser
  Scenario: Verify that the single user is retrieved successfully
    Given Get Single user payload is created
#    When user calls ListUser request with GET http call
    When user calls "SingleUser" request with "GET" http call
    Then API call got success with status code 200

  @SampleCreateUser
  Scenario: Verify user is created successfully
    Given create user payload is created
 #   When user calls createUser request with POST http call
    When user calls "createUser" request with "POST" http call
    Then API call got success with status code 201
    Then "name" should be "Amol"

  @SampleUpdateUser
  Scenario: Verify user is updated successfully
    Given update user payload is created
#    When user calls updateUser request with PUT http call
    When user calls "updateUser" request with "PUT" http call
    Then API call got success with status code 200

  @SampleDeleteUser
  Scenario: Verify user is deleted successfully
    Given delete user payload is created
#    When user calls deleteUser request with delete http call
    When user calls "deleteUser" request with "DELETE" http call
    Then API call got success with status code 204