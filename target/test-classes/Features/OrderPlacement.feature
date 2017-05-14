@Version2
Feature: Verifying the functionality of order placement

Scenario: Verifying successful order placement
Given I launched online store home page
When I click on Women Category
And I sort the items by price lowest to highest
And I select the lowest price item to cart
And I click Proceed to checkout
When I enter "<EmailId>","<Pwd>"
And I click on SignIn button
And I confirm the address and proceed to checkout
And I accept terms and proceed to checkout
Then I select payment method
Then I confirm my order
Then I can see completed order placement