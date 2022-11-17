"use strict";
exports.__esModule = true;
// let marks:number[] = [20,30,50];
var marks = [];
// How to add items in an array in JS/TS
marks.push(20);
marks.push(30);
marks.push(50);
// Write a logic to calculate total
var total = 0;
//foreach
for (var _i = 0, marks_1 = marks; _i < marks_1.length; _i++) {
    var mark = marks_1[_i];
    total = total + mark;
    console.log(mark);
}
console.log("Total:" + total);
var noOfSubjects = marks.length;
var average = total / noOfSubjects;
console.log("Average:" + average.toFixed(1));
// Task: Create a class Calculator
// Create a constructor
// Create  a method getTotal(marks) which should return total
// Create a method - getPercentage(total,noOfSubjects) which should return percentage
