var alphas:string[];
alphas=["1","2","3","4"];
console.log(alphas[0]);
console.log(alphas[1]);

var nums:number[]=[1,2,3];
console.log(nums[2]);
console.log(nums[1]);

//creazione di un array tramite l'oggetto array
//argomento->1) un valore numerico(dimensione array) oppure 2)elenco di valori(separati da virgole)
//1)
var arr_names:number[]=new Array(4);
for(var i=0;i<arr_names.length;i++){
    arr_names[i]=i*2;
    console.log(arr_names[i]);
}
//2)
var names:string[]=new Array("Mary","Tom","Jack","Jesoo");
for(let name of names){
    console.log("E' il turno di : ",name);
}

//pop-> rimuove un elemento da un array e lo restituisce
var numbers=[1,4,9];
var element=numbers.pop();
console.log("element is: ",element);

//push
var numbers2=[2,8,18];
console.log(numbers2);
var element2=numbers2.push(20);
console.log(numbers2);

//destrutturazione di un array
var arr3:number[]=[12,13];
var[x,y]=arr3;
console.log(x);
console.log(y);

//attraverso l'array con for
var j:any;
var nums3:number[]=[1001,1002,1003,1004];
for (j in nums3){
    console.log(nums3[j]);
}

//array multidimensionali (ad esempio array bidimensionale)
var arr_names4:number[][]=[[1,2,3],[11,22,33]];
console.log(arr_names4[0]);

//posso passare un array a una funzione
var nomii:string[]=new Array("Mary","Tom","Jack","Jill");
function disp(array_nomi:string[]){
    for (let nome of array_nomi){
        console.log(nome);
    }
}
disp(nomii);
