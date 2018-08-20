@dashboard
Feature: Dashboard page validation 

#@validate_landingpage
#Scenario: Validate quickly landing page 

#	Given Launch application "https://172.29.162.35/"
#    When Login user with "admin" and "admin"
#	Then System should allow user to logs in
# 	And Navigate to "Events"
# 	And Navigate to "Tasks"
# 	And Navigate to "Change Password"
# 	And Log Out

@logins, @sanity_dash
Scenario: Validate Dashboard page

 	Given Launch application "https://172.29.162.38/"
    When Login user with "admin" and "admin"
	Then System should allow user to logs in
	Given Default active page should be Dashboard

@dashboard_perf, @sanity_dash, @sanity
Scenario: Validate Dashboard Performance Section
	
	Given Navigate to "Dashboard"
	When Performance section load
	Then Performance title should be "Performance"
	When IOPS section load
	Then IOPS section title should be "IOPS"
	When Bandwidth section load
	Then Bandwidth section title should be "Bandwidth"
	When Metadata OPS section load
	Then Metadata OPS section title should be "Metadata OPS"
	When Open File Performance section load
	Then Open File Performance section title should be "Open File Performance"
	
@dashboard_cap, @sanity_dash, @sanity
Scenario: Validate Dashboard Capacity Section
	
	Given Default active page should be Dashboard
	When Capacity should load
	Then Capacity section title should be "Capacity"
	When Storage section load
	Then Storage section title should be "Storage"
	When Total section load
	Then Total section title should be "Total"
	When Growth section load
	Then Growth section title should be "Growth"
	When Cap section load
	Then Cap section title should be "Capacity"
	
@dashboard_align, @sanity_dash, @sanity
Scenario: Validate Dashboard Alignment Section
	
	Given Default active page should be Dashboard
	When Alignment section load
	Then Alignment section title should be "Alignment"
	When Volume Exceeding Thresholds section load
	Then Volume Exceeding Thresholds section title should be "Volume Exceeding Thresholds"
	When Mobility Bandwidth section load
	Then Mobility Bandwidth section title should be "Mobility Bandwidth"
	When File Alignment section load
	Then File Alignment section title should be "File Alignment"
	When Current Mobility Reasons section load
	Then Current Mobility Reasons section title should be "Current Mobility Reasons"
