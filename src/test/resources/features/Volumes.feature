Feature: Infrastrucutre & Data: Volumes Groups

@Login_To_Volumes
Scenario: Validate Objectives And Tiers page 

	Given Launch application "https://172.29.160.20/" 
	When Login user with "admin" and "admin" 
	Then System should allow user to logs in
	

@add_volume
Scenario Outline: Add Volumes
	Given Navigate to "Infrastructure & Data"
	Then Select Managed Objects "Volumes" tab
	When Click on Add Volumes
	Then Add Volume Popover should display
	And Search for Storage System "NetAppCmode"
	And Browse for volumes
	And Search and Select for volume "fayaz_vol1"
	And Click on Next Step button on Selections
	Then Select Assimilate Data to "<assmilateData>"
	And Click on Next Step button on Assimilate Data
	Then Manage Capacity threshold to "<mobilityPercentage>"
	And Click on Next Step button on Manage Capacity
	And Click on Add Volumes button
	Then Validate Added Volume
	
	Examples:
	|assimilateData|mobilityPercentage|
	|No|75%|