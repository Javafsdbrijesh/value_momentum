"use strict";
exports.__esModule = true;
exports.Calculator = void 0;
var Calculator = /** @class */ (function () {
    function Calculator() {
        console.log("Calculator constructor");
    }
    Calculator.prototype.getTotal = function (marks) {
        var total = 0;
        //todo - implement logic to calculate total
        for (var _i = 0, marks_1 = marks; _i < marks_1.length; _i++) {
            var mark = marks_1[_i];
            total = total + mark;
        }
        return total;
    };
    Calculator.prototype.getPercentage = function (total, noOfSubjects) {
        var percentage = 0;
        //todo - implement a logic to calculate percentage
        percentage = total / noOfSubjects;
        return percentage;
    };
    return Calculator;
}());
exports.Calculator = Calculator;
// Task: Create a class Calculator
// Create a constructor
// Create  a method getTotal(marks) which should return total
// Create a method - getPercentage(total,noOfSubjects) which should return percentage
