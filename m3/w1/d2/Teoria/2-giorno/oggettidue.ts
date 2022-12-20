/* private
class Persona {
    nome:string;
    cognome:string;
    private visualizzaNomeCognome() {               // se non dichiaro nulla è pubblico e quindi accessibile dall'esterno
        return this.nome + ' ' + this.cognome
    } 
}
var marioRossi = new Persona();
marioRossi.nome = "Mario";
marioRossi.cognome = "Rossi";
console.log(marioRossi.visualizzaNomeCognome()); // Mario Rossi
*/

// static -> si usa quando voglio usare un metodo senza necessità di creare un'istanza della classe
/*
class Persona {
    nome:string;
    cognome:string;
    constructor(nome:string,cognome:string) {
        this.nome = nome;
        this.cognome = cognome;
    }
    static concatena(a:string, b:string) {
        return a + " " + b;
    }
} 
console.log(Persona.concatena("Mario", "Rossi"));
*/

// extends -> estendo una classe
class Shape {
    Area:number

    constructor(a:number) {
        this.Area = a
    }
}
class Circle extends Shape {        // la classe figlia eredita dalla classe genitore (accede implicitamente)
    disp():void {
        console.log("Area of the circle: "+this.Area)
    }
}
var obj = new Circle(223);
obj.disp();

// extends multilivello
class Root {
    str:string
}
class Child extends Root {}
class Leaf extends Child {} // eredita indirettamente da Root
var obje = new Leaf();
obje.str = "hello";
console.log(obje.str)
