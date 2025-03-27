import java.io.IOException;
import java.util.LinkedList;
import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Locale.setDefault(Locale.US); //numeri con la virgola li traduce con il punto

		// Create una lista con 10 elementi Wifi casuali
		LinkedList<WiFi> lwifi = new LinkedList<WiFi>();
		for (int i = 0; i < 10; i++) {
			lwifi.add(WiFi.MakeWifi());
		}

		System.out.println(lwifi);

		// Domanda:La potreste stampare in formato CSV poiché
		// dobbiamo passarla al vostro collega Onisa?
		for (var x : lwifi) {
			String a = String.format("%s,%s,%s,%f\n", 
					x.getId(), x.getProtocollo(), x.getPassword(), x.getFrequenza());
			System.out.print(a);
			
			System.out.printf("%s,%s,%s,%f\n", 
					x.getId(), x.getProtocollo(), x.getPassword(), x.getFrequenza());
		}
		var fou = Util.OpenFileForWriting("wifi.dat");
		for(var x : lwifi) {
			String a = String.format("%s,%s,%s,%f\n", x.getId(), x.getProtocollo(), x.getPassword(), x.getFrequenza());
			fou.write(a);
		}
		fou.close();
		
		//Rileggo la lista da file
		lwifi.clear();
		var fin = Util.OpenFileForReading("wifi.dat");
		String row = fin.readLine(); //leggo le righe
		while(row!=null) { //finché è diverso da null uso la riga e poi leggo la successiva
			
	    	// divido ogni riga in varie stringhe
			String[] items = (row.split(";")); 	
			WiFi it = new WiFi(items[0], items[1], items[2], Double.parseDouble(items[3]));
			lwifi.add(it); //aggiungo elemento in lista
			System.out.println(row);
			row = fin.readLine();
		}
		
		fin.close();	
		
		//Ora ho letto la lista e l'ho ricostruita!
		
		WiFi appo = WiFi.MakeWifi();
		//Dichiaro la stringa che conterrà la descrizione in formato JSON
		String jsonString;
		ObjectMapper objectMapper = new ObjectMapper();
		jsonString = objectMapper.writeValueAsString(appo);
		System.out.println(jsonString);
		
		WiFi nuovo = objectMapper.readValue(jsonString,WiFi.class);
		System.out.println(nuovo);
		
		//Salavare su file la wifi ma stavolta in formato JSON
		//e non in formato CSV e poi rileggete da capo
		var f = Util.OpenFileForWriting("wifi.txt");
		for(var x : lwifi) {
			//Converto x in JSON e poi faccio write su file
			String a = objectMapper.writeValueAsString(x);
			f.write(a+"\n");
		}
		fou.close();
		lwifi.clear();
		fin = Util.OpenFileForReading("wifi.txt");
		row = fin.readLine(); //leggo le righe
		while(row!=null) { //finché è diverso da null uso la riga e poi leggo la successiva
			
	    	// divido ogni riga in varie stringhe
			WiFi it = objectMapper.readValue(row,  WiFi.class);
			lwifi.add(it); //aggiungo elemento in lista
			row = fin.readLine();
		}
		
		fin.close();	
		System.out.println(lwifi);
		
		//oppure
		String listaJson = objectMapper.writeValueAsString(lwifi);
		System.out.println(listaJson);
		lwifi.clear();
		
		lwifi = objectMapper.readValue(listaJson, lwifi.getClass());
		System.out.println(lwifi);
	}
	}

