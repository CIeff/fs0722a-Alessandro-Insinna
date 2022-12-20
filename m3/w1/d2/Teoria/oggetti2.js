var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Persona3 = /** @class */ (function () {
    function Persona3() {
        this.nome = "";
        this.cognome = "";
    }
    /*private*/ Persona3.prototype.visualizzaNomeCognome = function () {
        return this.nome + " " + this.cognome;
    };
    return Persona3;
}());
var marioRossi = new Persona3();
marioRossi.nome = "Mario";
marioRossi.cognome = "Rossi";
console.log(marioRossi.visualizzaNomeCognome());
//static -> si usa quando voglio usare un metodo senza necessità di creare un'istanza della classe
var Persona4 = /** @class */ (function () {
    function Persona4(nome, cognome) {
        this.nome = "";
        this.cognome = "";
        this.nome = nome;
        this.cognome = cognome;
    }
    Persona4.concatena = function (a, b) {
        return a + " " + b;
    };
    return Persona4;
}());
console.log(Persona4.concatena("Mario", "Rossi"));
//extends
var Shape = /** @class */ (function () {
    function Shape(a) {
        this.Area = 0;
        this.Area = a;
    }
    return Shape;
}());
var Circle = /** @class */ (function (_super) {
    __extends(Circle, _super);
    function Circle() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Circle.prototype.disp = function () {
        console.log("Area: ", this.Area);
    };
    return Circle;
}(Shape));
var rotondo = new Circle(223);
rotondo.disp();
