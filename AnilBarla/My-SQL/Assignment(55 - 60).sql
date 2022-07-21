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
values(1,"Anil","257253932","kotlas pg","Hyd","India","M",20),
(2,"Manoj","786533566","kotlas pg","Hyd","India","M",20),
(3,"Pallavi","123456","women pg","Hyd","India","F",20),
(4,"Sai","12462543","BHEL","Hyd","India","M",21),
(5,"Pavan","1234567","BHEL","Hyd","India","M",22);

update customer
set Customer_Name = "Sai Krish" WHERE Customer_ID = 4;

select * from customer where Customer_Name like "a%";