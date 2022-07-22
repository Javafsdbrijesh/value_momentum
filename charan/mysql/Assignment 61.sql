use customer_database;


/* assingment 61*/
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
values ("Abhi"), ("sneha"), ("Arvind"), ("Anil"), ("Shree"), ("Harshil") ;
 
insert into committees(name)
values("venky"), ("Shreevidya"), ("Sumanth"), ("Deekshisth")

select * from members;
select * from committees;


