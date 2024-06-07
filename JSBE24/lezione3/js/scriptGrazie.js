class Utente {
    constructor(nome, cognome, eta, email, password) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.email = email;
        this.password = password;
    }
}

let dettaglioUtente = document.querySelector("#dettaglioUtente");
let logoutBtn = document.querySelector("#logoutBtn");

//Compongo lo user e riepilogo i suoi dati
function creaUser() {
    let utente;
    if (localStorage.length != 0) {
        utente = new Utente(
            localStorage.getItem("nomeUser"),
            localStorage.getItem("cognomeUser"),
            localStorage.getItem("etaUser"),
            localStorage.getItem("emailUser"),
            localStorage.getItem("passwordUser"),
        )
        console.log(utente);
        stampaUtente(utente);
    } else {
        console.log("Non c'è nessun utente registrato");
    }
}

/**
 * 
 * @param {Utente} utente 
 */
function stampaUtente(utente) {
    
    dettaglioUtente.innerHTML = `<p>${utente.nome} ${utente.cognome}, ${utente.eta} anni</p>
    <p>${utente.email}</p>
    <p>password: ********</p>
    `;
    
}

function rimuoviUser() {
    localStorage.removeItem("nomeUser"),
    localStorage.removeItem("cognomeUser"),
    localStorage.removeItem("etaUser"),
    localStorage.removeItem("emailUser"),
    localStorage.removeItem("passwordUser")
}

//Il button esegue il logout
logoutBtn.addEventListener("click", function () {
    rimuoviUser();
    dettaglioUtente.innerHTML = "<p>Arrivederci, stronzo! :)</p>";

});

//Al caricamento della pagina viene creato lo User
window.addEventListener("DOMContentLoaded", creaUser);