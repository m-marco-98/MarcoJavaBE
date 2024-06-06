let nomeAutore = "Marco Magnano";
let eta = 26;

//Voglio scrivere il valore di una variabile all'interno della mia pagina HTML

//Recupero l'elemento html con un particolare id

let infoAutore = document.getElementById("infoAutore");

//Scrivo all'interno del tag p appena
infoAutore.innerHTML = nomeAutore + ", età " + eta;

let titolo = document.getElementById("titolo");

//Voglio leggere il contenuto del tag p id = titolo
console.log(titolo);

let num1 = 25.6;
let num2 = 12.12;

let somma = num1 + num2;
let diff = num1 - num2;
let molt = num1 * num2;
let div = num1 / num2;

//Recupero tutti gli elementi html byId

let resSomma = document.getElementById("resSomma");
resSomma.innerHTML = "La somma vale: " + somma;

let resDiff = document.getElementById("resSottr");
resDiff.innerHTML = "La differenza vale: " + diff;

let resMolt = document.getElementById("resMolt");
resMolt.innerHTML = "La moltiplicazione vale: " + molt;

document.getElementById("resDiv").innerHTML = "La divisione vale: " + div;

