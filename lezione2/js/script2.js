//Classe studente
class Studente {
    constructor(nome, cognome, corso, matricola) {
        this.nome = nome;
        this.cognome = cognome;
        this.corso = corso;
        this. matricola = matricola;
    } 
}

//Variabili globali
let registroStudenti = [];
let registroJSON;



//Registrazione dello studente
/**
 * 
 * @param {Studente} studente 
 */
function registraStudente(studente) {

    registroStudenti.push(studente);
    registroJSON = JSON.stringify(registroStudenti);
    let lastUser = querySelector("#lastUser");
    lastUser.innerHTML(" dhedjeghdg ");

}

//Controllo sull'inserimento
function validate() {
    let nome = document.querySelector("#nome").value;
    let cognome = document.querySelector("#cognome").value;
    let corso = document.querySelector("#corso").value;
    let matricola = document.querySelector("#matricola").value;

    let feed = document.querySelector("#feed");
    
    if (nome == "" || cognome == "" || corso == "" || matricola == "") {
        event.preventDefault;        
        feed.innerHTML("Errore nell'inserimento")
    } else {
        let studente = new Studente(nome, cognome, corso, matricola);
        registraStudente(studente);
    }
    
}

//Stampa studenti
function stampaStudenti() {
    let classe = document.querySelector("#classe");
    classe.innerHTML(registroJSON);
}


//Tasto registrazione
let btnReg = document.querySelector("#btnReg")
btnReg.addEventListener("click", validate);

//tasto mostra studenti
let btnShowStudenti = document.querySelector("#btnShowStudenti")
btnShowStudenti.addEventListener("click", stampaStudenti);

//Esercizio: Controlla i campi input. 
//Dopo aver controllato registra lo studente, 
//che verrà mostrato all'interno del div #lastUser 
//e verrà salvato all'interno di un array di studenti. 
//Al click su mostra lista studenti mostrerò la lista,
//in formato JSON, di tutti gli studenti registrati fino a quel momento
