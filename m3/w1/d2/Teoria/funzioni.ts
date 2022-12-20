//definizione di una funzione
function function_name(){   //può anche essere anonima (function(){})
    //function body
    console.log("Function Called");
}
//invoca la funzione
function_name();


//restituzione di una funzione
function greet():string{            //funzione restituisce una stringa
    return "Hello World!!!";
}

//invoco greet in un'altra funzione
function caller(){
    var msg=greet(); //funzione greet invoked
    console.log(msg)
}
caller();

//funzioni con parametri opzionali -> gli argomenti non vengono passati obbligatoriamente
function disp_dettagli(id:number,name:string,mail_id?:string){
    console.log("ID:",id);
    console.log("Name",name);
    mail_id?console.log("Email id",mail_id)
    :(console.log("Email non inserita"));
}
disp_dettagli(123,"John");
disp_dettagli(111,"Mary","mary@gmail.com");

//parametro rest [...] in TypeScript -> devono essere tutti dello stesso tipo
function addNumbers(...nums:number[]){
    let somma:number=0;
    nums.reduce((a,b)=>somma=a+b);
    console.log(somma);
}
addNumbers(1,2,3);
addNumbers(10,20,30,40,50);

//function anonime
var msg=function(){
    return "hello world"
}
console.log(msg());

//funzioni anonime con parametri
var res=function(a:number,b:number){
    return a*b
}
console.log(res(11,2));

//anche typescript supporta il costruttore function
var myFunction = new Function("a","b","return a+b");
var zz= myFunction(4,5);
console.log(x);

