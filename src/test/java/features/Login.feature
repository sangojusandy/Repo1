Feature: verify login module


Scenario Outline: Verify login functionality
Given I am on the login page
When Entered the login credentials username as<Username> and password as<password>
Then I should be redirected to Dashboard
Examples:
|    Username                     | password                   |
|    devteam@silverbullet.co.uk   | N8g.heGKwMHET-EyGzroe@-c   |

