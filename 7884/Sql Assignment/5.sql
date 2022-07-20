select 
    m.member_id,
    m.name as member,
    c.committee_id,
    c.name as committees
from
    members m
right join committees c on c.name = m.name;