$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/Feature/Login.Feature");
formatter.feature({
  "line": 2,
  "name": "User Story 1 - Login page",
  "description": "\r\nAs a user\r\nI want to login \r\nSo that i can see my account home page",
  "id": "user-story-1---login-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@UserStory1"
    }
  ]
});
formatter.scenario({
  "line": 8,
  "name": "Sign up for new acount",
  "description": "",
  "id": "user-story-1---login-page;sign-up-for-new-acount",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "User on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "click on Sign Up Menu",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I can see Account creation page",
  "rows": [
    {
      "cells": [
        "hello world"
      ],
      "line": 13
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "I input the fields",
  "rows": [
    {
      "cells": [
        "PlanType",
        "Firstname",
        "Lastname",
        "Email",
        "Confirm Email",
        "Username",
        "Password",
        "ConfirmPassword",
        "company_name",
        "company_phone",
        "company_email",
        "company_fax",
        "company_desc",
        "city",
        "state",
        "postcode",
        "country"
      ],
      "line": 15
    },
    {
      "cells": [
        "Free Edition",
        "John22",
        "Nicolas2",
        "John2Nicolas@gmail.com",
        "John2Nicolas@gmail.com",
        "Johnnicolas222",
        "Password#123",
        "Password#123",
        "siv",
        "12345",
        "sv@gmail.com",
        "12345",
        "fdfdgs",
        "test",
        "Michigan",
        "112233",
        "Australia"
      ],
      "line": 16
    },
    {
      "cells": [
        "Free Edition",
        "Joh",
        "Nic",
        "JohnNic@gmail.com",
        "JohnNic@gmail.com",
        "johnnic",
        "Password#123",
        "Password#123",
        "comp",
        "112233",
        "comp@gmail.com",
        "112233",
        "nghgj",
        "fdfdg",
        "Michigan",
        "12321",
        "Canada"
      ],
      "line": 17
    },
    {
      "cells": [
        "Free Edition",
        "test",
        "tester",
        "tester@gmail.com",
        "tester@gmail.com",
        "testtester",
        "Password#123",
        "Password#123",
        "comp2",
        "143212",
        "comp2@gmail.com",
        "14321",
        "ddff",
        "tytyr",
        "Michigan",
        "343422",
        "Finland"
      ],
      "line": 18
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "HopePageStepDefinitions.user_on_the_home_page()"
});
formatter.result({
  "duration": 16904292997,
  "status": "passed"
});
formatter.match({
  "location": "HopePageStepDefinitions.clickonSignUpMenu()"
});
formatter.result({
  "duration": 6945918313,
  "status": "passed"
});
formatter.match({
  "location": "AccStepDefinitions.i_can_see_Account_creation_page(DataTable)"
});
formatter.result({
  "duration": 126018754,
  "status": "passed"
});
formatter.match({
  "location": "AccStepDefinitions.I_input_the_fields(DataTable)"
});
formatter.result({
  "duration": 3134324316,
  "error_message": "net.serenitybdd.core.exceptions.SerenityManagedException: The following error occurred: \nBuild info: version: \u00273.5.2\u0027, revision: \u002710229a9\u0027, time: \u00272017-08-21T17:29:55.15Z\u0027\nSystem info: host: \u0027HAUSGSGPA0011C\u0027, ip: \u002710.50.131.54\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_171\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{moz:profile\u003dC:\\Users\\AU0003A7\\AppData\\Local\\Temp\\rust_mozprofile.VYLBtIMCW8YT, rotatable\u003dfalse, moz:geckodriverVersion\u003d0.23.0, timeouts\u003d{implicit\u003d0, pageLoad\u003d300000, script\u003d30000}, pageLoadStrategy\u003dnormal, unhandledPromptBehavior\u003ddismiss and notify, moz:headless\u003dfalse, platform\u003dANY, moz:accessibilityChecks\u003dfalse, moz:useNonSpecCompliantPointerOrigin\u003dfalse, acceptInsecureCerts\u003dfalse, browserVersion\u003d63.0, platformVersion\u003d6.1, moz:processID\u003d6168, browserName\u003dfirefox, javascriptEnabled\u003dtrue, platformName\u003dwindows, setWindowRect\u003dtrue, moz:webdriverClick\u003dtrue}]\nSession ID: b5faf6b3-5c65-497b-a890-4ceba4e3376d\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:185)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:120)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:641)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:698)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.alert(RemoteWebDriver.java:1024)\r\n\tat net.serenitybdd.core.pages.PageObject.getAlert(PageObject.java:1039)\r\n\tat Pages.AccountPage.company_signin(AccountPage.java:137)\r\n\tat Steps.AccPageStep.CompanyDetails(AccPageStep.java:41)\r\n\tat Steps.AccPageStep$$EnhancerByCGLIB$$87e6a56b.CGLIB$CompanyDetails$2(\u003cgenerated\u003e)\r\n\tat Steps.AccPageStep$$EnhancerByCGLIB$$87e6a56b$$FastClassByCGLIB$$64dd7521.invoke(\u003cgenerated\u003e)\r\n\tat net.sf.cglib.proxy.MethodProxy.invokeSuper(MethodProxy.java:228)\r\n\tat net.thucydides.core.steps.StepInterceptor.invokeMethod(StepInterceptor.java:395)\r\n\tat net.thucydides.core.steps.StepInterceptor.executeTestStepMethod(StepInterceptor.java:380)\r\n\tat net.thucydides.core.steps.StepInterceptor.runTestStep(StepInterceptor.java:355)\r\n\tat net.thucydides.core.steps.StepInterceptor.testStepResult(StepInterceptor.java:132)\r\n\tat net.thucydides.core.steps.StepInterceptor.intercept(StepInterceptor.java:61)\r\n\tat Steps.AccPageStep$$EnhancerByCGLIB$$87e6a56b.CompanyDetails(\u003cgenerated\u003e)\r\n\tat HomePageStepDefinitions.AccStepDefinitions.I_input_the_fields(AccStepDefinitions.java:73)\r\n\tat ✽.Then I input the fields(src/main/java/Feature/Login.Feature:14)\r\n",
  "status": "failed"
});
});