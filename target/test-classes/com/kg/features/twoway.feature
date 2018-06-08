@twoway
Feature: navigate to my trip 
Scenario:google search page
Given I am at  mytrip page
When I fill makemytrip
Then I press the enter key
@From
Scenario: Test from element
Given fill the source
When I fill the source
Then I press enter key
@to
Scenario: Test to element
Given fill the destination
When I fill the destination
Then enter key for to element
@depart
Scenario Outline: Test depart element
Given fill year '<year>'
When fill month '<month>'
And fill day '<day>'
Then click enter 
Examples:
|year|month|day|
|2019|april|19|
@return
Scenario: Test return element
Given fill the return
When I fill the return
Then i click 

