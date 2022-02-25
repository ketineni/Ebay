Feature:MyAccount-Login Feature
Description: This feature will test a login functionality

Scenario Outline: Log-in with valid username and password
Given open browser
When Enter the url "http://practice.automationtesting.in/"
And Click on My Account Menu
And Enter registered username "<username>"and password "<password>"
And Click on login button
Then Verify login

Examples:
   	| username        | password     |
    | sumanamandava   | MimmsHall20*  |
    | Sumana          | Mimms        |