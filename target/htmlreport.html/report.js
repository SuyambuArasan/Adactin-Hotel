$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/adactin/feature/adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking application",
  "description": "",
  "id": "hotel-booking-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": ": Login page",
  "description": "",
  "id": "hotel-booking-application;:-login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Check"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter the \"\u003cusername\u003e\" in username field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter the \"\u003cpassword\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click the login Button  and it navigates to search hotel page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-application;:-login-page;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 11,
      "id": "hotel-booking-application;:-login-page;;1"
    },
    {
      "cells": [
        "name",
        "word"
      ],
      "line": 12,
      "id": "hotel-booking-application;:-login-page;;2"
    },
    {
      "cells": [
        "user",
        "pass"
      ],
      "line": 13,
      "id": "hotel-booking-application;:-login-page;;3"
    },
    {
      "cells": [
        "Dineshkasiraman34215",
        "P07C68"
      ],
      "line": 14,
      "id": "hotel-booking-application;:-login-page;;4"
    },
    {
      "cells": [
        "use",
        "pas"
      ],
      "line": 15,
      "id": "hotel-booking-application;:-login-page;;5"
    },
    {
      "cells": [
        "Dineshkasiraman34215",
        "P07C68"
      ],
      "line": 16,
      "id": "hotel-booking-application;:-login-page;;6"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": ": Login page",
  "description": "",
  "id": "hotel-booking-application;:-login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Check"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter the \"name\" in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter the \"word\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click the login Button  and it navigates to search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Adactin_Url()"
});
formatter.result({
  "duration": 25745936400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "name",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_enter_the_in_username_field(String)"
});
formatter.result({
  "duration": 175570500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "word",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_enter_the_in_password_field(String)"
});
formatter.result({
  "duration": 74573300,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_Button_and_it_navigates_to_search_hotel_page()"
});
formatter.result({
  "duration": 1341815400,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": ": Login page",
  "description": "",
  "id": "hotel-booking-application;:-login-page;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Check"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter the \"user\" in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter the \"pass\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click the login Button  and it navigates to search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Adactin_Url()"
});
formatter.result({
  "duration": 1245523400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_enter_the_in_username_field(String)"
});
formatter.result({
  "duration": 133305400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "pass",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_enter_the_in_password_field(String)"
});
formatter.result({
  "duration": 160565000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_Button_and_it_navigates_to_search_hotel_page()"
});
formatter.result({
  "duration": 987295600,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": ": Login page",
  "description": "",
  "id": "hotel-booking-application;:-login-page;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Check"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter the \"Dineshkasiraman34215\" in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter the \"P07C68\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click the login Button  and it navigates to search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Adactin_Url()"
});
formatter.result({
  "duration": 1037633500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dineshkasiraman34215",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_enter_the_in_username_field(String)"
});
formatter.result({
  "duration": 178404800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "P07C68",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_enter_the_in_password_field(String)"
});
formatter.result({
  "duration": 139006600,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_Button_and_it_navigates_to_search_hotel_page()"
});
formatter.result({
  "duration": 1584635400,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": ": Login page",
  "description": "",
  "id": "hotel-booking-application;:-login-page;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Check"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter the \"use\" in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter the \"pas\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click the login Button  and it navigates to search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Adactin_Url()"
});
formatter.result({
  "duration": 4350907400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "use",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_enter_the_in_username_field(String)"
});
formatter.result({
  "duration": 12211545600,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d99.0.4844.84)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-SNNP6BI0\u0027, ip: \u0027192.168.146.112\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 99.0.4844.84, chrome: {chromedriverVersion: 98.0.4758.102 (273bf7ac8c90..., userDataDir: C:\\Users\\dines\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:56959}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: d6a7b879bbe1eaae4e10b665e0f2ad13\n*** Element info: {Using\u003did, value\u003dusername}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementById(RemoteWebDriver.java:372)\r\n\tat org.openqa.selenium.By$ById.findElement(By.java:188)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy17.sendKeys(Unknown Source)\r\n\tat baseclass.BaseClass.userInput(BaseClass.java:26)\r\n\tat com.adactin.feature.StepDefinition.user_enter_the_in_username_field(StepDefinition.java:37)\r\n\tat ✽.When user enter the \"use\" in username field(src/test/java/com/adactin/feature/adactin.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "pas",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_enter_the_in_password_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_Button_and_it_navigates_to_search_hotel_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 16,
  "name": ": Login page",
  "description": "",
  "id": "hotel-booking-application;:-login-page;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@Check"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter the \"Dineshkasiraman34215\" in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter the \"P07C68\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user click the login Button  and it navigates to search hotel page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_Launch_The_Adactin_Url()"
});
formatter.result({
  "duration": 12119169300,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d99.0.4844.84)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-SNNP6BI0\u0027, ip: \u0027192.168.146.112\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_281\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 99.0.4844.84, chrome: {chromedriverVersion: 98.0.4758.102 (273bf7ac8c90..., userDataDir: C:\\Users\\dines\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:56959}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: d6a7b879bbe1eaae4e10b665e0f2ad13\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:277)\r\n\tat baseclass.BaseClass.getUrl(BaseClass.java:264)\r\n\tat com.adactin.feature.StepDefinition.user_Launch_The_Adactin_Url(StepDefinition.java:19)\r\n\tat ✽.Given user Launch The Adactin Url(src/test/java/com/adactin/feature/adactin.feature:5)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dineshkasiraman34215",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_enter_the_in_username_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "P07C68",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_enter_the_in_password_field(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.user_click_the_login_Button_and_it_navigates_to_search_hotel_page()"
});
formatter.result({
  "status": "skipped"
});
});