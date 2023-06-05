# 2469. LeetCode's Convert the Temperature - SUPER Simple Python Solution Beats 98% in Memory

## Intuition
To convert a temperature from Celsius to Kelvin and Fahrenheit, we can use the following formulas:

- Kelvin = Celsius + 273.15
- Fahrenheit = Celsius * 1.80 + 32.00

These formulas are based on the definitions of the temperature scales and the relationships between them.

## Approach
We can implement a function that takes a Celsius temperature as input and returns a list of two elements: the corresponding Kelvin and Fahrenheit temperatures. We can use the formulas above to calculate the conversions and round the results to two decimal places.

## Complexity
- Time complexity: $$O(1)$$


- Space complexity: $$O(1)$$

## Code
```
class Solution(object):
    def convertTemperature(self, celsius):
        return [celsius + 273.15, celsius * 1.80 + 32.00]
        """
        :type celsius: float
        :rtype: List[float]
        """
```