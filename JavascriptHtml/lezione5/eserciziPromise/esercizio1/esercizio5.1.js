let job = () =>{
    return "Hello world!"
}

let x = new Promise((resolve, reject) => {
    let esito = true;
    if(esito){
        setTimeout(() =>{
            resolve(job());
        }, 2000)
    }else{
        reject("errore nella chiamata");
    }
});

x.then((dati)=>{
    console.log(dati);
}).catch((err)=>{
    console.log(err);
});

