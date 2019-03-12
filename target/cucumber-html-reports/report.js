$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cucumberFeatures/Login_Test.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@DEM-3"
    }
  ]
});
formatter.scenario({
  "name": "Successfull Login",
  "description": "\t\tSuccessful Login with Valid Credentials",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DEM-3"
    },
    {
      "name": "@DEM-1"
    },
    {
      "name": "@DEM-2"
    }
  ]
});
formatter.step({
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginTests.user_is_on_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Navigate to LogIn Page",
  "keyword": "When "
});
formatter.match({
  "location": "LoginTests.user_navigate_to_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters UserName and Password",
  "keyword": "And "
});
formatter.match({
  "location": "LoginTests.user_enters_username_and_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTests.message_displayed_login_successfully()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Successful LogOut",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@DEM-3"
    },
    {
      "name": "@DEM-5"
    },
    {
      "name": "@DEM-2"
    }
  ]
});
formatter.step({
  "name": "User LogOut from the Application",
  "keyword": "When "
});
formatter.match({
  "location": "LoginTests.user_logout_from_the_application()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@class\u003d\u0027logout1\u0027]\"}\n  (Session info: chrome\u003d71.0.3578.98)\n  (Driver info: chromedriver\u003d2.45.615291 (ec3682e3c9061c10f26ea9e5cdcf3c53f3f74387),platform\u003dWindows NT 10.0.16299 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027LIN22003146\u0027, ip: \u002710.236.67.9\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_181\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.45.615291 (ec3682e3c9061c..., userDataDir: C:\\Users\\priyrai\\AppData\\Lo...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:57480}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 71.0.3578.98, webStorageEnabled: true}\nSession ID: 449b55fe3501846165f7797e4479e574\n*** Element info: {Using\u003dxpath, value\u003d//a[@class\u003d\u0027logout1\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:548)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:322)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:424)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:314)\r\n\tat stepDefinition.LoginTests.user_logout_from_the_application(LoginTests.java:48)\r\n\tat ✽.User LogOut from the Application(src/test/resources/cucumberFeatures/Login_Test.feature:16)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Message displayed LogOut Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTests.message_displayed_logout_successfully()"
});
formatter.result({
  "status": "skipped"
});
});