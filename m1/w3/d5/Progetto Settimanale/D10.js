/*
REGOLE
- Tutte le risposte devono essere scritte in JavaScript
- Se sei in difficoltà puoi chiedere aiuto a un Teaching Assistant
- Puoi usare Google / StackOverflow ma solo quanto ritieni di aver bisogno di qualcosa che non è stato spiegato a lezione
- Puoi testare il tuo codice in un file separato, o de-commentando un esercizio alla volta
- Per farlo puoi utilizzare il terminale Bash, quello di VSCode o quello del tuo sistema operativo (se utilizzi macOS o Linux)
*/
/* Questo array viene usato per gli esercizi. Non modificarlo. */

const movies = [
  {
    Title: "The Lord of the Rings: The Fellowship of the Ring",
    Year: "2001",
    imdbID: "tt0120737",
    Type: "movie",
    Poster:
      "https://m.media-amazon.com/images/M/MV5BN2EyZjM3NzUtNWUzMi00MTgxLWI0NTctMzY4M2VlOTdjZWRiXkEyXkFqcGdeQXVyNDUzOTQ5MjY@._V1_SX300.jpg",
  },

  {
    Title: "The Lord of the Rings: The Return of the King",
    Year: "2003",
    imdbID: "tt0167260",
    Type: "movie",
    Poster:
      "https://m.media-amazon.com/images/M/MV5BNzA5ZDNlZWMtM2NhNS00NDJjLTk4NDItYTRmY2EwMWZlMTY3XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg",
  },
  {
    Title: "The Lord of the Rings: The Two Towers",
    Year: "2002",
    imdbID: "tt0167261",
    Type: "movie",
    Poster:
      "https://m.media-amazon.com/images/M/MV5BNGE5MzIyNTAtNWFlMC00NDA2LWJiMjItMjc4Yjg1OWM5NzhhXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_SX300.jpg",
  },
  {
    Title: "Lord of War",
    Year: "2005",
    imdbID: "tt0399295",
    Type: "movie",
    Poster:
      "https://m.media-amazon.com/images/M/MV5BMTYzZWE3MDAtZjZkMi00MzhlLTlhZDUtNmI2Zjg3OWVlZWI0XkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SX300.jpg",
  },
  {
    Title: "Lords of Dogtown",
    Year: "2005",
    imdbID: "tt0355702",
    Type: "movie",
    Poster:
      "https://m.media-amazon.com/images/M/MV5BNDBhNGJlOTAtM2ExNi00NmEzLWFmZTQtYTZhYTRlNjJjODhmXkEyXkFqcGdeQXVyNDk3NzU2MTQ@._V1_SX300.jpg",
  },
  {
    Title: "The Lord of the Rings",
    Year: "1978",
    imdbID: "tt0077869",
    Type: "movie",
    Poster:
      "https://m.media-amazon.com/images/M/MV5BOGMyNWJhZmYtNGQxYi00Y2ZjLWJmNjktNTgzZWJjOTg4YjM3L2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg",
  },
  {
    Title: "Lord of the Flies",
    Year: "1990",
    imdbID: "tt0100054",
    Type: "movie",
    Poster:
      "https://m.media-amazon.com/images/M/MV5BOTI2NTQyODk0M15BMl5BanBnXkFtZTcwNTQ3NDk0NA@@._V1_SX300.jpg",
  },
  {
    Title: "The Lords of Salem",
    Year: "2012",
    imdbID: "tt1731697",
    Type: "movie",
    Poster:
      "https://m.media-amazon.com/images/M/MV5BMjA2NTc5Njc4MV5BMl5BanBnXkFtZTcwNTYzMTcwOQ@@._V1_SX300.jpg",
  },
  {
    Title: "Greystoke: The Legend of Tarzan, Lord of the Apes",
    Year: "1984",
    imdbID: "tt0087365",
    Type: "movie",
    Poster:
      "https://m.media-amazon.com/images/M/MV5BMTM5MzcwOTg4MF5BMl5BanBnXkFtZTgwOTQwMzQxMDE@._V1_SX300.jpg",
  },
  {
    Title: "Lord of the Flies",
    Year: "1963",
    imdbID: "tt0057261",
    Type: "movie",
    Poster:
      "https://m.media-amazon.com/images/M/MV5BOGEwYTlhMTgtODBlNC00ZjgzLTk1ZmEtNmNkMTEwYTZiM2Y0XkEyXkFqcGdeQXVyMzU4Nzk4MDI@._V1_SX300.jpg",
  },
  {
    Title: "The Avengers",
    Year: "2012",
    imdbID: "tt0848228",
    Type: "movie",
    Poster:
      "https://m.media-amazon.com/images/M/MV5BNDYxNjQyMjAtNTdiOS00NGYwLWFmNTAtNThmYjU5ZGI2YTI1XkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_SX300.jpg",
  },
  {
    Title: "Avengers: Infinity War",
    Year: "2018",
    imdbID: "tt4154756",
    Type: "movie",
    Poster:
      "https://m.media-amazon.com/images/M/MV5BMjMxNjY2MDU1OV5BMl5BanBnXkFtZTgwNzY1MTUwNTM@._V1_SX300.jpg",
  },
  {
    Title: "Avengers: Age of Ultron",
    Year: "2015",
    imdbID: "tt2395427",
    Type: "movie",
    Poster:
      "https://m.media-amazon.com/images/M/MV5BMTM4OGJmNWMtOTM4Ni00NTE3LTg3MDItZmQxYjc4N2JhNmUxXkEyXkFqcGdeQXVyNTgzMDMzMTg@._V1_SX300.jpg",
  },
  {
    Title: "Avengers: Endgame",
    Year: "2019",
    imdbID: "tt4154796",
    Type: "movie",
    Poster:
      "https://m.media-amazon.com/images/M/MV5BMTc5MDE2ODcwNV5BMl5BanBnXkFtZTgwMzI2NzQ2NzM@._V1_SX300.jpg",
  },
];

// JS Basics

/* ESERCIZIO A
  Crea una variabile chiamata "sum" e assegnaci il risultato della somma tra i valori 10 e 20.
*/

let sum = 10 + 20; //creo una variabile somma e svolgo l'operazione

/* ESERCIZIO B
  Crea una variabile chiamata "random" e assegnaci un numero casuale tra 0 e 20 (deve essere generato dinamicamente a ogni esecuzione).
*/

let random = Math.floor(Math.random() * 20); //creo una variabile chiamata random e svolgo la creazione di un numero casuale da 0 a 20

/* ESERCIZIO C
  Crea una variabile chiamata "me" e assegnaci un oggetto contenente le seguenti proprietà: name = il tuo nome, surname = il tuo cognome, age = la tua età.
*/

let me =
  //inizializzo oggetto "me"
  {
    name: "Alessandro", //iniziallo proprietà di me "name"
    surname: "Insinna", //iniziallo proprietà di me "surname"
    age: 25, //iniziallo proprietà di me "age"
  };

/* ESERCIZIO D
  Crea del codice per rimuovere programmaticamente la proprietà "age" dall'oggetto precedentemente creato.
*/

delete me.age; //uso delete per cancellare la proprietà "age" dell'oggetto "me"

/* ESERCIZIO E
  Crea del codice per aggiungere programmaticamente all'oggetto precedentemente creato un array chiamato "skills", contenente i linguaggi di programmazione che conosci.
*/

let skills = ["javascript"]; //Inizializzo una variabile array contenente una sola stringa "javascript"
me.skills = skills; //creo una nuova proprietà nell'oggetto "me" che ha le stesse caratteristiche della variabile "skills precedentemente creata"

/* ESERCIZIO F
  Crea un pezzo di codice per aggiungere un nuovo elemento all'array "skills" contenuto nell'oggetto "me".
*/

me.skills.push("non conosco altri linguaggi"); //uso il metodo "push" per inserire un nuovo elemento nell'array precedentemente inserito nell'oggetto "me"

/* ESERCIZIO G
  Crea un pezzo di codice per rimuovere programmaticamente l'ultimo elemento dall'array "skills" contenuto nell'oggetto "me".
*/

me.skills.pop(me.skills[1]); //uso il metodo "pop" per eliminare l'ultimo elemento dell'array "skills" nell'oggetto "me"

// Funzioni

/* ESERCIZIO 1
  Crea una funzione chiamata "dice": deve generare un numero casuale tra 1 e 6.
*/

let numeroCasuale; // creo una variabile "numeroCasuale"
function dice() {
  // creo una funzione "dice"
  numeroCasuale = Math.ceil(Math.random() * 6); // riassegno la variabile precedentemente creata con un numero casuale da 1 a 6 tramite lo strumento "Math.ceil" che mi arrotonda per eccesso i numeri creati dallo strumento "Math.random"
}
dice(); // richiamo la funzione

/* ESERCIZIO 2
  Crea una funzione chiamata "whoIsBigger" che riceve due numeri come parametri e ritorna il maggiore dei due.
*/

function whoIsBigger(num1, num2) {
  //creo una funzione "whoIsBigger" che prende in entrata 2 parametri (num1,num2)
  //num1>num2?console.log(num1+" è maggiore di "+num2):console.log(num2+" è maggiore di "+num1);    //uso un operatore ternario per comparare i 2 numeri e ritornare il maggiore con un console.log
  let num; //creo una variabile "num"
  if (num1 > num2) {
    // metto in paragone i 2 parametri in entrata con un "if"
    num = num1; //se l'if torna positiva la condizione iniziale, assegna il valore di "num1" alla variabile "num"
  } // stabilisco altri comandi per condizione non veritiera nell'if soprastante con un "else"
  else {
    num = num2; // assegno il valore di "num2" alla variabile "num" in caso la condizione dell'if non sia verificato e sia iniziato l'operatore "else"
  }
  console.log(num); // torno il valore della variabile "num" riassegnata ora con valore maggiore tra i 2 numeri presi in entrata come paramenti in un console.log
}
whoIsBigger(2, 3); // richiamo la funzione "whoIsBigger" e assegno come parametri in entrata 2 numeri che voglio paragonare;

/* ESERCIZIO 3
  Crea una funzione chiamata "splitMe" che riceve una stringa come parametro e ritorna un'array contenente ogni parola della stringa.

  Es.: splitMe("I love coding") => ritorna ["I", "Love", "Coding"]
*/

function splitMe(str) {
  // creo una funzione chiamata "splitMe" che riceve una stringa come parametro in entrata
  let arr = str.split(" "); // creo una variabile "arr" a cui assegno come valore la risultante del metodo "split" applicato alla stringa in entrata (risultate in un array( metto uno spazio nel metodo per specificare quando eseguire la divisione di ogni lettera ))
  console.log(arr); // console.log di "arr" mostra il risultato del metodo applicato alla stringa in entrata ( mi ritorna un array con ogni parola come elemento a se)
}
splitMe("I love coding"); // richiamo la funzione e inserisco una stringa valida come parametro in entrata

/* ESERCIZIO 4
  Crea una funzione chiamata "deleteOne" che riceve una stringa e un booleano come parametri.
  Se il valore booleano è true la funzione deve ritornare la stringa senza il primo carattere, altrimenti la deve ritornare senza l'ultimo.
*/

function deleteOne(str, bool) {
  // creo una funzione "deleteOne" che prende come parametri in entrata una stringa e un booleano (true/false)
  if (bool) {
    // con un operatore if verifico se il boolean in entrata come parametro sia vero
    console.log(str.slice(1, str.length)); // entrati nel ciclo per verifica effetuata positivamente ritorno un console.log della stringa utilizzando il metodo "slice" per eliminare la prima lettera della stringa
  } // do come direttiva alternativa del codice se l'if non viene soddisfatto
  else {
    console.log(str.slice(str.lengt, -1)); // ritorno un console.log della stringa alla quale applico un metodo slice per togliere l'ultima lettera della stringa
  }
}
deleteOne("EPICODE", true); // richiamo la funzione e do i parametri richiesti in entrata

/* ESERCIZIO 5
  Crea una funzione chiamata "onlyLetters" che riceve una stringa come parametro e la ritorna eliminando tutte le cifre numeriche.

  Es.: onlyLetters("I have 4 dogs") => ritorna "I have dogs"
*/

function onlyLetters(str)                         // creo una funzione chiamata "onlyLetters" che accetta un parametro in entrata come stringa
{ 
  let words=str.split("");                        // inizializzo una variabile che ha come valore il risultato del metodo split applicato al parametro str
  console.log(words);                             // console.log per verificare il risultato
  let w2=[];                                      // creo un vettore vuoto

  for(let w of words)                             // ciclo "for -of" per la variabile words
  { 
    isNumeric(w);                                 // richiamo la funzione
    console.log(isNumeric(w));                    // console log per verifica visiva
    if(!isNumeric(w))                             // operatore if per paragonare se la lettera "w" torna come stringa o numero
    {
         w2.push(w);                               // in caso sia verificato l'operatore "if" pusho nell'array vuoto la lettera verificata stringa
         
    }
  }
  w2=w2.join("");                                 // passo l'array a stringa complessiva
  console.log(w2);                                // console log per verifica visiva
} 
onlyLetters("I have 4 dogs");                     // richiamo la funzione con stringa come parametro


function isNumeric(str) 
{                             // funzione per verificare se una stringa contiene un numero 
  return !isNaN(parseFloat(str)) && isFinite(str);    //return della funzione per verificare se il risultante sia NaN o numero finito
}


/* ESERCIZIO 6
  Crea una funzione chiamata "isThisAnEmail" che riceve una stringa come parametro e ritorna true se la stringa è un valido indirizzo email.
*/

function isThisAnEmail(str)                        //creo funzione che accetta stringa come parametro
{                             
  let words=str.split("");                         // divido la stringa 
 
                                      
    if(str.includes("@")&&(str.includes(".com")|| str.includes(".it")))  // operatore if per verificare se ci sono simboli specifici nella stringa data
    {
        console.log("email valida")                                       // console log di ritorno se è verificato l'operatore if
    }
    else
    {
        console.log("email non valida")                                 // console log di ritorno se non è verificato
    }
  
}
isThisAnEmail("abc@cg.it");                                                 // richiamo la variabile con la stringa in entrata
/* ESERCIZIO 7
  Scrivi una funzione chiamata "whatDayIsIt" che ritorna il giorno della settimana corrente.
*/

function WhatDayIsIt() {                                              //creo funzione
  let data = new Date();                                              //inizializzo la variabile data come una nuova data
  let options = {                                                     //creo un oggetto
    weekday: "long",                                                  //proprietà oggetto 
    day: "numeric",                                                  //proprietà oggetto 
    month: "long",                                                  //proprietà oggetto 
    year: "numeric",                                                  //proprietà oggetto 
  };
  console.log(data.toLocaleDateString("it-IT", options));             // console log di ritorno 
}
WhatDayIsIt();                                                        // richiamo la funzione

/* ESERCIZIO 8
  Scrivi una funzione chiamata "rollTheDices" che riceve un numero come parametro.
  Deve invocare la precedente funzione dice() il numero di volte specificato nel parametro, e deve tornare un oggetto contenente una proprietà "sum":
  il suo valore deve rappresentare il totale di tutti i valori estratti con le invocazioni di dice().
  L'oggetto ritornato deve anche contenere una proprietà "values", contenente un array con tutti i valori estratti dalle invocazioni di dice().

  Example:
  rollTheDices(3) => ritorna {
      sum: 10
      values: [3, 3, 4]
  }
*/





function rollTheDices(n)                                    //creo una funzione che accetta numero come parametro in entrata
{
  var ojb={  };                                             // creo oggetto vuoto
  let value=[];                                             //creo array vuoto
  let sum=0;                                                // creo variabile sum =0
  for(i=0;i<n;i++)                                          // ciclo for 
  {
    dice();                                                 // richiamo la funzione dice
    value.push(numeroCasuale);                             // aggiungo il numero all'array
    sum+=numeroCasuale;                                    // aggiungo il valore a sum 
  }
  console.log(value);                                       // console log di value
  console.log(sum);                                         // console log sum
  ojb.value=value;                                          // aggiungo value all'oggetto
  ojb.somma=sum;                                            // aggiungo somma all'oggetto
  console.table(ojb);                                       // console table per vedere oggetto
  return ojb;                                               // return
}
rollTheDices(3);                                            //richiamo funzione





/* ESERCIZIO 9
  Scrivi una funzione chiamata "howManyDays" che riceve una data come parametro e ritorna il numero di giorni trascorsi da tale data.
*/

function howManyDays(aaaa,mm,gg)                            //creo funzione che accetta 3 parametri numerici in entrata per simulare una data
{
    let dateDiff;                                           // creo variabile 
    let nData=new Date(aaaa,mm,gg);                         // creo variabile nData alla quale assegno valori dei parametri
    let now=new Date();                                     // creo variabile "now" alla quale assegno nuvo data(del pc di default)
    console.log(nData);                                     // console log data inserita
    console.log(now);                                     // console log data Pc
    dateDiff=(now.getTime()-nData.getTime())/(1000*3600*24); // assegno ad una variabile la differenza tra le date dividendo per numeri tramite i quali mi ritornano giorni
    console.log("Sono passati "+Math.floor(dateDiff)+" giorni") // console log con risposta con un "Math.floor" per evitare numeri decimali
}
howManyDays(2022,10,05);                                    // richiamo la funzione con numeri sottoforma di data come parametri in ingresso






/* ESERCIZIO 10
  Scrivi una funzione chiamata "isTodayMyBirthday" che deve ritornare true se oggi è il tuo compleanno, falso negli altri casi.
*/

function isTodayMyBirthday (aaaa,mm,gg)                   //creo funzione che accetta 3 parametri numerici in entrata per simulare una data
{
  let myBDay= new Date("1997/11/08");                     //creo variabile con la data del mio compleanno
  let today=new Date(aaaa,mm,gg);                         // creo variabile "now" alla quale assegno nuvo data(del pc di default)
  let thisMonth=today.getMonth();                         // prendo il mese dalla data di oggi
  let thisDay=today.getDate();                            // prendo il giorno dalla data di oggi
  let myMonth=myBDay.getMonth();                          // prendo il mese dalla data del mio compleanno
  let myDay=myBDay.getDate();                             // prendo il giorno dalla data del mio compleanno
  if((String(myDay)+String(myMonth+1))==(String(thisDay)+String(thisMonth+1)))            // operatore if per comparare il giorno+mese (sottoforma di stringa) del mio compleanno alla data di oggi
  {
    console.log("Oggi è il tuo compleanno, Auguri!!!!")     // console log se l'operatore if è soddisfatto
  }
  else
  {
    console.log("Oggi non è il tuo compleanno :( ")       // console log se l'operatore if non è soddisfatto
  }
  
  
  }   
  isTodayMyBirthday();                                      // richiamo la funzione

// Arrays & Oggetti

// NOTA: l'array "movies" usato in alcuni esercizi è definito alla fine di questo file

/* ESERCIZIO 11
  Scrivi una funzione chiamata "deleteProp" che riceve un oggetto e una stringa come parametri; deve ritornare l'oggetto fornito dopo aver eliminato
  in esso la proprietà chiamata come la stringa passata come secondo parametro.
*/

let ogg={name:"ale",surname:"ciccio",age:25};           // creo oggetto con name surname e age come proprietà
let stringa="name";                                     // inizializzo variabile e associo name
console.log(ogg,stringa);                               // console log oggetto e stringa

function deleteProp(obj,str)                            // creo funzione che prende un oggetto e una stringa come parametri
{
  for(let props in obj)                                 // ciclo "for-in" per ciclare l'oggetto
  {
    if(props==str)                                      // operatore if per paragonare le proprietà dell'oggetto alla stringa
    {
        delete obj[props];                              // cancello proprietà dell'oggetto se if è soddisfatto
    }
  }
  return console.log(obj,str);                          // return console log di oggetto e stringa
  
}
deleteProp(ogg,stringa);                                // richiamo la funzione con un oggetto e una stringa in entrata come parametri


/* ESERCIZIO 12
  Scrivi una funzione chiamata "newestMovie" che trova il film più recente nell'array "movies" fornito.
*/

function newestMovie()                                  // creo funzione
{
  let newestMovie;                                      // creo variabile
  let moviesYear=[];                                    // creo array
  for (let movie of movies)                             // ciclo "for-of" dell'array movies
  {
    moviesYear.push(movie.Year+"-> "+movie.Title)       // pusho l'anno del film e il titolo
  }
  moviesYear.reduce(function (p,c)                      // usando reduce paragono gli elementi del nuovo array
  {
    
    p>c?newestMovie=p:newestMovie=c;                    // operatore ternario per paragonare i 2 parametri del metodo reduce
    return newestMovie;                                 // ritorno l'array
  })
    console.log("Il film più recente è: "+newestMovie)   // console log del risultato
}
newestMovie();                                           // richiamo la funzione


/* ESERCIZIO 13
  Scrivi una funzione chiamata countMovies che ritorna il numero di film contenuti nell'array "movies" fornito.
*/

function countMovies()                                  //creo funzione
{                                          
  let count=movies.length;                               //inizializzo variabile count con valore della lunghezza dell'array film
  console.log(count);                                   // console log del risultato
}
countMovies();                                          // richiamo funzione


/* ESERCIZIO 14
  Scrivi una funzione chiamata "onlyTheYears" che crea un array con solamente gli anni di uscita dei film contenuti nell'array "movies" fornito.
*/

function onlyTheYears ()                                // creo funzione
{
  let moviesYear=[];                                    // creo array vuoto
  for (let movie of movies)                             // ciclo array movies
  {
    moviesYear.push(movie.Year)                         // pusho nell'array vuoto la proprietà year di ogni elemento dell'array movies
  }
  console.log(moviesYear)                               // console log risultto
}
onlyTheYears();                                         // richiamo funzione


/* ESERCIZIO 15
  Scrivi una funzione chiamata "onlyInLastMillennium" che ritorna solamente i film prodotto nel millennio scorso contenuti nell'array "movies" fornito.
*/

function onlyInLastMillennium()                         // creo funzione
{
  let moviesYear=[];                                    // creo array vuoto
  for (let movie of movies)                              // ciclo array movies                          
  {
    if(movie.Year<2000)                                 // operatore if per comparare l'anno del film all'anno 2000
    {
    moviesYear.push(movie.Year)                         // pusho l'anno del film che soddisfa l'operatore if
    }
  }
  console.log(moviesYear)                               // console log risultato
}
  onlyInLastMillennium();                               // richiamo funzione



/* ESERCIZIO 16
  Scrivi una funzione chiamata "sumAllTheYears" che ritorna la somma di tutti gli anni in cui sono stati prodotti i film contenuti nell'array "movies" fornito.
*/

function sumAllTheYears()                               // creo funzione
{
  let moviesYear=[];                                    // creo array vuoto
  let tot=0;                                            // iniziliazzo variabile toto a 0
  for (let movie of movies)                             // ciclo array movies  
  {
    moviesYear=movie.Year*1;                             //trasformo stringa in numero
    tot+=moviesYear;                                    // aggiungo il numero del film alla somma
  }
  console.log(tot);                                      // console log risultato
}
 sumAllTheYears();                                      // richiamo funzione

/* ESERCIZIO 17
  Scrivi una funzione chiamata "searchByTitle" che riceve una stringa come parametro e ritorna i film nell'array "movies" fornito che la contengono nel titolo.
*/

function searchByTitle(str)                               // creo funzione che accetta come parametro una stringa
{
  str=str.toLowerCase();                                  // trasformo la stringa in lower case
  let trovaTitolo=[];                                     // creo array vuoto
  for(let titolo of movies)                               // ciclo for per l'array movies
  {
    if(titolo.Title.toLowerCase().includes(str))          // operatore if per vedere se la il titolo (in lower case) abbia al suo interno la stringa immessa
    {
        trovaTitolo.push(titolo.Title);                   // pusho il titolo nell'array vuoto
    }
  }
  console.table(trovaTitolo);                             // console log risultato
}
searchByTitle("aven");                                    // richiamo la funzione con una stringa parziale come parametro 

/* ESERCIZIO 18
  Scrivi una funzione chiamata "searchAndDivide" che riceve una stringa come parametro e ritorna un oggetto contenente due array: "match" e "unmatch".
  "match" deve includere tutti i film dell'array "movies" fornito che contengono la stringa fornita all'interno del proprio titolo, mentre "unmatch" deve includere tutti i rimanenti.
*/

function searchAndDivide(str)                             // creo funzione che accetta una stringa come parametro
{
  ojb={};                                                 // creo oggetto
  str=str.toLowerCase();                                  // trasformo la stringa in lower case                                   
  let match=[];                                           // creo array vuoto
  let unmatch=[];                                         // creo array vuoto
  for(let titolo of movies)                               // ciclo array movies
  {
    if(titolo.Title.toLowerCase().includes(str))          // paragono il titolo in lower case alla stringa in lower case
    {
       match.push(titolo)                                  // pusho titolo nell'array match se soddisfatto l'if
    }
    else
    {
        unmatch.push(titolo)                              // pusho titolo in unmatch se non soddisfatto l'if
    }
  }
  ojb.match=match;                                        // creo match come proprietà nell'oggetto e do il valore di match
  ojb.unmatch=unmatch;                                        // creo unmatch come proprietà nell'oggetto e do il valore di unmatch
  console.log(ojb);                                       // consol log risultato
}
searchAndDivide("ave");                                  // richiamo la funzione con stringa parziale 


/* ESERCIZIO 19
  Scrivi una funzione chiamata "removeIndex" che riceve un numero come parametro e 
  ritorna l'array "movies" fornito privo dell'elemento nella posizione ricevuta come 
  parametro.
*/

/*
function removeIndex2(num)                                                       // creo funzione che accetta un numero come parametro
{
  let arrayCopia=[...movies];                             // creo array copia di movies
    delete arrayCopia[num];                              // rimuovo l'elemento dell'array con indice pari al numero inserito come parametro(lasciando l'indice vuoto ma senza cancellarlo)
    console.log(arrayCopia)                             // consol log per riscontro visivo
}
removeIndex2(3);
*/ 

function removeIndex(num)                                 // creo funzione che accetta un numero come parametro
{
  let arrayCopia=[...movies];                             // creo array copia di movies
    arrayCopia.splice(num,1);                             // uso splice per togliere l'elemento all'indice uguale al numero inserito nella funzione
    console.log(arrayCopia);                              // console log per riscontro visivo
    console.log(movies);                              // console log per riscontro visivo
}
removeIndex(3);                                         // richiamo funzione

// DOM (nota: gli elementi che selezionerai non si trovano realmente nella pagina)

/* ESERCIZIO 20
  Scrivi una funzione per selezionare l'elemento dotato di id "container" all'interno della pagina.
*/
/*
function selectContainer()                            // creo funzione
{
 let container= document.querySelector("#container");               // inizializzo variabile agganciandola all'id container tramite query selector
}
selectContainer();                                  // richiamo funzione
*/

/* ESERCIZIO 21
  Scrivi una funzione per selezionare ogni tag <td> all'interno della pagina.
*/
/*
function selectAllTd ()                         // creo funzione
{
  let td =document.querySelectorAll("td");             // inizializzo variabile agganciandola all'id td tramite query selector all(che restituisce array )
}
*/

/* ESERCIZIO 22
  Scrivi una funzione che, tramite un ciclo, stampa in console il testo contenuto in ogni tag <td> all'interno della pagina.
*/
/*
function stampAllTd ()                                // creo funzione
{
  let tds= document.querySelectorAll("td");           // inizializzo variabile agganciandola all'id td tramite query selector all (array)
  for(let n of tds)                                   // ciclo array tds
  {
    console.log(n.textContent);                       // consol log del testo 
  }
}
stampAllTd();                                         // richiamo funzione
*/

/* ESERCIZIO 23
  Scrivi una funzione per aggiungere un background di colore rosso a ogni link all'interno della pagina.
*/
/*
function colorLinks()                                 // creo funzione
{
  let links=document.querySelectorAll("a");           // inizializzo variabile agganciandola agli elementi "a" con query selector (array)
  for(let l of links)                                 // ciclo array
  {
    l.style.backgroundColor="red";                    // cambio lo stile di ogni elemento ciclato
  }
}
colorLinks();                                         // richiamo funzione
*/

/* ESERCIZIO 24
  Scrivi una funzione per aggiungere un nuovo elemento alla lista non ordinata con id "myList".
*/
/*
function createListElement()                          // creo funzione
{
  let lista=document.querySelector("#myList");          // inizializzo variabile agganciandola all'id myList
  let li=document.createElement("li");                  // inizializzo variabile creando un elemento li
  let liText=document.createTextNode("Elemento creato");  // inizializzo variabile creando un textNode per create un testo

  li.appendChild(liText);                             // tramite appendChild() inserisco il testo nell'elemento li creato prima
  lista.appendChild(li);                              // tramite appendChild() inserisco l'elemento li (col testo) alla lista

}
createListElement();                                // richiamo funzione
*/

/* ESERCIZIO 25
  Scrivi una funzione per svuotare la lista non ordinata con id "myList".
*/
/*
function svuotaLista()                                  // creo funzione
{
    let lista=document.querySelector("#myList");        // inizializzo variabile agganciandola all'id myList
    while (lista.firstChild)                             // ciclo while. finchè lista.firstChild (primo elemnto della lista) torna vero (ovvero esiste)
    {
    lista.removeChild(lista.firstChild);                // rimuovo ogni volta firstChild dalla lista se esiste
    }
}
svuotaLista();                                          // richiamo funzione
*/

/* ESERCIZIO 26
  Scrivi una funzione per aggiungere ad ogni tag <tr> la classe CSS "test"
*/
/*
function addClassTest()                                 //creo funzione
{
  let trs=document.querySelectorAll("tr");              // creo variabile e la inizializzo agganciandola agli elementi tr (array)
  for (n of trs)                                        // ciclo array degli elementi tr
  {
    n.classList.add("test");                            //aggiungo ad ogni elemento dell'array una classe "test"
  }
}
addClassTest();                                         // richiamo funzione
*/

// [EXTRA] JS Avanzato

/* ESERCIZIO 27
  Crea una funzione chiamata "halfTree" che riceve un numero come parametro e 
  costruisce un mezzo albero di "*" (asterischi) dell'altezza fornita.

  Esempio:
  halfTree(3)

  *
  **
  ***

*/

function halftree2(num)                               // creo funzione che accetta un numero come parametro
{
    let counterVet=[];                                // creo array vuoto                                  
    let simbolo="*";                                  // inizializzo variabile con segno "*"
    for(let i=0;i<num;i++)                            // ciclo for 
    {
        counterVet.push(simbolo);                     // pusho nell'array vuoto il simbolo "*" ogni volta che l'array si ripete
        console.log(counterVet.join(""));             // mostro il console log dopo che trasformo l'array in stringa
    }

}
halftree2(22);                                        // richiamo funzione



/* ESERCIZIO 28
  Crea una funzione chiamata "tree" che riceve un numero come parametro e 
  costruisce un albero di "*" (asterischi) dell'altezza fornita.

  Esempio:
  tree(3)

    *
   ***
  *****

*/


/* ESERCIZIO 29
  Crea una funzione chiamata "isItPrime" che riceve un numero come parametro e 
  ritorna true se il numero fornito è un numero primo.
*/

function isItPrime(numero)                    // creo funzione che accetta un numero come parametro
{ 
    if(numero===1)                            // uguaglio numero a 1
    {
        console.log(numero+ " è primo")                // 1 è un numero primo
    }
    else if(numero===2)                       // uguagli numero a 2
    {
        console.log(numero+ " è primo");               // 2 è primo
    }
    else if(numero===3)                       // uguagli numero a 3
    { 
        console.log(numero+" è primo");               // 3 è primo
    }
    else if(numero>3&&numero%numero!=0||numero%2==0||numero%3==0)     // if che paragona se il numero sia maggiore di 3, se il risultato della divisione con se stesso non sia 0 e se sia divisibile per 2 o per 3
    {
        console.log(numero+ " non è primo");           // se soddisfatto l'ultimo if il numero non è primo
    }
    else if(numero===undefined)                       // se non è inserito nessun numero chiedo di inserirne uno
    {
      console.log("inserisci un numero");             // console log per far inserire un numero
    }
    else
    { 
        console.log(numero+ " è primo")                // se non soddisfa nessun if è primo
    }
}
isItPrime();                                  // richiamo funzione





