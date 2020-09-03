#Author: xyz@your.domain.com
Feature: CucumberJavaSearch

  @googlesearch
  Scenario Outline: Search Functionality
    Given I have open the GooglePage
    When I search JPMC word "<searchdata>"
    Then click first JPMC url ad verfiy logo
    
    Examples:
    |searchdata      |
    |J.P.Morgan Chase|
   
