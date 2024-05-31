//Voglio scrivere qualcosa all'interno del div demo

//1.recupero il div con id=demo

// let demo = document.getElementById("demo");

// demo.innerHTML = "Prova incredibile";

//Faccio la stessa cosa usando le funzioni
function saluta() {

    let demo = document.getElementById("demo");
    demo.innerHTML = "Ciao, mondo!!";

}

 //Richiamo una funzione
 saluta();


 //ATT: il richiamo di una funzione è independente dalla sua dichiarazione

 salutaStudente();

 function salutaStudente() {

    let demo = document.getElementById("demo")
    let nome = "Maria";
    demo.innerHTML = "Ciao, " + nome;

 }

 //Posso richiamare una funzione all'interno di un'altra funzione

 function aggiungiParole() {

    let feed = document.getElementById("feed");
    feed.innerHTML = "Queste sono le prime parole";
    aggiungiAltreParole(feed);

 }
/**
 * 
 * @param {HTMLElement} elementoHtml 
 */
 function aggiungiAltreParole(elementoHtml) {

    elementoHtml.innerHTML += ", questo è il resto delle parole";

 }

 aggiungiParole();

 // console.log(nome); //Non trova nulla, nome è una variabile locale

 //Funzioni con parametri

 function calcolaArea(base, altezza) {
    let area = base * altezza;
    return area;
}

let miaBase = 5;
let miaAltezza = 7;

let area = calcolaArea(miaBase, miaAltezza);

console.log("L'area vale: " + area);

//Espressione funzionale 
let calcArea = function(base, altezza) {
    let area = base * altezza;
    console.log(area);
    return area;
}

console.log(calcArea(5, 7));

function calcolaVolume(base, altezza, profondita) {
    let area = calcArea(base, altezza);
    let volume = area * profondita;
    return volume;
}

console.log(calcolaVolume(2, 3, 4));

function calcolaVolume2(area, profondita) {
    let volume = area * profondita;
    return volume;
}

console.log(calcolaVolume2(calcolaArea(5, 6), 7));


//CLOSURE. Funzioni dichiarate dentro funzioni: incapsulamento

//la funzione calcArea non è visibile e accessibile dall'esterno
function calcolaVolume(base, altezza, profondita) {

    let volume;
    let area;

    function calcArea() {
        area = base * altezza;
    }

    calcolaArea();
    volume = area * profondita;
    return volume;

}


//Esempio

//la funzione può restituire risultatti di tip diverso, il tipo di ritorno non è dichiarato nella funzione
let numeri = [34, 15, 22, 10, 5, 8, 9, 26];

function calcolaPari(numero) {
    if(numero % 2 == 0) {
        return numero;
    } else {
        return "dispari";
    }
}

//parametro =>
//funcion parametro

let numClick = 0;

function eseguiCalcolo() {
    numClick++;
    if (numClick <= 10) {
      gioco.innerHTML = "";
        numeri.forEach(numero => {
            gioco.innerHTML += "<li>" + calcolaPari(numero) + "</li>";
        });
    } else {
        gioco.innerHTML = "<h2> Basta cliccare! </h2>";
        window.alert("No more click");
    }
}


// let gioco = document.getElementById("gioco");


//Recupero il pulsante
let btn = document.getElementById("btn");

//Collego il pulsante tramite addEventListener alla funzione esegui calcolo
//ATT: quando ruichiamo una funzione con EventListener NON devo inserire le parentesi tonde, mettere le parentesi farebbe partire la funzione

btn.addEventListener("click", eseguiCalcolo);

