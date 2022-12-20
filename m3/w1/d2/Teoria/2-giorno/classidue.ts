// ridefinire il metodo e invocarlo con super.nomeMetodoClasseBase
class Vehicle {
    modello:string;
    marca:string;
    tipoVeicolo:string;

    constructor(marca:string, modello:string, tipoVeicolo:string) {
        this.marca = marca;
        this.modello = modello;
        this.tipoVeicolo = tipoVeicolo;
    }
    dettagliVeicolo():string {
        return `${this.tipoVeicolo} - ${this.marca} - ${this.modello}`;
    }
}
class Cars extends Vehicle {
    constructor(marca:string, modello:string) {
        super(marca, modello, 'auto');
    }
    dettagliVeicolo(): string {
        console.log('Dettagli auto:');
        return super.dettagliVeicolo();
        }
}

const jaguar = new Cars('Jaguar', 'F-Type');
const ducati = new Motorbike('Ducati', 'Panigale V4');

console.log(jaguar instanceof Cars); // true
//console.log(ducati instanceof Motorbike); // true
//console.log(ducati instanceof Cars); // false
console.log(jaguar.dettagliVeicolo());
console.log(jaguar.marca);
console.log(jaguar.modello);
console.log(jaguar.tipoVeicolo);