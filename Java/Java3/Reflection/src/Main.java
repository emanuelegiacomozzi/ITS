import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
//		try {
//			Class c = Class.forName("Calcolatrice");
//			
//			Method [] metodi = c.getDeclaredMethods();
//			System.out.println("Metodi della classe "+ c.getName());
//			for(Method metodo:metodi) {
//				System.out.println("Metodo = " + metodo.getName());
//			}
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Persona p = new Persona();
		Field nome = Persona.class.getDeclaredField("nome");
		nome.setAccessible(true);
		System.out.println("Valore campo nome = "+ nome.get(p));
		
		Class c = Class.forName("Automobile");
		Method[] metodi = c.getDeclaredMethods();
		System.out.println("Metodi della classe: " + c.getName());
		for(Method metodo:metodi) {
			System.out.println("Metodo = "+ metodo.getName());
		}
		
		
		
	}
}
