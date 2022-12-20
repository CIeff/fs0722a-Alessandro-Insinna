// definizione di una funzione
/*
function nome_funzione() {
    // function definition
    console.log("Function called")
}
*/
// chiamata di funzione
/*
function test() {
    console.log("Function called")
}
test()      // invocazione della funzione
*/
// restituzione di una funzione
/*
function greet():string { // la funzione restituisce una stringa
    return "Hello World"
}

function caller() {
    var msg = greet() // function greet invoked
    console.log(msg)
}

// invoke function
caller()
*/
// funzioni con parametri opzionali -> gli argomenti non vengono passati obbligatoriamente
function disp_details(id, name, mail_id) {
    console.log("ID:", id);
    console.log("Name:", name);
    if (mail_id != undefined)
        console.log("Email ID", mail_id);
}
disp_details(123, "John");
disp_details(111, "mary", "email_protected");
// parametri rest ... in TypeScript -> devono essere tutti dello stesso tipo
function addNumbers() {
    var nums = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        nums[_i] = arguments[_i];
    }
    var i;
    var sum = 0;
    for (i = 0; i < nums.length; i++) {
        sum = sum + nums[i];
    }
    console.log("sum of the numbers", sum);
}
addNumbers(1, 2, 3);
addNumbers(10, 10, 10, 10, 10);
// parametri predefiniti -> esempio funzione che calcola un prezzo che ha uno sconto -> dichiaro tipo di dato & valore
function calculate_discount(price, rate) {
    if (rate === void 0) { rate = 0.50; }
    var discount = price * rate;
    console.log("Discount Amount ", discount);
}
calculate_discount(1000);
calculate_discount(1000, 0.30);
// funzioni anonime
var msg = function () {
    return "hello world";
};
console.log(msg());
// funzioni anonime con parametri
var res = function (a, b) {
    return a * b;
};
console.log(res(12, 2));
// anche TypeScript supporta il costruttore function
var myFunction = new Function("a", "b", "return a * b");
var x = myFunction(4, 3);
console.log(x);
