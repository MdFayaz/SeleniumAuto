Feature: Mobility Page Validations 

@Validate_MobilityPpage
Scenario: Validate Mobility page 

	Given Launch application "https://172.29.161.140/" 
	When Login user with "admin" and "admin" 
	Then System should allow user to logs in 
	And Navigate to "Mobility"