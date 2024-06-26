
public class Televisori extends Prodotto {
	
	private int pollici;
	private boolean smart;
	
	//getter e setter
	public int getPollici() {
		return pollici;
	}
	public void setPollici(int pollici) {
		this.pollici = pollici;
	}
	public boolean isSmart() {
		return smart;
	}
	public void setSmart(boolean smart) {
		this.smart = smart;
	}
	
	public Televisori(int codice, String nome, String marca, double prezzo, int iva, int pollici, boolean smart){
		super(codice,nome,marca,prezzo,iva);
		this.pollici=pollici;
		this.smart=smart;
	}
	
	String infoTelevisore(){
		 return "Codice "+getCodice()+", "+nome+", "+marca+", "+ pollici+"pollici,  "+smart+", "+prezzo+"euro, iva al "+iva+"%"+"."+" Prezzo finale: "+prezzoPiuIva();
		 }
}
