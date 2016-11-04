
package moo.proyecto.entrega1;


public class Main extends java.lang.Object{
    
    
    public Main (){
        
    }
    
    public static void main (java.lang.String args[]){ 
        ControlJuego  juego = new ControlJuego();
        juego.cargaNiveles();
        juego.empiezaPartida();     
    }
}
