$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumberGoogleSearch.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    }
  ],
  "line": 2,
  "name": "CucumberJavaSearch",
  "description": "",
  "id": "cucumberjavasearch",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Search Functionality",
  "description": "",
  "id": "cucumberjavasearch;search-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@run"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I have open the GooglePage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I search JPMC keyword",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "click first JPMC url ad verfiy logos",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.i_have_open_the_GooglePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.i_search_JPMC_keyword()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepDefinition.click_first_JPMC_url_ad_verfiy_logos()"
});
formatter.result({
  "status": "skipped"
});
});