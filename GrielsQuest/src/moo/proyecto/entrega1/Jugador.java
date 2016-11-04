

package moo.proyecto.entrega1;


public class Jugador {
        private Celda celda;//celda donde se encuentra en un instante de tiempo
    private Item item;// si lleva item si no  null

    public Jugador(Celda c) {
        this.celda = c; // ITEM??
    }

    public int getPosFila() {
        return celda.getFila();
    }

    public int getPosCol() {
        return celda.getColumna();
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        if (this.item == null) {
            this.item = item;
        } else {
        }
    }

    public void setCelda(Celda c) {
        this.celda=c;
    }

    
}
