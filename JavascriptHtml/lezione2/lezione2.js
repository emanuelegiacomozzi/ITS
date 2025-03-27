//array dinamici
let numeri = [];

numeri.push(1);
numeri.push(2);
numeri[2] = 3;
//empty in posizione 3
numeri[4] = 5;


let numeri2 = new Array();


//struttura di controllo
if(numeri[0] == 1){ //=== strettamente uguale, controlla sia valore che tipo
    console.log("entra");
}



//&& di corto circuito (quando non va bene un istruzione il codice va in corto circuito)
// & (confronta tutte e due a prescindere)

let x = true;
let y = 1;

if(x == y && x < 10){

}

if(x == y & x < 10){

}

