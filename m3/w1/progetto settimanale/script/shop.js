class CapoAbbigliamento {
    constructor(id, codProd, collezione, capo, modello, quantita, colore, prezzoIvaEsclusa, prezzoIvaInclusa, disponibile, saldo, img) {
        this.id = id;
        this.codProd = codProd;
        this.collezione = collezione;
        this.capo = capo;
        this.modello = modello;
        this.quantita = quantita;
        this.colore = colore;
        this.prezzoIvaEsclusa = prezzoIvaEsclusa;
        this.prezzoIvaInclusa = prezzoIvaInclusa;
        this.disponibile = disponibile;
        this.saldo = saldo;
        this.img = img;
    }
    getSaldoCapo() {
        return (this.prezzoIvaInclusa / 100) * this.saldo;
    }
    ;
    getAcquistoCapo() {
        return this.prezzoIvaInclusa - (this.prezzoIvaInclusa / 100) * this.saldo;
    }
}
class CapoAbbigliamento2 extends CapoAbbigliamento {
}
;
let ListaCapi = async function () {
    try {
        let lista = await fetch("../script/oggettoArticoli.json");
        return lista.json();
    }
    catch (_a) {
        console.log("Errore nel caricamento dei dati");
    }
};
let abc = async function () {
    let lista = await ListaCapi();
    console.log(lista);
    for (let capo of lista) {
        let CapoAbbigliamentoX = new CapoAbbigliamento2(capo.id, capo.codProd, capo.collezione, capo.capo, capo.modello, capo.quantita, capo.colore, capo.prezzoivaesclusa, capo.prezzoivainclusa, capo.disponibile, capo.saldo, capo.img);
        console.log(CapoAbbigliamentoX);
        console.log(CapoAbbigliamentoX.getSaldoCapo());
        console.log(CapoAbbigliamentoX.getAcquistoCapo());

        let card=document.createElement("div");
        card.classList.add("card");
        card.style="width:18rem";

        card.innerHTML=`
                        <img src=${CapoAbbigliamentoX.img} class="card-img-top">
                        <div class="card-body">
                            <h5 class="card-title">${CapoAbbigliamentoX.capo}</h5>
                            <p class="card-text">Prezzo Iva esclusa: ${CapoAbbigliamentoX.prezzoIvaEsclusa}</p>
                            <p class="card-text">Prezzo Iva inclusa: ${CapoAbbigliamentoX.prezzoIvaInclusa}</p>
                            <p class="card-text">Saldo: ${CapoAbbigliamentoX.saldo}%</p>
                            <p class="card-text">Saldo applicato: ${CapoAbbigliamentoX.getSaldoCapo()}</p>
                            <p class="card-text">Prezzo scontato: ${CapoAbbigliamentoX.getAcquistoCapo()}</p>
                            <button class="btn btn-primary">Aggiungi al carrello</button>
                        </div>
                        `;
        let contenitore= document.querySelector(".contenitore");
        contenitore.appendChild(card);
       
    }
    let cards=document.querySelectorAll(".card");
    let btnRimuovi=document.createElement("button");
            btnRimuovi.classList.add("btn","btn-danger");
            btnRimuovi.textContent="Rimuovi dal carrello";
    for (let i=0;i<cards.length;i++){
        let btn=document.querySelectorAll(".btn");
        for(let x=0;x<btn.length;x++){
        btn[i].addEventListener("click",function(){
            cards[i].style.backgroundColor="green";            
            cards[i].appendChild(btnRimuovi);
            btnRimuovi.addEventListener("click",function(){
                cards[i].style.backgroundColor="transparent";
                cards[i].removeChild(btnRimuovi);
            })
        })
        }
        }
};
abc();
