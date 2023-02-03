package progetto_settimanale.java;

import java.util.Scanner;

public class ProgettoSettimanaleMain {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		ElementoMultimediale lettore[]= new ElementoMultimediale[5];		
		
		caricaArray(lettore);	
		riproduciArray(lettore);
		
	}
	
	//caricamento array
	static ElementoMultimediale[] caricaArray(ElementoMultimediale[] arr) {
		
		int n=0;
		while(n<5) {
		System.out.println("quale tipo di file vuoi inserire? (1 per video/ 2 per audio/ 3 per immagine)");
		String res=scanner.nextLine();
		if(res.equals("1") || res.equals("2") || res.equals("3")) {
			arr[n]=opz(res);
			n++;
			}
		}
		System.out.println("Fine caricamento lettore");		
		return arr;
	}
	
	// switch opzioni caricamento array
	static ElementoMultimediale opz(String res) {
				
		switch(res) {
		case "1":
			System.out.println("Creazione elemento video");
			System.out.println("Inserisci titolo video");
			String titolo=scanner.nextLine();
			
			System.out.println("Inserisci durata video");			
			String provaDurataVideo=scanner.nextLine();
			while(isNumeric(provaDurataVideo)==false) {
				System.out.println("Inserisci durata video valida");
				provaDurataVideo=scanner.nextLine();
			}
			int durata=Integer.parseInt(provaDurataVideo);
			
			System.out.println("Inserisci volume del video");
			String provaVolumeVideo=scanner.nextLine();
			while(isNumeric(provaVolumeVideo)==false) {
				System.out.println("Inserisci volume video valida");
				provaVolumeVideo=scanner.nextLine();
			}
			int volume=Integer.parseInt(provaVolumeVideo);
			
			System.out.println("Inserisci luminosita del video");
			String provaLuminositaVideo=scanner.nextLine();
			while(isNumeric(provaLuminositaVideo)==false) {
				System.out.println("Inserisci volume video valida");
				provaLuminositaVideo=scanner.nextLine();
			}
			int luminosita=Integer.parseInt(provaLuminositaVideo);
			
			Video vid= new Video(titolo,durata,volume,luminosita);
			return vid;
		case "2":
			System.out.println("Creazione elemento audio");
			System.out.println("Inserisci titolo audio");
			String titolo1=scanner.nextLine();
			
			System.out.println("Inserisci durata audio");			
			String provaDurataAudio=scanner.nextLine();
			while(isNumeric(provaDurataAudio)==false) {
				System.out.println("Inserisci durata audio valida");
				provaDurataAudio=scanner.nextLine();
			}
			int durata1=Integer.parseInt(provaDurataAudio);
			
			System.out.println("Inserisci volume dell'audio");
			String provaVolumeAudio=scanner.nextLine();
			while(isNumeric(provaVolumeAudio)==false) {
				System.out.println("Inserisci volume audio valida");
				provaVolumeAudio=scanner.nextLine();
			}
			int volume1=Integer.parseInt(provaVolumeAudio);
			
			Audio aud= new Audio(titolo1,durata1,volume1);
			return aud;
		case "3":
			System.out.println("Creazione elemento immagine");
			System.out.println("Inserisci titolo immagine");
			String titolo3=scanner.nextLine();
			
			System.out.println("Inserisci luminosita dell'immagine");
			String provaLuminositaImmagine=scanner.nextLine();
			while(isNumeric(provaLuminositaImmagine)==false) {
				System.out.println("Inserisci luminosita valida");
				provaLuminositaImmagine=scanner.nextLine();
			}
			int luminosita2=Integer.parseInt(provaLuminositaImmagine);
			
			Immagine imm= new Immagine(titolo3,luminosita2);
			return imm;
		default:
			System.out.println("Scelta non valida- scelte possibili: 1-video 2-audio 3-immagine");
			return null;
		}
	

	}
	
	//controllo immissione numeri
	public static boolean isNumeric(String str) { 
		  try {  
		    Integer.parseInt(str);  
		    return true;
		  } catch(NumberFormatException e){  
		    return false;  
		  }  
		}
	
	//riproduzione elementi array
	public static void riproduciArray(ElementoMultimediale[] arr) {
		System.out.println("Quale elemento vuoi selezionare? ");	
		String provaMca=scanner.nextLine();
		while(isNumeric(provaMca)!=true) {
			System.out.println("Quale elemento vuoi selezionare? ");	
			provaMca=scanner.nextLine();
		}
		int mca=Integer.parseInt(provaMca);	
		
		while(mca!=0) {
			if(mca==1) {
			controlloMedia(arr[mca-1]);
			System.out.println("Quale elemento vuoi selezionare? ");	
			provaMca=scanner.nextLine();
			while(isNumeric(provaMca)!=true) {
				System.out.println("Inserire numero valido. Quale elemento vuoi selezionare?  ");		
				provaMca=scanner.nextLine();
			}
			mca=Integer.parseInt(provaMca);	
			}
			
			
			else if(mca==2) {
				controlloMedia(arr[mca-1]);
				System.out.println("Quale elemento vuoi selezionare? ");	
				provaMca=scanner.nextLine();
				while(isNumeric(provaMca)!=true) {
					System.out.println("Inserire numero valido. Quale elemento vuoi selezionare?  ");			
					provaMca=scanner.nextLine();
				}
				mca=Integer.parseInt(provaMca);	
			}
			
			else if(mca==3) {
				controlloMedia(arr[mca-1]);
				System.out.println("Quale elemento vuoi selezionare? ");	
				provaMca=scanner.nextLine();
				while(isNumeric(provaMca)!=true) {
					System.out.println("Inserire numero valido. Quale elemento vuoi selezionare?  ");			
					provaMca=scanner.nextLine();
				}
				mca=Integer.parseInt(provaMca);	
			}
			
			else if(mca==4) {
				controlloMedia(arr[mca-1]);
				System.out.println("Quale elemento vuoi selezionare? ");	
				provaMca=scanner.nextLine();
				while(isNumeric(provaMca)!=true) {
					System.out.println("Inserire numero valido. Quale elemento vuoi selezionare?  ");		
					provaMca=scanner.nextLine();
				}
				mca=Integer.parseInt(provaMca);	
			}
			
			else if (mca==5) {
				controlloMedia(arr[mca-1]);
				System.out.println("Quale elemento vuoi selezionare? ");		
				provaMca=scanner.nextLine();
				while(isNumeric(provaMca)!=true) {
					System.out.println("Inserire numero valido. Quale elemento vuoi selezionare?  ");		
					provaMca=scanner.nextLine();
				}
				mca=Integer.parseInt(provaMca);	
			}
			
			else {
				System.out.println("inserire numero valido (1-5)");
				System.out.println("Quale elemento vuoi selezionare? ");	
				provaMca=scanner.nextLine();
				while(isNumeric(provaMca)!=true) {
					System.out.println("Inserire numero valido. Quale elemento vuoi selezionare?  ");			
					provaMca=scanner.nextLine();
				}
				mca=Integer.parseInt(provaMca);	
			}
		}
		System.out.println("Fine riproduzione lettore");
				
	}
	
	
	//switch per audio/video o immagine
	public static  void controlloMedia(ElementoMultimediale el) {
		if(el instanceof Video) {
			System.out.println("elemento selezionato: "+el.titolo);
			System.out.println("1-riproduci video 2-cambia volume 3-cambia luminosita");
			String modificaVideo=scanner.nextLine();
			while(isNumeric(modificaVideo)!=true) {
				System.out.println("Inserisci opzione valida. 1-riproduci 2-cambia volume 3-cambia luminosita");
				modificaVideo=scanner.nextLine();
			}
			switch(modificaVideo) {
				case "1":
					System.out.println("elemento selezionato: "+el.titolo);
					el.play();
					break;
				case "2":
					System.out.println("elemento selezionato: "+el.titolo);
					System.out.println("1-abbassa volume 2-alza volume");
					String modificaVideoVolume=scanner.nextLine();
					while(isNumeric(modificaVideoVolume)!=true) {
						System.out.println("Inserisci opzione valida. 1-abbassa volume 2-alza volume");
						modificaVideoVolume=scanner.nextLine();
					}
					if(Integer.parseInt(modificaVideoVolume)==1) {
						System.out.println("Inserisci di quanto abbassare volume");
						String modificaVideoVolumeNum=scanner.nextLine();
						while(isNumeric(modificaVideoVolumeNum)!=true) {
							System.out.println("Inserisci un numero valido di quanto abbassare volume");
							modificaVideoVolumeNum=scanner.nextLine();
						}
						((Video) el).abbassaVolume(Integer.parseInt(modificaVideoVolumeNum));
					}
					else if(Integer.parseInt(modificaVideoVolume)==2) {
						System.out.println("Inserisci di quanto alzare volume");
						String modificaVideoVolumeNum=scanner.nextLine();
						while(isNumeric(modificaVideoVolumeNum)!=true) {
							System.out.println("Inserisci un numero valido di quanto alzare volume");
							modificaVideoVolumeNum=scanner.nextLine();
						}
						((Video) el).alzaVolume(Integer.parseInt(modificaVideoVolumeNum));
					}
					break;
				case "3":
					System.out.println("elemento selezionato: "+el.titolo);
					System.out.println("1-abbassa luminosita 2-alza luminosita");
					String modificaVideoLuminosita=scanner.nextLine();
					while(isNumeric(modificaVideoLuminosita)!=true) {
						System.out.println("Inserisci opzione valida. 1-abbassa luminosita 2-alza luminosita");
						modificaVideoLuminosita=scanner.nextLine();
					}
					if(Integer.parseInt(modificaVideoLuminosita)==1) {
						System.out.println("Inserisci di quanto abbassare la luminosita");
						String modificaVideoLuminositaNum=scanner.nextLine();
						while(isNumeric(modificaVideoLuminositaNum)!=true) {
							System.out.println("Inserisci un numero valido di quanto abbassare la luminosita");
							modificaVideoLuminositaNum=scanner.nextLine();
						}
						((Video) el).abbassaLuminosita(Integer.parseInt(modificaVideoLuminositaNum));
					}
					else if(Integer.parseInt(modificaVideoLuminosita)==2) {
						System.out.println("Inserisci di quanto alzare la luminosita");
						String modificaVideoLuminositaNum=scanner.nextLine();
						while(isNumeric(modificaVideoLuminositaNum)!=true) {
							System.out.println("Inserisci un numero valido di quanto alzare la luminosita");
							modificaVideoLuminositaNum=scanner.nextLine();
						}
						((Video) el).aumentaLuminosita(Integer.parseInt(modificaVideoLuminositaNum));
					}
					break;	
				default:
					System.out.println("Opzione non valida");
					break;
					
			}			
			
			
		}else if(el instanceof Audio){
			System.out.println("elemento selezionato: "+el.titolo);
			System.out.println("1-riproduci audio 2-cambia volume");
			String modificaAudio=scanner.nextLine();
			while(isNumeric(modificaAudio)!=true) {
				System.out.println("Inserisci opzione valida. 1-riproduci 2-cambia volume");
				modificaAudio=scanner.nextLine();
			}
			switch(modificaAudio) {
				case "1":
					el.play();
					break;
				case "2":
					System.out.println("elemento selezionato: "+el.titolo);
					System.out.println("1-abbassa volume 2-alza volume");
					String modificaAudioVolume=scanner.nextLine();
					while(isNumeric(modificaAudioVolume)!=true) {
						System.out.println("Inserisci opzione valida. 1-abbassa volume 2-alza volume");
						modificaAudioVolume=scanner.nextLine();
					}
					if(Integer.parseInt(modificaAudioVolume)==1) {
						System.out.println("Inserisci di quanto abbassare volume");
						String modificaAudioVolumeNum=scanner.nextLine();
						while(isNumeric(modificaAudioVolumeNum)!=true) {
							System.out.println("Inserisci un numero valido di quanto abbassare volume");
							modificaAudioVolumeNum=scanner.nextLine();
						}
						((Audio) el).abbassaVolume(Integer.parseInt(modificaAudioVolumeNum));
					}
					else if(Integer.parseInt(modificaAudioVolume)==2) {
						System.out.println("Inserisci di quanto alzare volume");
						String modificaAudioVolumeNum=scanner.nextLine();
						while(isNumeric(modificaAudioVolumeNum)!=true) {
							System.out.println("Inserisci un numero valido di quanto alzare volume");
							modificaAudioVolumeNum=scanner.nextLine();
						}
						((Audio) el).alzaVolume(Integer.parseInt(modificaAudioVolumeNum));
					}
					break;
				default:
					System.out.println("Opzione non valida");
					break;
			}			
			
			
		}else if(el instanceof Immagine) {			
			
			System.out.println("elemento selezionato: "+el.titolo);
			System.out.println("1-mostra immagine 2-cambia luminosita");
			String modificaImmagine=scanner.nextLine();
			while(isNumeric(modificaImmagine)!=true) {
				System.out.println("Inserisci opzione valida. 1-riproduci 2-cambia volume 3-cambia luminosita");
				modificaImmagine=scanner.nextLine();
			}
			switch(modificaImmagine) {
				case "1":
					((Immagine) el).show();
					break;
				case "2":
					System.out.println("elemento selezionato: "+el.titolo);
					System.out.println("1-abbassa luminosita 2-alza luminosita");
					String modificaImmagineLuminosita=scanner.nextLine();
					while(isNumeric(modificaImmagineLuminosita)!=true) {
						System.out.println("Inserisci opzione valida. 1-abbassa luminosita 2-alza luminosita");
						modificaImmagineLuminosita=scanner.nextLine();
					}
					if(Integer.parseInt(modificaImmagineLuminosita)==1) {
						System.out.println("Inserisci di quanto abbassare la luminosita");
						String modificaImmagineLuminositaNum=scanner.nextLine();
						while(isNumeric(modificaImmagineLuminositaNum)!=true) {
							System.out.println("Inserisci un numero valido di quanto abbassare la luminosita");
							modificaImmagineLuminositaNum=scanner.nextLine();
						}
						((Immagine) el).abbassaLuminosita(Integer.parseInt(modificaImmagineLuminositaNum));
					}
					else if(Integer.parseInt(modificaImmagineLuminosita)==2) {
						System.out.println("Inserisci di quanto alzare la luminosita");
						String modificaImmagineLuminositaNum=scanner.nextLine();
						while(isNumeric(modificaImmagineLuminositaNum)!=true) {
							System.out.println("Inserisci un numero valido di quanto alzare la luminosita");
							modificaImmagineLuminositaNum=scanner.nextLine();
						}
						((Immagine) el).aumentaLuminosita(Integer.parseInt(modificaImmagineLuminositaNum));
					}
					break;	
				default:
					System.out.println("Opzione non valida");
					break;
			}			
		}
	}
	
}
