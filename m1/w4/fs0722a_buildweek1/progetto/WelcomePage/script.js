let checkbox = document.getElementById("checkbox");
let ancor = document.getElementById("btn-proceed");

// evento sul click deòlla checkbox
checkbox.addEventListener("click", function () {
  // se la checkbox è checked, cambia colore del bottone e rendilo usufruibile
  if (checkbox.checked)

  // checkbox è checked? setto href, e il sito dell'href
  {
    document.querySelector("#div-proceed").classList.add("rilievo");
    ancor.setAttribute("href", "../QuestionPage/pagina2.html");

    // colleggo lo style all'ancor
    ancor.style.backgroundColor = "#00FFFF";
    ancor.style.boxShadow = "0 10px 50px 5px #00ffff";
  }

  else

  // se non ce checked, href nullo e style collegato
  {
    ancor.setAttribute('href', " ")
    ancor.style.backgroundColor = 'darkGray'
    ancor.style.boxShadow = '0 10px 50px 5px black'
  }

});
