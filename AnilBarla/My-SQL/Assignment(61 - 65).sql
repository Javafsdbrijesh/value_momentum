create table Btech (
Btech_Id int auto_increment,
name varchar(15),
primary key(Btech_Id)
);

create table CSE (
Cse_Id int auto_increment,
name varchar(10),
primary key(Cse_Id)
);

insert Btech(name)
values("Abhiram"), ("Aditya"), ("Arvind"), ("Anil"), ("Shreevidya"), ("Harshil") ;

insert CSE(name)
values("Abhiram"), ("Shreevidya"), ("Sumanth"), ("Deekshitha");

select 
b.Btech_Id,
b.name as btech,
c.cse_Id,
c.name as cse
from
Btech b
inner join cse c on  b.name = c.name;

select 
b.Btech_Id,
b.name as btech,
c.cse_Id,
c.name as cse
from
Btech b
right join cse c on  b.name = c.name;

select 
b.Btech_Id,
b.name as btech,
c.cse_Id,
c.name as cse
from
Btech b
left join cse c on  b.name = c.name;

select 
b.Btech_Id,
b.name as btech,
c.cse_Id,
c.name as cse
from
cse c
cross join btech b;