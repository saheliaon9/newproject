#Feature: Change password
#
#  Background:
#    Given the user login to MRCEM and selects your profile option from user menu

#    Scenario: Check validation message
#      When the user selects change password button and hit save button without entering data in any field
#      Then validation message will be shown for old, new and reenter password

#
#    Scenario: Verify validation message if new and confirm password is not same
#      When the user enter correct old password and enter different password in new and confirm password
#      Then  alert  will be shown for entering different password in new and confirm password


#  Scenario: Check the password change functionality by entering the old invalid password and the valid (matching) new and confirm password.
#    When the user enter invalid old password and enter matching password in new and confirm password
#    Then all  fields will become blank

#Scenario: Check the MAX and MIN Limit for passwords
#
#  When the user enter old password and new and confirm password less than six and hit save button
#    Then all  fields will become blank

#  Scenario: Verify new password can not be same as old password
#  When the user enter confirm and new password same as old password
#  Then validation message will be shown for entering confirm and new password same as old password

#  Scenario: Check whether the change password functionality is working by entering a valid password
#    When the user enter valid old password and enter matching password in new and confirm password and hit save button
#    Then password saved successfully message will show

