let variable = "50";

document.getElementById("testo").innerHTML = variable + typeof(variable);

//funzione globale
document.getElementById("testo1").innerHTML = typeof(variable) == "number";

//isNan. Nan è una costante (Not a Number) in js utilizzata per dirci che il risultato non è un numero
//console.log("ciao" * 10) torna Nan
document.getElementById("testo2").innerHTML = isNan(variable); //torna true se non è un numero

parseInt(variable);