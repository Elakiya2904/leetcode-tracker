-- Last updated: 7/8/2026, 3:36:59 PM
# Write your MySQL query statement below
WITH cte AS (
    SELECT *,
           LEAD(num, 1) OVER (ORDER BY id) AS next_1,
           LEAD(num, 2) OVER (ORDER BY id) AS next_2
    FROM Logs
)

SELECT DISTINCT num AS ConsecutiveNums
FROM cte
WHERE num = next_1
  AND num = next_2;