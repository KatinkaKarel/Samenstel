Feature: vullen formulieren
  As a user
  I want to login to Caseware Samenstel
  And open a project
  And fill out the form
  So that I can evaluate the form

  @Openen_Samenstel
  Scenario Outline: Openen Zorg
  
    Given I want to login with browser <Browser>
    When I type username "katinka.karel@caseware.nl" and password "WelkomKatinka01"
    And Select the Samenstellen module
    And open the Project "test2"
    
     Examples: 
      | Id | Browser  |
      |  1 | "Chrome" |

     @Importeren_Jaarrekening 
  Scenario Outline: Openen Samenstel
  
    Given I want to login with browser <Browser>
    When I type username "katinka.karel@caseware.nl" and password "WelkomKatinka01"
    And Select the module Samenstellen
    And Create a new Samenstellenfile
  	And Importeer saldibalans
  	And Sluit browser
		 
     Examples: 
      | Id | Browser  |
      |  1 | "Chrome" |
 

@TEST_Samenstellen 
  Scenario Outline: Openen Zorg
  
    Given I want to login with browser <Browser>
    When I type username "katinka.karel@caseware.nl" and password "WelkomKatinka01"
    And Select the module Samenstellen
    And Create a new Samenstellen file 
    And in entity nameentity "Katinka"
    And with name nameproject "Kat+date"
    #And open the Project "katimka"
    #And Importeer saldibalans
   	And Sluit browser
		       
     Examples: 
      | Id | Browser  |
      |  1 | "Chrome" |
        
 
        