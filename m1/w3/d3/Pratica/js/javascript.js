document.querySelector('#aggiungi').onclick = function()
{
    if(document.querySelector('#nuovoTask input').value.length != 0)
    {
        document.querySelector('#tasks').innerHTML+= 
        `
                <div class="task">
                <span id="taskNome">
                    ${(document.querySelector('#nuovoTask input').value).charAt(0).toUpperCase() + (document.querySelector('#nuovoTask input').value).slice(1)}
                </span>
                <button class="cancella">Cancella
                </button>
            </div>
        `;

        let taskN = document.querySelectorAll(".cancella");
        for(let i=0; i<taskN.length; i++)
        {
            taskN[i].onclick = function()
            {
                this.parentNode.remove();
            }
        }
        
    }
    else
    {
        alert("Aggiungi un Task Valido");
    }
    document.querySelector('#nuovoTask input').value="";
}

    let sbarra;
    sbarra = document.querySelector('div');
    sbarra.addEventListener('click', function(str) 
    {
      if (str.target.tagName == 'SPAN') 
      {
        str.target.classList.toggle('evidenziato');
      }
    }, false);
    

 