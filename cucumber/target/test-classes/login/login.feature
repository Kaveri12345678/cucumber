Feature: test orangehrm  #goal
1)valid case
2)invalid case
Background:
Given open the browser and navigate to login page   #precondition
@postivetesting
Scenario: to test orange hrm with valid data
When enter the username "Admin"
And  enter the password  "admin123"
And click on login
Then i should see the login   #outcome
@negativetesting
Scenario: to test orange hrm with invalid data
When enter the username "admi"
And  enter the password  "admin3"
And click on login
Then i should see the login   #outcome
