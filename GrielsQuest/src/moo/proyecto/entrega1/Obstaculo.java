
package moo.proyecto.entrega1;


public class Obstaculo {
    public static final int TIPO_PARED=0;
    public static final int TIPO_PUERTA=1;
    public static final int TIPO_HIELO=2;
    public static final int TIPO_FUEGO=3;
    public static final int TIPO_ROCA=4;
    private int tipo;
    
public Obstaculo (int tipo){
    this.tipo=tipo;
}       

    public int getTipo() {
        return tipo;
    }

}
