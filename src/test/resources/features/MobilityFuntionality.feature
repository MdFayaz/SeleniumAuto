@Mobility_fun
Feature: Test Mobility functionality

Scenario: Login to UI
 	Given Launch application "https://172.29.162.186/"
    When Login user with "admin" and "admin"
	Then System should allow user to logs in
	Given Default active page should be Dashboard

Scenario Outline: Add Storage System

	Given Navigate to "Infrastructure & Data"
	Then Select Managed Objects "Storage Systems" tab
	When Click on Add Storage System
	Then Add Storage System popover should display
	And Add Storage System with name "<name>" 
	And Add Storage System with type "<vendor>"
	Given IP Address "<ipAddress>"
	Given User "<user>"
	Given Password "<password>"
	And  Add Storage System
	Then Storage system should added with below details
	| Name | vendor |
	| NetAppCmode | NetApp C-Mode|
	
	Examples:
	|name | vendor|ipAddress | user | password |
	|NetAppCmode|c-mode|172.29.104.20|admin|netapp123|
	
Scenario Outline: Adding volume to a storage system

	Given Navigate to "Infrastructure & Data"
	Then Select Managed Objects "Storage Systems" tab
	And Search storage system table "NetAppCmode"
	When Click on Volume button "NetAppCmode"
	Then Add Volume Popover should display
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
	|No|65%|

Scenario Outline: Creating a Tier

	Given Navigate to "Objectives & Tiers"
	Then Select Objectives and Tiers "Tiers" tab
	When Click on Create Tier Button
	Given Enter Tier Name "<tierName>"
	Given Enter Tier Description "<Description>"
	When Click on Get Started Next Step button
	Given Select on Place On Storage
	Given Search Place On Storage "<storageName>"
	And Search Place On Storage Volume "<volName>"
	Then Check the place on Storage System
	And Click on save selection button
	When Click on Placement Next Step button
	Given Set performance read bandwidth "<readBandwidth>"
	Given Set performance read iops "<readIOPS>"
	Given Set performance read latency "<readLatencty>"
	Given Set performance write bandwidth "<writeBandiwth>"
	Given Set performance write iops "<writeIOPS>"
	Given Set performance write latency "<writeLatency>"
	When Click on Performance Next Step button
	When Click on Protection Next Step button
	When Click on Save Tier button
	
	Examples:
	|tierName | Description  | storageName|volName|readBandwidth| readIOPS| readLatencty| writeBandiwth | writeIOPS | writeLatency|
	|AutoTier1|Desc for tier1|  all|pd_export0|10 	|   20	  |     30	    |     12		|	13		|		150	  |
	|AutoTier2|Desc for tier2|  NetAppCmode|fayaz_vol1|25	|   15	  |     35		|     15	    |   35	    |       120   |

Scenario Outline: Create an objective

	Then Select Objectives and Tiers "Objectives" tab
	When Click on Create Objective Button
	Given Enter Objective Name "<objectiveName>"
	Given Enter Objective Description "<objDescription>"
	When Click on Name tab Next Step button
	When Select If attribute as "<attribute>"
	And Select If comparator "<comparator>"
	And Enter if attribute value "<attriValue>"
	And Click on Add Statement button
	Then If statement is added
	And Set activity tier value to "<tierName>"
	When Click on Define Rules tab Next Step button
	When Click on Review tab Save Objective button
	
	Examples:
	|objectiveName | objDescription | attribute | comparator | attriValue | tierName |
	|AutoObjective1| AutoObjectiveDescription| File Name| is | *.txt | AutoTier2 |			

Scenario Outline: Add Shares

	Given Navigate to "Infrastructure & Data"
	Then Select Managed Objects "Shares" tab
	When Click on Create Shares
	Given Create share with name "<name>"
	And Create share with export path "<exportPath>"
	And Create share with Applied Objective or Tier "<appliedObjOrTier>"
	Then Click on Create Share Button
	
	Examples:
	|name | exportPath |appliedObjOrTier|
	|share| /shr| AutoObjective1 |
	
Scenario: Creating random files after mounting the share path

	Given Connect to client "172.29.162.195" with "root" and "Tonian2013"
	And Make a directory "/mnt/share"
	Then Mount the data portal "172.29.162.193" on share "/shr" with type "nfs"
	When Create a file with name "Automation"
	Given Navigate to "Infrastructure & Data"
	Then Select Managed Objects "Shares" tab
	And Search for share "share"
	When Click on share "share"
