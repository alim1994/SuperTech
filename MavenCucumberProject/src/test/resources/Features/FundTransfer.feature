
@FundTransfer
Feature: Fund Transfer functionality
  As a user he wants to transfer fund to his family or friends
  
  @validpayeeandNoamount
  Scenario: valid payee and No amount
  Given User is on fund transfer webpage
  When User select payee "Jim" 
  And User enter amount " "
  And User click on transfer button
  Then User should check balance "5000.00"
  And User should get message "Please enter a valid amount"
  @validpayeeandValidamount
  Scenario: valid payee and valid amount
  Given User is on fund transfer webpage
  When User select payee "Jim" 
  And User enter amount "2000"
  And User click on transfer button
  Then User should check balance "3000.00"
  And User should get message "$2000 transferred successfully to Jim!!"
  
  @validpayeeandInvalidamount
  Scenario: valid payee and Invalid amount
  Given User is on fund transfer webpage
  When User select payee "Tim" 
  And User enter amount "7000"
  And User click on transfer button
  Then User should check balance "5000.00"
  And User should get message "Transfer failed!! account cannot be overdrawn"
  @InvalidpayeeandValidamount
  Scenario: Invalid payee and valid amount
  Given User is on fund transfer webpage
  When User select payee "John" 
  And User enter amount "2000"
  And User click on transfer button
  Then User should check balance "5000.00"
  And User should get message "Transfer failed!! 'John' is not approved. Please contact your branch"
