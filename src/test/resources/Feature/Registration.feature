Feature: to test registration functionality
   Scenario: Successful registration with valid details
    Given the user is on the registration page
    When the user enters name "Sanjay Singh Mehara"
    And the user enters email "mehrasanjay619@gmail.com"
    And the user selects gender "Male"
    And the user enters mobile number "0000000000"
    And the user enters date of birth "15-07-2001"
    And the user selects hobbies "Football,Singing"
    And the user enters subjects "Maths,Computer Science"
    And the user uploads file "C:\Users\my pc\OneDrive\Desktop\Aadhar.pdf"
    And the user enters current address "Nainital, Uttarakhand"
    And the user selects state "NCR"
    And the user selects city "Agra"
    And the user submits the registration form
    Then the registration should be successful