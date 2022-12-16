fetch("json/users.json")
.then((response)=>response.json())
.then((users)=>
{
    
    for (let element of users){

        let card=document.createElement("div");
        let img=document.createElement('span');
        let cBody=document.createElement('div');
        let p=document.createElement('p');
        let span=document.createElement('span');

        card.classList.add("card")
        
        img.innerHTML=`<img src=${element.profileURL}>`;
        span.innerHTML=`<a href=mailto:${element.email}>${element.email}</a>`;
        p.innerHTML=`<b>${element.firstName} ${element.lastName}</b>`;
        
        document.querySelector(".d-flex").appendChild(card);
        cBody.appendChild(p);cBody.appendChild(span);
        card.appendChild(img);card.appendChild(cBody);
    }  
})

