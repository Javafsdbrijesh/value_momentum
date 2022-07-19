/*Assignment-55*/
create database customer_db;

use customer_db;

/*Assignment-56*/
create table Customers(
	Customer_ID int,
    Customer_Name varchar(25),
    Phone_No int,
    Address varchar(255),
    City varchar(25),
    Country varchar(25)
);

select * from customer_db.Customers;

/*Assignment-57*/
create view Hyd_Customers as 
select Customer_Name, Phone_No from
Customers where City = "Hyderabad";

drop view Hyd_Customers;
drop table Customers;
drop database customer_db;

/*Assignment-58*/
alter table Customers add column Gender varchar(25);
alter table Customers add column Age int;
alter table Customers modify Phone_No int;

alter table Customers drop column Gender;
alter table Customers drop column Age;

/*Assignment-59*/
insert into Customers(Customer_ID, Customer_Name, Phone_No, Address, City, Country)
values (1, "Karthik", 100, "BHEL", "Hyderabad", "India");

insert into Customers(Customer_ID, Customer_Name, Phone_No, Address, City, Country)
values (2, "AK", 108, "KPHB", "Delhi", "Canada");

insert into Customers(Customer_ID, Customer_Name, Phone_No, Address, City, Country)
values (3, "ABCD", 232, "DEFG", "IJKL", "US");

insert into Customers(Customer_ID, Customer_Name, Phone_No, Address, City, Country)
values (4, "FFFF", 123, "Washington", "Dallas", "US");

insert into Customers(Customer_ID, Customer_Name, Phone_No, Address, City, Country)
values (5, "LMNO", 899, "KLJK", "GTYJK", "Canada");

/*Assignment-60*/
update Customers set Customer_Name = "Bob" where Customer_ID = 3;