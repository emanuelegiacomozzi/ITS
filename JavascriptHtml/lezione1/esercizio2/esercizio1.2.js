let numero = 100; //tipo number

//numero = "ciao"; //tipizzazione debole

let mioTag = document.getElementById("testo");
mioTag.innerHTML = `<h1>numero ${numero} </h1>`

numero = 70;
let mioTag2 = document.getElementById("testo2");
mioTag2.innerHTML = `<h1>numero ${numero} </h1>`
