Feature: Mercury Tours Registration

  Scenario: Successful registration with valid data
    Given the user is on the registration page
    When the user enters the following registration details:
      | firstName | lastName | phone     | email                | address | city    | state  | postalCode | country   | username    | password  | confirmPassword |
      | Sanjay    | Mehara   | 1234567890| sanjay@example.com   | TestSt  | Nainital| Uttarakhand | 263001    | INDIA    | sanjayUser | Pass@123  | Pass@123        |
    And the user submits the registration form
    Then the registration confirmation page should be displayed
