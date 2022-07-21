create database customer_db;
use customer_db;

create table Customer (
    Customer_ID int,
    Customer_Name varchar(25) not null,
    Pone_Number int unique,
    Address varchar(255),
    City varchar(25),
    Country varchar(25)    
);

select * from customer_db.Customer;

create view hyd_customers as
select Customer_Name,Pone_Number
from Customer where 
City="hyderabad";

drop view hyd_Customer;
drop table Customer;
drop database customer_db;

alter table Customer
add column Gender varchar(25);

alter table Customer
drop column Gender;

alter table Customer
modify pone_Number int;

alter table Customer
add column age varchar(25);

truncate table Customer;

insert into Customer(Customer_ID, Customer_Name, Pone_Number, Address, City, Country)
values (3, "Sai", 1285698, "18 Palm Street", "Pune","India");

insert into Customer(Customer_ID, Customer_Name, Pone_Number, Address, City, Country)
values (4, "Nethra", 2348956, "56 anjuman street", "Hyderabad","India");

update Customer
set Address = "17 Nehru Road" where Customer_ID = 3;

select * from customer;
select Customer_Name, City from customer;

select * from customer where Customer_Name like "v%";