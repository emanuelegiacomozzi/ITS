public class Aeroporti {

    public void gestisciVolo(Volo volo) {
    	switch (volo.getStato()) {
    	
            case Volo.stato.IMBARCATO:
            	if(volo.getStato() == Volo.stato.PRENOTATO) {
            		System.out.println("Il volo " + volo.getAereo().getNome() + " è stato imbarcato.");
            	}else {
            		System.out.println("Non è possibile effettuare l'imbarco, il volo non è stato prenotato!");
            	}
            	break;

            case Volo.stato.DECOLLATO:
                System.out.println("Il volo " + volo.getAereo().getNome() + " è decollato.");
                break;

            case Volo.stato.ATTERRATO:
                System.out.println("Il volo " + volo.getAereo().getNome() + " è atterrato.");
                break;

            default:
                System.out.println("Operazione non valida.");
                break;
        }
    }
}
