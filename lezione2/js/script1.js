//Creo la classe utente
class Utente {
    constructor(username, email, dataNascita) {
        this.username = username;
        this.email = email;
        this.dataNascita = dataNascita;
    }

}


//# è il simbolo dell'id 
//query selector è simile a getElementBy ma recupera una sola occorrenza, la prima (pensa all'uso con classi o elementi)
let mioForm = document.querySelector("#mioForm");

let demo = document.querySelector("#demo");

//Creo la funzione di validazione che determina se il form può essere inviato

function validate(){
    //Qui controllo tutti i campi
    let username = document.querySelector("#username").value;
    let dataNascita = document.querySelector("#dataNascita").value;
    let email = document.querySelector("#email").value;

    if (username == "" || email == "" || dataNascita == "") {
        //uso il metodo preventDefault affinchè il form non venga inviato
        event.preventDefault();
        demo.innerHTML = "Inserisci tutti i campi, sono obbligatori";
    } else {
        //Creo un oggetto Utente per poi poterlo inviare
        // let utente = {
        //     username: username,
        //     email: email,
        //     dataNascita: dataNascita
        // }
        let utente = new Utente(username, email, dataNascita);
        console.log(utente);
        registraUtente(utente);
    }
}


/**
 * @param {Utente} utente //I parametri sono delle annotazioni che riescono a comunicare all'IDE il tipo di file da aspettarsi, non a javascript
 */
function registraUtente(utente) { 
    let utenteJSON = JSON.stringify(utente);
    console.log(utenteJSON);

}

//L'evento sul quale verrà lanciata la funzione è il submit del form, quindi al submit di btn
//nell'event listner non vanno inserite le parentesi dopo le funzioni
mioForm.addEventListener("submit", validate);