@payment
Feature: PAYMENT FEATURE
  As an automation Tester
  I want to check payment process
  So that I can make sure this function work well

  Scenario: [PRE-DATA] - REGISTER
    Given I get login url
    And I click to here link
    When I input to "emailid" textbox with random data "automation@gmail.com"
    And I click to "btnLogin" button
    And I get infor of User ID
    And I get infor of Password
    And I open login page again
    And I intput to UserID textbox
    And I input to Password textbox
    And I click to "btnLogin" button
    Then I verify Homepage displayed with message "Welcome To Manager's Page of Guru99 Bank"

  Scenario Outline: [TC_01] - CREATE NEW CUSTOMER
    Given I open "New Customer" page
    When I input to "name" textbox with data "<CustomerName>"
    And I input to "rad1" radio button with data "<Gender>"
    And I input to "dob" textbox with data "<DateOfBirth>"
    And I input to "addr" textarea with data "<Address>"
    When I input to "city" textbox with data "<City>"
    When I input to "state" textbox with data "<State>"
    When I input to "pinno" textbox with data "<Pin>"
    When I input to "telephoneno" textbox with data "<Phone>"
    When I input to "emailid" textbox with random data "<Email>@gmail.com"
    When I input to "password" textbox with data "<Password>"
    And I click to "sub" button
    And I get infor of Customer ID
    Then I verify created or edited with successfully message "Customer Registered Successfully!!!"
    And I verify expected data at "Customer Name" text in table with actual data "<CustomerName>"
    And I verify expected data at "Birthdate" text in table with actual data "<DateOfBirth>"
    And I verify expected data at "Address" text in table with actual data "<Address>"
    And I verify expected data at "City" text in table with actual data "<City>"
    And I verify expected data at "State" text in table with actual data "<State>"
    And I verify expected data at "Pin" text in table with actual data "<Pin>"
    And I verify expected data at "Mobile No." text in table with actual data "<Phone>"

    Examples: 
      | CustomerName | Gender | DateOfBirth | Address     | City       | State   | Pin    | Phone     | Email      | Password |
      | Auto Test    | f      | 1989-08-16  | 123 Address | Binh Duong | Thu Dau | 123446 | 012345678 | automation | 123456M  |

  Scenario Outline: [TC_02] - CREATE 2 NEW ACCOUNTS
    Given I open "New Account" page
    When I input to Customer ID
    And I select value is "<AccountType>" in dropdown list "selaccount"
    When I input to "inideposit" textbox with data "<DepositAmount>"
    And I click to "button2" button
    Then I verify created or edited with successfully message "Account Generated Successfully!!!"
    And I get infor of first account
    Given I open "New Account" page
    When I input to Customer ID
    And I select value is "<AccountType>" in dropdown list "selaccount"
    When I input to "inideposit" textbox with data "<DepositAmount>"
    And I click to "button2" button
    Then I verify created or edited with successfully message "Account Generated Successfully!!!"
    And I get infor of second account

    Examples: 
      | AccountType | DepositAmount |
      | Current     |         50000 |

  Scenario Outline: [TC_03] - DEPOSIT TO ACCOUNT
    Given I open "Deposit" page
    When I input first account number
    And I input to "ammount" textbox with data "<FirstAmount>"
    And I input to "desc" textbox with data "<DepositDes>"
    And I click to "AccSubmit" button
    Then I verify created or edited with successfully message "Transaction details of Deposit for Account "
    Examples: 
      | FirstAmount | DepositDes         |
      |       50000 | Deposit to Account |
