#Feature: Login to  MRCEM Exam Prep website
#
#  Background:
#    Given   the user has hit the mrcemexamprep URl in the browser
#    And     select login button
#
#  Scenario: login to mrcexamprep site with valid username and password
#
#    When user enter valid username and password and select signin button
#    Then mrcemexamprep dashboard screen will open
#
#
#
#  Scenario: login to mrcexamprep site with invalid username and password
#
#    When user enter invalid username and password and select signin button
#    Then error message will show saying Username or email is not registered with us
#
#
#  Scenario: login to mrcexamprep site with valid username and invalid password
#
#    When user enter valid username and invalid password and select signin button
#    Then error message will show saying password is not valid
#
#
#  Scenario: check validation message for username and password
#
#    When user select signin button without entering valid username and password
#    Then validation message will show for username and password