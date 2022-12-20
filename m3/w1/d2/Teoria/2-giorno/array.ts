var alphas:string[];
alphas = ["1", "2", "3", "4"]
console.log(alphas[0]);
console.log(alphas[1]);

var nums:number[] = [1,2,3,3]
console.log(nums[0]);
console.log(nums[1]);
console.log(nums[2]);
console.log(nums[3]);

// creo usando l'oggetto Array 
// argomento -> un valore numerico che rappresenta la dimensione del mio array 
var arr_names:number[] = new Array(4)  
for(var i = 0;i<arr_names.length;i++) { 
   arr_names[i] = i * 2 
   console.log(arr_names[i]) 
}
// argomento -> un elenco di valori 
var names:string[] = new Array("Mary","Tom","Jack","Jill")
for(var i = 0;i<names.length;i++) {
    console.log(names[i])
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
var arr:number[] = [12,13]
var[x,y] = arr
console.log(x)
console.log(y)

// attraverso l'array con for
var j:any;
var nums:number[] = [1001, 1002, 1003, 1004]
for (j in nums) {
    console.log(nums[j])
}

// array multidimensionali (ad esempio array bidimensionale)
// var arr_name:datatype[][]=[[val1, val2, valn],[v1,v2,v3]]

// posso passare un array a una funzione
var nomi:string[] = new Array("Mary","Tom","Jack","Jill")
function disp(arr_nomi:string[]) {
    for(var i=0;i<arr_nomi.length;i++) {
        console.log(nomi[i])
    }
}
disp(nomi)