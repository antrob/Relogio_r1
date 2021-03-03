
public class Principal {

	public static void main(String[] args) {
		
		int horas=10, minutos=25, segundos=36;
		
		System.out.printf("%d:%d:%d %n", horas, minutos, segundos);
		
		horas = avancarHoras(horas);
		minutos = avancarMinutos(minutos);
		segundos = avancarSegundos(segundos);
		
		System.out.printf("%d:%d:%d %n", horas, minutos, segundos);
		
		horas = recuarHoras( recuarHoras(horas) );
		minutos = recuarMinutos( recuarMinutos(minutos) );
		segundos = recuarSegundos( recuarSegundos(segundos) );
		
		System.out.printf("%d:%d:%d %n", horas, minutos, segundos);

	}
	
	
	
	public static int avancarHoras( int horas ) {
		return horas +  1;
	}
	
	public static int recuarHoras( int horas ) {
		return horas -  1;
	}
	
	public static int avancarMinutos( int minutos ) {
		return minutos +  1;
	}
	
	public static int recuarMinutos( int minutos ) {
		return minutos -  1;
	}
	
	public static int avancarSegundos( int segundos ) {
		return segundos +  1;
	}
	
	public static int recuarSegundos( int segundos ) {
		return segundos -  1;
	}
	
	

}
