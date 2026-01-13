#language: en
@newsletter @tr
Feature: Je Souhaite Tester le boutton subscribe de l'application Web Demo Shop

@newsletter_validCredentials
Scenario: Je Souhaite Tester le boutton subscribe avec un email valide

Given Je me connecte sur le site Web Demo Shop
When Je saisis une adresse mail valide
And Je clique sur le bouton subscribe
Then il s affiche le message  "Thank you for signing up! A verification email has been sent. We appreciate your interest." 