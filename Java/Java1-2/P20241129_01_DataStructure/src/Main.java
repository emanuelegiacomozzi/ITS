import java.time.LocalTime;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		//Set, Map, Queue, Stack, Arrays, List
		LocalTime.now().getNano();
		var now = System.nanoTime();
		
		/*
		//calcolare il tempo che ci vuole per inserire 1000000
		//di numeri interi sequenziali in testa a una LinkedList
		 * 
		 */
		final Integer N=1000000000;
		long inizio, fine;
		
		//test LinkedList
		inizio = System.nanoTime();
		AddToLinkedList(N);
		fine = System.nanoTime();
		System.out.println("LinkedList: per inserire " + N + " elementi in coda " + (fine-inizio)/1000000000.0 + " sec. ");
		
		inizio = System.nanoTime();
		AddToArrayList(N);
		fine = System.nanoTime();
		System.out.println("LinkedList: per inserire " + N + " elementi in coda " + (fine-inizio)/1000000000.0 + " sec. ");
		
		inizio = System.nanoTime();
		AddFirstLinkedList(N);
		fine = System.nanoTime();
		System.out.println("LinkedList: per inserire " + N + " elementi in coda " + (fine-inizio)/1000000000.0 + " sec. ");
		
		inizio = System.nanoTime();
		AddFirstArrayList(N);
		fine = System.nanoTime();
		System.out.println("LinkedList: per inserire " + N + " elementi in coda " + (fine-inizio)/1000000000.0 + " sec. ");
		
	}

	private static LinkedList<Integer> AddToLinkedList(Integer n) {
        LinkedList<Integer> lli = new LinkedList<Integer>();
        while (n > 0) {
            lli.add(n--);
        }
        return lli;
    }
    private static ArrayList<Integer> AddToArrayList(Integer n) {
        ArrayList<Integer> lli = new ArrayList<Integer>();
        while (n > 0) {
            lli.add(n--);
        }
        return lli;
    }
    private static LinkedList<Integer> AddFirstLinkedList(Integer n) {
        LinkedList<Integer> lli = new LinkedList<Integer>();
        while (n > 0) {
            lli.addFirst(n--);
        }
        return lli;
    }
    private static ArrayList<Integer> AddFirstArrayList(Integer n) {
        ArrayList<Integer> lli = new ArrayList<Integer>();
        while (n > 0) {
            lli.addFirst(n--);
        }
        return lli;
    }
    
    private static NostraLL<Integer> AddFirst(Integer n) {
    	NostraLL<Integer> lli = new NostraLL<Integer>();
    	while (n > 0)
    }

}
