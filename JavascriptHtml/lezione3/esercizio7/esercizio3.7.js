let array = [5,6,10];
let max = array[0];

array.map((i)=> { 
    if(i > max){
        max = i;
    }
});


console.log("Numero più grande: " + max);

