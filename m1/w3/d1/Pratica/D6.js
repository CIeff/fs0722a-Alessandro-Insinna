/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Se sei in difficoltà puoi chiedere aiuto a un Teaching Assistant
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per farlo puoi utilizzare il terminale Bash, quello di VSCode o quello del tuo sistema operativo (se utilizzi macOS o Linux)
*/

/* ESERCIZIO 1
 Scrivi una funzione di nome "area", che riceve due parametri (l1, l2) e calcola l'area del rettangolo associato..
*/

/* SCRIVI QUI LA TUA RISPOSTA */

function area(l1,l2)
{
    return l1*l2;
}



/* ESERCIZIO 2
 Scrivi una funzione di nome "crazySum", che riceve due numeri interi come parametri.
 La funzione deve ritornare la somma dei due parametri, ma se il valore dei due parametri è il medesimo deve invece tornare
 la loro somma moltiplicata per tre.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

function crazySum (p1,p2)
{
    return p1===p2?(p1+p2)*3:p1+p2;
}



/* ESERCIZIO 3
 Scrivi una funzione di nome "crazyDiff" che calcola la differenza assoluta tra un numero fornito come parametro e 19.
 Deve inoltre tornare la differenza assoluta moltiplicata per tre qualora il numero fornito sia maggiore di 19.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

function crazyDiff(p)
{
    return p>19?Math.abs(p - 19)*3:Math.abs(p - 19);
}

/* ESERCIZIO 4
 Scrivi una funzione di nome "boundary" che accetta un numero intero n come parametro, e ritorna true se n è compreso tra 20 e 100 (incluso) oppure
 se n è uguale a 400.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

function boundary (n)
{
    return n>20&&n<=100||n==400?true:false;
}

/* ESERCIZIO 5
 Scrivi una funzione di nome "epify" che accetta una stringa come parametro.
 La funzione deve aggiungere la parola "EPICODE" all'inizio della stringa fornita, ma se la stringa fornita comincia già con "EPICODE" allora deve
 ritornare la stringa originale senza alterarla.
*/

/* SCRIVI QUI LA TUA RISPOSTA */

function epify(str)
{
    return str.includes("EPICODE")?str:"EPICODE "+str;
}

/*
const epify=function (str)
{
    if(str.startsWith("EPICODE"))
    {
        return str;
    }
    else
    {
        return "EPICODE "+str;
    }
}
*/


/* ESERCIZIO 6
 Scrivi una funzione di nome "check3and7" che accetta un numero positivo come parametro. La funzione deve controllare che il parametro sia un multiplo
 di 3 o di 7. (Suggerimento: usa l'operatore modulo)
*/

/* SCRIVI QUI LA TUA RISPOSTA */

function check3and7 (num)
{
    return Math.abs(num%3===0|| num%7===0)? true:false;
}

/* ESERCIZIO 7
 Scrivi una funzione di nome "reverseString", il cui scopo è invertire una stringa fornita come parametro (es. "EPICODE" --> "EDOCIPE")
*/

/* SCRIVI QUI LA TUA RISPOSTA */

function reverseString(str)
{
    return str.split("").reverse().join("");
}

/* ESERCIZIO 8
 Scrivi una funzione di nome "upperFirst", che riceve come parametro una stringa formata da diverse parole.
 La funzione deve rendere maiuscola la prima lettera di ogni parola contenuta nella stringa.
*/

/* SCRIVI QUI LA TUA RISPOSTA */


function upperFirst (str)
{
    let word=str.split(" ");
    let finalStr=[];
    for (let i=0;i<word.length;i++)
    {
        let firstChar=word[i].charAt(0);
        let upperCaseChar=firstChar.toUpperCase();
        let cutString=word[i].slice(1);
        let finalWord=upperCaseChar+cutString;
        finalStr.push(finalWord);
    }
    console.log(finalStr.join(" "));
}   
console.log(upperFirst("ciao come stai"));



/* ESERCIZIO 9
 Scrivi una funzione di nome "cutString", che riceve come parametro una stringa. La funzione deve creare una nuova stringa senza il primo e l'ultimo carattere
 della stringa originale.
*/


/* SCRIVI QUI LA TUA RISPOSTA */

function cutString(str)
{
    return str.slice(1,str.length-1);
}




/* ESERCIZIO 10
 Scrivi una funzione di nome "giveMeRandom", che accetta come parametro 
 un numero n e ritorna un'array contenente n numeri casuali 
 inclusi tra 0 e 10.
*/

/* SCRIVI QUI LA TUA RISPOSTA */
/*
function giveMeRandom(n)
{
    let finalNum=[];
    for (let i=0;i<n;i++)
    {
     finalNum.push(Math.floor(Math.random()*10));
     
    }
    return finalNum;
}
*/

function giveMeRandom(n)
{
    let arr=[];
    for (let i=0;i<n;i++)
    {
        arr.push(Math.floor(Math.random()*11));
    }
}