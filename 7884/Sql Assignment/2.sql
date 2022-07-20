use  customer_database;

CREATE TABLE members (
    member_id INT AUTO_INCREMENT,
    name VARCHAR(100),
    PRIMARY KEY (member_id)
);

drop table members;

CREATE TABLE committees (
    committee_id INT AUTO_INCREMENT,
    name VARCHAR(100),
    PRIMARY KEY (committee_id)
    );
    
    drop table committees;
    
insert into members(name) 
values ("Abhiram"), ("Aditya"), ("Arvind"), ("Anil"), ("Shreevidya"), ("Harshil") ;
 
insert into committees(name)
values("Abhiram"), ("Shreevidya"), ("Sumanth"), ("Deekshitha");

select * from committees;

select * from members;