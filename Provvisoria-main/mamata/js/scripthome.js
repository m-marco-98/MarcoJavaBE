class brano{
    constructor(titolo){
        this.titolo=titolo;        
        
}
}
let formLogin=document.querySelector("#formReg");
let lg=document.querySelector("#reg");

function validate(){
    lg.innerHTML="";
    //acquisizione controllo

    let inputColorati=document.querySelectorAll("input .borderRed");
    inputColorati.forEach(inputColorati=>{
    inputColorati.removeAttribute("class");
})
    let username=document.querySelector("#titolo").value;    
    
    

    validateUsername(username,event);    
    
   
}
function validateTitolo(titolo,event){
    if(titolo==""|| username.length<=2){
        demo.innerHTML+= "<p>hai dimenticato il titolo</p> ";
        document.querySelector("#titolo").setAttribute("class","borderRed");
        event.preventDefault();
        event.stopImmediatePropagation();
    }
}


function getTitolo(){
    fetch(URL)
    .then(data => {
        return data.json(); //il metodo json() converte il json in obj
    }
    )
    .then(response => {
                localStorage.setItem("userConnesso", JSON.stringify(response));
        
            });

    // inserisci la costante url
}


formLogin.addEventListener("submit",validate);


//recuperare gli elementi 
let elTitolo=document.querySelector("#titolo");
