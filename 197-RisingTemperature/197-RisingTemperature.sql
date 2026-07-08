-- Last updated: 7/8/2026, 3:36:45 PM
SELECT today.id
FROM Weather yesterday 
CROSS JOIN Weather today

WHERE DATEDIFF(today.recordDate,yesterday.recordDate) = 1
    AND today.temperature > yesterday.temperature
;