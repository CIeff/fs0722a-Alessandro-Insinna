var alphas;
alphas = ["1", "2", "3", "4"];
console.log(alphas[0]);
console.log(alphas[1]);
var nums = [1, 2, 3];
console.log(nums[2]);
console.log(nums[1]);
//creazione di un array tramite l'oggetto array
//argomento->1) un valore numerico(dimensione array) oppure 2)elenco di valori(separati da virgole)
//1)
var arr_names = new Array(4);
for (var i = 0; i < arr_names.length; i++) {
    arr_names[i] = i * 2;
    console.log(arr_names[i]);
}
//2)
var names = new Array("Mary", "Tom", "Jack", "Jesoo");
for (var _i = 0, names_1 = names; _i < names_1.length; _i++) {
    var name_1 = names_1[_i];
    console.log("E' il turno di : ", name_1);
}
//pop-> rimuove un elemento da un array e lo restituisce
var numbers = [1, 4, 9];
var element = numbers.pop();
console.log("element is: ", element);
//push
var numbers2 = [2, 8, 18];
console.log(numbers2);
var element2 = numbers2.push(20);
console.log(numbers2);
//destrutturazione di un array
var arr3 = [12, 13];
var x = arr3[0], y = arr3[1];
console.log(x);
console.log(y);
//attraverso l'array con for
var j;
var nums3 = [1001, 1002, 1003, 1004];
for (j in nums3) {
    console.log(nums3[j]);
}
//array multidimensionali (ad esempio array bidimensionale)
var arr_names4 = [[1, 2, 3], [11, 22, 33]];
console.log(arr_names4[0]);
//posso passare un array a una funzione
var nomii = new Array("Mary", "Tom", "Jack", "Jill");
function disp(array_nomi) {
    for (var _i = 0, array_nomi_1 = array_nomi; _i < array_nomi_1.length; _i++) {
        var nome = array_nomi_1[_i];
        console.log(nome);
    }
}
disp(nomii);
