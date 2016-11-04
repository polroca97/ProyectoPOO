
package moo.proyecto.entrega1;

import moo.proyecto.gui.InterfazGrafica;

public class ControlJuego {

private java.util.List<Nivel> niveles;
    InterfazGrafica gui;
    private int nivel;
    
    
    public ControlJuego(){
   
    }
    
    public void empiezaPartida(){
             /*Permite jugar la partida. Acciones:

Mientras el identificador del nivel sea menor que el id del m√°ximo nivel 
   Conseguir un clon del nivel correspondiente al identificador de nivel 
   Hacer 
      redibujar la GUI 
      interaccionar con el usuario para que √©ste pulse una tecla para mover el jugador. 
      decidir la fila y columna a la que se intentar√° mover el jugador 
      intentar mover el jugador si no se ha acabado el nivel 
   Mientras no se haya acabado el nivel 
   redibujar la GUI 
   incrementar el identificador de nivel*/
        
    }
    private void redibuja(Nivel nivelActual){
        
        
       /* Este m√©todo redibuja la GUI. 

Para cada celda del recinto del nivel en curso, colocar la imagen correspondiente a lo que haya en ella (obst√°culo, item o nada). 
Colocar la imagen del jugador en la celda que corresponda. 
Colorar la imagen del item que tenga el jugador en el bolsillo en la celda que ocupa la primera fila y la √∫ltima columna del recinto de juego.*/

    }
    
    public void cargaNiveles(){
    /**
     * M√©todo que crea y a√±ade 6 objetos nivel y los a√±ade a la secuencia 
     * de niveles.
     */
  
        niveles.add(new Nivel(Const.NIVEL_FILAS, Const.NIVEL_COLUMNAS,
                new char[][]{
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "   #            ".toCharArray(),
                        "  #L#           ".toCharArray(),
                        "  # #           ".toCharArray(),
                        "  # #           ".toCharArray(),
                        "  # #########   ".toCharArray(),
                        "  #J        P#  ".toCharArray(),
                        "   ##########   ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray()}));
        niveles.add(new Nivel(Const.NIVEL_FILAS, Const.NIVEL_COLUMNAS,
                new char[][]{
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        " ############## ".toCharArray(),
                        "#S      J H L P#".toCharArray(),
                        " ############## ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray()}));

        niveles.add(new Nivel(Const.NIVEL_FILAS, Const.NIVEL_COLUMNAS,
                new char[][]{
                        "                ".toCharArray(),
                        "       #        ".toCharArray(),
                        "      #H#       ".toCharArray(),
                        "      # #       ".toCharArray(),
                        "  ####  ####### ".toCharArray(),
                        " # J   S F L P# ".toCharArray(),
                        "  ##### ######  ".toCharArray(),
                        "      # #       ".toCharArray(),
                        "      #A#       ".toCharArray(),
                        "       #        ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray()}));
        niveles.add(new Nivel(Const.NIVEL_FILAS, Const.NIVEL_COLUMNAS,
                new char[][]{
                        "#   #  #  #   # ".toCharArray(),
                        "## ## # # #  # #".toCharArray(),
                        "# # # # # #  ###".toCharArray(),
                        "#   #  #  ## # #".toCharArray(),
                        "      ###       ".toCharArray(),
                        "######R  #######".toCharArray(),
                        "#LTTFS   HHARP##".toCharArray(),
                        "####AS   #######".toCharArray(),
                        "    ##J  #      ".toCharArray(),
                        "#   ###  ###  ##".toCharArray(),
                        " ###   ##   ##  ".toCharArray(),
                        " #  # #  # #  # ".toCharArray(),
                        " ###  #  # #  # ".toCharArray(),
                        " #     ##   ##  ".toCharArray()}));


        niveles.add(new Nivel(Const.NIVEL_FILAS, Const.NIVEL_COLUMNAS,
                new char[][]{
                        "                ".toCharArray(),
                        "                ".toCharArray(),
                        " ##########     ".toCharArray(),
                        " #TF## J  ####  ".toCharArray(),
                        " ##AH  ##T RS#  ".toCharArray(),
                        " ####F####H#### ".toCharArray(),
                        " #P # SHR T# L# ".toCharArray(),
                        " #   ##  ##   # ".toCharArray(),
                        " ### FTR AR ### ".toCharArray(),
                        "   #  F##R  #   ".toCharArray(),
                        "   ### ##A###   ".toCharArray(),
                        "     ######     ".toCharArray(),
                        "                ".toCharArray(),
                        "                ".toCharArray()}));
        niveles.add(new Nivel(Const.NIVEL_FILAS, Const.NIVEL_COLUMNAS,
                new char[][]{
                        "                ".toCharArray(),
                        "################".toCharArray(),
                        "#      J       #                ".toCharArray(),
                        "#      T       #                ".toCharArray(),
                        "#RRRRRRRRRRRRR#                ".toCharArray(),
                        " #RAHHFTFSFRT#               ".toCharArray(),
                        "  #FTFSFHFSH#              ".toCharArray(),
                        "   #HAHTFRH#             ".toCharArray(),
                        "    #HRFRA#            ".toCharArray(),
                        "     #FRR#           ".toCharArray(),
                        "      #L#          ".toCharArray(),
                        "      #P#         ".toCharArray(),
                        "      ###          ".toCharArray(),
                        "                ".toCharArray()
                }));
    }

}
