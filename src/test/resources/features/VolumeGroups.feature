@create_volume_groups
Feature: Manged Objects: Infrastructure & Data - Volume Groups

Scenario: Login_To_Navigate_Volume_Groups
	Given Launch application "https://172.29.162.186/"
    When Login user with "admin" and "admin"
	Then System should allow user to logs in
	Given Default active page should be Dashboard
	
Scenario: Navigate to Volume Groups

	Given Navigate to "Infrastructure & Data"
	Then Select Managed Objects "Volume Groups" tab