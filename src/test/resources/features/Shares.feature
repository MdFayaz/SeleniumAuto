@create_shares
Feature: Manged Objects: Infrastructure & Data - Shares

@Login_And_Navigate_To_Shares, @sanity_share
Scenario: Navigate to Shares tab

	Given Launch application "https://172.29.161.228/"
    When Login user with "admin" and "admin"
	Then System should allow user to logs in
	Given Default active page should be Dashboard

@sanity_share, @sanity
Scenario: sanity tests for Shares page
	Given Navigate to "Infrastructure & Data"
	Then Select Managed Objects "Shares" tab
	Then Shares view should display
	And Create share button icon should display
	And Apply objective or tier button icon should display
And Create shares button label should display
And Apply Objective or Tier button label should display
And Shares search section should display
And Shares search icon should display
And Shares clear icon should display
And Shares download icon should display
And Shares pagination should display
When Click on Create Shares
Then Create share popover should display
And Create Share name label should display
And Create Share export path label should display
And Create Share export subnet section should display
And Create Share export subnet label should display
And Create Share permissions label should display
And Create Share root squash label should display
And Create Share add subnet link should enabled
When Click on Add Subnet link
Then Add subnet section should display
And Add subnet section ipaddress input should enabled
And Add subnet section ipaddress label should display
And Add subnet section ipaddress helper label should display
And Add subnet section read only radio button should enabled
And Add subnet section read only radio button label should display
And Add subnet section read write radio button should enabled
And Add subnet section read write radio button label should display
And Add subnet section root suqash switch should enabled
And Share quota section share size should enabled
And Share quota section size alert should enabled
When Click on size alert "true"
Then Share quota section size alert should turn on
Then Share quota section size alert should turn off
When Close create share popover
Then Create share popover should close

@add_shares
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
	|share2| /shr2| AutoTier2 |

@create_file
Scenario: Creating random files after mounting the share path

	Given Connect to client "172.29.162.72" with "root" and "Tonian2013"
	And Make a directory "/mnt/share"
	Then Mount the data portal "172.29.162.70" on share "/shr2" with type "nfs"
	When Create random number of files with type ".txt" and number of files "3"
	Given Navigate to "Infrastructure & Data"
	Then Select Managed Objects "Shares" tab
	And Search for share "share2"
	When Click on share "share2"