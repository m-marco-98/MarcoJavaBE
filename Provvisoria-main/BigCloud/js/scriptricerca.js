const URL="http://localhost:9179/progetto_playlist";

class Brano{
    constructor(titolo){
        this.titolo=titolo;   
      
    }
}
let formric=document.querySelector("#formric");
let ric=document.querySelector("#ric");

function validate(){
    lg.innerHTML="";
    //acquisizione controllo

    let inputColorati=document.querySelectorAll("input .borderRed");
    inputColorati.forEach(inputColorati=>{
    inputColorati.removeAttribute("class");
})
    let titolo=document.querySelector("#titolo").value;    
    
    

    validateUsername(titolo,event);    
   
    
fetch(URL + "/canzoni")
    .then(data => {
        return data.json();
    })
    .then(response => {
        console.log(response);
        
        response.forEach(Brano => {
            
            elListaUtenti.appendChild(stampaUser(Brano));
        });
    })  
}


formric.addEventListener("submit",validate);



let elUsername=document.querySelector("#titolo");
