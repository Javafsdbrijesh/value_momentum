export {}
// let marks:number[] = [20,30,50];
let marks = [];
// How to add items in an array in JS/TS
marks.push(20);
marks.push(30);
marks.push(50);
    
// Write a logic to calculate total
let total = 0;
//foreach
for(let mark of marks){
    total = total +mark;
    console.log(mark);
}
console.log("Total:" + total);
const noOfSubjects = marks.length;
let average = total/noOfSubjects;
console.log("Average:" + average.toFixed(1)); 

// Task: Create a class Calculator
// Create a constructor
// Create  a method getTotal(marks) which should return total
// Create a method - getPercentage(total,noOfSubjects) which should return percentage
 