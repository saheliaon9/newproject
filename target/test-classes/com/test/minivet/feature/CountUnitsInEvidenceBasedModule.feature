#Feature: Count units in all modules
#
#  Background:
#    Given the user has login to MCREM exam prep website and select continue button in revision tile
#
#    Scenario: Check units in evidence based medicine tile
#      When    user check the total count of units in evidence based medicine module
#      Then   total count of units in evidence based medicine module should be same as the total count of units showing in evidence based medicine tile
#
#
#  Scenario: Check total counts of units completed in evidence based medicine module
#    When  user check the total count of units completed in evidence based medicine module
#    Then  total count of completed units in evidence based medicine module is same as the total count of completed units showing in evidence based medicine tile
#
#  Scenario: complete one unit in evidence based medicine module
#    When user select  mark as completed button in evidence based medicine unit
#    Then that unit in evidence based medicine will mark as read