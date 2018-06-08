@calender
Feature: navigate to my trip 
Scenario Outline: Test depart element
Given enter year '<year>'
When enter month '<month>'
And enter day '<day>'
Then press enter 
Examples:
|year|month|day|
|2019|april|19|