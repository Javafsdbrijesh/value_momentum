import { EmployeeDAO } from "./EmployeeDAO";


EmployeeDAO.save("Naresh");
EmployeeDAO.save("Siva");
EmployeeDAO.update(0,"Naresh Kumar");
EmployeeDAO.delete(1);

let employees = EmployeeDAO.findAll();
console.log(employees);

let emp = EmployeeDAO.findOne(0);
console.log("FindOne:" + emp);

let searchResults = EmployeeDAO.search("Naresh Kumar");
console.log("SearchResults:" + searchResults);