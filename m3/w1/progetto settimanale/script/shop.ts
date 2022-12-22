    interface ICapoAbbigliamento{
        id:number,
        codProd:number,
        collezione:number,
        capo:string,
        modello:number,
        quantita:number,
        colore:string,
        prezzoIvaEsclusa:number,
        prezzoIvaInclusa:number,
        disponibile:string,
        saldo:number,
        img:string
    }

     abstract class CapoAbbigliamento implements ICapoAbbigliamento{
        id:number;
        codProd:number;
        collezione:number;
        capo:string;
        modello:number;
        quantita:number;
        colore:string;
        prezzoIvaEsclusa:number;
        prezzoIvaInclusa:number;
        disponibile:string;
        saldo:number;
        img:string;
        constructor(id:number,codProd:number,collezione:number,capo:string,modello:number,quantita:number
                    ,colore:string,prezzoIvaEsclusa:number,prezzoIvaInclusa:number,disponibile:string,saldo:number,img:string){
                        this.id=id;
                        this.codProd=codProd;
                        this.collezione=collezione;
                        this.capo=capo;
                        this.modello=modello;
                        this.quantita=quantita;
                        this.colore=colore;
                        this.prezzoIvaEsclusa=prezzoIvaEsclusa;
                        this.prezzoIvaInclusa=prezzoIvaInclusa;
                        this.disponibile=disponibile;
                        this.saldo=saldo;
                        this.img=img;
                    }
        getSaldoCapo(){
            return (this.prezzoIvaInclusa/100)*this.saldo;
        };
        getAcquistoCapo(){
            return this.prezzoIvaInclusa-(this.prezzoIvaInclusa/100)*this.saldo;
        }
    }

    class CapoAbbigliamento2 extends CapoAbbigliamento{};

    let ListaCapi= async function(){
        try{
            let lista= await fetch("../script/oggettoArticoli.json");
            return lista.json();
        }
        catch{
            console.log("Errore nel caricamento dei dati");
        }
    }
  
   let abc= async function(){
        let lista = await ListaCapi();
        console.log(lista);

        for (let capo of lista){
            let CapoAbbigliamentoX = new CapoAbbigliamento2(capo.id,capo.codProd,capo.collezione,capo.capo,capo.modello,capo.quantita,capo.colore,capo.prezzoivaesclusa,capo.prezzoivainclusa,capo.disponibile,capo.saldo,capo.img);
            console.log(CapoAbbigliamentoX);
            console.log(CapoAbbigliamentoX.getSaldoCapo());
            console.log(CapoAbbigliamentoX.getAcquistoCapo());            
        }
    }
    abc()