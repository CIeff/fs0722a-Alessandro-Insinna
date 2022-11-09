// Esercizi aggiuntivi (facoltativi) per D4

/* EXTRA 1
 Scrivi una funzione chiamata "checkArray" che riceve un array di numeri casuali (creati con la funzione "giveMeRandom") e per ogni elemento stampa in console
 se il suo valore è maggiore di 5 o no.
 La funzione deve inoltre ritornare la somma di tutti i valori maggiori di 5.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
/*
function giveMeRandom(n)
{
    let arr=[];
    for (let i=0;i<n;i++)
    {
        arr.push(Math.floor(Math.random()*11));
    }
    console.table(arr);
    return arr;
    
}

   function checkArray(arr)
   {
    let somma=0;
    for(number of arr)
    {
        if(number>5)
        {
            
            console.log(number);
            somma+=number;
        }
    }
    console.log(somma);
    return somma;
   }

   checkArray(giveMeRandom(10));
*/


/* EXTRA 2
 Nel tuo eCommerce disponi di un'array di oggetti chiamato "shoppingCart". Ognuno di questi oggetti ha le seguenti proprietà: "price", "name", "id" e "quantity".
 Crea una funzione chiamata "shoppingCartTotal" che calcola il totale dovuto al negozio (tenendo conto delle quantità di ogni oggetto).
*/

/* SCRIVI QUI LA TUA RISPOSTA */


/* EXTRA 2
 Nel tuo eCommerce disponi di un'array di oggetti chiamato "shoppingCart". Ognuno di questi oggetti ha le seguenti proprietà: "price", "name", "id" e "quantity".
 Crea una funzione chiamata "shoppingCartTotal" che calcola il totale dovuto al negozio (tenendo conto delle quantità di ogni oggetto).
*/
/*
let shoppingCart = [];
function Shopping(price, name, id, quantity) {
  this.price = price;
  this.name = name;
  this.id = id;
  this.quantity = quantity;
}
//riempio la shoppingCart con degli oggetti
for (let i = 0; i < 10; i++) {
  let rnd = Math.round(Math.random() * 15);
  shoppingCart[i] = new Shopping(
    rnd,
    `Subscription n.${i}`,
    i,
    5
  );
}

/*
function shoppingCartTotal(shoppingCart) {
  let total = 0;
  for (g of shoppingCart) {
    total += g.price * g.quantity;
  }
  return total;
}

*/











/* EXTRA 3
 Nel tuo eCommerce disponi di un'array di oggetti chiamato "shoppingCart". Ognuno di questi oggetti ha le seguenti proprietà: "price", "name", "id" e "quantity".
 Crea una funzione chiamata "addToShoppingCart" che riceve un nuovo oggetto dello stesso tipo, lo aggiunge a "shoppingCart" e ritorna il nuovo numero totale degli elementi.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
/*
function addToShoppingCart(obj) {
    let l = shoppingCart.length;
    shoppingCart[l] = obj;
    return l + 1;
  }
  */










/* EXTRA 4
 Nel tuo eCommerce disponi di un'array di oggetti chiamato "shoppingCart". Ognuno di questi oggetti ha le seguenti proprietà: "price", "name", "id" e "quantity".
 Crea una funzione chiamata "maxShoppingCart" che riceve l'array "shoppingCart" e ritorna l'oggetto più costoso in esso contenuto.
*/

/* SCRIVI QUI LA TUA RISPOSTA */



let shoppingCart = [];
function Shopping(price, name, id, quantity) {
  this.price = price;
  this.name = name;
  this.id = id;
  this.quantity = quantity;
}

//riempio la shoppingCart con degli oggetti


for (let i = 0; i < 10; i++) {
  let rnd = Math.round(Math.random() * 15);
  shoppingCart[i] = new Shopping(
    rnd,
    `Subscription n.${i}`,
    i,
    5
  );
}


function maxShoppingCart(shoppingCart)
{
    max=0;
    let i=0;
    let j;
    shoppingCart.forEach(element=>
        {
            if (element.price>max)
            {
                max=element.price;
                j=i;
            }
            i++;
        })
        console.log(shoppingCart[j]);
};



















/* EXTRA 5
 Nel tuo eCommerce disponi di un'array di oggetti chiamato "shoppingCart". Ognuno di questi oggetti ha le seguenti proprietà: "price", "name", "id" e "quantity".
 Crea una funzione chiamata "latestShoppingCart" che riceve l'array "shoppingCart" e ritorna l'ultimo elemento.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* EXTRA 6
 Crea una funzione chiamata "loopUntil" che riceve un numero intero come parametro con valore tra 0 e 9.
 La funzione è composta da un ciclo che stampa un numero casuale tra 0 e 9 finchè il numero casuale non è maggiore di x per tre volte di fila.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* EXTRA 7
Crea una funzione chiamata "average" che riceve un array come parametro e ne ritorna la media aritmetica. La funzione salta automaticamente i valori non numerici nell'array.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* EXTRA 8
 Crea una funzione chiamata "longest" che trova la stringa più lunga all'interno di un array di stringhe fornito come parametro.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* EXTRA 9
 Crea una funzione per creare un filtro anti-spam per la tua casella email. La funzione riceve un parametro stringa chiamato "emailContent", e torna un valore booleano.
 La funzione deve ritornare true se "emailContent" non contiene le parole "SPAM" o "SCAM".
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* EXTRA 10
 Scrivi una funzione che riceve una data come parametro, e calcola il numero di giorni passati da quella data.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

/* EXTRA 11
 Scrivi una funzione chiamata "matrixGenerator" che riceve come paremetri due numeri interi, "x" e "y".
 Il risultato deve essere una matrice di "x" volte "y", e i valori devono rispecchiare gli indici della posizione all'interno della matrice.
 Es.: x = 3, y = 2
 ["00","01","02"
 "10","11","12"]
*/

/* SCRIVI QUI LA TUA RISPOSTA */
