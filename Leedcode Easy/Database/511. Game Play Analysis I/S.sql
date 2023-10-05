# Write your MySQL query statement below
select player_id, min(event_date) as first_login 
from (
select player_id, event_date from activity group by player_id, event_date 
) as temp
group by player_id;