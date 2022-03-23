package cancion;

public class PruebaCancion {
	
	/**
	 * Main que crea 4 canciones, de las cuales, la primera la reproduce y la pausa en 2 m�todos.
	 * Y a continuaci�n, con una serie de m�todos, muestra varia informaci�n. 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Cancion cancionPrueba = new Cancion();
		System.out.println(cancionPrueba);
		
		Cancion cancionClasico = new Cancion("Sweet Home Alabama", 180);
		System.out.println(cancionPrueba);
		
		Cancion primeraCancion = new Cancion("I Don't Like Mondays", "The Boomtown Rats", 390, true);
		Cancion segundaCancion = new Cancion("Don�t Stop Believin�", "Journey", 320, false);
		Cancion terceraCancion = new Cancion("Come Join The Murder", "The White Buffalo & The Forest Rangers", 420, false);
		Cancion cuartaCancion = new Cancion("Don�t Let Me Be Missunderstood", "The Animals", 220, true);
		Cancion quintaCancion = new Cancion("I Want to Break Free", "QUeen", 330, false);
		if (primeraCancion.reproducirCancion()) {
			System.out.println(primeraCancion.getTitulo() + "est� sonando");
		}
		if (primeraCancion.pararCancion()) {
			System.out.println(primeraCancion.getTitulo() + "stop");
		}
		if (primeraCancion.MismaCancion(cancionClasico)) {
			System.out.println("Parece que no son la misma canci�n");
		}
		Cancion nueva = new Cancion("Baba O'riley", "The Who", 310, false);
		Cancion[] canciones = { primeraCancion, segundaCancion, terceraCancion, nueva };
		
		mostrarCancionesyAutor(canciones);
		mostrarCancionMasLarga(canciones);

		mostrarSiguienteCancion(primeraCancion, canciones);
		mostrarSiguienteCancion(nueva, canciones);
	}

/**
 * Metodo para mostrar la siguiente canci�n que va a sonar a continuaci�n
 * @param miCancion
 * @param canciones
 */
	private static void mostrarSiguienteCancion(Cancion miCancion, Cancion[] canciones) {
		System.out.println("La canci�n que sonar� despu�s de " + miCancion.getTitulo() + " ser� "
				+ Cancion.SiguienteCancion(canciones, miCancion.getTitulo()));
	}

	/**
	 * Metodo para buscar la canci�n m�s larga
	 * @param canciones
	 */
	private static void mostrarCancionMasLarga(Cancion[] canciones) {
		System.out.println("La canci�n m�s larga es: " + Cancion.MayorDuracion(canciones));
	}

	/**
	 * Muestra el t�tulo de la canci�n mas su autor
	 * @param canciones
	 */
	private static void mostrarCancionesyAutor(Cancion[] canciones) {
		for (int i = 0; i < canciones.length; i++) {
			System.out.println("La canci�n es " + canciones[i].getTitulo() + " de " + canciones[i].getGrupo());
		}
	}
	

}