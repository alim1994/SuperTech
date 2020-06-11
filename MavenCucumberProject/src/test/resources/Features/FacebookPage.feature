Feature: SignUp Facebook Page
As a User He Want to signup his Facebook Page

Scenario: Signup Facebook Page
Given User is on Facebook webpage
When User enter firstname "mashurul"  lastname "alim" email "mashurul@gmail.com" Re enter email "mashurul@gmail.com" password "alim123" 
And User Chose month "Jan" day "7" year "1994"
And User select on male radio button
And User will click SignUp button
Then User Will see his Facebook account
