function calculateResult(mark) {
    var result;
    if (mark < 0) {
        return "Inavalid Mark";
    }
    result = mark >= 80 ? "PASS" : "FAIL";
    return result;
}
var result = calculateResult(70);
var result1 = calculateResult(-19);
console.log("Result" + result);
console.log("Result:" + result1);
