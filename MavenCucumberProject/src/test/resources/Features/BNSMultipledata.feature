@BNSMultipleData
Feature: Fill up BNS Login  form
  As a user he wants fill up bns Login form

  Scenario Outline: Fill up bns Login form
    Given User is on BNS login form page
    When User Enter firstname "<FirstName>"  lastname "<LastName>" email "<Email>" password "<Password>" phone number "<PhoneNumber>"
    And User Select month "<Month>" day "<Day>" year "<Year>"
    And User will Click on "<Gender>" radio button
    And User will Click submit button
    Then User should see "<Message>"

    Examples: 
      | FirstName | LastName  | Email             | Password | PhoneNumber  | Month | Day | Year | Gender | Message             |
      | Mashurul  | Alim      | alim123@gamil.com | alim123  | 203-685-0716 | Jan   |  12 | 2003 | Male   | Submitted Form Data |
      | Parveen   | Sultana   | parveen@gmail.com | par4532  | 356-453-9099 | May   |  10 | 2002 | Female | Submitted Form Data |
      | Anwar     | Hossain   | anwar@yahoo.com   | anw3456  | 769-266-5221 | Feb   |  19 | 2003 | Male   | Submitted Form Data |
      | Ataur     | Tarafder  | ata@yahoo.com     | der45    | 347-444-2890 | Jun   |  20 | 2001 | Male   | Submitted Form Data |
      | Farhana   | Zaman     | farhana@gmail.com | far4532  | 356-453-9098 | May   |  30 | 2006 | Female | Submitted Form Data |
      | Jamal     | Chowdhury | jamal@yahoo.com   | jaml456  | 769-266-5224 | Feb   |  19 | 2004 | Male   | Submitted Form Data |
