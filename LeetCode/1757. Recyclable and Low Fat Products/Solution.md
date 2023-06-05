# Recyclable and Low-Fat Products - Simple & Logical SQL Command

## Intuition
The problem is to find the product ids of products that are low in fats and recyclable from a table called `Products`. A possible way to solve this problem is to use a SQL query that filters the rows based on the `low_fats` and `recyclable` columns.

## Approach
1. Write a `SELECT` statement that specifies the `product_id` column as the output.
2. Write a `FROM` clause that specifies the `Products` table as the source.
3. Write a `WHERE` clause that specifies the conditions for `low_fats` and `recyclable` columns. Use the `AND` operator to combine the two conditions.
4. Run the query and return the result.

## Complexity
- Time complexity: $$O(n)$$
The SQL query iterates over all of the items in the `Product table to check if they match the clauses.

- Space complexity: $$O(1)$$
No additional storage is necessary for the SQL query.

## Code
```sql
SELECT product_id FROM Products WHERE low_fats='Y' AND recyclable='Y';
```