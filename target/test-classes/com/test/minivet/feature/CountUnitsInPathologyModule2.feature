#Feature: Count of units  in haematology under pathology module
#
#  Background:
#    Given the user has login to MCREM exam prep website and select continue button in revision tile and select the pathology tile
#
#  Scenario: Check units in haematology tile
#    When    user check the total count of units in haematology module
#    Then   total count of units in haematology module should be same as the total count of units showing in haematology tile
#
#
#  Scenario: Check total counts of units haematology tile
#    When  user check the total count of units completed in haematology tile
#    Then  total count of completed units in haematology is same as the total count of completed units showing in haematology tile
#
#
#  Scenario: complete one unit in haematology module
#    When user select  mark as completed button in haematology unit
#    Then that unit in haematology will mark as read