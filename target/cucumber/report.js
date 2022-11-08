$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/BankAndCashFile.feature");
formatter.feature({
  "line": 1,
  "name": "Techfios bank and cash New Account Functionality",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters the \"\u003cusername\u003e\" as \"username\" field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters the \"\u003cpassword\u003e\" as \"password\" field",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User clicks on \"login\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User clicks on \"newAccount\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User enters \"\u003caccountTitle\u003e\" in accounts page as \"accountTitle\" field",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enters \"\u003cdescription\u003e\" in accounts page as \"description\" field",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User enters \"\u003cinitialBalance\u003e\" in accounts page as \"initialBalance\" field",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User enters \"\u003caccountNumber\u003e\" in accounts page as \"accountNumber\" field",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enters \"\u003ccontactPerson\u003e\" in accounts page as \"contactPerson\" field",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User enters \"\u003cPhone\u003e\" in accounts page as \"Phone\" field",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters \"\u003cinternetBankingURL\u003e\" in accounts page as \"internetBankingURL\" field",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User clicks on \"Submit\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 21,
  "name": "",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "Phone",
        "internetBankingURL"
      ],
      "line": 22,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "demoAcc",
        "SavingAcc",
        "10000",
        "1234",
        "Sahiba",
        "1234567890",
        "https://www.bankofamerica.com/"
      ],
      "line": 23,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2684959000,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters the \"demo@techfios.com\" as \"username\" field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters the \"abc123\" as \"password\" field",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User clicks on \"login\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should land on Dashboard page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User clicks on \"newAccount\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User enters \"demoAcc\" in accounts page as \"accountTitle\" field",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enters \"SavingAcc\" in accounts page as \"description\" field",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User enters \"10000\" in accounts page as \"initialBalance\" field",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User enters \"1234\" in accounts page as \"accountNumber\" field",
  "matchedColumns": [
    5
  ],
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User enters \"Sahiba\" in accounts page as \"contactPerson\" field",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User enters \"1234567890\" in accounts page as \"Phone\" field",
  "matchedColumns": [
    7
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters \"https://www.bankofamerica.com/\" in accounts page as \"internetBankingURL\" field",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User clicks on \"Submit\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User should be able to validate account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "BankAndCashStep.User_is_on_the_techfios_login_page()"
});
formatter.result({
  "duration": 863117600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 17
    },
    {
      "val": "username",
      "offset": 40
    }
  ],
  "location": "BankAndCashStep.user_enters_the(String,String)"
});
formatter.result({
  "duration": 3178572800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 17
    },
    {
      "val": "password",
      "offset": 29
    }
  ],
  "location": "BankAndCashStep.user_enters_the(String,String)"
});
formatter.result({
  "duration": 3140232000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "login",
      "offset": 16
    }
  ],
  "location": "BankAndCashStep.user_clicks_on(String)"
});
formatter.result({
  "duration": 5727904500,
  "status": "passed"
});
formatter.match({
  "location": "BankAndCashStep.user_should_land_on_Dashboard_page()"
});
formatter.result({
  "duration": 284029100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "newAccount",
      "offset": 16
    }
  ],
  "location": "BankAndCashStep.user_clicks_on(String)"
});
formatter.result({
  "duration": 661937300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demoAcc",
      "offset": 13
    },
    {
      "val": "accountTitle",
      "offset": 43
    }
  ],
  "location": "BankAndCashStep.user_enters_in_accounts_page(String,String)"
});
formatter.result({
  "duration": 3196410400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "SavingAcc",
      "offset": 13
    },
    {
      "val": "description",
      "offset": 45
    }
  ],
  "location": "BankAndCashStep.user_enters_in_accounts_page(String,String)"
});
formatter.result({
  "duration": 165422600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10000",
      "offset": 13
    },
    {
      "val": "initialBalance",
      "offset": 41
    }
  ],
  "location": "BankAndCashStep.user_enters_in_accounts_page(String,String)"
});
formatter.result({
  "duration": 146926300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234",
      "offset": 13
    },
    {
      "val": "accountNumber",
      "offset": 40
    }
  ],
  "location": "BankAndCashStep.user_enters_in_accounts_page(String,String)"
});
formatter.result({
  "duration": 154280800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sahiba",
      "offset": 13
    },
    {
      "val": "contactPerson",
      "offset": 42
    }
  ],
  "location": "BankAndCashStep.user_enters_in_accounts_page(String,String)"
});
formatter.result({
  "duration": 157855700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1234567890",
      "offset": 13
    },
    {
      "val": "Phone",
      "offset": 46
    }
  ],
  "location": "BankAndCashStep.user_enters_in_accounts_page(String,String)"
});
formatter.result({
  "duration": 174157800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.bankofamerica.com/",
      "offset": 13
    },
    {
      "val": "internetBankingURL",
      "offset": 66
    }
  ],
  "location": "BankAndCashStep.user_enters_in_accounts_page(String,String)"
});
formatter.result({
  "duration": 196827300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Submit",
      "offset": 16
    }
  ],
  "location": "BankAndCashStep.user_clicks_on(String)"
});
formatter.result({
  "duration": 3692253000,
  "status": "passed"
});
formatter.match({
  "location": "BankAndCashStep.user_should_be_able_to_validate_account_created_successfully()"
});
formatter.result({
  "duration": 293241400,
  "status": "passed"
});
});