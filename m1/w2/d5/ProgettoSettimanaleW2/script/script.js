function aggiungiCifra(elemento)  //funzione "aggiungi elemento alla casella input"
    {
        let cifraCliccata=elemento.getAttribute("data-simbolo");     //Aggiungo elemento a "casella input" (dal tastierino)
        document.getElementById("casellaInput").value+=cifraCliccata;   //ritorna una stringa con il valore preso e lo aggiunge alla stringa già esistente
    }
        
function tot()                                                  //funzione per fare totale ("=")
    {
        let numeri=document.getElementById("casellaInput");     // prende il valore della casella input
        numeri.value=eval(numeri.value);                        // tramite la funzione "Eval" trasforma la stringa in numero (se possibile)
    }
        
function clr()                                                     //funzione per cancellare tutto (clear)
    {   
        let numeri=document.getElementById("casellaInput");           //prende il valore della casella input
        numeri.value=" ";                                             // cambia il valore della stringa in " "
    }
function dlt()                                                      //funzione per togliere l'ultimo "elemento" dalla stringa
    {
        let numeri=document.getElementById("casellaInput");            //prende il valore della casella input
        numeri.value=numeri.value.substring(0, numeri.value.length-1);      //tramite la funzione "substring" vado a dargli il valore da tolgiere (l'ultimo) dalla grandezza (length) della stringa nella "casella input"
    }

    




        /* 
        isSymbol(s)
            {
                let simboli=["*","/","+","-"];
                return simboli.includes(s);
            }

        isSymbol("+")
        */
            
           
            


