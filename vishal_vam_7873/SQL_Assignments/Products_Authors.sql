/*Assignment-69 : Create database product_database, create table products with columns(prod_id, prod_name, prod_cost, prod_price)*/
create database product_database;

use product_database;

create table products (
	prod_id int,
    prod_name varchar(25),
    prod_cost int,
    prod_price int
);

/*Assignment-70 : Insert data in products table.*/
insert into products(prod_id, prod_name, prod_cost, prod_price) 
values (1,"SAMSUNG M32", 14999, 17999);

insert into products(prod_id, prod_name, prod_cost, prod_price) 
values (2,"OPPO F17", 16990, 19990);

insert into products(prod_id, prod_name, prod_cost, prod_price) 
values (3,"Apple iPHONE 13 Pro MAX", 130900, 133900);

insert into products(prod_id, prod_name, prod_cost, prod_price) 
values (4,"OnePlus Nord", 24999, 27999);

insert into products(prod_id, prod_name, prod_cost, prod_price) 
values (5,"Redmi Note 11T", 14999, 17999);

insert into products(prod_id, prod_name, prod_cost, prod_price) 
values (6,"Redmi 5", 9899, 10999);

insert into products(prod_id, prod_name, prod_cost, prod_price) 
values (7,"VIVO V23", 28299, 29990);

insert into products(prod_id, prod_name, prod_cost, prod_price) 
values (8,"Realme 8s", 13999, 17999);

/*Assignment-71 : Create function calcProfit to calculate profit.*/
delimiter $$
create function calcProfit(cost int, price int) returns int deterministic
begin
	declare profit int;
    set profit = price - cost;
    return profit;
end
$$

/*Assignment-72 : Create a select statement to execute the above function.*/
select *, calcProfit(prod_cost, prod_price) as profit from products;

/*Assignment-73 :  Create and call a test procedure to display all product names.*/
delimiter $$
create procedure procedure_test()
begin
	select prod_name from products;
end
$$

call procedure_test();

/*Assignment-74 : Create a IN procedure to update price of procust using in parameter.*/
delimiter $$
create procedure update_price(in input_prod_id int, in input_prod_cost int)
begin
	update products set prod_cost = input_prod_cost where prod_id = input_prod_id;
end
$$

call update_price(4, 30000);
call update_price(8, 20000);

/*Assignment-75 : Create a OUT procedure to display max_price from products table using out parameter.*/
delimiter $$
create procedure display_max(out highest_prod_cost int)
begin
	select max(prod_cost) into highest_prod_cost from products;
end
$$

call display_max(@M);
select @M;

/*Assignment-76 : Create table authors with columns as author_id, author_name, email, gender.*/
create table author (
	author_id int not null auto_increment primary key,
    author_name varchar(25) not null,
    email varchar(25),
    gender varchar(10)
);

insert into author(author_name, email, gender)
values ("AK", "AK@gmail.com","Male"),("Yashwanth", "yash@gmail.com", "Male"),("Bhanu", "bhanu@gmail.com", "Male"),
("Janita","janita@gmail.com","Female"),("Saketh", "saketh@gmail.com", "Male"),("Nikhil", "nikhil@gmail.com", "Male");

/*Assignment-77 : Create a INOUT procedure to display gender count.*/
delimiter $$
create procedure display_gender(inout mfgender int, in emp_gender varchar(10))
begin
	select count(gender) into mfgender from author where gender = emp_gender;
end
$$

call display_gender(@M, "Male");
select @M;

call display_gender(@F, "Female");
select @F;
