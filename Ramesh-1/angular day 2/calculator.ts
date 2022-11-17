export class Calculator {

    constructor(){
        console.log("Calculator constructor");
    }

    getTotal(marks:number[]): number{
        let total = 0;
        //todo - implement logic to calculate total
        for(let mark of marks){
            total = total + mark;
        }
        return total;
    }

    getPercentage(total:number, noOfSubjects:number): number{
        let percentage = 0 ;
        //todo - implement a logic to calculate percentage
        percentage = total / noOfSubjects;
        return percentage;
    }

}

// Task: Create a class Calculator
// Create a constructor
// Create  a method getTotal(marks) which should return total
// Create a method - getPercentage(total,noOfSubjects) which should return percentage