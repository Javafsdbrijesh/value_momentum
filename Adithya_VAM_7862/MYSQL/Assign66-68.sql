use customer_databse

delimiter $$
CREATE PROCEDURE SelectAllCustomers2()
BEGIN
select Customer_Name, Phone_Number from customers ;
END
$$
CALL SelectAllCustomers2();

delimiter $$
create procedure SelectAllMembers2()
begin
select * from members;
end
$$

call SelectAllMembers2();

call SelectAllCustomers2;
