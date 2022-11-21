package zadaca2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Restoran obj1 = new Restoran ();
		
		obj1.setIme("Exclusive");
		obj1.setLokacija("Remo 3/3");
		obj1.setTelefon("077889887");
		obj1.setBrNaSedista(55);
		
		System.out.println(obj1.getIme());
		System.out.println(obj1.getLokacija());
		System.out.println(obj1.getTelefon());
		System.out.println(obj1.getBrNaSedista());
	}

}
