class Solution {
 public int finalValueAfterOperations(String[] operations) {
 int x = 0;
 int size = operations.length; // store the size of the array
 for (int i = 0; i < size; i++) { // use the size variable
 String operation = operations[i]; // store the operation in a variable
 switch (operation) { // use switch statement
 case "++X":
 case "X++":
 x++;
 break;
 case "--X":
 case "X--":
 x--;
 break;
 }
 }
 return x;
 }
}
