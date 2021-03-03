
public class Principal {

	public static void main(String[] args) {
		
		int horas=10, minutos=25, segundos=36;
		
		System.out.printf("%d:%d:%d %n", horas, minutos, segundos);
		
		int[] minutosHoras;
		int[] segundosMinutosHoras; 
		
		horas = avancarHoras(horas);
		minutosHoras = avancarMinutos(minutos, horas);
		minutos = minutosHoras[0];
		horas = minutosHoras[1];
		segundosMinutosHoras = avancarSegundos(segundos, minutos, horas);
		segundos = segundosMinutosHoras[0];
		minutos = segundosMinutosHoras[1];
		horas = segundosMinutosHoras[2];
		
		System.out.printf("%d:%d:%d %n", horas, minutos, segundos);
		
		horas = recuarHoras(horas);
		minutosHoras = recuarMinutos(minutos, horas);
		minutos = minutosHoras[0];
		horas = minutosHoras[1];
		segundosMinutosHoras = recuarSegundos(segundos, minutos, horas);
		segundos = segundosMinutosHoras[0];
		minutos = segundosMinutosHoras[1];
		horas = segundosMinutosHoras[2];
		
		System.out.printf("%d:%d:%d %n", horas, minutos, segundos);

	}
	
	
	// Incorpora��o da Intelig�ncia de um Rel�gio Digital  
	
	// Avan�a a hora e retorna a nova hora  
	public static int avancarHoras( int horas ) {
		
		if( horas==23 )
			horas = 0;
		else
			horas = horas + 1;
		
		return horas;
	}
	
	// Recua uma hora e retorna a nova hora  
	public static int recuarHoras( int horas ) {
		
		if( horas == 0 )
			horas = 23;
		else
			horas = horas - 1;
		
		
		return horas;
	}
	
	
	/* 
	 * Avan�a os minutos e retorna os novos minutos,
	 * e tamb�m retorna a hora que pode ser alterada caso os minutos passados sejam o 59
	 * 
	 *  Logo, recebe como argumentos os minutos e a hora
	 *  e retorna um array com os novos minutos e a nova hora  
	 *   
	 */
	public static int[] avancarMinutos( int minutos, int horas ) {
		
		if( minutos == 59 ) {
			minutos = 0;
			horas = avancarHoras(horas);
		}
		else
			minutos++;
		
		int[] minutosHoras = { minutos, horas }; 
		return minutosHoras ;
	}
	
	
	/* 
	 * Recua os minutos e retorna os novos minutos,
	 * e tamb�m retorna a hora que pode ser alterada caso os minutos passados sejam o 0
	 * 
	 *  Logo, recebe como argumentos os minutos e a hora
	 *  e retorna um array com os novos minutos e a nova hora  
	 *   
	 */
	public static int[] recuarMinutos( int minutos, int horas ) {
		
		if( minutos == 0 ) {
			minutos = 59;
			horas = recuarHoras(horas);
		}
		else
			minutos--;
		
		int[] minutosHoras = { minutos, horas }; 
		return minutosHoras ;
		
	}
	
	
	/* 
	 * Avan�a os segundos e retorna os novos segundos,
	 * e tamb�m retorna os minutos que podem ser alterados caso os segundos passados sejam o 59
	 *        e tamb�m � necess�rio retornar as horas que num caso muito extremo (minuto 59) tamb�m poder�o ser alteradas 
	 * 
	 *  Logo, recebe como argumentos os segundos, os minutos e a hora
	 *  e retorna um array com os novos segundos, e minutos e hora  
	 *   
	 */
	public static int[] avancarSegundos( int segundos, int minutos, int horas ) {
		
		if( segundos == 59 ) {
			segundos = 0;
			int[] minutosHoras = avancarMinutos( minutos, horas);
			minutos = minutosHoras[0];
			horas = minutosHoras[1];
		}
		else
			segundos++;
		
		int[] segundosMinutosHoras = { segundos, minutos, horas }; 
		return segundosMinutosHoras ;
		
	}
	
	
	/* 
	 * Recua os segundos e retorna os novos segundos,
	 * e tamb�m retorna os minutos que podem ser alterados caso os segundos passados sejam o 0
	 *        e tamb�m � necess�rio retornar as horas que num caso muito extremo tamb�m poder�o ser alteradas 
	 * 
	 *  Logo, recebe como argumentos os segundos, os minutos e a hora
	 *  e retorna um array com os novos segundos, e minutos e hora  
	 *   
	 */
	public static int[] recuarSegundos( int segundos, int minutos, int horas ) {
		
		if( segundos == 0 ) {
			segundos = 59;
			int[] minutosHoras = recuarMinutos( minutos, horas);
			minutos = minutosHoras[0];
			horas = minutosHoras[1];
		}
		else
			segundos--;
		
		int[] segundosMinutosHoras = { segundos, minutos, horas }; 
		return segundosMinutosHoras ;
		
	}
	
	

}
