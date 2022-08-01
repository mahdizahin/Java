package first;

public class Agro extends Start {
	String CattleName;
	double CattlePrice;
	public Agro(String name, int id,String CattleName,double CattlePrice) {
		super(name,id);
		this.CattleName=CattleName;
		this.CattlePrice=CattlePrice;
	}

	public void display() {
		 super.display();
		 System.out.println("Cattle Name:"+CattleName);
		 System.out.println("Cattle Price : "+CattlePrice);
	 }
}
