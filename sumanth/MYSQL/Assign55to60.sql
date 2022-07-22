/*Assignment 55: Create database customer_database (perform create, use and drop commands)
Assignment 56: Create table customers(id,name, phoneno, address, city, country ) (perform create deop operations)
Assignment 57: Create View using name and phone number (perform create deop operations).
Assignment 58: Alter customers table by adding a column name gender and age. Modify phone number type from int to varchar
Assignment 59: Inssert 5 records into customers table.
Assignment 60: Update name from customers table where customer id is "2"


use customer_databse;
create table Customers
(
	Customer_ID int,
    Customer_Name varchar(15),
    Phone_number int,
    Adress varchar(255),
    city varchar(50),
    country varchar(15)
);

create view HyderabadCustomers as 
select Customer_Name,Phone_number 
from 
Customers 
where 
city="Hyderabad";

drop view HyderabadCustomers;
alter table customers
add Current_location varchar(100);
customerscustomers
alter table customers
modify Phone_number int(12);

INSERT INTO customers (Customer_ID,Customer_Name,Phone_number,Adress,city,country,Current_location)
VALUES (7002,"bcd",900,"Malkajgiri","Telangana","India","kochi");

alter table customers
drop column Current_location

create view India as select Customer_Name,Customer_ID from customers where country="India"
update customers
SET customer_name="äbcdefg"
WHERE customer_id=7000*/
create database javafsd