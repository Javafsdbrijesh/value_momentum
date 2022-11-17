"use strict";
//Data Access Object (DAO) => insert/update/delete/select 
//create table employees ( name varchar(100));
exports.__esModule = true;
exports.EmployeeDAO = void 0;
var EmployeeDAO = /** @class */ (function () {
    function EmployeeDAO() {
    }
    //insert into employees(name) values (?)
    EmployeeDAO.save = function (name) {
        console.log("EmployeeDAO- save" + name);
        this.employees.push(name);
    };
    //select * from employees; returns [] ( 1 or more);
    EmployeeDAO.findAll = function () {
        console.log("EmployeeDAO-findAll");
        return this.employees;
    };
    //select * from employees where id = ?; //returns 1 row
    EmployeeDAO.findOne = function (index) {
        return this.employees[index];
    };
    //update employees set name = ? where id = ?; // 1 row 
    EmployeeDAO.update = function (index, name) {
        this.employees[index] = name;
    };
    //delete from employees where id = ?; 1 row
    EmployeeDAO["delete"] = function (index) {
        this.employees.splice(index, 1);
    };
    EmployeeDAO.search = function (name) {
        var results = [];
        // implement logic
        return results;
    };
    EmployeeDAO.employees = []; //db table
    return EmployeeDAO;
}());
exports.EmployeeDAO = EmployeeDAO;
