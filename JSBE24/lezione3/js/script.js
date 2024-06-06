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

function validate() {
    //Qui raccolgo tutti i valori dal form;
    let nome = String(document.querySelector("#nome").value);
    let cognome = String(document.querySelector("#cognome").value);
    let email = String(document.querySelector("#email").value);
    let password = document.querySelector("#password").value;
    let termCond = document.querySelector("#termCond");
    let eta = document.querySelector("#eta").value;

    cleanAll();
    validateName(nome, event);
    validateCognome(cognome,event);
    validateEta(eta, event);
    validateEmail(email, event);
    validatePassword(password, event);

    function validateName(nome, event) {
        if(nome == "" || nome.length <= 2) {
            demo.innerHTML += "<p> Hai dimenticato il nome </p>";
            document.querySelector("#nome").setAttribute("class", "borderRed")
            event.preventDefault();
            event.stopImmediatePropagation();
        }
    }

    function validateCognome(cognome, event) {
        if(cognome == "" || cognome.length <= 2) {
            demo.innerHTML += "<p> Hai dimenticato il cognome </p>";
            document.querySelector("#cognome").setAttribute("class", "borderRed")
            event.preventDefault();
            event.stopImmediatePropagation();
        }
    }

    function validateEta(eta, event) {
        if(eta < 18) {
            demo.innerHTML += "<p> Mi dispiace, non puoi entrare, sei troppo giovane</p> ";
            document.querySelector("#eta").setAttribute("class", "borderRed")
            event.preventDefault();
            event.stopImmediatePropagation();
        }
    }

    function validateEmail(email, event) {
        let regexEmail = /\b[\w\.-]+@[\w\.-]+\.\w{2,5}\b/;
        if(!email.match(regexEmail)) {
            demo.innerHTML += "<p> La tua email non è valida </p>";
            document.querySelector("#email").setAttribute("class", "borderRed")
            event.preventDefault();
            event.stopImmediatePropagation();
        }
    }

    function validatePassword(password, event) {
        let regexPassword = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$/;
        if(!password.match(regexPassword)) {
            demo.innerHTML += "<p> La tua password non è valida </p>";
            document.querySelector("#password").setAttribute("class", "borderRed")
            event.preventDefault();
            event.stopImmediatePropagation();
        }
    }



    function cleanAll() {
        demo.innerHTML = "";
        document.querySelector("#nome").setAttribute("class", "");
        document.querySelector("#cognome").setAttribute("class", "");
        document.querySelector("#eta").setAttribute("class", "");
        document.querySelector("#email").setAttribute("class", "");

    }
}

formReg.addEventListener("submit", validate);