import {Calculator} from "./Calculator";

const marks:number[] = [ 40,50,99,80]; //input
let noOfSubjects =  marks.length; //size of an array : 3 subjects

const calculatorObj = new Calculator();//Create an Object

let total = calculatorObj.getTotal(marks);  //calling a method 
console.log("Total:" + total);

let percentage = calculatorObj.getPercentage(total, noOfSubjects);
console.log("Percentage:" + percentage);