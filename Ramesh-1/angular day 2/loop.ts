export {}
// let marks:number[] = [20,30,50];
let marks:number[] = [];
// How to add items in an array in JS/TS
marks.push(20);
marks.push(30);
marks.push(50);

// Write a logic to calculate total
console.log("For Loop");
for(let i=0;i<marks.length;i++){
    let mark = marks[i];
    console.log(mark);
}
console.log("Foreach loop");
//foreach
for(let mark of marks){
    console.log(mark);
}