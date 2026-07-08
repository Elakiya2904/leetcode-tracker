-- Last updated: 7/8/2026, 3:56:39 PM
# Write your MySQL query statement below
SELECT  customer_id FROM Customer GROUP BY customer_id
HAVING COUNT(distinct product_key) = (SELECT COUNT(product_key) FROM Product)