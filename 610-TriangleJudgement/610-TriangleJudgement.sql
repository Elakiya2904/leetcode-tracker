-- Last updated: 7/8/2026, 3:57:14 PM
# Write your MySQL query statement below
select *, if(x+y>z and y+z>x and x+z>y, "Yes","No") as triangle from triangle