
public class Cuffie extends Prodotto{
	
	private String colore;
	private String wirelessOCablate;
	
	//getter e setter
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	public String getWirelessOCablate() {
		return wirelessOCablate;
	}
	public void setWirelessOCablate(String wirelessOCablate) {
		this.wirelessOCablate = wirelessOCablate;
	}
	
	public Cuffie(int codice, String nome, String marca, double prezzo, int iva, String colore, String wirelessOCablate){
		super(codice,nome,marca,prezzo,iva);
		this.colore=colore;
		this.wirelessOCablate=wirelessOCablate;
	}

	String infoCuffie(){
		 return "Codice "+getCodice()+", "+nome+", "+marca+", "+ colore +",  "+ wirelessOCablate+", "+prezzo+"euro, iva al "+iva+"%"+"."+" Prezzo finale: "+prezzoPiuIva();
		 }
}
