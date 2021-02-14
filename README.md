## PlanitTesting

## Requirements
Application URL: http://jupiter.cloud.planittesting.com

## Test Cases
### Test case 1:
1. From the home page go to contact page
2. Click submit button
3. Validate errors
4. Populate mandatory fields
5. Validate errors are gone

### Test case 2:
1. From the home page go to contact page
2. Populate mandatory fields
3. Click submit button
4. Validate successful submission message 

### Test case 3: 
1. From the home page go to contact page
2. Populate mandatory fields with invalid data
3. Validate errors

### Test case 4:
1. From the home page go to shop page
2. Click buy button 2 times on “Funny Cow”
3. Click buy button 1 time on “Fluffy Bunny”
4. Click the cart menu
5. Verify the items are in the cart

## Structure:
Test Scenarios are created in BDD Cucumber framework with Page Object Model using Java language.

## Assumptions:
1) As Forename and Message fields are taking every value as a valid value and hence assumption is made to keep them empty to generate the error for invalid values.
2) It has been assumed that automation is to be carried out with respect to written test cases as detailed requirements are not available.

## Bugs found
1) In Email field, if entered data is not in format of email address as '*@*.com' and if user clicks on submit button then feedback gets submitted. Given rest all mandatory fields are entered with some value.
2) If space is entered in forname and message field and email field contains any valid or invalid data and when user clicks on submit button, then also feedback gets submitted.
