$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("dropdown.feature");
formatter.feature({
  "line": 2,
  "name": "check dropdown functionality",
  "description": "",
  "id": "check-dropdown-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@dropdown"
    }
  ]
});
formatter.scenario({
  "line": 4,
  "name": "Test the html page",
  "description": "",
  "id": "check-dropdown-functionality;test-the-html-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am at  sample html page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I select menus from dropdown",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I press exit",
  "keyword": "Then "
});
formatter.match({
  "location": "dropdown.i_am_at_sample_html_page()"
});
formatter.result({
  "duration": 22044353024,
  "status": "passed"
});
formatter.match({
  "location": "dropdown.i_select_menus_from_dropdown()"
});
formatter.result({
  "duration": 8733634299,
  "status": "passed"
});
formatter.match({
  "location": "dropdown.i_press_exit()"
});
formatter.result({
  "duration": 146482,
  "status": "passed"
});
});