//async/await

let a = () =>{
    console.log("a");
}


let b = () =>{
    console.log("b");
    let x = new Promise((res,rej)=>{
        setTimeout(()=>{
            res("ciao");
        }, 2000);
    })
}


let c = () =>{
    console.log("c");
}


let d = () =>{
    console.log("d");
}

let calcolo = async () =>{
    a();
    await b().then((x)=>{
        console.log(x);
    });
    c();
    d();
}

