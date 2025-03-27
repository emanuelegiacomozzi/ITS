document.getElementById("form").addEventListener("submit", function(event){
    event.preventDefault(); 

let num = parseInt(document.getElementById("giorno").value);

let range = () =>{
    if(num>=1 && num<=7){
        return true;
    }else{
        return false;
    }
}

let settimana = () =>{
    if(range()){
        switch(num){
            case 1:
                document.getElementById("lunedì").innerHTML = "Lunedì";
                break;
            case 2:
                document.getElementById("martedì").innerHTML = "Martedì";
                break;
            case 3:
                document.getElementById("mercoledì").innerHTML = "Mercoledì";
                break;
            case 4:
                document.getElementById("giovedì").innerHTML = "Giovedì";
                break;
            case 5:
                document.getElementById("venerdì").innerHTML = "Venerdì";
                break;
            case 6:
                document.getElementById("sabato").innerHTML = "Sabato";
                break;
            case 7:
                document.getElementById("domenica").innerHTML = "Domenica";
                break;
        }
    }else{
            document.getElementById("errore").innerHTML = "Peccato, non posso indovinare il giorno";
    }
}

settimana();

});