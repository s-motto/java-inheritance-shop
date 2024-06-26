//Creare la classe Prodotto che gestisce i prodotti dello shop.
//Un prodotto è caratterizzato da:
//codice (numero intero)
//nome
//marca
//prezzo
//iva
//Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali 
//altri metodi di “utilità” per fare in modo che:
//il codice prodotto sia accessibile solo in lettura
//gli altri attributi siano accessibili sia in lettura che in scrittura
//Lo shop gestisce diversi tipi di prodotto:
//Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
//Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
//Cuffie, caratterizzate dal colore e se sono wireless o cablate
//Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono 
//i vari sotto tipi di prodotto.



public class Prodotto {
	protected int codice;
	protected String nome;
	protected String marca;
	protected double prezzo;
	protected int iva;
	
	
	//getter e setter
	public int getCodice() {
		return codice;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	
	
	int codiceRandom() {
		return (int)Math.floor(Math.random()* (9000- 1000 + 1) + 1000 );
	}
	
	double prezzoPiuIva() {
		 
		double percentuale=prezzo+((prezzo*iva)/100);
		return percentuale;
	}

	Prodotto(int codice, String nome, String marca, double prezzo, int iva){
		this.codice=codiceRandom();
		this.nome=nome;
		this.marca=marca;
		this.prezzo=prezzo;
		this.iva=iva;
	}
}
