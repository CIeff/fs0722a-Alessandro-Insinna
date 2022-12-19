let giocatore1;
let giocatore2;
function comparaNumeri(n1, n2) {
    let numeroCasuale = Math.floor(Math.random() * (100 - 1) + 1);
    console.log(numeroCasuale);
    n1 == numeroCasuale ? console.log("Giocatore 1 ha azzaccato il numero casuale")
        : n2 == numeroCasuale ? console.log("Giocatore 2 ha azzaccato il numero casuale")
            : (Math.abs(n1 - numeroCasuale)) > (Math.abs(n2 - numeroCasuale)) ? console.log("nessuno dei due giocatore ha azzeccato il numero casuale ma il giocatore 2 si è avvicinato di più!")
                : console.log("nessuno dei due giocatore ha azzeccato il numero casuale ma il giocatore 1 si è avvicinato di più!");
}
comparaNumeri(40, 80);
console.log("------------------------------------------");
let btn = document.querySelector("#ok");
let numeroProva = document.querySelector("#numero");
btn.addEventListener("click", function () {
    let numeroProva1 = parseInt(numeroProva.value);
    let result = (numeroProva1 * 3 + 6) / 3 - numeroProva1;
    console.log("Se si moltiplica il numero inserito per 3");
    console.log("Poi si aggiunge 6");
    console.log("e successivamente si divide il numero per 3");
    console.log("e alla fine si sottrae il numero inserito");
    console.log("il risultato sarà: " + result);
    console.log("----------------------------------------");
    let catetoMag = (numeroProva1 * Math.sqrt(3)) / 2;
    console.log("cateto maggiore: ", catetoMag);
    let catetoMin = (numeroProva1 / 2);
    console.log("cateto minore: ", catetoMin);
    let pitagora = Math.sqrt(numeroProva1 * numeroProva1 - catetoMag * catetoMag);
    console.log("Ipotenusa^2: ", (numeroProva1 * numeroProva1), " Cateto maggiore^2: ", (catetoMag * catetoMag));
    console.log("cateto minore^2: ", (numeroProva1 * numeroProva1 - catetoMag * catetoMag));
    console.log("cateto minore ", pitagora);
});
