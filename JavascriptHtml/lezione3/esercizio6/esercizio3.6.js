let array = [5,6,10];

let sum = 0;
let somma = array.map((i)=> { 
    sum += i;
});

let media = sum / array.length;

console.log("Somma: " + sum);
console.log("Media: " + media);

