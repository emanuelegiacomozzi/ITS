let secondi = 12560;

let ore = Math.floor(secondi/3600); 
let minuti = Math.floor((secondi % 3600) / 60);  
let sec = Math.floor(secondi % 60);

console.log("ore: " + ore + ", minuti: " + minuti + ", secondi: "+ sec );