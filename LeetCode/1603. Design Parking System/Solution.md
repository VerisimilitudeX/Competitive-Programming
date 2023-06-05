# 1603. LeetCode's Design Parking System - EXTREMELY SIMPLE & LOGICAL Java Solution Beats 90%

# Intuition
The problem is to design a parking system that can accommodate different types of cars (big, medium, small) and has a fixed number of slots for each type. The system should be able to check if there is a slot available for a given car type and park the car if possible.

# Approach
One possible approach is to use three variables to store the number of slots for each car type. The constructor of the class should initialize these variables with the given values. The addCar method should check the car type and decrement the corresponding variable if there is a slot available. It should also return true or false depending on whether the car was parked or not.

# Complexity
- Time complexity: $$O(1)$$
- Space complexity:$$O(1)$$

# Code
```java
class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
        if (carType == 1 && big > 0) {
            big -= 1;
            return true;
        } else if (carType == 2 && medium > 0) {
            medium -= 1;
            return true;
        } else if (carType == 3 && small > 0) {
            small -= 1;
            return true;
        } else {
            return false;
        }
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
```