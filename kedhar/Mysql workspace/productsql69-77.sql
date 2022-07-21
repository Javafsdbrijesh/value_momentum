CREATE DATABASE product_database;
USE product_database;
SELECT * FROM products;
create table Products(
prod_id int not null,
prod_name varchar(25) not null,
prod_cost INT,
prod_price INT,
primary key(prod_id)
);
insert into products(prod_name, prod_cost, prod_price)
values ("PIXEL", 1100.99,700.76),("AIRPODS", 199.99, 99.50),("CHARGER", 99.00, 59.45);
 
insert into products(prod_name, prod_cost, prod_price)
values ("XPERIA", 999.00, 810.00),("ALPHA", 4000.90, 3000.50);
 
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
values("KEDHARREDDY", "kedharreddy21@gmail.com", "Male"),("Akhila", "Akhila@gmail.com", "female");
 
delimiter $$
create procedure display_gender(inout mfgender int, in emp_gender varchar(10))
begin
select count(gender) into mfgender from author where gender = emp_gender;
end
$$
 
call display_gender(@M, "Male");
select @M;
 */kedhar reddy
call display_gender(@F, "Female");
select @F;