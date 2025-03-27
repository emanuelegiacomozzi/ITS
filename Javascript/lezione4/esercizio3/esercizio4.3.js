let randomNumber = Math.floor(Math.random() * 101); 
console.log(randomNumber)


document.getElementById("form").addEventListener("submit", function (event) {
    event.preventDefault(); 

    
    let numero = parseInt(document.getElementById("numero").value); 

    let conteggio = parseInt(document.getElementById("conteggio").textContent);
    if (isNaN(conteggio)) {
        conteggio = 0;
    }
    conteggio++;
    document.getElementById("conteggio").textContent = conteggio;

    let indovina = () => {
        if (numero === randomNumber) {
            document.getElementById("indovinato").innerHTML = "Hai indovinato!";
            document.getElementById("maggiore").innerHTML = "";
            document.getElementById("minore").innerHTML = "";
            document.getElementById("errore").innerHTML = "";
            document.getElementById("numero").disabled = true;
            document.querySelector("input[type='submit']").disabled = true;
            return;
        } else if (numero > randomNumber) {
            document.getElementById("maggiore").innerHTML = "Il numero inserito è più grande!";
            document.getElementById("minore").innerHTML = ""; 
            document.getElementById("indovinato").innerHTML = "";
            document.getElementById("errore").innerHTML = "";
        } else if (numero < randomNumber) {
            document.getElementById("minore").innerHTML = "Il numero inserito è più piccolo!";
            document.getElementById("maggiore").innerHTML = "";
            document.getElementById("indovinato").innerHTML = "";
            document.getElementById("errore").innerHTML = "";
        } else if (numero > 100 || numero < 0) {
            document.getElementById("errore").innerHTML = "Errore! Inserire un numero valido";
            document.getElementById("maggiore").innerHTML = "";
            document.getElementById("minore").innerHTML = "";
            document.getElementById("indovinato").innerHTML = "";
        }
    };

    indovina(); 

});

document.querySelectorAll("input[type='submit']")[1].addEventListener("click", function (event) {
    event.preventDefault();

    document.getElementById("numero").value = "";
    document.getElementById("conteggio").textContent = "0";
    document.getElementById("indovinato").innerHTML = "";
    document.getElementById("maggiore").innerHTML = "";
    document.getElementById("minore").innerHTML = "";
    document.getElementById("errore").innerHTML = "";

    document.getElementById("numero").disabled = false;
    document.querySelector("input[type='submit']").disabled = false;

    randomNumber = Math.floor(Math.random()*101);
    console.log(randomNumber);

});