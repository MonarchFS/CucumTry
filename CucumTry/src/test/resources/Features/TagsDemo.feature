@FunctionalTest
Feature: Using Tags in Cucumber

	@SmokeTest
  Scenario: Scenario1
    Given This is scenario1
	
	@SmokeTest
  Scenario: Scenario2
    Given This is scenario2

	@SanityTest
	@SmokeTest
  Scenario: Scenario3
    Given This is scenario3

	@RegressionTest
  Scenario: Scenario4
    Given This is scenario4

  Scenario: Scenario5
    Given This is scenario5

  Scenario: Scenario6
    Given This is scenario6
