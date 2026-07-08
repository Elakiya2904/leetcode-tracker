-- Last updated: 7/8/2026, 3:56:38 PM
# Write your MySQL query statement below

select  p.product_name , s.year ,  s.price from 
Sales s join Product p
on s.product_id = p.product_id 