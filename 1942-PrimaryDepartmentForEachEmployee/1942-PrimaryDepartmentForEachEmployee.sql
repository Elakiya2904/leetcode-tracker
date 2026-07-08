-- Last updated: 7/8/2026, 3:55:58 PM
# Write your MySQL query statement below
SELECT employee_id, department_id
FROM Employee
WHERE primary_flag='Y' OR 
    employee_id in
    (SELECT employee_id
    FROM Employee
    Group by employee_id
    having count(employee_id)=1)