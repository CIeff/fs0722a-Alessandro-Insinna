


// variabili globali

// domanda messa a titoletto 
let questionText = document.getElementById("questionText");
// risposte possibili delle domande
let answers = document.getElementsByClassName("answer");

// risposte corrette che verranno aumentate
let risposteCorretteDate = 0;
// numero di domande nell'array
let nDomande = 10;

// indice delle domande
var nDomanda = 0;

// variabile inizializzata
var domanda;

const questions = [
  {
    category: "Science: Computers",
    type: "multiple",
    difficulty: "easy",
    question: "What does CPU stand for?",
    correct_answer: "Central Processing Unit",
    incorrect_answers: [
      "Central Process Unit",
      "Computer Personal Unit",
      "Central Processor Unit",
    ],
  },
  {
    category: "Science: Computers",
    type: "multiple",
    difficulty: "easy",
    question:
      "In the programming language Java, which of these keywords would you put on a variable to make sure it doesn&#039;t get modified?",
    correct_answer: "Final",
    incorrect_answers: ["Static", "Private", "Public"],
  },
  {
    category: "Science: Computers",
    type: "boolean",
    difficulty: "easy",
    question: "The logo for Snapchat is a Bell.",
    correct_answer: "False",
    incorrect_answers: ["True"],
  },
  {
    category: "Science: Computers",
    type: "boolean",
    difficulty: "easy",
    question:
      "Pointers were not used in the original C programming language; they were added later on in C++.",
    correct_answer: "False",
    incorrect_answers: ["True"],
  },
  {
    category: "Science: Computers",
    type: "multiple",
    difficulty: "easy",
    question:
      "What is the most preferred image format used for logos in the Wikimedia database?",
    correct_answer: ".svg",
    incorrect_answers: [".png", ".jpeg", ".gif"],
  },
  {
    category: "Science: Computers",
    type: "multiple",
    difficulty: "easy",
    question: "In web design, what does CSS stand for?",
    correct_answer: "Cascading Style Sheet",
    incorrect_answers: [
      "Counter Strike: Source",
      "Corrective Style Sheet",
      "Computer Style Sheet",
    ],
  },
  {
    category: "Science: Computers",
    type: "multiple",
    difficulty: "easy",
    question:
      "What is the code name for the mobile operating system Android 7.0?",
    correct_answer: "Nougat",
    incorrect_answers: ["Ice Cream Sandwich", "Jelly Bean", "Marshmallow"],
  },
  {
    category: "Science: Computers",
    type: "multiple",
    difficulty: "easy",
    question: "On Twitter, what is the character limit for a Tweet?",
    correct_answer: "140",
    incorrect_answers: ["120", "160", "100"],
  },
  {
    category: "Science: Computers",
    type: "boolean",
    difficulty: "easy",
    question: "Linux was first created as an alternative to Windows XP.",
    correct_answer: "False",
    incorrect_answers: ["True"],
  },
  {
    category: "Science: Computers",
    type: "multiple",
    difficulty: "easy",
    question:
      "Which programming language shares its name with an island in Indonesia?",
    correct_answer: "Java",
    incorrect_answers: ["Python", "C", "Jakarta"],
  },
];

//##### Funzioni Della Pagina #####

// timer countdown

let countdownNumberEl = document.getElementById("countdown-number");
let countdown = 30;
countdownNumberEl.textContent = countdown;


setInterval(function () {
  // il countdown scendendo è minore o uguale di zero, lo rimetti a 30, se no, continua il countdown
  countdown = --countdown <= 0 ? 30 : countdown;
  countdownNumberEl.textContent = countdown;
  // timer si refressha! cambia la domanda
  if (countdown === 30) {
    // passa alla domanda successiva
    nDomanda++;
    // esegui funzione
    scegliEMostraDomanda(questions)
  }
}, 1000);



let cerchio = document.querySelector(".cerchioBlu");

// resetto la progressione del css del cerchio blu del timer
function reset() {
  cerchio.classList.remove("cerchioBlu");
  console.log(cerchio);
  countdown = 30;
  setTimeout(function () {
    cerchio.classList.add("cerchioBlu");
  }, 1)
}


scegliEMostraDomanda(questions);

// per ogni risposta aggiungi un event on click
for (let a of answers) {
  a.addEventListener("mousedown", function () {
    // se la domanda è corretta, aggiungi 1 a risposte corrette
    if (a.innerHTML == domanda.correct_answer) {
      risposteCorretteDate++;
      console.log(risposteCorretteDate);
    }

    // sempre nell'event listener

    // rimuove la domanda per far apparire la successiva
    rimuoviDomanda();
    console.log(questions);

    // mostra la domanda successiva 
    nDomanda += 1;

    // resetto il timer
    reset();

    // chiamo funzione per mostrare la domanda
    scegliEMostraDomanda(questions);

  });
}



// funzione per rimuovere domanda
function rimuoviDomanda() {
  questionText.innerHTML = " ";
  answers[0].innerHTML = " ";
  answers[1].innerHTML = " ";
  answers[2].innerHTML = " ";
  answers[3].innerHTML = " ";
}



////////////////////////FUnzione per mostrare la domanda///////////////////////////

// funzione per mostrare e ciclare la domanda
function scegliEMostraDomanda(arr) {
  // se il numero domande è uguale a 10
  if (nDomanda == 10) {
    // creo oggetto contenente risposte corrette e la lunghezza delle domande
    const oggetto = {
      correct: risposteCorretteDate,
      total: questions.length,
    };
    // questo oggetto verrà messo in sessiosSOtrage che poi in pagina tre potrai prendere
    // con json.stringify ttasformo l'oggetto in stringa
    sessionStorage.setItem("chiaveDiOggetto", JSON.stringify(oggetto));
    // mi butta in pagina 3
    window.location.href = "../ResultPage/index.html";
  }


  for (let a of answers) {
    // per ogni risposta metti visibile
    a.style.visibility = "visible";
  }


  let vediDomanda = nDomanda + 1;

  // aggiorno il numero in UX della domanda
  document.querySelector(".abc").innerHTML = `QUESTION ${vediDomanda}/10`;


  //domanda è presa mettendo nDomanda come index dell'array preso come parametro(questions)
  domanda = arr[nDomanda];

  // fai vedere la domanda nel html
  questionText.innerHTML = domanda.question;

  // randomizza la posizione delle risposte
  let totalAnswersShuffled =
    [...domanda.incorrect_answers, domanda.correct_answer].sort(() => (Math.random() > .5) ? 1 : -1)

  // if--> se la domanda è multipla
  if (domanda.type == "multiple") {

    // mischia la posizione delle domande
    answers[0].innerHTML = totalAnswersShuffled[0];
    answers[1].innerHTML = totalAnswersShuffled[1];
    answers[2].innerHTML = totalAnswersShuffled[2];
    answers[3].innerHTML = totalAnswersShuffled[3];
  } else {
    // se la domanda è booleano
    // mischia solo la posizione di due risposte
    // le altre due si nascondono
    answers[0].innerHTML = totalAnswersShuffled[0];
    answers[1].innerHTML = totalAnswersShuffled[1];
    answers[2].style.visibility = "hidden";
    answers[3].style.visibility = "hidden";

  }
}







