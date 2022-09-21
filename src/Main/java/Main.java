
public class Main {
	public static void main(String[] args) {
		
		AgenteDeBolsa lucas = new AgenteDeBolsa();
		
		AgenciasDeBolsa agencias = new AgenciasDeBolsa();
		
		lucas.enlazarObservador(agencias);
		
	
		int numero = (int)(Math.random()*3);
		//solo si el numero es 1 la bolsa sube y entonces se ve como notifica
		if(numero == 1)
		lucas.subeLaBolsa();
	}
	
	
	
}
