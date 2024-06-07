const URL = "https://reqres.in/api/users?page=2";

//Utilizzo fetch API per poter chiamare i dati e ottenerli
//Applico il metodo GET

let utenti = [];

let elListaUtenti = document.querySelector("#listaUtenti");

fetch(URL)
    .then(data => {
        console.log(data)
        return data.json(); //Il metodo json converte il dato formato json in obj
    }
    )
    .then(response => {
        console.log(response);
        //Stampo i nomi degli utenti
        response.data.forEach(user => {
            
            //Controllo
            console.log(user.first_name + " " + user.last_name);  
            //Stampa in HTML
            elListaUtenti.innerHTML += stampaInfoUser(user); //1) Riempire l'array utenti qui dentro
        });
//2) Qui nella fetch inserire una funzione di stampa che scorre l'array di foto al click
//quando arriva in fonfo all'array della pagina 1, far partire la fetch per il caricamento dell'array dalla pagina due
//NB: la fetch prende una costante in entrata, posso dargliene un'altra che contiene l'url per l'altra pagina
    });
