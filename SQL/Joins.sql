use customer_db;

CREATE TABLE members (

    member_id INT AUTO_INCREMENT,

    name VARCHAR(100),

    PRIMARY KEY (member_id)

);

CREATE TABLE committees (

    committee_id INT AUTO_INCREMENT,

    name VARCHAR(100),

    PRIMARY KEY (committee_id)

);
insert into members(name) 
values ("yashwanth"), ("janitha"), ("karthik"), ("Anil"), ("nikil"), ("Harshil") ;

insert into committees(name)
values("yashwanth"), ("Shreevidya"), ("janitha"), ("Deekshitha");

select * from members;
select * from committees;

select
    m.member_id,
    m.name as member,
    c.committee_id,
    c.name as committees

from members m
inner join committees c on c.name=m.name;

select 
    m.member_id,
    m.name as member,
    c.committee_id,
    c.name as committees

    from members m right join committees c on c.name=m.name;
    select 
    m.member_id,
    m.name as member,
    c.committee_id,
    c.name as committees

    from members m left join committees c on c.name=m.name;
    select 
    m.member_id,
    m.name as member,
    c.committee_id,
    c.name as committees

    from members m cross join committees c;