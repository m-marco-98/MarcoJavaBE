//Commento JS

let saluto = "Ciao Mondo!";

console.log();

let mioNome = "Marco Magnano";

let eta = 26;

let presenza = true;

var corso = "Java BE";

console.log("Ciao nome: " + mioNome + ", età: " + eta + ", corso: " + corso + ", presenza: " + presenza);

//Javascript è debolmente tipizzato

let miaVariabile = 42;
console.log(miaVariabile);

miaVariabile = 40.00;
console.log(miaVariabile)

miaVariabile = "Un numero a caso";
console.log(miaVariabile)

let numero1 = 5;
let numero2 = 9;
let somma = numero1 + numero2;

console.log("La somma tra i due numeri vale: " +(numero1 + numero2))

console.log(typeof numero1);
console.log(typeof numero2);
console.log(typeof 1.978713);
console.log(typeof true);
console.log(typeof "Ciao come stai?")

let valoreNull = null;
console.log(valoreNull);
console.log(typeof valoreNull);

//ARRAY
let colori = ["giallo", "rosso", "verde", "blu"];
console.log(colori);

//push aggiunge un elemento
colori.push("Arancione");
//sort ordina l'array
colori.sort();

//elimino l'ultimo elmento
colori.pop();

console.log(colori);

for(let i = 0; i < colori.length; i++) {
    
    console.log(colori[i]);
}

colori.forEach(colore => {
    console.log(colore);
})

for (const colore in colori) {
    console.log(colori[colore]);
}

//TRIPLO UGUALE
let num1 = 10;
let num2 = "10";

//Confronta il contenuto della stringa con il numero
if (num1 == num2) {
    console.log("I numeri sono uguali");
} else {
    console.log("I numeri sono diversi");
}

//Tiene conto del tipo
if (num1 === num2) {
    console.log("I numeri sono uguali");
} else {
    console.log("I numeri sono diversi nel tipo");
}

//esmpio: la mia variabile deve obbligatoriamente essere una stringa
let miaNuovaVar = "Ciao";

if (typeof miaNuovaVar != "string") {
    console.log("la variabile non è una stringa");
} else {
    console.log("la variabile è una stringa");
}