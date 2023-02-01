package corso_java;

public class Rettangolo {

	double altezza;
	double larghezza;
	
	public Rettangolo(double altezza, double larghezza) {
		this.altezza=altezza;
		this.larghezza=larghezza;
	}
	
	public double perimetro() {
		return (this.altezza+this.larghezza)*2;
	}
	
	public double area () {
		return this.altezza*this.larghezza;
	}
	
	
	
}
