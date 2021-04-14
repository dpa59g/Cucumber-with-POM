$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login into Lynk Application",
  "description": "",
  "id": "login-into-lynk-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Enter Valid Login Credentials",
  "description": "",
  "id": "login-into-lynk-application;enter-valid-login-credentials",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "user lauches the browser and Enter the Lynk Url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "user enter valid username and password and click on the login button",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "Site Home should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.user_lauches_the_browser_and_Enter_the_Lynk_Url()"
});
formatter.result({
  "duration": 31870656300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enter_valid_username_and_password_and_click_on_the_login_button()"
});
formatter.result({
  "duration": 610826300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.site_Home_should_be_displayed()"
});
formatter.result({
  "duration": 18587202900,
  "status": "passed"
});
formatter.uri("SiteHome.feature");
formatter.feature({
  "line": 1,
  "name": "User click on the Site Tile and navigates to Trial Home",
  "description": "",
  "id": "user-click-on-the-site-tile-and-navigates-to-trial-home",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "User enters into WWMG site\u0027s Trial Home",
  "description": "",
  "id": "user-click-on-the-site-tile-and-navigates-to-trial-home;user-enters-into-wwmg-site\u0027s-trial-home",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Site Name is WWMG",
  "keyword": "When "
});
formatter.step({
  "line": 4,
  "name": "Click the Site Tile of WWMG",
  "keyword": "Then "
});
formatter.step({
  "line": 5,
  "name": "Check the Trial Home of WWMG is Displayed",
  "keyword": "And "
});
formatter.match({
  "location": "SiteHomeSteps.site_Name_is_WWMG()"
});
formatter.result({
  "duration": 293116200,
  "status": "passed"
});
formatter.match({
  "location": "SiteHomeSteps.click_the_Site_Tile_of_WWMG()"
});
formatter.result({
  "duration": 452016000,
  "status": "passed"
});
formatter.match({
  "location": "SiteHomeSteps.check_the_Trial_Home_of_WWMG_is_Displayed()"
});
formatter.result({
  "duration": 43800,
  "status": "passed"
});
});