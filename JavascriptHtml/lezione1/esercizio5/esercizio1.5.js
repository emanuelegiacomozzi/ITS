let giorni = "Lunedì, Martedì, Mercoledì, Giovedì, Venerdì, Sabato, Domenica";

giorni = giorni.replaceAll(",", "<br>"); //sostituisce la virgola col carattere a capo
document.getElementById("testo").innerHTML = giorni;


giorni = giorni.replaceAll(",", "\n"); //\n va bene solo con js
console.log(giorni);