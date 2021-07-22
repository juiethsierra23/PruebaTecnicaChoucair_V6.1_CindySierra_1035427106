@stories
Feature: Academy Choucair
  As a user, i want to learn how to automate in screamplay at the choucair Academy with the automation course
  @scenario1
  Scenario: search  for a automation course
   Given than Cindy wants to learn automation at the academy Choucair
    |strUser|strPassword|
    |1035427106|Choucair2021*|
   When she search for the course Recursos Automatizacion Bancolombia on the Chaucair academy platform
    |strCourse|
    |Recursos Automatizacion Bancolombia|
   Then she finds the course called recursos Automatizacion Bancolombia
    |strCourse|
    |Recursos Automatizacion Bancolombia|
