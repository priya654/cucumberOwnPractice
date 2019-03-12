@DEM-3
Feature: 

	#Successful Login with Valid Credentials
	@DEM-1 @DEM-2
	Scenario: Successfull Login
		Successful Login with Valid Credentials
			Given User is on Home Page
			When User Navigate to LogIn Page
			And User enters UserName and Password
			Then Message displayed Login Successfully        
				
  #Successful LogOut
	@DEM-5 @DEM-2
	Scenario: Successful LogOut
		When User LogOut from the Application
		Then Message displayed LogOut Successfully   