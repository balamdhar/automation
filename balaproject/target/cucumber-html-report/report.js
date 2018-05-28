$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumber.feature");
formatter.feature({
  "line": 1,
  "name": "To search cucumber in google",
  "description": "",
  "id": "to-search-cucumber-in-google",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Cucumber Google",
  "description": "",
  "id": "to-search-cucumber-in-google;cucumber-google",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on google page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I type \"cucumber\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click search button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I clear search textbox",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepage.googlePage()"
});
formatter.result({
  "duration": 85598438,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "cucumber",
      "offset": 8
    }
  ],
  "location": "SearchText.searchText(String)"
});
formatter.result({
  "duration": 86830240,
  "status": "passed"
});
formatter.match({
  "location": "SearchButton.searchButton()"
});
formatter.result({
  "duration": 2843454922,
  "status": "passed"
});
formatter.match({
  "location": "Clearpage.Clear()"
});
formatter.result({
  "duration": 48383343,
  "status": "passed"
});
formatter.uri("junit.feature");
formatter.feature({
  "line": 1,
  "name": "To search junit in google",
  "description": "",
  "id": "to-search-junit-in-google",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Junit Google",
  "description": "",
  "id": "to-search-junit-in-google;junit-google",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@JunitScenario"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on google page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I type \"junit\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click search button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I clear search textbox",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepage.googlePage()"
});
formatter.result({
  "duration": 10741328,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "junit",
      "offset": 8
    }
  ],
  "location": "SearchText.searchText(String)"
});
formatter.result({
  "duration": 70301312,
  "status": "passed"
});
formatter.match({
  "location": "SearchButton.searchButton()"
});
formatter.result({
  "duration": 854048093,
  "status": "passed"
});
formatter.match({
  "location": "Clearpage.Clear()"
});
formatter.result({
  "duration": 49036645,
  "status": "passed"
});
formatter.uri("testng.feature");
formatter.feature({
  "line": 1,
  "name": "To search testng in google",
  "description": "",
  "id": "to-search-testng-in-google",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Testng Google",
  "description": "",
  "id": "to-search-testng-in-google;testng-google",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@TestngScenario"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on google page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I type \"testng\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click search button",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "I clear search textbox",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepage.googlePage()"
});
formatter.result({
  "duration": 8900951,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testng",
      "offset": 8
    }
  ],
  "location": "SearchText.searchText(String)"
});
formatter.result({
  "duration": 80288594,
  "status": "passed"
});
formatter.match({
  "location": "SearchButton.searchButton()"
});
formatter.result({
  "duration": 1079315184,
  "status": "passed"
});
formatter.match({
  "location": "Clearpage.Clear()"
});
formatter.result({
  "duration": 48746769,
  "status": "passed"
});
});