function calculategrade(mark) {
    var grade = "";
    if (mark >= 90) {
        grade = "A";
    }
    else if (mark >= 80 && mark < 90) {
        grade = "B";
    }
    else {
        grade = "F";
    }
    return grade;
}
console.log(calculategrade(70));
console.log(calculategrade(89));