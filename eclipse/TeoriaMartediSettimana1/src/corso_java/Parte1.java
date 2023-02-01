package corso_java;

public class Parte1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main");
		
		/*
		Veicolo2 v=new Veicolo2();
		v.marca="Fiat";
		v.modello="Panda";
		v.targa="DB288SD";
		v.colore="Grigio Metallizato";
		v.cilindrata=1200;
		*/
		
		Veicolo v1=new Veicolo("Panda","Fiat","DB288SD","Grigio Metallizato",1200);
		System.out.println(v1.info());
		
		Veicolo v6=new Veicolo("Panda","Fiat","DB288SD","Grigio Metallizato",1200);
		System.out.println(v1.info());
		
		Veicolo v2= new Veicolo("Fiesta","Ford",1200);
		System.out.println(v2.info());
		v2.colore="Bianco";
		System.out.println(v2.info());
		
		Veicolo v3= new Veicolo("V3","BMW",2500,"Verde");
		System.out.println(v3.info());
		
		
		int x=5;
		int z=x;
		System.out.println(x);
		System.out.println(z);
		z=10;
		System.out.println(x);
		System.out.println(z);
		Veicolo v5=v1;
		v5.colore="rosso";
		System.out.println(v1.colore);
		
		
		int tNum=10;
		System.out.println(tNum);
		
		testInt(tNum);
		System.out.println(tNum);
		
		testVeicolo(v1);
		System.out.println(v1.marca);
	
		System.out.println(Veicolo.count);
		
		System.out.println(v1.equals(v6));
		
		Veicolo2 a=new Veicolo2();
		a.marca="Fiat";
		a.modello="Panda";
		a.targa="DB288SD";
		a.colore="Grigio Metallizato";
		
		Veicolo2 a2=new Veicolo2();
		a2.marca="Fiat";
		a2.modello="Panda";
		a2.targa="DB288SD";
		a2.colore="Grigio Metallizato";
		
		
		
		
	}
	
	public static void testInt(int param) {
		param=25;
	}
	
	public static void testVeicolo(Veicolo param) {
		param.marca="---";
	}


}
