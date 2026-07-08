-- Last updated: 7/8/2026, 3:56:04 PM
# Write your MySQL query statement below
SELECT user_id , COUNT(follower_id) as followers_count
FROM Followers
GROUP BY user_id
ORDER BY user_id ASC;