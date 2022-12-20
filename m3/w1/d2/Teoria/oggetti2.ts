class Persona3{
    nome:string="";
    cognome:string="";
    /*private*/ visualizzaNomeCognome(){                //metodo pubblico( se non dichiaro nulla e quindi accesibile dall'esterno)
        return this.nome+" "+this.cognome
    }
}

var marioRossi=new Persona3();
marioRossi.nome="Mario";
marioRossi.cognome="Rossi";
console.log(marioRossi.visualizzaNomeCognome());

//static -> si usa quando voglio usare un metodo senza necessità di creare un'istanza della classe
class Persona4{
    nome:string="";
    cognome:string="";
    constructor(nome:string,cognome:string){
        this.nome=nome;
        this.cognome=cognome;
    }
    static concatena(a:string,b:string){
        return a+" "+b;
    }
}
console.log(Persona4.concatena("Mario","Rossi"));

//extends
class Shape{
    Area:number=0;
    constructor(a:number){
        this.Area=a;
    }
}
class Circle extends Shape{
    disp():void{
        console.log("Area: ",this.Area);
    }
}
let rotondo = new Circle(223);
rotondo.disp();
