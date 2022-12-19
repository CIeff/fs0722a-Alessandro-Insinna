let nome = "Mary";
let nome2;
let nome3 = "Mary";
let nome4;
let nome5 = "John";
let score1 = 50;
let score2 = 42.50;
let sum = score1 + score2;
console.log("name " + nome5);
console.log("first score " + score1);
console.log("second score " + score2);
console.log("sum " + sum);
let code = 123;
let employeeCode = code;
console.log(typeof (employeeCode));
let codeString = "123";
var num = 2;
console.log("value of num" + num);
var global_num = 12;
class Numbers {
    constructor() {
        this.num_val = 13;
    }
    StoreNum() {
        var local_num = 14;
    }
}
Numbers.sval = 10;
console.log("gloabl num" + global_num);
console.log("static field" + Numbers.sval);
var obj2 = new Numbers();
console.log(obj2.num_val);
