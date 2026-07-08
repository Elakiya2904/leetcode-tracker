-- Last updated: 7/8/2026, 3:56:05 PM
# Write your MySQL query statement below
SELECT tweet_id
FROM Tweets
WHERE CHAR_LENGTH(content) > 15;