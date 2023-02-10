package threads;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

import org.apache.commons.io.FileUtils;



public class Esercizio3 {

	static Scanner scanner= new Scanner(System.in);
	static File file= new File("Files/provaFile.txt");
	static File registroPresenze= new File("Files/RegistroPresenze.txt");
	static String testo;
	
	public static void main(String[] args) throws IOException {
		
		/*
	
		try {
			scritturaFile("Test file");
			String testoDaFile= leggiFile();
			System.out.println("Testo: "+testoDaFile);
		}catch(IOException e) {
			e.printStackTrace();
		}
		
		//cancellazioneDirectory();
		//cancellazioneFile();
	
		*/
	
		Map<String,Integer> RegistroPresenze= new HashMap<String,Integer>();
		
		inserisciPresenza(RegistroPresenze);
		inserisciPresenza(RegistroPresenze);
		scriviPresenze(RegistroPresenze);
		//stampaRegistro(RegistroPresenze);
		leggiTesto();
		
	}	
		
	
	
	public static void inserisciPresenza(Map<String, Integer> x) {
		System.out.println("Inserisci nome");
		String nome=scanner.nextLine();
		System.out.println("Inserisci numero presenze");
		int presenze=Integer.parseInt(scanner.nextLine());
		
		x.put(nome, presenze);
	}
	
	public static void scriviPresenze(Map<String,Integer>x) throws IOException {
		String testo2="";
		for (Entry<String, Integer> entry : x.entrySet()) {
                    testo2+=entry.getKey()+"@"+entry.getValue()+"#";
		}
		System.out.println(testo2);
		FileUtils.writeStringToFile(registroPresenze, testo2,"UTF-8");
		
	}
	
	public static void leggiTesto() throws IOException {
		String registro= FileUtils.readFileToString(registroPresenze);
		System.out.println(registro);
	}
	
	/*
	public static void stampaRegistro(Map<String,Integer>x) {
		System.out.println(x.toString());
	}
	*/
	
	public static void scritturaFile(String testo) throws IOException {
		FileUtils.writeStringToFile(file, testo, "UTF-8");
		System.out.println("Testo inserito: "+testo);
	}
	
	public static String leggiFile() throws IOException{
		String txtFile= FileUtils.readFileToString(file, "UTF-8");
		return txtFile;
	}
	
	public static void cancellazioneFile() throws IOException{
		FileUtils.deleteQuietly(file);
	}
	
	public static void cancellazioneDirectory() throws IOException{
		FileUtils.deleteDirectory(file);
	}
	
	

}
