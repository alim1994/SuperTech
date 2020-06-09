
@BNS
Feature: Fill up BNS registration form 
As a user he wants fill up bns registration form

@BNSPage
Scenario: Fill up bns registration form
Given User is on BNS login form webpage
When User enter firstname "Alim"  lastname "mashurul" email "mashurul@gmail.com" password "alim123" phone number "2036850716"
And User select month "Jan" day "3" year "2003"
And User will click on male radio button
And User will click submit button
Then User should verify message "Submitted Form Data"
