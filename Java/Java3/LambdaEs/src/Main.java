import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

	public static void main(String[] args) {
		List<String> stringhe = new ArrayList<>();
		stringhe.add("Ciao");
		stringhe.add("Fragola");
		stringhe.add("Cammello");
		stringhe.add("Lama");
		
		Predicate<String> maggioreDi5 = stringa -> stringa.length()>5;
		 List<String> paroleFiltrate = new ArrayList<>();
		 
		 List<String> stringhe2 = new ArrayList<>();	        
	        // Iteriamo sulla lista e applichiamo il predicato usando il metodo test()
	        for (String stringa: stringhe) {
	            if (maggioreDi5.test(stringa)) {
	                paroleFiltrate.add(stringa);
	            }
	        }
	     
	     for(String stringa:paroleFiltrate) {
	    	 System.out.println("Stringa: " + stringa);
	     }

	}
}
