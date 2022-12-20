var person={
    firstName:"Federico",
    lastName:"De Ambrosis",
    sayHello:function(){}   //type template
}
console.log(person.firstName);
console.log(person.lastName);
//person.sayHello=function(){return "hello"+person.firstName};  restituisce errore perchè non ho definito un type template
person.sayHello=function(){
    console.log("hello",person.firstName)
};
person.sayHello();

//oggetti con parametri di funzione

var person2={
    firstName:"Federico",
    lastName:"De Ambrosis"
};
var invokerPerson=function(obj:{firstName:string,lastName:string}){ 
    console.log(obj.firstName,obj.lastName)
}
invokerPerson(person2);

//classi supportate
class Persona1{
    nome:string="";
    cognome:string="";
    constructor(nome:string,cognome:string){
        this.nome=nome;
        this.cognome=cognome;
    }
    visualizzaNomeCognome(){
        return this.nome+" "+this.cognome;
    }
}

var mario = new Persona1("Mario","Rossi");
console.log(mario);
console.log(mario.visualizzaNomeCognome());

//altro esempio
class Car1{
    //field
    engine:string="";
    //constructor -> funzione speciale di class che serve a inizializzare le variaili -> è una funzione quindi può avere parametri
    constructor(engine:string){
        this.engine=engine
    }
//function
display():void{
    console.log("Engine is : ",this.engine)
}
}

var panda= new Car1("XXSY1");
console.log("leggo engine",panda.engine);
panda.display();

