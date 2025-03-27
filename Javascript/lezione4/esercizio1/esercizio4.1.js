let stringa1 = prompt("Inserisci parola 1: ");
let stringa2 = prompt("Inserisci parola 2: ");

let risultato = () => {
    if(stringa1 === stringa2){
        return true;
    }else{
        return false;
    }
}

let mioTag1 = document.getElementById("testo");
mioTag1.innerHTML = `<p> Argomento 1: ${stringa1} </p>`

let mioTag2 = document.getElementById("testo1");
mioTag2.innerHTML = `<p> Argomento 2: ${stringa2} </p>`

let mioTag3 = document.getElementById("testo2");
mioTag3.innerHTML = `<p> Risposta: ${risultato()} </p>`