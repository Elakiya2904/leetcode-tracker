-- Last updated: 7/8/2026, 3:57:17 PM
# Write your MySQL query statement below
SELECT name, population, area
FROM World
WHERE area >= 3000000
   OR population >= 25000000;