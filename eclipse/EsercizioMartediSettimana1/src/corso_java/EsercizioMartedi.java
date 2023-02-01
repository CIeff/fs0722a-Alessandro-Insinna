package corso_java;

public class EsercizioMartedi {

	public static void main(String[] args) {
		
		Rettangolo prova1 = new Rettangolo(3,4);		

		stampaRettangolo(prova1);

		Rettangolo prova2=new Rettangolo(5,6);
		
		stampaDueRettangoli(prova1,prova2);
	}
	
	public static void stampaDueRettangoli(Rettangolo x, Rettangolo y) {
		stampaRettangolo(x);
		stampaRettangolo(y);
		System.out.println("///////////////////////////");
		
		System.out.println("Area rettangoli: "+(y.area()+x.area()));
		System.out.println("Perimetro rettangoli: "+(x.perimetro()+y.perimetro()));
		System.out.println("///////////////////////////");
	}
	
	public static void stampaRettangolo(Rettangolo rettangolo) {
		System.out.println("Area  rettangolo1:  "+rettangolo.area());
		System.out.println("Perimetro rettangolo1:  "+rettangolo.perimetro());
		System.out.println("///////////////////////////");
	}
}
