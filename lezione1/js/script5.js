//Notazione funzione Costruttore
function Auto(marca, modello, cilindrata, marcia) {

    this.marca = marca;
    this.modello = modello;
    this.cilindrata = cilindrata;
    this.marcia = marcia;

    this.info = function () {
        return "Automobile: " + this.marca + " " + this.modello + " " + this.cilindrata + " " + this.marcia;
    }

}

let auto1 = new Auto("Volvo", "XC90", 2000, 6);
let auto2 = new Auto("Lancia", "Delta", 1600, 5);
let auto3 = new Auto("Peugeot", "3008", 5);

console.log(auto1.info());
console.log(auto3.info()); //Stampa l'oggetto 3 anche se mancano dei parametri

class Moto{
    constructor(marca, modello, cilindrata, velocita){
        this.marca = marca;
        this.modello = modello;
        this.cilindrata = cilindrata;
        this.velocita = velocita;
    }

    static tipologia = "MOTOCICLETTA";

    //Metodo
    accendi() {
        return "VROOOOM";
    }

    getMarca() {
        return this.marca;
    }

    static calcolaDiffVel(m1, m2) {

        let differenza = m1.velocita - m2.velocita;
        return differenza;

    }
}

let miaMoto = new Moto("Kawasaki", "Z750", 750, 135);
console.log(miaMoto.accendi());
console.log(miaMoto.marca + " " + miaMoto.modello);
console.log(miaMoto.tipologia); //Stampa undefined, tipologia è un parametro static, appartiene alla classe
console.log(Moto.tipologia);

let tuaMoto = new Moto("Piaggio", "Ciao", 49, 35);

console.log(Moto.calcolaDiffVel(miaMoto, tuaMoto));


let prova = document.getElementById("prova");

class Penna {

    constructor(colore, tipo, peso) {
        this.colore = colore;
        this.peso = peso;
        this.tipo = tipo;
    }
}

function stampaPennaInDiv() {

    prova.innerHTML += "<li>" + for (const key in persona) {
        
           Penna[key];
            
    } + "</li>"
    

}