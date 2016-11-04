package moo.proyecto.entrega1;

public class Celda {

    private int columna;
    private int fila;
    private Item item;
    private Obstaculo obstaculo;

    public Celda(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;

    }

    public Celda(int fila, int columna, Item item) {
        this.fila = fila;
        this.columna = columna;
        this.item = new Item(item.getTipo());
    }

    public Celda(int fila, int columna, Obstaculo obstaculo) {
        this.fila = fila;
        this.columna = columna;
        this.obstaculo = new Obstaculo(obstaculo.getTipo());

    }

    public java.lang.String getArchivoImagen() {
        if (item != null) {
            if (item.getTipo() == Item.TIPO_LLAVE) {
                return Const.ARCHIVO_LLAVE;
            } else if (item.getTipo() == Item.TIPO_SOPLETE) {
                return Const.ARCHIVO_SOPLETE;
            } else if (item.getTipo() == Item.TIPO_AGUA) {
                return Const.ARCHIVO_AGUA;
            } else if (item.getTipo() == Item.TIPO_PICO) {
                return Const.ARCHIVO_PICO;
            } else {
                return null;
            }
        } else if (obstaculo != null) {
            if (obstaculo.getTipo() == Obstaculo.TIPO_PARED) {
                return Const.ARCHIVO_PARED;
            } else if (obstaculo.getTipo() == Obstaculo.TIPO_PUERTA) {
                return Const.ARCHIVO_PUERTA;
            } else if (obstaculo.getTipo() == Obstaculo.TIPO_HIELO) {
                return Const.ARCHIVO_HIELO;
            } else if (obstaculo.getTipo() == Obstaculo.TIPO_FUEGO) {
                return Const.ARCHIVO_FUEGO;
            } else if (obstaculo.getTipo() == Obstaculo.TIPO_ROCA) {
                return Const.ARCHIVO_ROCA;
            } else {
                return null;
            }
        } else {
            return null;
        }

    }

    public int getColumna() {
        return columna;
    }

    public int getFila() {
        return fila;
    }
//HACER PASA Y PUEDE PASSAR (MODIFICAR INTENTA MOVeT ) a if (puede passar==true)&&Fila col es la puerta, true

    public boolean puedePasar(Jugador j) {

        if (this.obstaculo == null && this.item == null) {
            if (j.getPosCol() == this.columna && j.getPosFila() == this.fila) {
                  } else if (this.obstaculo != null && this.item == null) {
            if (j.getItem() == null) {
                return false;
            } else if ((this.obstaculo.getTipo() >= Obstaculo.TIPO_PUERTA)
                    && (this.obstaculo.getTipo() - 1 == j.getItem().getTipo())) {
                return true;
            } else {
                return false;
            }
        } else if (this.item != null && this.obstaculo == null) {
            if (j.getItem() == null) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
            } else if (j.getPosCol() - 1 == this.columna && j.getPosFila() == this.fila) {
                   } else if (this.obstaculo != null && this.item == null) {
            if (j.getItem() == null) {
                return false;
            } else if ((this.obstaculo.getTipo() >= Obstaculo.TIPO_PUERTA)
                    && (this.obstaculo.getTipo() - 1 == j.getItem().getTipo())) {
                return true;
            } else {
                return false;
            }
        } else if (this.item != null && this.obstaculo == null) {
            if (j.getItem() == null) {
                return true;
            } else {
                return false;
            }

        } 
        else {
            return false;
        }
       
                
               
            } else if (j.getPosCol() + 1 == this.columna && j.getPosFila() == this.fila) {
                return true;
            } else if (j.getPosCol() == this.columna && j.getPosFila() - 1 == this.fila) {
                return true;
            } else if (j.getPosCol() == this.columna && j.getPosFila() + 1 == this.fila) {
                return true;
            } else {
                return false;
            }
     
    }

    public boolean pasa(Jugador j) {
//        Método que implementa las acciones a realizar cuando el jugador realmente llega a una celda; este método devuelve true si esta celda tiene el obstáculo puerta y false en caso contrario. 
//Si en la celda hay un item, hacer que el jugador tome ese item. El método puedePasar() solo permite pasar al jugador a una celda con un item si el jugador no tiene ninguno. 
//Si en la celda hay un obstáculo 
//...a. Eliminar el item del jugador. El método puedePasar() solo permite pasar al jugador a una celda con un obstáculo si el jugador tiene el item que permite vencer dicho obstáculo. Al vencer el obstáculo, el item se consume. 
//...b. Si el obstáculo que hay en la celda es la puerta, devolver true. Eso indicará que el juego puede cambiar a un nivel superior. 
//Dejar la celda vacía y devolver false
    }
}
