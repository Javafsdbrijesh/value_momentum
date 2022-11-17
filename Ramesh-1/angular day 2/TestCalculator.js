"use strict";
exports.__esModule = true;
var Calculator_1 = require("./Calculator");
var marks = [40, 50, 99, 80]; //input
var noOfSubjects = marks.length; //size of an array : 3 subjects
var calculatorObj = new Calculator_1.Calculator(); //Create an Object
var total = calculatorObj.getTotal(marks); //calling a method 
console.log("Total:" + total);
var percentage = calculatorObj.getPercentage(total, noOfSubjects);
console.log("Percentage:" + percentage);
