create database product_database;
use product_database;
create table products(
prod_id int AUTO_INCREMENT ,
prod_name varchar(25) ,
prod_cost float ,
prod_price float ,
primary key(prod_id)
);

insert into products(prod_name, prod_cost, prod_price)
values ("Fan", 1079.60, 1679.50),("Electric keyboard", 799.99, 342.50),("Electric light", 112.00, 569.54);
 
insert into products(prod_name, prod_cost, prod_price)
values ("Bag", 49.00, 120.00),("pen", 300.90, 350.50);

delimiter $$
create function calcProfit(cost float, price float) returns decimal(9,2) deterministic
begin
    declare profit decimal(9,2);
    set profit = price-cost;
    return profit;
end
$$
 
select *, calcProfit(prod_cost,prod_price) as profit from products;
 

delimiter $$
create procedure procedure_test()
begin
    select prod_name from products;
end
$$
call procedure_test();
 
delimiter $$
create procedure update_price(in input_prod_id int, in input_prod_cost float)
begin
    update products set prod_cost = input_prod_cost where prod_id = input_prod_id;
end
$$
 
call update_price(3, 299);
call update_price(4, 100);
 
delimiter $$
create procedure display_max(out highest_prod_cost float)
begin
    select max(prod_cost) into highest_prod_cost from products;
end
$$
 
call display_max(@M);
select @M;
 
create table author(
    author_id int not null auto_increment primary key,
    author_name varchar(25) not null,
    email varchar(25),
    gender varchar(10)
);
 
insert into author(author_name, email, gender)
values("Ram", "Ram45@gmail.com", "Male"),("Divya", "Divya23@gmail.com", "female");productsauthor
 
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