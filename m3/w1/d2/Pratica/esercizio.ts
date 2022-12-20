

let inputFiglio=(<HTMLInputElement>document.querySelector("#figlio"));
let btnFiglioDeposita=document.querySelector("#btn-figlio1");
let btnFiglioRitira=document.querySelector("#btn-figlio2");
let sonBalance=(<HTMLDivElement>document.querySelector("#sonBalance"));



btnFiglioDeposita?.addEventListener("click",function(){
    sonAccount.deposit(parseInt(inputFiglio.value));
    console.log("Amount to deposit: ",parseInt(inputFiglio.value));
    console.log("Son account balance: "+sonAccount.balance);
    sonBalance.innerHTML="Balance: "+sonAccount.balance.toString();
});

btnFiglioRitira?.addEventListener("click",function(){
    if(sonAccount.balance-parseInt(inputFiglio.value)>=0)
    {sonAccount.withdraw(parseInt(inputFiglio.value));
    console.log("Amount to withdraw: ",parseInt(inputFiglio.value));
    console.log("Balance: ",sonAccount.balance)
    sonBalance.innerHTML="Balance: "+sonAccount.balance.toString();}
    else
    {console.log("Can't withdraw this amount")
    console.log("Balance: ",sonAccount.balance)
    sonBalance.innerHTML="Balance: "+sonAccount.balance.toString();}
});

let inputMadre=(<HTMLInputElement>document.querySelector("#madre"));
let btnMadreDeposita=document.querySelector("#btn-madre1");
let btnMadreRitira=document.querySelector("#btn-madre2");
let motherBalance=(<HTMLDivElement>document.querySelector("#motherBalance"));
let motherInt=(<HTMLDivElement>document.querySelector("#interesse"));


btnMadreDeposita?.addEventListener("click",function(){
    motherAccount.deposit(parseInt(inputMadre.value));
    console.log("Amount to deposit: ",parseInt(inputMadre.value));
    console.log("Mother's account balance: "+""+motherAccount.balance)
    motherBalance.innerHTML="Balance: "+motherAccount.balance.toString();
    motherAccount.addInterest();
    
    
});

btnMadreRitira?.addEventListener("click",function(){
    if(motherAccount.balance-parseInt(inputMadre.value)>=0)
    {motherAccount.withdraw(parseInt(inputMadre.value));
        console.log("Amount to withdraw: ",parseInt(inputMadre.value))
        console.log("Balance: ",motherAccount.balance)
        motherBalance.innerHTML="Balance: "+motherAccount.balance.toString();}
    else
    {console.log("Can't withdraw this amount")
    console.log("Balance: ",motherAccount.balance)
    motherBalance.innerHTML="Balance: "+motherAccount.balance.toString();}
})




class Account {
    balance:number;
    constructor(balance:number=0){
        this.balance=balance;
    }
    deposit(ammontare_versamento:number){
        this.balance+=ammontare_versamento;
       
    }
    withdraw(ammontare_ritiro:number){
        this.balance-=ammontare_ritiro;
       
    }
}

let sonAccount= new Account();


class Mother extends Account{
    balance: number;
    interesse:number=10;
    addInterest(){
        console.log("interest: "+this.interesse+"%"+" = "+(this.balance/100*this.interesse));
        let balance_int=(this.balance/100*this.interesse)+this.balance;
        console.log("Mother account with interest added: "+balance_int);
        let motherBalanceWithInterest=(<HTMLDivElement>document.querySelector("#motherBalanceWithInterest"));
        motherBalanceWithInterest.innerHTML=" Balance with interest: "+balance_int.toString();     
    }
}
let motherAccount= new Mother();


motherInt.textContent="Interesse: "+motherAccount.interesse.toString()+"%";
