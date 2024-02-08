@1mgTest

Feature: 1mg application test feature functionality

Description: In order to 1mg application functionality  works,I want to run the cucumber test to verify it is working

Background: 
    When user opens the browser
    Then Home page should be displayed

@Scenario1
Scenario: to test the mobile functionality

When user  enters location box
Then entered location page should be displayed
When user search for medicine in the serach box
Then searched medicine page should be displayed
Then check the delivery date is today
When user  click  on add item to the cart
Then cart page should be displayed
And user should delete  item from the cart
Then deleted cart page should be displayed
Then user should match product details with excel sheet














