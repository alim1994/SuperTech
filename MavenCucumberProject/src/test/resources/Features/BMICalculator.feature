@BMI
Feature: BMI Calculator Functionality
  As a user he wants to Calculater his BMI
	
	@HeightandNoWeight
  Scenario: Height and No Weight
    Given User BMI Calculator Webpage
    When User Enter Height "170"
     And User Enter Weight " "
    And User click Calculate button
    Then User Should get Message "Please enter Weight"
	@NoHeightandWeight
  Scenario: No Height and Weight
    Given User BMI Calculator Webpage
    When User Enter Height " "
    And User Enter Weight "50"
    And User click Calculate button
    Then User Should get Message "Please enter Height"
@CategoryNormal
  Scenario: Category Normal
    Given User BMI Calculator Webpage
    When User Enter Height "170"
    And User Enter Weight "60"
    And User click Calculate button
    Then User will see BMI index "20.8"
    And User will see Category "Normal"
    
@CategoryOverweight
  Scenario: Category Overweight
    Given User BMI Calculator Webpage
    When User Enter Height "170"
    And User Enter Weight "80"
    And User click Calculate button
    Then User will see BMI index "27.7"
    And User will see Category "Overweight"
    
    @CategoryUnderweight
    Scenario: Category Underweight
    Given User BMI Calculator Webpage
    When User Enter Height "170"
    And User Enter Weight "50"
    And User click Calculate button
    Then User will see BMI index "17.3"
    And User will see Category "Underweight"

@CategoryObesity
  Scenario: Category Obesity
    Given User BMI Calculator Webpage
    When User Enter Height "170"
    And User Enter Weight "90"
    And User click Calculate button
    Then User will see BMI index "31.1"
    And User will see Category "Obesity"
