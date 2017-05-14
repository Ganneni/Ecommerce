Feature: Verifying login,logout and contact us functionality

@LoginLogout
Scenario Outline: Logging into the store using valid credentials
Given I launched online store home page
When I clicked SignIn link
Then I can see login page
When I enter "<EmailId>","<Pwd>"
And I click on SignIn button
Then I can successfully login into my account with "<UserName>"
Then I SignOut




Examples:
|      EmailId              |     Pwd     |   UserName   |
| babyspractice@gmail.com   |   abcdefgh  |   David Smith|


@Logout
Scenario: Logging out from my account
