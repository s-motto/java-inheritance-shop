
public class Smartphone extends Prodotto {
	private int imei;
	private int memoria;
	
	
	//getter e setter
	public int getImei() {
		return imei;
	}
	
	public void setImei(int imei) {
		this.imei = imei;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	public Smartphone(int codice, String nome, String marca, double prezzo, int iva, int imei, int memoria){
		super(codice,nome,marca,prezzo,iva);
		this.imei=imei;
		this.memoria=memoria;
	}
	
	 String infoSmartphone(){
		 return "Codice "+getCodice()+", "+nome+", "+marca+", "+ "IMEI "+imei+", memoria "+memoria+" GB, "+prezzo+"euro, iva al "+iva+"%"+"."+" Prezzo finale: "+prezzoPiuIva();
		 };
	}
