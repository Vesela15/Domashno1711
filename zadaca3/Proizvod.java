package zadaca3;

public class Proizvod {

	public static void main(String[] args) {}
		// TODO Auto-generated method stub
		private String ime;
		private String proizvoditel;
		private int cena;
		private double tezhina;
		
		public Proizvod () {
			this.ime = "Nestle Milk";
			this.proizvoditel = "Nestle";
			this.cena = 90;
			this.tezhina = 90;
		}
		
		public String getIme () {
			return this.ime;
		}
		public String getProizvoditel () {
			return this.proizvoditel;
		}
		public int getCena () {
			return this.cena;
		}
		public double getTezhina () {
			return this.tezhina;

	}

}
