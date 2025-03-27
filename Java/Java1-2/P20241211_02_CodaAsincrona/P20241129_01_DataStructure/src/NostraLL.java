//Implementazione di una linked list
public class NostraLL<T> { //T è un tipo generico, la lista può contenere ogni tipo di dato
	private T data; //memorizza i dati nel nodo della lista
	private NostraLL<T> next; //riferimento al nodo successivo (prossimo elemento nella LinkedList)
	private NostraLL<T> first;
	
	void addFirst(T info) { //metodo per aggiungere un nuovo nodo all'inizio della lista
		NostraLL<T> l = new NostraLL<T>(); //creazione di un nuovo nodo
		l.data = info; //assegnamo ad l il valore info
		l.next = null; //next del nuovo nodo inizializzato a null, perché è l'ultimo nella lista e non ha nodi successivi
		if (first == null) { //se la lista è vuota e il nodo corrente è l'unico presente, il nodo viene aggiunto come primo 
			//la lista è vuota
			first = l;
		} else {
			while(next.next != null) {
				next = next.next;
			}
			next.next = l;
			
		}
	}
	

}
