var alphas;
alphas = ["1", "2", "3", "4"];
console.log(alphas[0]);
console.log(alphas[1]);
var nums = [1, 2, 3, 3];
console.log(nums[0]);
console.log(nums[1]);
console.log(nums[2]);
console.log(nums[3]);
// creo usando l'oggetto Array 
// argomento -> un valore numerico che rappresenta la dimensione del mio array 
var arr_names = new Array(4);
for (var i = 0; i < arr_names.length; i++) {
    arr_names[i] = i * 2;
    console.log(arr_names[i]);
}
// argomento -> un elenco di valori 
var names = new Array("Mary", "Tom", "Jack", "Jill");
for (var i = 0; i < names.length; i++) {
    console.log(names[i]);
}
// metodo pop -> rimuove un elemento dall'array e lo restituisce -> sintassi array.pop()
/*
var numbers = [1, 4, 9];
var element = numbers.pop();
console.log("element is : " + element);
var element = numbers.pop();
console.log("element is : " + element);
*/
// metodo push -> aggiunge l'elemento (gli elementi) forniti nell'array e restituisce il nuovo array
var numbers = [1, 4, 9];
var length = numbers.push(10);
console.log("new numbers is : " + numbers);
var length = numbers.push(20);
console.log("new numbers is : " + numbers);
// destrutturazione di un array
var arr = [12, 13];
var x = arr[0], y = arr[1];
console.log(x);
console.log(y);
// attraverso l'array con for
var j;
var nums = [1001, 1002, 1003, 1004];
for (j in nums) {
    console.log(nums[j]);
}
// array multidimensionali (ad esempio array bidimensionale)
// var arr_name:datatype[][]=[[val1, val2, valn],[v1,v2,v3]]
// posso passare un array a una funzione
var nomi = new Array("Mary", "Tom", "Jack", "Jill");
function disp(arr_nomi) {
    for (var i = 0; i < arr_nomi.length; i++) {
        console.log(nomi[i]);
    }
}
disp(nomi);
