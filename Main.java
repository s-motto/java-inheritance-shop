
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smartphone samsung= new Smartphone(0000,"Samsung Galaxy A55","Samsung", 344.99d, 22, 3458134, 500);
		Televisori xiaomi= new Televisori(0000,"Xiaomi L453","Xiaomi", 234.89D, 22, 22,true);
		Cuffie jbc= new Cuffie(0000, "Headphones JBC", "JBC", 199.34D, 22, "nere", "wireless");
		System.out.println(samsung.infoSmartphone());
		System.out.println(xiaomi.infoTelevisore());
		System.out.println(jbc.infoCuffie());
	}

}
