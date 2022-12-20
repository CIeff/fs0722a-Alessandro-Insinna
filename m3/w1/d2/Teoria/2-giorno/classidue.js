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
// ridefinire il metodo e invocarlo con super.nomeMetodoClasseBase
var Vehicle = /** @class */ (function () {
    function Vehicle(marca, modello, tipoVeicolo) {
        this.marca = marca;
        this.modello = modello;
        this.tipoVeicolo = tipoVeicolo;
    }
    Vehicle.prototype.dettagliVeicolo = function () {
        return this.tipoVeicolo + " - " + this.marca + " - " + this.modello;
    };
    return Vehicle;
}());
var Cars = /** @class */ (function (_super) {
    __extends(Cars, _super);
    function Cars(marca, modello) {
        return _super.call(this, marca, modello, 'auto') || this;
    }
    Cars.prototype.dettagliVeicolo = function () {
        console.log('Dettagli auto:');
        return _super.prototype.dettagliVeicolo.call(this);
    };
    return Cars;
}(Vehicle));
var jaguar = new Cars('Jaguar', 'F-Type');
var ducati = new Motorbike('Ducati', 'Panigale V4');
console.log(jaguar instanceof Cars); // true
//console.log(ducati instanceof Motorbike); // true
//console.log(ducati instanceof Cars); // false
console.log(jaguar.dettagliVeicolo());
console.log(jaguar.marca);
console.log(jaguar.modello);
console.log(jaguar.tipoVeicolo);
