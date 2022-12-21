abstract class Lavoratore{
    nome:string;
    codReddito:number;
    redditoAnnuoLordo:number;
    tasseInps:number;
    tasseIrpef:number;
    constructor(nome:string,codReddito:number,redditoAnnuoLordo:number,tasseInps:number,tasseIrpef:number){
        this.nome=nome;
        this.codReddito=codReddito;
        this.redditoAnnuoLordo=redditoAnnuoLordo;
        this.tasseInps=tasseInps;
        this.tasseIrpef=tasseIrpef;
    }
}

class Lavorate1 extends Lavoratore{
    getUtileTasse():number{
        let utile:number=this.redditoAnnuoLordo-this.codReddito;
        console.log("Utile per la conta delle tass: "+utile);
        return utile;
    }
    getTasseInps():number{
        let tassoInps:number=this.tasseInps
        let utile=this.getUtileTasse();
        let tasseInps2:number=(utile/100)*tassoInps;
        console.log("Tasse Inps: "+tasseInps2);
        return tasseInps2;
    }
    getTasseIrpef():number{
        let tassoIrpef:number=this.tasseIrpef;
        let utile=this.getUtileTasse();
        let tasseIrpef2=(utile/100)*tassoIrpef;
        console.log("Tasse Irpef: "+tasseIrpef2);
        return tasseIrpef2;
    }
    getRedditoAnnuoNetto():number{
        let utile:number=this.getUtileTasse();
        let tasseInps2:number=this.getTasseInps();
        let tasseIrpef2=this.getTasseIrpef();
        let redditoAnnuoNetto=utile-tasseInps2-tasseIrpef2;
        console.log("Reddito annuo netto: "+redditoAnnuoNetto);
        return redditoAnnuoNetto;
    }
}

let mariolo = new Lavorate1("Mariolo",0,899,9,25);
console.log(mariolo);
mariolo.getRedditoAnnuoNetto();

let marione = new Lavorate1("Marione",1,2543,10,26);
console.log(marione);
marione.getRedditoAnnuoNetto();