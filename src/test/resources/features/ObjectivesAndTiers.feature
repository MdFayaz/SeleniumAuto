@create_smart_objective
Feature: Objectives And Tiers Page Validations 

@Login_And_Navigate_To_Objectives_And_Tiers_Page, @sanity_oat
Scenario: Validate Objectives And Tiers page 

	Given Launch application "https://172.29.161.122/"
	When Login user with "admin" and "admin"
	Then System should allow user to logs in
	Given Default active page should be Dashboard
	
@sanity_oat,@sanity
Scenario Outline: Run sanity for Objectives
	And Navigate to "Objectives & Tiers"
	Then Select Objectives and Tiers "Objectives" tab
	And Objective page should load
	And Active objectives section display
	And Active table maginifier display
	And Active table search input display
	And Active table clear search display
	And Active table download button display
	And Active table display
	And Inactive table pagination display
	And Inactive objectives section display
	And Inactive table maginifier display
	And Inactive table search input display
	And Inactive table clear search display
	And Inactive table download button display
	And Inactive table display
	And Inactive table pagination display
	When Click on Create Objective Button
	And Create new objective title should display
	And Name tab instruction should display
	And Name tab Select label should display
	And Name tab Name label should display
	And Name tab Description label should display
	And Name tab Choose Existing label should not display
	And Select Copy and Edit Existing radio button
	And Name tab Choose Existing label should display
	And Select Create New radio button
	And Name tab Choose Existing label should not display
	Given Enter Objective Name "<objectiveName>"
	Given Enter Objective Description "<objDescription>"
	When Click on Name tab Next Step button
	And Define rules basic view should display
	And Define rules header should display
	And Basic button should display
	And Advanced button should display
	And If section should display
	And Activity Range section should display
	And Additional Rules button should display
	When Click on Advanced button
	And Advanced view should display
	And Advanced view instruction should display
	And Advanced view text area should display
	And Advanced view text area error should display
	And Advanced view Cancel and Revert to Basic Editor should display
	When Click on Cancel and Revert to Basic Editor button
	And Define rules basic view should display
	When Select If attribute as "<attribute>"
	And Select If comparator "<comparator>"
	And Enter if attribute value "<attriValue>"
	And Click on Add Statement button
	Then If statement is added
	And Set activity tier value to "<tierName>"
	When Click on Add Activity Range
	And Remove a tier "default-objective"
	When Click on Define Rules tab Next Step button
	And Review tab section display
	And Review tab Name section display 
	And Review tab Name edit icon display 
	And Review tab Description section display 
	And Review tab Description edit icon display 
	And Review tab Rules section display 
	And Review tab Rules edit icon display 
	And Review tab Rules delete icon display 
	And Review tab Cancel Objective button display 
	When Click on Review tab Cancel Objective button
	And Objective page should load
		
	Examples:
	|objectiveName | objDescription | attribute | comparator | attriValue | tierName |
	|AutoObjective0| AutoObjectiveDescription| File Name| is | *.txt | default-objective|	
	

@sanity_oat,@sanity
Scenario: Run sanity for Tiers
	Then Select Objectives and Tiers "Tiers" tab
	And Tiers section should load
	And Tiers table maginifier display
	And Tiers table search input display
	And Tiers table clear search display
	And Tiers table download button display
	And Tiers table display
	And Tiers table pagination display
	When Click on Create Tier Button
	Then Get Started tab view should load
	And Create New Tier title should display
	And Create New Tier instruction should display
	Then Get Started select section should load
	And Get Started select section should load
	And Get Started name section should load
	And Get Started description section should load
	And Get Started cost section should load
	Given Enter Tier Name "smokeTier"
	Given Enter Tier Description "Tier should not get create"
	When Click on Copy And Edit Existing tier radio button
	Then Copy and edit choose existing dropdown display
	When Click on Create New Tier radio button
	Then Copy and edit choose existing dropdown wont display
	When Click on Create New Tier radio button
	When Click on Get Started Next Step button
	Then Create new tier Placement tab view display
	And Create new tier Placement tab header fields display
	And Create new tier Placement tab header instruction display
	And Create new tier Placement tab do not move display
	And Create new tier Placement tab optimze for capacity display
	And Create new tier Placement tab confine data to section display
	And Create new tier Placement tab confine data to section title display
	And Create new tier Placement tab confine data to section subtitle display
	And Create new tier Placement tab confine data to empty section display
	And Create new tier Placement tab confine data to empty section add icon display
	And Create new tier Placement tab place data to section display
	And Create new tier Placement tab place data to section title display
	And Create new tier Placement tab place data to section subtitle display
	And Create new tier Placement tab place data to empty section display
	And Create new tier Placement tab place data to empty section add icon display
	When Skip the Placement Section
	Then Create new tier Performance tab view display
	And Create new tier Performance tab header display
	And Create new tier Performance tab read bandwidth display
	And Create new tier Performance tab read iops display
	And Create new tier Performance tab read latency display
	And Create new tier Performance tab write bandwidth display
	And Create new tier Performance tab write iops display
	And Create new tier Performance tab write latency display
	When Click on Performance Next Step button
	Then Create new tier Protection tab view display
	And Create new tier Current Selections section display
	And Create new tier Protection tab header display
	Then Create new tier Protection tab Durability section display
	And Create new tier Protection tab Durability label display
	Then Create new tier Protection tab Availability section display
	And Create new tier Protection tab Availability label display
	Then Create new tier Protection tab Priority section display
	And Create new tier Protection tab Priority label display
	Then Create new tier Protection tab Online Delay section display
	And Create new tier Protection tab Online Delay label display
	And Create new tier Current Selections section display
	And Create new tier Protection tab Forever radio button enabled
	And Create new tier Protection tab Hours radio button enabled
	And Create new tier Protection tab Minutes radio button enabled
	And Create new tier Protection tab Seconds radio button enabled
	And Create new tier Protection tab Online Delay radio button enabled
	When Skip the Protection Section
	And Create new tier preview should display
	And Create new tier Current Selections section display
	And Create new tier Preview tab header display
	And Create new tier preview tab name section should display
	And Create new tier preview tab performance section should display
	And Create new tier preview tab protection section should display
	And Create new tier preview tab confine to section should display
	And Create new tier preview tab confine to edit button should enabled
	And Create new tier preview tab place on edit button should enabled
	And Create new tier preview tab cancel button enabled
	When Click on preview cancel button
	And Tiers section should load
	
@sanity_oat,@sanity
Scenario: Run sanity for Data Profilers
	Then Select Objectives and Tiers "Data Profiler" tab
	And Refresh button should exist
	And Share dropdown should exist
	And Data dropdown should exist
	And Cost Input should exist
	And Baseline dropdown should exist
	And Savings dollar value should exist
	And Savings percent value should exist
	And Instruction to Selecting share icon should exist
	When Select data profilers share "max_dses_and_dps_share"
	Then Data Profiler section should display
	And Add Tier section Files button should exist
	And Add Tier section Capacity button should exist
	And Add Tier section Cost button should exist
	And Slider to add tier should exist
	And One Histogram chart should exist by default

@Create_A_Tier
Scenario Outline: Creating a Tier

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
	|tierName | Description  |storageName|volName| readBandwidth| readIOPS| readLatencty| writeBandiwth | writeIOPS | writeLatency|
	|AutoTier1|Desc for tier1| all|pd_export0| 10 	|   20	  |     30	    |     12		|	13		|		150	  |
	|AutoTier2|Desc for tier2| NetAppCmode|fayaz_vol1| 25	|   15	  |     35		|     15	    |   35	    |       120   |
    
@Create_An_Objective
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
	When Click on Add Activity Range
	And Set activity tier value to "<tierName>"
	When Click on Define Rules tab Next Step button
	And Review tab section display
	And Review tab Name section display 
	And Review tab Name edit icon display 
	And Review tab Description section display 
	And Review tab Description edit icon display 
	And Review tab Rules section display 
	And Review tab Rules edit icon display 
	And Review tab Rules delete icon display 
	And Review tab Cancel Objective button display 
	When Click on Review tab Save Objective button
	
	
	Examples:
	|objectiveName | objDescription | attribute | comparator | attriValue | tierName |
	|AutoObjective0| AutoObjectiveDescription| File Name| is | *.txt | test0|		