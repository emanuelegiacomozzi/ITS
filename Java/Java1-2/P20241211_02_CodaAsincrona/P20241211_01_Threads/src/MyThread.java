import java.time.LocalTime;

public class MyThread extends Thread {
    private long num;

    public void run() {
//        while (num-- > 0) {
//            System.out.println("Thread id: " + getId() + ". Num: " + num);
//        }				             //tag in gola(metodo deprecabile)
//    }
    	  while(true) {
    		  System.out.println(LocalTime.now());
    		  try {
    			  Thread.sleep(1000);
    		  } catch (InterruptedException e) {
    			  e.printStackTrace();
    		  }
    	  }
    }
    public MyThread(long num) { //è un costruttore perché ha lo stesso nome della classe e non ha tipo di ritorno
        super();
        this.num = num;
    }
}