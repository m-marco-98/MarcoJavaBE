class Utente {
    constructor(nome, cognome, eta, email, password, termCond) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.email = email;
        this.password = password;
        this.termCond = termCond;
    }
}

let formReg = document.querySelector("#formReg");
let demo = document.querySelector("#demo");

//Funzione avviata all'invio del form (tramite il tasto di submit) che controlla che i campi siano corretti
function validate() {
    //Qui raccolgo tutti i valori dal form;
    let nome = String(document.querySelector("#nome").value);
    let cognome = String(document.querySelector("#cognome").value);
    let email = String(document.querySelector("#email").value);
    let password = document.querySelector("#password").value;
    let termCond = document.querySelector("#termCond");
    let eta = document.querySelector("#eta").value;

    cleanAll();
    validateNome(nome, event);
    validateCognome(cognome, event);
    validateEta(eta, event);
    validateEmail(email, event);
    validatePassword(password, event);
    validateTermCond(termCond, event);
}

//Funzioni di validazione per ogni campo
function validateNome(nome, event) {
    if (nome == "" || nome.length <= 2) {
        demo.innerHTML += "<p> Hai dimenticato il nome </p>";
        document.querySelector("#nome").setAttribute("class", "borderRed")
        event.preventDefault();
        event.stopImmediatePropagation();
    } else {
        localStorage.setItem("nomeUser", nome);
    }
}

function validateCognome(cognome, event) {
    if (cognome == "" || cognome.length <= 2) {
        demo.innerHTML += "<p> Hai dimenticato il cognome </p>";
        document.querySelector("#cognome").setAttribute("class", "borderRed")
        event.preventDefault();
        event.stopImmediatePropagation();
    } else {
        localStorage.setItem("cognomeUser", cognome);
    }
}

function validateEta(eta, event) {
    if (eta < 18) {
        demo.innerHTML += "<p> Mi dispiace, non puoi entrare, sei troppo giovane</p> ";
        document.querySelector("#eta").setAttribute("class", "borderRed")
        event.preventDefault();
        event.stopImmediatePropagation();
    } else {
        localStorage.setItem("etaUser", eta);
    }
}

function validateEmail(email, event) {
    let regexEmail = /\b[\w\.-]+@[\w\.-]+\.\w{2,5}\b/;
    if (!email.match(regexEmail)) {
        demo.innerHTML += "<p> La tua email non è valida </p>";
        document.querySelector("#email").setAttribute("class", "borderRed")
        event.preventDefault();
        event.stopImmediatePropagation();
    } else {
        localStorage.setItem("emailUser", email);
    }
}

function validatePassword(password, event) {
    let regexPassword = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$/;
    if (!password.match(regexPassword)) {
        demo.innerHTML += "<p> La tua password non è valida </p>";
        document.querySelector("#password").setAttribute("class", "borderRed")
        event.preventDefault();
        event.stopImmediatePropagation();
    } else {
        localStorage.setItem("passwordUser", password);
    }
}

function validateTermCond(termCond, event) {
    if (!termCond.checked) {
        demo.innerHTML += "<p> Accetta Termini e Condizioni </p>";
        event.preventDefault();
    }
}

//Funzione per resettare tutte le impostazioni grafiche del form
function cleanAll() {
    demo.innerHTML = "";
    let inputsColorati = document.querySelectorAll("#input.borderRed");
    
    inputsColorati.forEach(inputColorato => {
        //inputColorato.removeAttribute("class"); Rimuove la classe
        inputColorato.classList.remove("borderRed");
    });
}

formReg.addEventListener("submit", validate);

//Recupero direttamente i campi
let elNome = document.querySelector("#nome");
let elCognome = document.querySelector("#cognome");
let elEta = document.querySelector("#eta");
let elEmail = document.querySelector("#email");
let elPassword = document.querySelector("#password");

elNome.addEventListener("blur", function () {
    validateNome(this.value, this. event);
});
elCognome.addEventListener("blur", function () {
    validateCognome(this.value, this. event);
});
elEta.addEventListener("blur", function () {
    validateEta(this.value, this. event);
});
elEmail.addEventListener("blur", function () {
    validateEmail(this.value, this. event);
});
elPassword.addEventListener("blur", function () {
    validatePassword(this.value, this. event);
});