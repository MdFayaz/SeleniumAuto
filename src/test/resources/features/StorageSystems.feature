@storage_systems
Feature: Storage Systems

@login_to_storage_systems, @sanity_storage_systems
Scenario: Validate Dashboard page

 	Given Launch application "https://172.29.161.122/"
    When Login user with "admin" and "admin"
	Then System should allow user to logs in
	Given Default active page should be Dashboard

@sanity_storage_systems, @sanity
Scenario: Run sanity for Stroage Systems
	Given Navigate to "Infrastructure & Data"
	Then Select Managed Objects "Storage Systems" tab
    Then Storage System view should display
	And Add Storage System icon should display
	And Add Storage System header should display
	And Storage System search icon should display
	And Storage System clear icon should display
	And Storage System download icon should display
	When Click on Add Storage System
	Then Add Storage System popover should display
	And Add storage system popover title
	And Add storage system name label display
	And Add storage system name textfield display
	And Add storage system type label display
	And Add storage system type dropdown display
	And Add Storage System with type "EMC Isilon"
	And Add storage system ip address label display
	And Add storage system ip address textfield display
	And Add storage system user label display
	And Add storage system user textfield display
	And Add storage system password label display
	And Add storage system password textfield display
	And Add storage system snmp label display
	And Add storage system snmp textfield display
	And Add Storage System with type "NetApp 7-Mode"
	And Add storage system ip address label display
	And Add storage system ip address textfield display
	And Add storage system user label display
	And Add storage system user textfield display
	And Add storage system password label display
	And Add storage system password textfield display
	And Add Storage System with type "NetApp C-Mode"
	And Add storage system ip address label display
	And Add storage system ip address textfield display
	And Add storage system user label display
	And Add storage system user textfield display
	And Add storage system password label display
	And Add storage system password textfield display
	And Add Storage System with type "Other"
	And Add storage system ip address label display
	And Add storage system ip address textfield display
	And Add storage system description label display
	And Add storage system description textfield display
	And Add Storage System with type "S3"
	And Add storage system access key label display
	And Add storage system access key textfield display
	And Add storage system secret key label display
	And Add storage system secret key textfield display
	And Add storage system endpoint label display
	And Add storage system endpoint dropdown display
	And Add storage system proxy host label display
	And Add storage system proxy host textfield display
	And Add storage system proxy port label display
	And Add storage system proxy port textfield display
	When Close Add Storage System popover
	Then Add Storage System popover should not display

@add_storage_system
Scenario Outline: Add Storage System
	When Click on Add Storage System
	Then Add Storage System popover should display
	And Add Storage System with name "<name>" 
	And Add Storage System with type "<vendor>"
	Given IP Address "<ipAddress>"
	Given User "<user>"
	Given Password "<password>"
	Given SNMP "<snmp>"
	Given Description "<description>"
	Given Access Key "<Access Key>"
	Given Secret Key "<secret key>"
	Given Endpoint "<Endpoint>"
	Given Proxy Host "<Proxy Host>"
	Given Proxy Port "<Proxy Port>"
	And  Add Storage System
	Then Storage system should added with below details
	| Name | vendor |
	| NetAppCmode | NetApp C-Mode|
	
	Examples:
	|name | vendor|ipAddress | user | password |
	|NetAppCmode|c-mode|172.29.104.20|admin|netapp123|
	
@add_volume_to_storage
Scenario Outline: Adding volume to a storage system

	Given Navigate to "Infrastructure & Data"
	Then Select Managed Objects "Storage Systems" tab
	And Search storage system table "NetAppCmode"
	When Click on Volume button "NetAppCmode"
	Then Add Volume Popover should display
	And Search and Select for volume "fayaz_vol1"
	And Click on Next Step button on Selections
	Then Select Assimilate Data to "<assimilateData>"
	And Click on Next Step button on Assimilate Data
	Then Manage Capacity threshold to "<mobilityPercentage>"
	And Click on Next Step button on Manage Capacity
	And Click on Add Volumes button
	Then Validate Added Volume
	
	Examples:
	|assimilateData|mobilityPercentage|
	|No|65%|
	
@add_volume_to_storage_with_assimilate
Scenario Outline: Adding volume to a storage system

	Given Navigate to "Infrastructure & Data"
	Then Select Managed Objects "Storage Systems" tab
	And Search storage system table "NetAppCmode"
	When Click on Volume button "NetAppCmode"
	Then Add Volume Popover should display
	And Search and Select for volume "fayaz_vol3"
	And Click on Next Step button on Selections
	Then Select Assimilate Data to "<assimilateData>"
	And Confirm Assimilate "Assimilate"
	Then Add to share link should display
	When Click on Add to Share link
	Then Add To Existing Share section should display
	When Select an existing share "share"
	And Type share path "/shr"
	And Click on Add to Existing Share save button
	And Click on Next Step button on Assimilate Data
	Then Manage Capacity threshold to "<mobilityPercentage>"
	And Click on Next Step button on Manage Capacity
	And Click on Add Volumes button
	Then Validate Added Volume
	
	Examples:
	|assimilateData|mobilityPercentage|
	|Yes|65%|