class Solution(object):
    def convertTemperature(self, celsius):
        return [celsius + 273.15, celsius * 1.80 + 32.00]
        """
        :type celsius: float
        :rtype: List[float]
        """