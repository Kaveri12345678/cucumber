Feature: Test guru99  #goal
1)valid case
2)invalid case
Background:
Given open the browser and navigate to the login page 
@PositiveTesting
Scenario: To test the login functionality with valid
When Enter the username "user"
And Enter the password "user"
And Click on login
Then I should see the login page as :mercury towers  #outcome
@NegativeTesting
Scenario: To test the login functionality with invalid
When Enter the username "admin"
And Enter the password "admin123"
And Click on login
Then Ishould not see the login page as :mercury towers