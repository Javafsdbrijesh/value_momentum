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
values ("mouse", 699.99, 899.99),("mouse pad", 100.99, 159.99),("web cam", 3000.00, 3299.99);
 
insert into products(prod_name, prod_cost, prod_price)
values ("GPU", 9999.00, 10110.00),("SSD", 3000.90, 3450.50);
 
delimiter $$
create function calcProfit(cost float, price float) returns decimal(9,2) deterministic
begin
    declare profit decimal(9,2);
    set profit = price-cost;
    return profit;
end
$$
 
select *, calcProfit(prod_cost,prod_price) as profit from products;