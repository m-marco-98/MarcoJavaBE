const URL="http://localhost:9179/api";

class Utente{
    constructor(username,password){
        this.username=username;        
        this.password=password;        
    }
}

let formLogin=document.querySelector("#formLogin");
let lg=document.querySelector("#lg");

function validate(){
    lg.innerHTML="";
    //acquisizione controllo

    let inputColorati=document.querySelectorAll("input .borderRed");
    inputColorati.forEach(inputColorati=>{
    inputColorati.removeAttribute("class");
})
    let username=document.querySelector("#username").value;    
    let password=document.querySelector("#password").value;   
    

    validateUsername(username,event);    
    validatePassword(password,event);
    
    const URL_login = URL + "/utente/login";
    login(URL_login);
}


function login(url){
    
    fetch(url)
    .then(data => {
        console.log(data);
        return data.json(); //il metodo json() converte il json in obj
    }
    )
    .then(response => {
                console.log(response);
                // localStorage.setItem("userConnesso", JSON.stringify(response));        
            })        
};   


function validateUsername(username,event){
    if(username==""|| username.length<=2){
        demo.innerHTML+= "<p>hai dimenticato l'username</p> ";
        document.querySelector("#username").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }
}

function validatePassword(password,event){
    
    if(password==""){
        demo.innerHTML+= "<p>hai dimenticato la password</p>";
        document.querySelector("#pass").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }
}



formLogin.addEventListener("submit",validate);


//recuperare gli elementi 
let elUsername=document.querySelector("#username");
let elPass=document.querySelector("#pass");