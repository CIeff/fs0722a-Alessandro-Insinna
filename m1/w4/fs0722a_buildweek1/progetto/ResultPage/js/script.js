

// dal session storage, prendo item chiaveDiOggetto
const value = sessionStorage.getItem("chiaveDiOggetto");
console.log({ value });

// vedo un oggetto dentro l'oggetto che mi fa vedere i valori che preso da pag2
console.log({ object: JSON.parse(value) });

// l'oggetto in cui potremmo lavorare 
const risposte = JSON.parse(value)
console.log(risposte)

// dall'oggetto risposte correte
let corrette = risposte.correct;
console.log(corrette);

// dall'oggetto lunghezza delle domande
let total = risposte.total;
console.log(total);
// risposte sbagliate
let sbagliate = total - corrette;
console.log(sbagliate);

// percentuale risposte corrette
let percGiust = (corrette / total) * 100;
console.log(percGiust);

// percentuale risposte sbagliate
let percSbagliate = (sbagliate / total) * 100;
console.log(percSbagliate);


// n corrette /10
document.getElementById('domande_giuste').innerHTML = corrette + '/' + total + ' questions'
// n sbagliate / 10
document.getElementById('domande_sbagliate').innerHTML = sbagliate + '/' + total + ' questions'
// percentuali giuste
document.getElementById('perc_giusta').innerHTML = percGiust + "%";
// percentuali sbajate
document.getElementById('perc_sbagliata').innerHTML = percSbagliate + "%";


// se le risposte corrette sono maggiori o uguali a sei
if (corrette >= 6) {
    document.querySelector(".Text1").innerHTML = "Congratulations!";
    document.querySelector(".Text1").style.fontSize = "1.2rem";
    document.querySelector("#Text2").innerHTML = "You passed the exam.";
}

// caso in cui sono minori di 6
else {
    document.querySelector(".Text1").innerHTML = "You failed!";
    document.querySelector(".Text1").style.fontSize = "1.2rem";
    document.querySelector("#Text2").innerHTML = "You did not pass the exam.";
    document.querySelector("#Text2").style.color = "#D20094";
}







// funzione per far funzionare la sbarra di progressione dei Results
function progressioneBarraRisultati() {

    // mi aggancio al cerchio in questione
    let path = document.querySelector('#val_cerchio2')
    console.log(path)

    // calcolo la progressione del cerchio che deve effettuare
    let progressionePath = 880 / total * sbagliate
    console.log(progressionePath)


    path.style.strokeDashoffset = `${progressionePath}px`





}

progressioneBarraRisultati()

