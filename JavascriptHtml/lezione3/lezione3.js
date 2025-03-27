let i = 1
while(i<=10){
    console.log(i);
    i++;
}


for(let i=0; i<=10; i++){
    console.log(i);
}



let numeri = [2,6,9];

//for in, for of
for(let i in numeri){  //con in si cicla per indici
    console.log(numeri[i]);
}

for(let i of numeri){  //con of si cicla per numero elementi
    console.log(i);
}

//in js esiste l'oggetto Array() con seguenti metodi : map(), forEach()
let variabile1 = numeri.forEach((i)=> { //non torna nulla
    console.log(i);
    return i+1;
});
console.log("variabile1: "+ variabile1);

let variabile2 = numeri.map((i)=> { //torna un nuovo array
    console.log(i);
    return i+2;
});
console.log("variabile2: "+ variabile2);