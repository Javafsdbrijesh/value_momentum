use customer_database;

/* Assingment 61*/
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
values ("Harsha"), ("Abhi"), ("vishal"), ("Anil"), ("vidya"), ("kedhar") ;
 
insert into committees(name)
values("Harsha"), ("vidya"), ("Shuchi"), ("Roopesh");

select * from members;
select * from committees;