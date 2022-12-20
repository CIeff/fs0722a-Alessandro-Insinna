var person = {
    firstName: "Federico",
    lastName: "De Ambrosis",
    sayHello: function () { } //type template
};
console.log(person.firstName);
console.log(person.lastName);
//person.sayHello=function(){return "hello"+person.firstName};  restituisce errore perchè non ho definito un type template
person.sayHello = function () {
    console.log("hello", person.firstName);
};
person.sayHello();
//oggetti con parametri di funzione
var person2 = {
    firstName: "Federico",
    lastName: "De Ambrosis"
};
var invokerPerson = function (obj) {
    console.log(obj.firstName, obj.lastName);
};
invokerPerson(person2);
//classi supportate
var Persona1 = /** @class */ (function () {
    function Persona1(nome, cognome) {
        this.nome = "";
        this.cognome = "";
        this.nome = nome;
        this.cognome = cognome;
    }
    Persona1.prototype.visualizzaNomeCognome = function () {
        return this.nome + " " + this.cognome;
    };
    return Persona1;
}());
var mario = new Persona1("Mario", "Rossi");
console.log(mario);
console.log(mario.visualizzaNomeCognome());
//altro esempio
var Car1 = /** @class */ (function () {
    //constructor -> funzione speciale di class che serve a inizializzare le variaili -> è una funzione quindi può avere parametri
    function Car1(engine) {
        //field
        this.engine = "";
        this.engine = engine;
    }
    //function
    Car1.prototype.display = function () {
        console.log("Engine is : ", this.engine);
    };
    return Car1;
}());
var panda = new Car1("XXSY1");
console.log("leggo engine", panda.engine);
panda.display();
