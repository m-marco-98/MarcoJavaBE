//Notazione letterale

//Studente è un oggetto già fatto e costruito
let studente = {
    //Proprietà
    nome: "Dario",
    cognome: "Mennillo",
    eta: 35,
    presenza: true,

    //Metodo
    salutaDocente: function () {
        return "Ciao Mauro!";
    }
}

//Accedere a prop e metodi con la notazione .
console.log(studente.nome);
console.log(studente.cognome);
console.log(studente.eta);
console.log(studente.presenza);
console.log(studente.salutaDocente());

//Accedere con [string]
console.log(studente["nome"]);
console.log(studente["cognome"]);
console.log(studente["eta"]);
console.log(studente["presenza"]);
console.log(studente["salutaDocente"]);

function stampaInfo(persona) {

    //La key rappresenta la prorpietà dell'oggetto formato stringa
    for (const key in persona) {
        console.log(persona[key]);
    }
}

stampaInfo(studente);