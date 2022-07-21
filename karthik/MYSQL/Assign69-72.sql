create database product_database;
use product_database;
create table products(
prod_id int not null auto_increment,
prod_name varchar(25) not null,
prod_cost float not null default 0.0,
prod_price float not null default 0.0,
primary key(prod_id)
);
 
insert into products(prod_name, prod_cost, prod_price)
values ("printe", 1011.40, 1199.50),("keyboard", 299.99, 499.50),("mouse", 199.00, 299.45);
 
insert into products(prod_name, prod_cost, prod_price)
values ("book", 99.00, 110.00),("pen", 400.90, 450.50);
 
delimiter $$
create function calcProfit(cost float, price float) returns decimal(9,2) deterministic
begin
    declare profit decimal(9,2);
    set profit = price-cost;
    return profit;
end
$$
 
select *, calcProfit(prod_cost,prod_price) as profit from products;