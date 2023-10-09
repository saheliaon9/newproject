#Feature: Count of units  in general pathology under pathology module
#
#  Background:
#    Given the user has login to MCREM exam prep website and select continue button in revision tile and select pathology tile
#
#  Scenario: Check units in general pathology tile
#    When    user check the total count of units in general pathology module
#    Then   total count of units in general pathology module should be same as the total count of units showing in general pathology tile
#
#
#  Scenario: Check total counts of units completed in general pathology tile
#    When  user check the total count of units completed in general pathology tile
#    Then  total count of completed units in general pathology is same as the total count of completed units showing in general pathology tile
#
#
#  Scenario: complete one unit in general pathology module
#    When user select  mark as completed button in general pathology unit
#    Then that unit in general pathology will mark as read