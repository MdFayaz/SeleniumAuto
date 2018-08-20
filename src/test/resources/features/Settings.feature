Feature: Settings Page Validations 

@validate_SettingsPage 
Scenario: Validate Settings page 

	Given Launch application "https://172.29.161.228/" 
	When Login user with "admin" and "admin" 
	Then System should allow user to logs in 
	And Navigate to "Administration"