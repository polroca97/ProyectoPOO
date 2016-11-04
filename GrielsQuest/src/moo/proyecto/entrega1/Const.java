package moo.proyecto.entrega1;

/**
 * Created by mmacias on 22/7/16.
 */
/**
 *
 * Esta clase contiene algunas constantes que se utilizar√°n en el programa. En
 * concreto contiene constantes para:
 * <br>...Indicar el n√∫mero de filas y de columnas del recinto.
 * <br>...Indicar los nombres relativos de los archivos en los que se encuentran
 * las im√°genes de los obst√°culos y los elementos que permiten vencerlos.
 * <br>...Caracteres que permiten crear, v√≠a c√≥digo, los recintos de los
 * diferentes niveles. 
 * 
 * Para construir el recinto, el dise√±ador de niveles genera un
 * mapa de caracteres. Se trata de un vector bidireccional (matriz) de id√©nticas
 * dimensiones a las del recinto del juego. El car√°cter presente en cada
 * posici√≥n de esta matriz indicar√° el obst√°culo, item o asuencia de ambos que
 * el recinto del juego tendr√° en la celda que ocupe la posici√≥n que tenga los
 * mismos n√∫meros de fila y columna que la posici√≥n del mapa.
 * A partir de ese mapa de caracteres el c√≥digo construye el recinto con celdas
 * que est√°n libres o contienen obst√°culos o items, seg√∫n los caracteres contenidos
 * en las diferentes posiciones del mapa (ver {@link  moo.proyecto.entrega1.Nivel#Nivel}). 
 *
 *
 */
public class Const {

    /**
     * N√∫mero de columnas del recinto
     */
    public static final int NIVEL_COLUMNAS = 16;
    /**
     * N√∫mero de filas del recinto
     */
    public static final int NIVEL_FILAS = 14;

    /**
     * Nombre relativo del archivo en el que est√° la im√°gen del
     * jugador-personaje
     */
    public static final String ARCHIVO_JUGADOR = "/imagenes/jugador.png";
    /**
     * Nombre relativo del archivo en el que est√° la im√°gen de la pared
     */
    public static final String ARCHIVO_PARED = "/imagenes/pared.png";
    /**
     * Nombre relativo del archivo en el que est√° la im√°gen de la puerta
     */
    public static final String ARCHIVO_PUERTA = "/imagenes/puerta.png";
    /**
     * Nombre relativo del archivo en el que est√° la im√°gen de la llave
     */
    public static final String ARCHIVO_LLAVE = "/imagenes/llave.png";
    /**
     * Nombre relativo del archivo en el que est√° la im√°gen del soplete
     */
    public static final String ARCHIVO_SOPLETE = "/imagenes/soplete.png";
    /**
     * Nombre relativo del archivo en el que est√° la im√°gen del hielo
     */
    public static final String ARCHIVO_HIELO = "/imagenes/hielo.png";
    /**
     * Nombre relativo del archivo en el que est√° la im√°gen del agua
     */
    public static final String ARCHIVO_AGUA = "/imagenes/agua.png";
    /**
     * Nombre relativo del archivo en el que est√° la im√°gen del fuego
     */
    public static final String ARCHIVO_FUEGO = "/imagenes/fuego.png";
    /**
     * Nombre relativo del archivo en el que est√° la im√°gen de un pico
     */
    public static final String ARCHIVO_PICO = "/imagenes/pico.png";
    /**
     * Nombre relativo del archivo en el que est√° la im√°gen de una roca
     */
    public static final String ARCHIVO_ROCA = "/imagenes/roca.png";

    /**
     * Caracter que en el mapa de caracteres de Nivel (ver
     * {@link  moo.proyecto.entrega1.Nivel}) indica que en esa posici√≥n est√° el
     * jugador.
     */
    public static final char CELDA_POSICION_INICIAL_JUGADOR = 'J';
    /**
     * Caracter que en el mapa de caracteres de Nivel (ver
     * {@link  moo.proyecto.entrega1.Nivel}) indica que la celda est√° vac√≠a.
     */
    public static final char CELDA_NORMAL = ' ';
    /**
     * Caracter que en el mapa de caracteres de Nivel (ver
     * {@link  moo.proyecto.entrega1.Nivel}) indica que en esa posici√≥n hay una
     * pared.
     */
    public static final char CELDA_PARED = '#';
    /**
     * Caracter que en el mapa de caracteres de Nivel (ver
     * {@link  moo.proyecto.entrega1.Nivel}) indica que en esa posici√≥n est√° la
     * puerta.
     */
    public static final char CELDA_PUERTA = 'P';
    /**
     * Caracter que en el mapa de caracteres de Nivel (ver
     * {@link  moo.proyecto.entrega1.Nivel}) indica que en esa posici√≥n hay una
     * llave.
     */
    public static final char CELDA_LLAVE = 'L';
    /**
     * Caracter que en el mapa de caracteres de Nivel (ver
     * {@link  moo.proyecto.entrega1.Nivel}) indica que en esa posici√≥n hay un
     * soplete.
     */
    public static final char CELDA_SOPLETE = 'S';
    /**
     * Caracter que en el mapa de caracteres de Nivel (ver
     * {@link  moo.proyecto.entrega1.Nivel}) indica que en esa posici√≥n hay un
     * bloque de hielo.
     */
    public static final char CELDA_HIELO = 'H';
    /**
     * Caracter que en el mapa de caracteres de Nivel (ver
     * {@link  moo.proyecto.entrega1.Nivel}) indica que en esa posici√≥n hay una
     * llama.
     */
    public static final char CELDA_FUEGO = 'F';
    /**
     * Caracter que indica presencia de pared.
     */
    public static final char CELDA_AGUA = 'A';
    /**
     * Caracter que indica presencia de pico.
     */
    public static final char CELDA_PICO = 'T';
    /**
     * Caracter que indica presencia de roca.
     */
    public static final char CELDA_ROCA = 'R';
}


