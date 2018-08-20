Feature: Datasphere Smoke feature file

@login_invalid_scenario, @smoke
  Scenario Outline: Launch Application with invalid user
    Given Launch application "https://172.29.161.220/"
    Then Page title should be "Primary Data | DataSphere"
    When Login user with "<username>" and "<password>"
    Then System should not allow user to logs in
    And Invalid credentials warning dialog should display with title "Unable to log in"
    Then Closing warning popup with "<closeUsing>" should close dialog

    Examples: 
      | username     | password        | closeUsing |
      | wrongAdmin   | wrongPassword   | closeIcon  |
      | invalidAdmin | invalidPassword | okButton   |

@login_valid_scenario, @smoke
  Scenario: Launch Application with valid user
  	Given Launch application "https://172.29.161.220/"
    When Login user with "admin" and "admin"
    Then System should allow user to logs in
    And By default dashboard page should display
    
@logout
Scenario: Logout the user
	Given Navigate to "User"
	And Click on "Log Out" button