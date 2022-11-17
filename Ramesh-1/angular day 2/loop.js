"use strict";
exports.__esModule = true;
// let marks:number[] = [20,30,50];
var marks = [];
// How to add items in an array in JS/TS
marks.push(20);
marks.push(30);
marks.push(50);
// Write a logic to calculate total
console.log("For Loop");
for (var i = 0; i < marks.length; i++) {
    var mark = marks[i];
    console.log(mark);
}
console.log("Foreach loop");
//foreach
for (var _i = 0, marks_1 = marks; _i < marks_1.length; _i++) {
    var mark = marks_1[_i];
    console.log(mark);
}
