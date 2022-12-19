//sintassi per dichiarare  una variabile
let nome:string="Mary";         //la variabile memorizza un tipo di dato stringa
let nome2:string;               //la variabile è una stringa, il valore undefined
let nome3="Mary";               //il tipo di dato è dedotto dal valore che scrivo
let nome4;                      //il tipo di dato è any, valore undefined
let nome5:string="John";
let score1:number=50;
let score2:number=42.50;
let sum=score1+score2;
console.log("name "+nome5);
console.log("first score "+score1);
console.log("second score "+score2);
console.log("sum "+sum);

//type assertion
let code:any=123;
let employeeCode= <number> code;
console.log(typeof(employeeCode));
let codeString:string="123";


// inferred typing
var num=2;                     //datatype inferred as number
console.log("value of num"+num);

//ambiti delle variabili
var global_num=12;             //global variable
class Numbers{
    num_val=13;                 //class variable
    static sval =10;            //stastic field

    StoreNum():void{
        var local_num=14;       //local variable
    }          
}

console.log("gloabl num"+global_num);
console.log("static field"+Numbers.sval);
var obj2 = new Numbers();
console.log(obj2.num_val);
//console.log("local num"+local_num); non se po fa

