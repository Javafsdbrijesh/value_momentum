/*Assignmnet 61: Creatae table members, committees with id and name as column. Insert test data as shared.
use customer_databse;
CREATE TABLE member(
	mem_id INT AUTO_INCREMENT,
    name VARCHAR(100),
    PRIMARY KEY(mem_id)
    );
    CREATE TABLE comitie(
		com_id INT auto_increment,
        name VARCHAR(100),
        PRIMARY KEY(COM_ID)
        );*/
/*Assignment 62: Create Inner Join
use customer_databse;
select
	m.mem_id,
    m.name as member,
    c.com_id,
    c.name as comitie
from
	member m
inner join comitie c on c.name = m.name;*/
/*Assignment 63: Create Right Join
use customer_databse;
select 
	m.mem_id,
    m.name as member,
    c.com_id,
    c.name as comitie
from
	member m right join comitie c on c.name = m.name;
*/
/*Assignmnet 64: Create Left Join
select
	m.mem_id,
    m.name as member,
    c.com_id,
    c.name as comitie
from
	member m left join comitie c on c.name = m.name;
*/
/*Assignment 65: Create Cross Join
select
    m.mem_id,
    m.name as member,
    c.com_id,
    c.name as comitie
from
    member m cross join comitie c*/