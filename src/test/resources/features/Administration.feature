Feature: Aministration Page Validations 

@validate_AdminPage, @admin_sanity, @sanity
Scenario: Validate Administration page 

	Given Launch application "https://172.29.162.38/" 
	When Login user with "admin" and "admin" 
	Then System should allow user to logs in 
	
@admin_sanity, @sanity
Scenario: sanity tests for Administration - System tab 
    And Navigate to "Administration" 
	When Click on System tab 
	Then System tab should active 
	And System view loads 
	And System tab cluster information title 
	And System tab primary node information title 
	
@admin_sanity, @sanity
Scenario: Sanity tests for Administration - Services tab 
	When Click on Services tab 
	Then Services tab should active 
	And Services view loads 
	And Services search section should display 
	And Services search icon should loads 
	And Services clear icon should display 
	And Services table pagination should display 
	
@admin_sanity, @sanity
Scenario: Sanity tests for Administration - Network tab 
	When Click on Network tab 
	Then Network tab should active 
	And Network view loads 
	And Network table pagination should display 
	
@admin_sanity, @sanity
Scenario: Sanity tests for Administration - SNMP tab 
	When Click on SNMP tab 
	Then SNMP tab should active 
	And SNMP view loads 
	And SNMP header section should display 
	And SNMP title should display 
	And SNMP disabled by default 
	And SNMP download button enabled 
	And SNMP download text should display 
	When Click on SNMP checkbox "true" 
	Then SNMP should enabled 
	When Click on SNMP checkbox "false" 
	Then SNMP should disabled 
	
	
	And SNMP managers section should display 
	And SNMP mangers section title should display 
	And SNMP managers section subnet details should display 
	And SNMP managers section version details should display 
	And SNMP managers section community should display 
	And SNMP managers delete link should enabled 
	And SNMP managers add manager link should enabled 
	
	
	And SNMP trap destination section should display 
	And SNMP trap destination section title should display 
	And SNMP trap destination section IP address details should display 
	And SNMP trap destination section version details should display 
	And SNMP trap destination section community should display 
	And SNMP trap destination delete link should enabled 
	And SNMP trap destination add destination link should enabled 
	
	
	And SNMP system details section should display 
	And SNMP system details section title should display 
	And SNMP system details contact name details should display 
	And SNMP system details contact email details should display 
	And SNMP system details description details should display 
	And SNMP system details location address details should display 
	
	And SNMP Save button should enabled 
	
@admin_sanity, @sanity
Scenario: Sanity tests for Administration - Software Update tab 
	When Click on Software Update tab 
	Then Software update tab should active 
	And Software update view loads 
	And Software Packages section should display 
	And Software Packages section title should display 
	And Software Packages upload button should enabled 
	And Software Packages cancel button should enabled 
	And Software Packages table should display 
	And Software Packages table pagination should display 
	And Software Nodes section should display 
	And Software Nodes section title should display 
	And Software Node update all button should disabled 
	And Software Nodes table should display 
	And Software Nodes table pagination should display 
	
@admin_sanity, @sanity
Scenario: Sanity tests for Administration - Support tab 
	When Click on Support tab 
	Then Support update tab should active 
	And Support update view loads 
	And Support update send section should loads 
	And Support tab send section title should display 
	And Support tab send section sub title should display 
	And Support update send button should enabled 
	And Support update download section should loads 
	And Support tab download section title should display 
	And Support tab download section sub title should display 
	And Support update download button should enabled 
	
@admin_sanity, @sanity 
Scenario: Sanity tests for Administration - Active Directory tab 
	When Click on Active Directory tab 
	Then Active directory tab should active 
	And Active directory tab view loads 
	And Active directory title should display 
	And Active directory domain label should display 
	And Active directory domain input enabled 
	And Active directory organizational unit label should display 
	And Active directory organizational unit helper text should display 
	And Active directory organizational unit input enabled 
	And Active directory organizational unit icon displayed 
	And Active directory login label should display 
	And Active directory login input enabled 
	And Active directory password label should display 
	And Active directory password input enabled 
	And Active directory join button enabled 
	
@admin_sanity, @sanity 
Scenario: Sanity tests for Administration - Users tab 
	When Click on Users tab 
	Then Users tab should active 
	And Users tab view loads 
	And Create user icon should display 
	And Create user label should display 
	And Create user search section should display 
	And Create user search icon should display 
	And Create user search clear icon should display 
	And Create users table download icon should display 
	And Create users table pagination should display