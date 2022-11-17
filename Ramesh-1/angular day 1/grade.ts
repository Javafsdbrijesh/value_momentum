const mark:number = 90;

//calculate grade

let grade:string;



//Rule 1: if mark above 90, then grade A

//Rule 1: if mark between 80-90, then grade B

//Rule 1: if mark lessthan 80, then grade F

if (mark >= 90)

{

    grade = "A";

}

else if (mark >= 80 && mark < 90){

    grade = "B";

}

else {

    grade = "F";

}

console.log("Grade:" + grade);