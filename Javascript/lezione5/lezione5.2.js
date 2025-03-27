//Promise() : oggetto javascript, creato per gestire le chiamate asincrone
//Promise Costruttore
//il costruttore prende come parametro una funzione che prende come parametro due funzioni
console.log("codice 1")
//Codice produttore
let x = new Promise( (resolve, reject) => {
    //connetto al db........recupero gli utenti ... ci sono?
    console.log("codice 2");
    let esito = true;
    if(esito){
        setTimeout(()=> {
            console.log("codice 3");
            resolve("tuttto ok");//sinonimo return
        }, 1000)
    }else{
        reject("errore nella chiamata"); //sinonimo return
    }
} );
console.log("codice 4");

//Codice consumatore stampa a video (document.write)
x.then((dati)=>{
    console.log("codice 5");
    console.log(dati); //tutto ok 
}).catch((err)=>{
    console.log(err); //errore nella chiamata
}); //se l'esito è resolve entra nel then, altrimenti nel catch

console.log("codice 6");