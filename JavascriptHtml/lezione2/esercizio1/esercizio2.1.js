let n1 = 2;
let n2 = 4;
let n3 = 6;
let n4 = 9;
let n5 = 2;

let array = [];

array.push(n1);
array.push(n2);
array.push(n3);
array.push(n4);
array.push(n5);

let somma = 0;
for(let i = 0; i< array.length; i++){
    somma += array[i];
}

let media = somma/array.length;

console.log(somma);
console.log(media);
