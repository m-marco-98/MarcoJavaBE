//Conserva l'id del record da modificare 
let globalId;

//Definisce la classe utente
class Utente{
    constructor(name,lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}

//Selettori 
let elListaUtenti = document.querySelector("#elListaUtenti");
let formReg = document.querySelector("#formReg");

//L'URL dell'endpoint
const URL_endpoint = "https://6668148df53957909ff66d29.mockapi.io/api/utenti";

//Funzione per caricare l'utente
function salvaUtente() {

    let userName = document.querySelector("#nomeUser").value;
    let lastName = document.querySelector("#cognomeUser").value;

    if(userName == "" || lastName == "") {
        event.preventDefault();
    } else {

        let utente = new Utente(userName, lastName);

        fetch(URL_endpoint, {
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(utente)
        }).then(data => {
            return data.json();
        }).then(() => {
            location.reload();
        })
    }
}

formReg.addEventListener("submit", salvaUtente);

//Funzione per recuperare l'array di utenti
function recuperaDati() {
    fetch(URL_endpoint)
    .then(data => {
        return data.json();
    })
    .then(response => {
        response.forEach(user => {
            elListaUtenti.appendChild(stampaUser(user));                
        });
       
    })
}

//Funzione per recuperare un singolo utente secondo l'ID
function recuperaUtenteById(id) {

    URL_singleObject = URL_endpoint + "/" + id;

    fetch(URL_singleObject)
    .then(data => {
        return data.json();
    })
    .then(response => {
        return response.json();       
    })
}

//Funzione per l'eminare un utente secondo ID
function eliminaUserById(id) {
    
    let URL_del = URL_endpoint + "/" + id;

    fetch(URL_del, {
        method: "DELETE"
    })
        .then(data => {
            return data.json();
        })
        .then(userEliminato => {
            console.log("Hai eliminato ", userEliminato);
            location.reload();
        })
        .catch(error => {
            console.log(error);
        })
}

//Funzione per odificare un utente secondo l'ID   
function modificaUserById(id){

    let URL_mod = URL_endpoint + "/" + id;
    let userName = document.querySelector("#nomeUserMod").value;
    let lastName = document.querySelector("#cognomeUserMod").value;

    if(userName == "" || lastName == "") {
        event.preventDefault();
    } else {

        let utente = new Utente(userName, lastName);

        fetch(URL_mod, {
            method: "PUT",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify(utente)
        }).then(data => {
            return data.json();
        }).then(() => {
            location.reload();

        })

    }

}

formMod.addEventListener("submit", function(){
    modificaUserById(globalId);
});

//Funzione che mostra l'array di utenti sulla pagina e propone i tasti per eseguire delle operazioni
function stampaUser(user) {
    let rigaUser = document.createElement("li");
    rigaUser.innerHTML = `${user.name} ${user.lastName}`;

    let btnElimina = document.createElement("button");
    btnElimina.innerHTML = " X ";

    let btnModifica = document.createElement("button");
    btnModifica.innerHTML = " Modifica ";

    btnElimina.addEventListener("click", function(){
        eliminaUserById(user.id);
    })

    btnModifica.addEventListener("click", function(){
        globalId = user.id;
        document.querySelector("#nomeUserMod").value = `${user.name}`;
        document.querySelector("#cognomeUserMod").value = `${user.lastName}`;
    })

    rigaUser.appendChild(btnModifica);
    rigaUser.appendChild(btnElimina);

    return rigaUser;
}

window.addEventListener("DOMContentLoaded", recuperaDati);