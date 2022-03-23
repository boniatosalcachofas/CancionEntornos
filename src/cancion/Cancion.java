package cancion;


/**
 * 
 * @author ismael
 * @version 02.2022
 * Clase principal por la cu�l vamos a utilizar para
 * poder configurar nuestro diskjam
 *
 */
public class Cancion {
	private String titulo;
	private String grupo;
	private int duracion;
	private boolean sonando;

	// Definimos los constructores

	/**
	 * Constructor cuya principal funcionalidad es hacer que el reproductor de discos
	 * se encienda pero no reproduzca ninguna canci�n
	 * 
	 */
	Cancion() // Constructor sin par�metros
	{
		this.titulo = "";
		this.duracion = 0;
		this.sonando = false;
	}
	/**
	 * 
	 * @param titulo
	 * @param duracion
	 * Constructor que introduce el disco en el reproductor pero sin darle al play.
	 */
	Cancion(String titulo, int duracion)// constructor con 2 par�metros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = false;
	}
	/**
	 * 
	 * @param titulo
	 * @param grupo
	 * @param duracion
	 * @param sonando
	 * Constructor por el cual introduces el disco en el reproductor y eliges si reproducirlo o no. Tambien muestra el grupo
	 */
	Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 par�metros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = sonando;
		this.grupo = grupo;
	}
	/**
	 * M�todo para reproducir la canci�n si est� en pause o no est� sonando. Si est� sonando 
	 * har� un return de false porque no pudo hacerla sonar, y si no est� sonando,
	 * har� un return a true porque si pudo hacerla sonar, y tornar� "sonando" a true. 
	 * @return
	 */
	boolean reproducirCancion() {
		if (this.sonando) {
			return false;
		} else {
			this.sonando = true;
			return true;
		}
	}

	/**
	 * M�todo para pausar la canci�n si est� en pause o no est� sonando. Si est� en pause
	 * har� un return de false porque no pudo pausarla, y si est� sonando,
	 * har� un return a true porque si pudo hacerla sonar, y tornar� "sonando" a true. 
	 * @return
	 */
	boolean pararCancion() {
		if (!this.sonando) {
			return false;
		} else {
			this.sonando = false;
			return true;
		}
	}
	
	// meter m�todos get/set/toString()
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	/**
	 * Es un get de sonando que indica si esta sonando o no con un booleano 
	 * (para los booleanos en vez de get se usa "is")
	 * @return
	 */
	public boolean isSonando() {
		return sonando;
	}
	/**
	 * Es un get de sonando que indica si esta sonando o no con un booleano 
	 * (para los booleanos en vez de get se usa "is")
	 *
	 */
	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}
	/**
	 * M�todo para comprobar si es la misma canci�n
	 * @param cancion
	 * @return
	 */
	boolean MismaCancion(Cancion cancion) {
		if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
			return true;
		else
			return false;
	}

	/**
	 * M�todo para calcular la canci�n m�s larga mediante un for e igualando la cancion actual a la m�s larga si supera a la anterior.
	 * @param canciones
	 * @return
	 */
	public static String MayorDuracion(Cancion[] canciones) {
		int posMax = 0;
		int max = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].duracion > max) {
				posMax = i;
				max = canciones[i].duracion;
			}
		}
		return canciones[posMax].titulo;

	}
	/**
	 * M�todo para pasar a la siguiente canci�n mediante un for
	 * @param canciones
	 * @param titulo
	 * @return
	 */
	static String SiguienteCancion(Cancion[] canciones, String titulo) {
		int pos = 0;
		int siguiente = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (titulo == canciones[i].titulo) {
				pos = i;
			}
		}
		if (pos == canciones.length - 1) {
			siguiente = 0;
		} else {
			siguiente = pos + 1;
		}
		return canciones[siguiente].titulo;
	}
	
	@Override 
	public String toString() { 
	return "Datos de la canci�n [titulo=" + titulo + ", autor=" +  grupo + ", duracion=" + duracion + ", sonando=" + sonando 
	+ "]"; 
	}

}