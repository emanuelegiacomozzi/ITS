//var non va usata

let nome = "Mario";

console.log("Ciao"+ nome);

//DOM .... libreria che si trova nel browser, non è js
//document.write("ciao mondo"); //il dom ha metodi che interagiscono con l'html. Interazione fra js e html
document.getElementById("testo").innerHTML = "Ciao " + nome; //accedere a questo id nell'html e scrive