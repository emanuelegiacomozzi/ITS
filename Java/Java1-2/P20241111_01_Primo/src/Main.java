
import java.util.Collections;
import java.util.LinkedList;
//import java.util.List;
//import java.util.Scanner;
//import java.util.Collections;
import java.util.List;

		public class Main {


		 public static void main(String[] args) {


		 LinkedList<Studente> lstud = new LinkedList<Studente>();

		 lstud.add(new Studente("pippo", 34, "altro", 12));

		 lstud.add(new Studente("pippo", 44, "altro", 12));

		 lstud.add(new Studente("paperino", 22, "altro", 11));

		 lstud.add(new Studente("aaa cercasi", 22, "altro", 11));

		 lstud.add(new Studente("aaa cercasi", 11, "altro", 11));
		 
		 Collections.sort(lstud);

		 for (Studente studente : lstud) {
	            System.out.println(studente);
	        }
		 
		 
		 

		 


	}

}
