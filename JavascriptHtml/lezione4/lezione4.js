//funzioni

//fase 1 -> hoisting
//test1 è una funzione(oggetto eseguibile), o meglio è una variabile
function test1(){
    console.log("test1");
}

console.log(test1);
test1();

//modo alternativo
var test2 = function(){
    console.log("test2");
}
test2();



//fase2 -> niente hoisting
let test3 = function (){
    console.log("test3");
}

//arrow function -> callback: funzioni chiamate automaticamente
let test4 = () => {
    console.log("test4");
}

//regole arrow function:
//1 se il parametro è uno solo, le parentesi tonde sono opzionali
//2 se l'istruzione è una sola, le graffe sono opzionali e il return implicito

let numeri = [2,4,5];
let test5 = numeri.map(i => i+1);

test3();
test4();
console.log(test5);