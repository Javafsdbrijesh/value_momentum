"use strict";
exports.__esModule = true;
var EmployeeDAO_1 = require("./EmployeeDAO");
EmployeeDAO_1.EmployeeDAO.save("Naresh");
EmployeeDAO_1.EmployeeDAO.save("Siva");
EmployeeDAO_1.EmployeeDAO.update(0, "Naresh Kumar");
EmployeeDAO_1.EmployeeDAO["delete"](1);
var employees = EmployeeDAO_1.EmployeeDAO.findAll();
console.log(employees);
var emp = EmployeeDAO_1.EmployeeDAO.findOne(0);
console.log("FindOne:" + emp);
var searchResults = EmployeeDAO_1.EmployeeDAO.search("Naresh Kumar");
console.log("SearchResults:" + searchResults);
