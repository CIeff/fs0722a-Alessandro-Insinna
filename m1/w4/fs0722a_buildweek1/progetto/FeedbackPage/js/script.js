
// creo array con icone usando spread operator
const ratingStars = [...document.getElementsByClassName("rating_star")];




// riceve argomento array ratingStars 
function executeRating(stars, result) {
    // se sono piene
    const starClassActive = "rating_star fas fa-star";

    // se sono vuote
    const starClassUnactive = "rating_star far fa-star";

    // lunghezza array messo in parametro
    const starsLength = stars.length;

    // inizializzione index per ciclo
    let i;

    // map per ogni click sulla stellina
    stars.map((star) => {
        // i è uguale all'indice della stella premuta
        star.onclick = () => {
            // i è uguale alla stella cliccata 
            i = stars.indexOf(star);

            // se la stella è stata cliccata viene attribuito la classe inattiva, partirra il ciclo
            if (star.className.indexOf(starClassUnactive) !== -1) {
                // al click della stella, il ciclo serve per cliccare le stelle precendeti
                printRatingResult(result, i + 1);
                for (i; i >= 0; --i) stars[i].className = starClassActive;
            }
            // else fa l'opposto, mi deseleziona le stelle che sono a destra delle stelle che a selezionato l'utente
            else {
                printRatingResult(result, i);
                for (i; i < starsLength; ++i) stars[i].className = starClassUnactive;
            }
        };
        console.log(printRatingResult)
    });
}

// funzione vuote da richiamare nella executeRating
function printRatingResult(result, num = 0) {

}
//richiamo funzione
executeRating(ratingStars);




function inviaFeed() {
    popUp();
    document.querySelector("#inputBox").value = " ";
}
function noPopUp() {
    document.querySelector(".popUp").classList.add("none");
}

function popUp() {
    document.querySelector(".popUp").classList.remove("none");
}

let popUpButton = document.querySelector(".popUpButton");
popUpButton.addEventListener("click", function () {
    noPopUp();
})


