Feature: Verifying Registration Feature

@SignUp
Scenario Outline: Signing up for new account with email id
Given I launched online store home page
When I clicked SignIn link
Then I can see login page
When I enter "<EmailId>" and click on create account button
Then I can see Registration page
When I enter "<Gender>","<CFname>","<CLname>","<pwd>","<Day>","<Month>","<Year>","<ChkBoxesInfo>","<Company>","<Add1>","<Add2>","<City>","<State>","<Postcode>","<AddInfo>","<HomePhone>","<Mobile>"
And I click on Register Button
Then I get registered successfully



Examples:
|  EmailId                  | Gender | CFname   | CLname      |   pwd      | Day | Month  | Year | ChkBoxesInfo | Company  | Add1    |  Add2   |   City   | State       |  Postcode   |	AddInfo	|  HomePhone   | Mobile    |  
|  babyspractice@gmail.com  | Mr.    | David    |  Smith      |  abcdefgh  | 15  | 8      | 1947 | None         |          | Address1| Address2|  City    | California  |  90210      |         |              | 1234567890|


