create database customer_database;

use customer_database;

create table customer (
Customer_ID int,
Customer_Name varchar(16),
Phone_Number int,
Address varchar(50),
city varchar(25),
country varchar(10) 
);

drop database customer_database;

drop table customer;

create view Valuemomentum_Customer as select customer_Name, Phone_Number from customer where country = "India";

drop view hyderbad_customer;

alter table customer
add column Gender varchar(8),
add column age int;

alter table customer
modify Phone_Number varchar(10);

insert into customer(Customer_ID,Customer_Name,Phone_Number,Address,city,country,Gender,age)
values(1,"Arvind","7893585300","NCL Sindhu","Hyd","India","M",22),
(2,"Usha","8985727272","NCL Godavari","Hyd","India","F",46),
(3,"Abhishek","7893585170","Shivanagar","Hyd","India","M",18);

update customer
set Customer_Name = "Abhishek Karthik" WHERE Customer_ID = 3;

select * from customer where Customer_Name like "a%";