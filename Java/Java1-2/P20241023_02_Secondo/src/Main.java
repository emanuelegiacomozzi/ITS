
public class Main {

	public static void main(String[] args) {
		
		int [] vint = new int[100];
		double [] vdou = new double[100];
		
		
		/**for (int i=0; i<100; i++) {
			
			vint[i] = i+1;
			System.out.println(vint[i]);
		}
		
		
		for (int i=100; i>0; i--) {
			
			vint[100-i]=i;
			
		}
		**/
		
		for (int i=2; i<100; i+=2) {
			
			vint[i/2-1]=i;
			
		}
		StampaVint(vint);
		
		for (int i=0; i<100; i++) {
			vint[i]=(i+1)*2-1;
		}
		StampaVint(vint);
		
		for (int i=1; i<=100; i++) {
			vdou[i-1]=1.0/i;
		}
		StampaVdou(vdou);
		
		vint[0] = 1;
		vint[1] = 1;
		for(int i=2; i<100; i++) {
			vint[i] = vint[i-1]+vint[i-2];
		}
		StampaVint(vint);
		
		
		System.out.println(Fattoriale(15));
		System.out.println(Fact(50));
		
		/*crivello di eratostene
		 * 
		 */
		/*Eratostene(10000);
		 * 
		 */
		
	}
		
	private static int Fattoriale(int N) {
		
		int p = 1;
		for(int i=2; i<=N; i++) {
			p *= i;
		}
		return p;
	}
	
	public static int Fact(int N) {
		if(N==0) {
			return 1;
		} else {
			return N * Fact(N-1);
		}
	}

	private static void Eratostene(int N) {
		
		boolean [] v = new boolean[1000000000];
		for (int i=2; i<v.length; i++) {
			v[i]=true;
		}
		for (int i=2; i<v.length; i++) {
			if (v[i]==true) {
				System.out.println(i + " è un numero primo");
				
				for (int k=i+i; k<v.length; k+=i) {
					v[k]=false;
				}
			}
		}
	}

	private static void StampaVint(int[] vint) {
		for (int v: vint) {
			System.out.print(v + " ");
		}
		System.out.println();
	}
	private static void StampaVdou(double[] vdou) {
		for (double v: vdou) {
			System.out.print(v + " ");
		}
		System.out.println();
	}
	
	
		
}

		
