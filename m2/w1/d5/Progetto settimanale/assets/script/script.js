let navBar= document.querySelector("#nav");
let btn=document.querySelector("#btn")

window.onscroll=function(){
    let up=window.scrollY;
    console.log(up)
    if (up>=455)
{
    navBar.classList.add("white")
    btn.classList.add("green")
}
else
{
    navBar.classList.remove("white");
    btn.classList.remove("green");
}
}

