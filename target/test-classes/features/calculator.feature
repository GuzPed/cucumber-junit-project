Feature: Calculator should work for simple math
  As a user I should be able to do simple math

 Scenario Outline: Should be able to add 2 numbers
    Given Calculator is open
    When I add <firstNumber> with <secondNumber>
    Then I should get <finalNumber>

    Examples:
   | firstNumber  | secondNumber|finalNumber|
   |2             |3            |5          |
   |8             |9            |17         |
   |12            |8            |20         |
   |15            |10           |25         |
