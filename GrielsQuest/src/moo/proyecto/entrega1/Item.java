
package moo.proyecto.entrega1;


public class Item {
      private int tipo;
  public static final int TIPO_AGUA=2;
  public static final int TIPO_LLAVE=0;
  public static final int TIPO_SOPLETE=1;
  public static final int TIPO_PICO=3;
  
  public Item (int tipo){
      this.tipo=tipo;
  }

    public int getTipo() {
        return tipo;
    }

    
}
