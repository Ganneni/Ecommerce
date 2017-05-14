$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "id": "verifying-login,logout-and-contact-us-functionality",
  "description": "",
  "name": "Verifying login,logout and contact us functionality",
  "keyword": "Feature",
  "line": 1
});
formatter.before({
  "duration": 10636903840,
  "status": "passed"
});
formatter.scenario({
  "id": "verifying-login,logout-and-contact-us-functionality;logging-into-the-store-using-valid-credentials;;2",
  "tags": [
    {
      "name": "@LoginLogout",
      "line": 3
    }
  ],
  "description": "",
  "name": "Logging into the store using valid credentials",
  "keyword": "Scenario Outline",
  "line": 18,
  "type": "scenario"
});
formatter.step({
  "name": "I launched online store home page",
  "keyword": "Given ",
  "line": 5
});
formatter.step({
  "name": "I clicked SignIn link",
  "keyword": "When ",
  "line": 6
});
formatter.step({
  "name": "I can see login page",
  "keyword": "Then ",
  "line": 7
});
formatter.step({
  "name": "I enter \"babyspractice@gmail.com\",\"abcdefgh\"",
  "keyword": "When ",
  "line": 8,
  "matchedColumns": [
    0,
    1
  ]
});
formatter.step({
  "name": "I click on SignIn button",
  "keyword": "And ",
  "line": 9
});
formatter.step({
  "name": "I can successfully login into my account with \"Davi Smith\"",
  "keyword": "Then ",
  "line": 10,
  "matchedColumns": [
    2
  ]
});
formatter.step({
  "name": "I SignOut",
  "keyword": "Then ",
  "line": 11
});
formatter.match({
  "location": "SignUpStepDefinition.i_launched_online_store_home_page()"
});
formatter.result({
  "duration": 5120601721,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDefinition.i_clicked_SignIn_link()"
});
formatter.result({
  "duration": 354860648,
  "status": "passed"
});
formatter.match({
  "location": "SignUpStepDefinition.i_can_see_login_page()"
});
formatter.result({
  "duration": 26775,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "babyspractice@gmail.com",
      "offset": 9
    },
    {
      "val": "abcdefgh",
      "offset": 35
    }
  ],
  "location": "LoginStepDefinition.i_enter(String,String)"
});
formatter.result({
  "duration": 2528196420,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.i_click_on_SignIn_button()"
});
formatter.result({
  "duration": 1904464491,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Davi Smith",
      "offset": 47
    }
  ],
  "location": "LoginStepDefinition.i_can_successfully_login_into_my_account_with(String)"
});
formatter.result({
  "duration": 110255454,
  "status": "failed",
  "error_message": "java.lang.AssertionError: Login failure\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat stepDefinitions.LoginStepDefinition.i_can_successfully_login_into_my_account_with(LoginStepDefinition.java:66)\r\n\tat ✽.Then I can successfully login into my account with \"Davi Smith\"(Login.feature:10)\r\n"
});
formatter.match({
  "location": "LoginStepDefinition.i_SignOut()"
});
formatter.result({
  "status": "skipped"
});
formatter.write("Current Page URL is http://automationpractice.com/index.php?controller\u003dmy-account");
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 2519043422,
  "status": "passed"
});
});