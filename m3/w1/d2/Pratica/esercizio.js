var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var inputFiglio = document.querySelector("#figlio");
var btnFiglioDeposita = document.querySelector("#btn-figlio1");
var btnFiglioRitira = document.querySelector("#btn-figlio2");
var sonBalance = document.querySelector("#sonBalance");
btnFiglioDeposita === null || btnFiglioDeposita === void 0 ? void 0 : btnFiglioDeposita.addEventListener("click", function () {
    sonAccount.deposit(parseInt(inputFiglio.value));
    console.log("Amount to deposit: ", parseInt(inputFiglio.value));
    console.log("Son account balance: " + sonAccount.balance);
    sonBalance.innerHTML = "Balance: " + sonAccount.balance.toString();
});
btnFiglioRitira === null || btnFiglioRitira === void 0 ? void 0 : btnFiglioRitira.addEventListener("click", function () {
    if (sonAccount.balance - parseInt(inputFiglio.value) >= 0) {
        sonAccount.withdraw(parseInt(inputFiglio.value));
        console.log("Amount to withdraw: ", parseInt(inputFiglio.value));
        console.log("Balance: ", sonAccount.balance);
        sonBalance.innerHTML = "Balance: " + sonAccount.balance.toString();
    }
    else {
        console.log("Can't withdraw this amount");
        console.log("Balance: ", sonAccount.balance);
        sonBalance.innerHTML = "Balance: " + sonAccount.balance.toString();
    }
});
var inputMadre = document.querySelector("#madre");
var btnMadreDeposita = document.querySelector("#btn-madre1");
var btnMadreRitira = document.querySelector("#btn-madre2");
var motherBalance = document.querySelector("#motherBalance");
var motherInt = document.querySelector("#interesse");
btnMadreDeposita === null || btnMadreDeposita === void 0 ? void 0 : btnMadreDeposita.addEventListener("click", function () {
    motherAccount.deposit(parseInt(inputMadre.value));
    console.log("Amount to deposit: ", parseInt(inputMadre.value));
    console.log("Mother's account balance: " + "" + motherAccount.balance);
    motherBalance.innerHTML = "Balance: " + motherAccount.balance.toString();
    motherAccount.addInterest();
});
btnMadreRitira === null || btnMadreRitira === void 0 ? void 0 : btnMadreRitira.addEventListener("click", function () {
    if (motherAccount.balance - parseInt(inputMadre.value) >= 0) {
        motherAccount.withdraw(parseInt(inputMadre.value));
        console.log("Amount to withdraw: ", parseInt(inputMadre.value));
        console.log("Balance: ", motherAccount.balance);
        motherBalance.innerHTML = "Balance: " + motherAccount.balance.toString();
    }
    else {
        console.log("Can't withdraw this amount");
        console.log("Balance: ", motherAccount.balance);
        motherBalance.innerHTML = "Balance: " + motherAccount.balance.toString();
    }
});
var Account = /** @class */ (function () {
    function Account(balance) {
        if (balance === void 0) { balance = 0; }
        this.balance = balance;
    }
    Account.prototype.deposit = function (ammontare_versamento) {
        this.balance += ammontare_versamento;
    };
    Account.prototype.withdraw = function (ammontare_ritiro) {
        this.balance -= ammontare_ritiro;
    };
    return Account;
}());
var sonAccount = new Account();
var Mother = /** @class */ (function (_super) {
    __extends(Mother, _super);
    function Mother() {
        var _this = _super !== null && _super.apply(this, arguments) || this;
        _this.interesse = 10;
        return _this;
    }
    Mother.prototype.addInterest = function () {
        console.log("interest: " + this.interesse + "%" + " = " + (this.balance / 100 * this.interesse));
        var balance_int = (this.balance / 100 * this.interesse) + this.balance;
        console.log("Mother account with interest added: " + balance_int);
        var motherBalanceWithInterest = document.querySelector("#motherBalanceWithInterest");
        motherBalanceWithInterest.innerHTML = " Balance with interest: " + balance_int.toString();
    };
    return Mother;
}(Account));
var motherAccount = new Mother();
motherInt.textContent = "Interesse: " + motherAccount.interesse.toString() + "%";
