-- Last updated: 7/8/2026, 3:57:19 PM
# Write your MySQL query statement below
SELECT name
FROM Customer
WHERE referee_id <> 2
   OR referee_id IS NULL;