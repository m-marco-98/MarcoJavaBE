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

//Stampa dello studente
/**
 * 
 * @param {Studente} studente 
 */
function stampalastUser(studente) {
    let lastUser = document.querySelector("#lastUser");
    lastUser.innerHTML = `
        <p> Nome: ${studente.nome} </p>
        <p> Cognome: ${studente.cognome} </p>
        <p> Corso: ${studente.corso} </p>
        <p> Matricola: ${studente.matricola} </p>
    `
}


//Registrazione dello studente
/**
 * 
 * @param {Studente} studente 
 */
function registraStudente(studente) {

    registroStudenti.push(studente);
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
        feed.innerHTML = "<strong>Errore nell'inserimento</strong>";
    } else {
        let studente = new Studente(nome, cognome, corso, matricola);
        registraStudente(studente);
        feed.innerHTML = "";
        stampalastUser(studente);
        let allInput = document.querySelectorAll("#formComp input"); //Questa è una NodeList, un parente degli array
        allInput.forEach(input => {
            input.value = "";
        });
    }
    
}

//Stampa studenti
/**
 * 
 * @param {String} studenti 
 */
function stampaStudenti(studenti) {
    let classe = document.querySelector("#classe");
    classe.innerHTML = studenti;
}


//Tasto registrazione
let btnReg = document.querySelector("#btnReg");
btnReg.addEventListener("click", validate);

//tasto mostra studenti
let btnShowStudenti = document.querySelector("#btnShowStudenti")
btnShowStudenti.addEventListener("click", function(){  //Per passare un parametro a stampaStudenti dentro un eventListener(che non ammetterebbe parentesi), wrappo la funzione dentro una funzione anonima
    //Tasformo l'array di studenti in un JSON
    let registroJSON = JSON.stringify(registroStudenti);
    //Stampo gli studenti passando il JSON
    stampaStudenti(registroJSON);
});

//Esercizio: Controlla i campi input. 
//Dopo aver controllato registra lo studente, 
//che verrà mostrato all'interno del div #lastUser 
//e verrà salvato all'interno di un array di studenti. 
//Al click su mostra lista studenti mostrerò la lista,
//in formato JSON, di tutti gli studenti registrati fino a quel momento
