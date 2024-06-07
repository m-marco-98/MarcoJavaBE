const URL = "https://reqres.in/api/users?page=2";

//Utilizzo fetch API per poter chiamare i dati e ottenerli
//Applico il metodo GET

let utenti = [];

let elListaUtenti = document.querySelector("#listaUtenti");
let btn = document.querySelector("#btn");
btn.addEventListener("click", mostraUtenti);


function mostraUtenti(){

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
            elListaUtenti.innerHTML += stampaInfoUser(user);
        });

    });

    function stampaInfoUser(user) {
        let info = `
        <li>
            <p>Nome: ${user.first_name}</p>
            <p>Cognome: ${user.last_name}</p>
            <img src="${user.avatar}"/>
        </li>
        `
        return info;
    }
}
