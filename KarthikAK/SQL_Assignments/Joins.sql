use customer_db;

/*Assignment-61*/
create table members (
	member_id int auto_increment,
    name varchar(100),
    primary key (member_id)
);

create table committees (
	committee_id int auto_increment,
    name varchar(100),
    primary key (committee_id)
);

insert into members (name) values ("AK"), ("Arvind"), ("Karthik"), ("Bob"), ("Superman"), ("Man"); 
insert into committees (name) values ("AK"), ("Arvind"), ("Karthik"), ("Bob"); 

select * from members;
select * from committees;

/*Assignment-62*/
select
	m.member_id,
    m.name as member,
    c.committee_id,
    c.name as committees
from 
	members m
inner join committees c on c.name = m.name;

/*Assignment-63*/
select
	m.member_id,
    m.name as member,
    c.committee_id,
    c.name as committees
from
	members m
right join committees c on c.name = m.name;

/*Assignment-64*/
select
	m.member_id,
    m.name as member,
    c.committee_id,
    c.name as committees
from
	members m
left join committees c on c.name = m.name;

/*Assignment-65*/
select
	m.member_id,
    m.name as member,
    c.committee_id,
    c.name as committees
from
	members m cross join committees c;