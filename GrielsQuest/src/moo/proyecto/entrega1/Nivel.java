package moo.proyecto.entrega1;

public class Nivel {

    private Jugador jugador;
    private Celda[][] celdas;
    private int filas;
    private int columnas;
    private char[][] mapa;

    public Nivel(int filas, int columnas, char[][] mapa) {
        this.filas = filas;
        this.columnas = columnas;

    }

    public Jugador getJugador() {
        return jugador;
    }

    public Celda getCelda(int fila, int col) {
        if (fila < Const.NIVEL_FILAS && col < Const.NIVEL_COLUMNAS) {
            return celdas[fila][col];
        } else {
            return null;
        }
    }

    public Nivel clonar() {
        Nivel nivelclon = new Nivel(filas, columnas, mapa);
        return nivelclon;
    }

    public boolean IntentaMoverJugador(int fila, int col) {
        /*true si el jugador ha podido moverse a la celda destino y esta celda 
        destino es la que contiene la puerta, false si sucede lo contrario.*/
        //comparamos celdas posibles, si tien P true, si no false, para los demas casos false
        // i si la celda no existe que passa?
        //Poner (si hay obstaculo, 
        if (celdas[fila][col].getColumna() == jugador.getPosCol()
                && celdas[fila][col].getFila() == jugador.getPosFila()
                && (mapa[fila][col] == Const.CELDA_PUERTA)) {
            //jugador.setCelda(celdas[fila][col]);
            return true;
        } else if (celdas[fila][col].getColumna() == jugador.getPosCol() + 1
                && celdas[fila][col].getFila() == jugador.getPosFila()
                && (mapa[fila][col] == Const.CELDA_PUERTA)) {
            //jugador.setCelda(celdas[fila][col]);
            return true;
        } else if (celdas[fila][col].getColumna() == jugador.getPosCol() - 1
                && celdas[fila][col].getFila() == jugador.getPosFila()
                && (mapa[fila][col] == Const.CELDA_PUERTA)) {
            //jugador.setCelda(celdas[fila][col]);
            return true;
        } else if (celdas[fila][col].getColumna() == jugador.getPosCol()
                && celdas[fila][col].getFila() == jugador.getPosFila() + 1
                && (mapa[fila][col] == Const.CELDA_PUERTA)) {
           //jugador.setCelda(celdas[fila][col]);
            return true;
        } else if (celdas[fila][col].getColumna() == jugador.getPosCol()
                && celdas[fila][col].getFila() == jugador.getPosFila() - 1
                && (mapa[fila][col] == Const.CELDA_PUERTA)) {
            //jugador.setCelda(celdas[fila][col]);
            return true;
        } 
        
        
        else if (celdas[fila][col].getColumna() == jugador.getPosCol()
                && celdas[fila][col].getFila() == jugador.getPosFila()
                && (mapa[fila][col] != Const.CELDA_PUERTA)) {
            //jugador.setCelda(celdas[fila][col]);
            return false;
        } else if (celdas[fila][col].getColumna() == jugador.getPosCol() + 1
                && celdas[fila][col].getFila() == jugador.getPosFila()
                && (mapa[fila][col] != Const.CELDA_PUERTA)) {
            //jugador.setCelda(celdas[fila][col]);
            return false;
        } else if (celdas[fila][col].getColumna() == jugador.getPosCol() - 1
                && celdas[fila][col].getFila() == jugador.getPosFila()
                && (mapa[fila][col] != Const.CELDA_PUERTA)) {
            //jugador.setCelda(celdas[fila][col]);
            return false;
        } else if (celdas[fila][col].getColumna() == jugador.getPosCol()
                && celdas[fila][col].getFila() == jugador.getPosFila() + 1
                && (mapa[fila][col] != Const.CELDA_PUERTA)) {
            //jugador.setCelda(celdas[fila][col]);
            return false;
        } else if (celdas[fila][col].getColumna() == jugador.getPosCol()
                && celdas[fila][col].getFila() == jugador.getPosFila() - 1
                && (mapa[fila][col] != Const.CELDA_PUERTA)) {
            //jugador.setCelda(celdas[fila][col]);
            return false;
                  
        } else {
            return false;
        }
    }

}
