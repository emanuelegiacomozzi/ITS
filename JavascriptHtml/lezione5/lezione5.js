//Procedura


let a = () =>{
    console.log("Sono A");
}

let b = () =>{
    console.log("Sono B");
    setTimeout(() => {console.log("Ciao sono nel browser")}, 3000); //funzione del browser
}

let c = () =>{
    console.log("Sono C");
}

let d = () =>{
    console.log("Sono D");
}

let calcolo = () => {
    a();
    b();
    c();
    d();

}

calcolo();

//js usa funzioni non sue, (browser, node.js)
// setTimeout(), fetch()