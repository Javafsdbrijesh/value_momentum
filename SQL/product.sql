create database product_db;
use product_db;
create table product(
product_id int not null auto_increment,
product_name varchar(25) not null,
product_cost float not null default 0.0,
product_price float not null default 0.0,
primary key(product_id)
);
select * from product_db.product;
insert into product(product_name, product_cost, product_price)
values ("CPU", 1099.40, 1199.50),("desktop", 299.99, 499.50),("floppy disk", 199.00, 299.45);
 insert into product(product_name, product_cost, product_price)
values ("laptop", 99.00, 110.00),("scanner", 400.90, 450.50)
delimiter $$
create function calcProfit(cost float, price float) returns decimal(9,2) deterministic
begin
declare profit decimal(9,2);
set profit = price-cost;
return profit;
end
$$
select *, calcProfit(product_cost,product_price) as profit from product;

delimiter $$
create procedure procedure_test()
begin
select product_name from product;
end
$$
call procedure_test();

delimiter $$
create procedure update_price(in input_product_id int, in input_product_cost float)
begin
update product set product_cost = input_product_cost where product_id = input_product_id;
end
$$
call update_price(3, 299);
call update_price(4, 100);
delimiter $$
create procedure display_max(out highest_product_cost float)
begin
select max(product_cost) into highest_product_cost from product;
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
values("yashwanth", "yashwanth@gmail.com", "Male"),("janitha", "janitha@gmail.com", "female");
delimiter $$
create procedure display_gender(inout mfgender int, in emp_gender varchar(10))
begin
select count(gender) into mfgender from author where gender = emp_gender;
end
$$
call display_gender(@M, "Male");
select @M;

