//notazione letterale
let studente = {
    nome: "Pippo",
    cognome: "Rossi",
    matr: 123,

    studia: function() {
        return this.nome + " " + this.cognome + " sta studiando";
    }
}

class Docente {
    constructor(nome, cognome, corso) {
        this.nome = nome;
        this.cognome = cognome;
        this.corso = corso;

        this.insegna = function () {
            return "Il docente " + this.nome + " " + this.cognome + " sta insegnando il corso " + this.corso;
        };
    }
}

let docenteJAVA = new Docente("Mauro", "Bogliaccino", "JAVABE");
let docenteJS = new Docente("Dario", "Mennillo", "TSS");
let docenteDB = new Docente("Oscar", "Vecchione", "JavaWeb");

//Adesso voglio trasformare i miei oggetti in formato JSON
let studenteJSON = JSON.stringify(studente);
console.log(studente); //Questo è l'oggetto JS
console.log(studenteJSON); //Questo è l'oggetto in formato JSON

//Posso trasformare il docente
console.log(JSON.stringify(docenteJS));

//Riceviamo un oggetto in formato JSON, quindi una stringa
let studente4JSON = '{"nome": "Anna", "cognome": "Verdi", "matricola": "321"}';

//trasformo la stringa in un oggetto
let studente4 = JSON.parse(studente4JSON);

console.log(studente4);
console.log(studente.nome);
console.log(studente.matricola);

//Faccio la stessa cosa per il docente
let docente4JSON = '{"nome": "Luca", "cognome": "Ceroni", "corso": "Sicurezza"}';

let docente4OBJ = JSON.parse(docente4JSON);
console.log(docente4OBJ);

let docente4 = new Docente(docente4OBJ.nome, docente4OBJ.cognome, docente4OBJ.corso);

console.log(docente4);
console.log(docente4.insegna());

let listaDocenti = [
    docenteJAVA,
    docenteDB,
    docenteJS,
    docente4
];

let elListaDoc = document.getElementById("elListaDoc");

listaDocenti.forEach(Docente => {
    elListaDoc.innerHTML += "<li>" + Docente.insegna() + "</li>";
});