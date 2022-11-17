function calculateResult(mark:number):string{



    let result:string;



    if(mark<0){



        return "Inavalid Mark";



    }



    result=mark >= 80 ? "PASS" : "FAIL";



    return result;



}



let result:string = calculateResult(70);



let result1:string = calculateResult(-19);



console.log("Result" + result);



console.log("Result:"+ result1);