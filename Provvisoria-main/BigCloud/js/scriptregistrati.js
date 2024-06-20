const URL="jdbc:mysql://localhost:3306/progetto_playlist"

class Utente{
    constructor(username,nome,cognome,email,pass,termCond){
        this.username=username;
        this.nome=nome;
        this.cognome=cognome;
        this.email=email;
        this.pass=pass;
        this.termCond=termCond;
    }
}

let formReg=document.querySelector("#formReg");
let reg=document.querySelector("#reg");

function validate(){
    reg.innerHTML="";
    //registrazione e controllo

    let inputColorati=document.querySelectorAll("input .borderRed");
    inputColorati.forEach(inputColorati=>{
    inputColorati.removeAttribute("class");
})
    let username=document.querySelector("#username").value;
    let nome=document.querySelector("#nome").value;
    let cognome=document.querySelector("#cognome").value;
    let email=document.querySelector("#email").value;
    let pass=document.querySelector("#pass").value;
    let contpass=document.querySelector("#contpass").value;    
    let termCond=document.querySelector("#termCond").value;

    validateUsername(username,event);
    validateName(nome, event);
    validateCognome(cognome,event);    
    validateEmail(email,event);
    validatePass(pass,event);
    validateContpass(contpass,event);

    if(!termCond.checked){
        reg.innerHTML+="<p>non hai spuntato termini e condizioni</p>"
        event.preventDefault();
    }
fetch(URL, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(Utente)
    })
        .then(data => {
            return data.json();
        })
        .then(() => {
            location.reload();
        })
}
function validateUsername(username,event){
    if(eta==""|| username.length<=2){
        demo.innerHTML+= "<p>hai dimenticato l'username</p> ";
        document.querySelector("#username").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }
}
function validateName(nome, event){
    if(nome=="" || nome.length<=2){
        demo.innerHTML+="<p>hai dimenticato il nome</p>";
        document.querySelector("#nome").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }
}
function validateCognome(cognome, event){
    if(cognome=="" || nome.length<=2){
        demo.innerHTML+="<p>hai dimenticato il cognome</p>";
        document.querySelector("#cognome").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }
}

function validateEmail(email, event){
    let regexEmail=/^[\w-\.]+@([\w-]+\.)+[\w-]{2,5}$/;
    if(!email.match(regexEmail)){
        demo.innerHTML+= "<p>La tua mail non è valida </p>";
        document.querySelector("#email").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }
}
function validatePass(pass,event){
    let regexpass=/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[a-zA-Z]).{8,}$/;
    if(!pass.match(regexpass)){
        demo.innerHTML+= "<p>La tua password non è sicura </p>";
        document.querySelector("#pass").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }
}
function validateContpass(contpass, event){
    if(contpass!=pass ){
        demo.innerHTML+="<p>le password non coincidono</p>";
        document.querySelector("#contpass").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }
}





formReg.addEventListener("submit",validate);


//recuperare gli elementi 
let elEta=document.querySelector("#username");
let elNome=document.querySelector("#nome");
let elCognome=document.querySelector("#cognome");
let elEmail=document.querySelector("#email");
let elPass=document.querySelector("#pass");