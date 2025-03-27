let array = [5,6,10,2,7,8];
let contPari = 0;
let contDisp = 0;

array.map((i)=> { 
    if(i % 2 == 0 ){
        contPari += 1;
    }else{
        contDisp += 1;
    }
});


console.log(`Nell'array ci sono ${contPari} numeri pari e ${contDisp} numeri dispari.`);