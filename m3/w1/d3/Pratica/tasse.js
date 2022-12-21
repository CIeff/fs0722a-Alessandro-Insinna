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
var Lavoratore = /** @class */ (function () {
    function Lavoratore(nome, codReddito, redditoAnnuoLordo, tasseInps, tasseIrpef) {
        this.nome = nome;
        this.codReddito = codReddito;
        this.redditoAnnuoLordo = redditoAnnuoLordo;
        this.tasseInps = tasseInps;
        this.tasseIrpef = tasseIrpef;
    }
    return Lavoratore;
}());
var Lavorate1 = /** @class */ (function (_super) {
    __extends(Lavorate1, _super);
    function Lavorate1() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    Lavorate1.prototype.getUtileTasse = function () {
        var utile = this.redditoAnnuoLordo - this.codReddito;
        console.log("Utile per la conta delle tass: " + utile);
        return utile;
    };
    Lavorate1.prototype.getTasseInps = function () {
        var tassoInps = this.tasseInps;
        var utile = this.getUtileTasse();
        var tasseInps2 = (utile / 100) * tassoInps;
        console.log("Tasse Inps: " + tasseInps2);
        return tasseInps2;
    };
    Lavorate1.prototype.getTasseIrpef = function () {
        var tassoIrpef = this.tasseIrpef;
        var utile = this.getUtileTasse();
        var tasseIrpef2 = (utile / 100) * tassoIrpef;
        console.log("Tasse Irpef: " + tasseIrpef2);
        return tasseIrpef2;
    };
    Lavorate1.prototype.getRedditoAnnuoNetto = function () {
        var utile = this.getUtileTasse();
        var tasseInps2 = this.getTasseInps();
        var tasseIrpef2 = this.getTasseIrpef();
        var redditoAnnuoNetto = utile - tasseInps2 - tasseIrpef2;
        console.log("Reddito annuo netto: " + redditoAnnuoNetto);
        return redditoAnnuoNetto;
    };
    return Lavorate1;
}(Lavoratore));
var mariolo = new Lavorate1("Mario", 0, 899, 9, 25);
console.log(mariolo);
mariolo.getRedditoAnnuoNetto();
