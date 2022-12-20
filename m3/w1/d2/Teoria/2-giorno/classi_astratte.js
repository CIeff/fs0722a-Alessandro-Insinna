var __extends = (this && this.__extends) || (function () {
    var extendStatics = Object.setPrototypeOf ||
        ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
        function (d, b) { for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p]; };
    return function (d, b) {
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
// keyword abstract -> classi base che non possono essere istanziate
// devono avere almeno un metodo su cui farò la dichiarazione senza che venga implementato
var Veicolo = /** @class */ (function () {
    function Veicolo(marca, modello, colore) {
        this.marca = marca;
        this.modello = modello;
        this.colore = colore;
    }
    Veicolo.prototype.vernicia = function (colore) {
        this.colore = colore;
    };
    Veicolo.prototype.coloreCorrente = function () {
        return this.colore;
    };
    return Veicolo;
}());
var Automobile = /** @class */ (function (_super) {
    __extends(Automobile, _super);
    function Automobile(marca, modello, colore) {
        return _super.call(this, marca, modello, colore) || this;
    }
    Automobile.prototype.dettagliVeicolo = function () {
        return this.marca + " - " + this.modello;
    };
    return Automobile;
}(Veicolo));
//const veicolo = new Veicolo('Jaguar', 'F-Type', 'nero')
var jaguars = new Automobile('Jaguar', 'F-Type', 'nero');
console.log(jaguars.dettagliVeicolo()); // Jaguar - F-Type
console.log(jaguars.coloreCorrente()); // nero
jaguars.vernicia('rosso');
console.log(jaguars.coloreCorrente()); // rosso
