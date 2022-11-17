"use strict";
exports.__esModule = true;
//If the mark is above 80, PASS
//if it is lessthan 80, FAIL
var mark = 95;
var result;
if (mark >= 80) {
    //console.log("FAIL");
    result = "Pass";
}
else {
    result = "fail";
}
console.log("Result:" + result);
//Task: calculate grade
// >90=A
//80-90=>B
//less than 80 = F
