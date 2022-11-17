"use strict";
exports.__esModule = true;
var Role;
(function (Role) {
    Role[Role["ADMIN"] = 0] = "ADMIN";
    Role[Role["USER"] = 1] = "USER";
    Role[Role["SUPERADMIN"] = 2] = "SUPERADMIN";
})(Role || (Role = {}));
var Gender;
(function (Gender) {
    Gender[Gender["MALE"] = 0] = "MALE";
    Gender[Gender["FEMALE"] = 1] = "FEMALE";
})(Gender || (Gender = {}));
var name = "Naresh";
var role = Role.SUPERADMIN;
var gender = Gender.MALE;
console.log("Name:" + name + ", role:" + role + ", gender=" + gender);
