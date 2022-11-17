"use strict";
exports.__esModule = true;
var Employee_1 = require("./Employee");
var emp1 = new Employee_1.Employee(1, "Naresh", 15000, true);
var emp2 = new Employee_1.Employee(2, "Ravi", 65000, false);
var emp3 = new Employee_1.Employee(3, "Suman", 50000, true);
var employees = [];
//How to add items to an array
employees.push(emp1);
employees.push(emp2);
employees.push(emp3);
//Iterate 
for (var _i = 0, employees_1 = employees; _i < employees_1.length; _i++) {
    var emp = employees_1[_i];
    console.log(emp.empId + "-" + emp.name + "- Rs." + emp.salary);
}
//Total no of employees
console.log("No of employees:" + employees.length);
//Total Amount paid for all active employees by the client
var totalSalary = 0;
//write the logic here
console.log("Total Amount needed for next month :Rs." + totalSalary);
