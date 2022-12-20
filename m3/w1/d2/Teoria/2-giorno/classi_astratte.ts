// keyword abstract -> classi base che non possono essere istanziate
// devono avere almeno un metodo su cui farò la dichiarazione senza che venga implementato
abstract class Veicolo {
    private colore: string;     // accessibile solo all'interno della classe    
    protected modello:string;   // accessibile nella classe + nelle estensioni
    protected marca:string;

    constructor(marca:string, modello:string, colore:string){
        this.marca = marca;
        this.modello = modello;
        this.colore = colore;
    }
    public vernicia(colore:string):void {
        this.colore = colore;
    }
    public coloreCorrente():string {
        return this.colore;
    }
    public abstract dettagliVeicolo():string
}
class Automobile extends Veicolo {
    constructor(marca:string, modello:string, colore:string){
        super(marca,modello,colore);
    }
    public dettagliVeicolo(): string {
        return `${this.marca} - ${this.modello}`
    }
}
//const veicolo = new Veicolo('Jaguar', 'F-Type', 'nero')
const jaguars = new Automobile('Jaguar', 'F-Type', 'nero');
console.log(jaguars.dettagliVeicolo()) // Jaguar - F-Type
console.log(jaguars.coloreCorrente()) // nero
jaguars.vernicia('rosso');
console.log(jaguars.coloreCorrente()); // rosso