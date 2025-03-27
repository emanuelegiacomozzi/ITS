let job = (data) =>{
    return new Promise((resolve,reject)=>{
        if(typeof data === "number" && data % 2 == 0){
        setTimeout(()=>{
            resolve("pari");
        }, 2000);
        }else if(typeof data === "number" && data % 2 == 1){
            setTimeout(()=>{
                resolve("dispari");
            }, 1000);
        }else{
            reject("errore")
        }
    });
}


job(11).then((x)=>{
    console.log(x);
}).catch((err)=>{
    console.log(err);
});


